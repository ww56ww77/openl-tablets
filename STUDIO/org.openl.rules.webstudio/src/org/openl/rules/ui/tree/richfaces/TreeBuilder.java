package org.openl.rules.ui.tree.richfaces;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.openl.base.INamedThing;
import org.openl.meta.number.NumberValue.ValueType;
import org.openl.rules.table.formatters.FormattersManager;
import org.openl.rules.validation.properties.dimentional.DispatcherTablesBuilder;
import org.openl.util.tree.ITreeElement;

abstract class TreeBuilder {

    private ITreeElement<?> root;
    private boolean hideDispatcherTables;

    public TreeBuilder(ITreeElement<?> root, boolean hideDispatcherTables) {
        this.root = root;
        this.hideDispatcherTables = hideDispatcherTables;
    }

    public TreeNode build() {
        return build(false);
    }

    public TreeNode build(boolean hasRoot) {
        TreeNode rfTree = new TreeNode();
        addNodes(rfTree, root);
        if (hasRoot) {
            setNodeData(root, rfTree);
            TreeNode rfRoot = new TreeNode();
            rfRoot.addChild(0, rfTree);
            return rfRoot;
        }
        return rfTree;
    }

    private void addNodes(TreeNode dest, ITreeElement<?> source) {
        int index = 1;
        Iterable<? extends ITreeElement<?>> children = getChildrenIterator(source);
        for (ITreeElement<?> child : children) {
            TreeNode rfChild = toRFNode(child);
            if (hideDispatcherTables && rfChild.getName().startsWith(DispatcherTablesBuilder.DEFAULT_DISPATCHER_TABLE_NAME)) {
                continue;
            }
            dest.addChild(index, rfChild);
            if (child != null) {
                addNodes(rfChild, child);
            }
            index++;
        }
    }

    protected Iterable<? extends ITreeElement<?>> getChildrenIterator(ITreeElement<?> source) {
        return source.getChildren();
    }

    private TreeNode toRFNode(ITreeElement<?> node) {
        if (node == null) {
            return createNullNode();
        }
        TreeNode rfNode = new TreeNode(node.isLeaf());
        setNodeData(node, rfNode);
        return rfNode;
    }

    protected void setNodeData(ITreeElement<?> source, TreeNode dest) {
        String name = getDisplayName(source, INamedThing.SHORT);
        String title = getDisplayName(source, INamedThing.REGULAR);
        String url = getUrl(source);
        int state = getState(source);
        int numErrors = getNumErrors(source);
        String type = getType(source);
        boolean active = isActive(source);

        dest.setName(name);
        dest.setTitle(title);
        dest.setUrl(url);
        dest.setState(state);
        dest.setNumErrors(numErrors);
        dest.setType(type);
        dest.setActive(active);
    }

    protected boolean isActive(ITreeElement<?> element) {
        return true;
    }

    protected String getType(ITreeElement<?> element) {
        String type = element.getType();
        if (type != null) {
            return type;
        }
        return StringUtils.EMPTY;
    }

    protected String getUrl(ITreeElement<?> element) {
        return StringUtils.EMPTY;
    }

    protected String getDisplayName(Object obj, int mode) {
        if ((ClassUtils.isAssignable(obj.getClass(), Number.class, true))) {
            return FormattersManager.format(obj);
        }
        if (obj instanceof INamedThing) {
            INamedThing nt = (INamedThing) obj;
            return nt.getDisplayName(mode);
        }
        return String.valueOf(obj);
    }

    protected int getState(ITreeElement<?> element) {
        return 0;
    }

    protected int getNumErrors(ITreeElement<?> element) {
        return 0;
    }

    private TreeNode createNullNode() {
        TreeNode dest = new TreeNode(true);
        dest.setName("null");
        dest.setTitle("null");
        dest.setUrl(getUrl(null));
        dest.setType(ValueType.SINGLE_VALUE.toString());
        return dest;
    }
}
