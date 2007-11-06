package org.openl.rules.workspace;

import java.io.File;
import java.io.IOException;

public class TestHelper {
    /**
     * Working folder for tests.
     */
    public static String FOLDER_TEST = "test_work";

    /**
     * After running this method {@link #FOLDER_TEST} exists inside of <i>current directory</i> and is empty. 
     *
     * @throws IOException if operation fails 
     */
    public static void ensureTestFolderExistsAndClear() throws IOException {
        File testFolder = new File(FOLDER_TEST);
        if (!testFolder.isDirectory())
            testFolder.mkdirs();

        if (!testFolder.isDirectory()) {
            throw new IOException("failed to create directory: " + FOLDER_TEST);
        }

        if (!clearDirectory(testFolder)) {
            throw new IOException("failed to clear directory: " + FOLDER_TEST);
        }
    }

    public static boolean clearDirectory(File dir) {
        for (File file: dir.listFiles()) {
            if (!deleteFile(file)) {
                return false;
            }
        }
        return true;
    }
    public static boolean deleteFile(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles())
                if (!deleteFile(f))
                    return false;
        }
        return file.delete();
    }

}
