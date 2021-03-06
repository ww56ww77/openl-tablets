package org.openl.rules.workspace.lw.impl;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.openl.rules.workspace.WorkspaceUserImpl;
import org.openl.rules.workspace.lw.LocalWorkspace;

public class LocalWorkspaceManagerImplTest {
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();
    private LocalWorkspaceManagerImpl manager;

    @Before
    public void init() throws Exception {
        manager = new LocalWorkspaceManagerImpl();
        manager.setWorkspaceHome(tempFolder.getRoot().getAbsolutePath());
        manager.init();
    }

    @Test
    public void removeWorkspaceOnSessionTimeout() throws Exception {
        WorkspaceUserImpl user = new WorkspaceUserImpl("user1");
        LocalWorkspace workspace1 = manager.getWorkspace(user);

        // Must return cached version
        LocalWorkspace workspace2 = manager.getWorkspace(user);
        assertSame(workspace1, workspace2);
        assertSame(workspace1.getRepository(), workspace2.getRepository());

        // Session timeout
        workspace1.release();

        // Must create new instance
        workspace2 = manager.getWorkspace(user);
        assertNotSame(workspace1, workspace2);
        assertNotSame(workspace1.getRepository(), workspace2.getRepository());
    }
}