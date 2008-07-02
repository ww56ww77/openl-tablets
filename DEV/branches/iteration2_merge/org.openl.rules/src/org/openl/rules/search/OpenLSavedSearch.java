package org.openl.rules.search;

import org.openl.util.export.IExportRow;
import org.openl.util.export.IExportSection;
import org.openl.util.export.IExportable;
import org.openl.util.export.ExportRow;
import org.openl.util.export.ExportSectionSingleRow;

/**
 * @author Aliaksandr Antonik.
 */
public class OpenLSavedSearch implements IExportable<OpenLSavedSearch>, IExportSection<OpenLSavedSearch> {
    private SearchElement[] tableElements;
    private SearchElement[] columnElements;
    private String tableTypes;

    public OpenLSavedSearch(SearchElement[] columnElements, SearchElement[] tableElements, String[] tableType) {
        this.columnElements = columnElements;
        this.tableElements = tableElements;
        tableTypes = join(tableType);
    }

    private static String join(String[] strings) {
        if (strings == null || strings.length == 0)
            return "";

        StringBuilder sb = new StringBuilder();
        sb.append(strings[0]);
        for (int i = 1; i < strings.length; ++i) {
            sb.append(",").append(strings[i]);
        }

        return sb.toString();
    }

    public OpenLSavedSearch() {
    }

    public SearchElement[] getColumnElements() {
        return columnElements;
    }

    public void setColumnElements(SearchElement[] columnElements) {
        this.columnElements = columnElements;
    }

    public SearchElement[] getTableElements() {
        return tableElements;
    }

    public void setTableElements(SearchElement[] tableElements) {
        this.tableElements = tableElements;
    }

    public String getTableTypes() {
        return tableTypes;
    }

    /**
     * {@inheritDoc}
     */
    public IExportSection<OpenLSavedSearch> mainSection() {
        return this;
    }

    /**
     * Returns section name.
     *
     * @return name
     */
    public String getName() {
        return "OpenL Search";
    }

    /**
     * Returns the java class this section represents.
     *
     * @return a class
     */
    public Class<OpenLSavedSearch> getExportedClass() {
        return OpenLSavedSearch.class;
    }

    /**
     * Returns array of subsections of this section. Can be <code>null</code>.
     *
     * @return child sections
     */
    public IExportSection[] getSubSections() {
        return new IExportSection[] {
                new ExportSectionSingleRow("Table Type", new String[] {tableTypes}),
                new SearchElementSection("Table elements", tableElements),
                new SearchElementSection("Column elements", columnElements),
        };
    }

    /**
     * {@inheritDoc}
     */
    public IExportRow[] getRows() {return null;}

    private static class SearchElementSection implements IExportSection<SearchElement> {
        String name;
        SearchElement[] searchElements;

        private SearchElementSection(String name, SearchElement[] searchElements) {
            this.name = name;
            this.searchElements = searchElements;
        }

        public String getName() {
            return name; 
        }

        public Class<SearchElement> getExportedClass() {
            return SearchElement.class;
        }

        public IExportSection[] getSubSections() {
            return null;
        }

        /**
         * Return array of rows - section data. Can be <code>null</code>.
         *
         * @return section rows.
         */
        public IExportRow[] getRows() {
            IExportRow[] exportRows = new IExportRow[searchElements.length];

            for (int i = 0; i < searchElements.length; ++i) {
                SearchElement searchElement = searchElements[i];
                exportRows[i] = new ExportRow(searchElement.getType(), String.valueOf(searchElement.isNotFlag()),
                        searchElement.getOperator().getName(),
                        searchElement.getOpType1(), searchElement.getValue1(), searchElement.getOpType2(),
                        searchElement.getValue2());
            }

            return exportRows;
        }
    }

}
