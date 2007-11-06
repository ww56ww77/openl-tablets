package org.openl.rules.workspace;

import org.openl.rules.workspace.dtr.DesignTimeRepository;
import org.openl.rules.workspace.dtr.RepositoryException;
import org.openl.rules.workspace.dtr.impl.DesignTimeRepositoryImpl;
import org.openl.rules.workspace.lw.LocalWorkspace;
import org.openl.rules.workspace.lw.LocalWorkspaceManager;
import org.openl.rules.workspace.lw.impl.LocalWorkspaceManagerImpl;
import org.openl.rules.workspace.uw.UserWorkspace;
import org.openl.rules.workspace.uw.impl.UserWorkspaceImpl;

import java.util.HashMap;
import java.util.Map;

public class MultiUserWorkspaceManager {
    private LocalWorkspaceManager localManager;
    private DesignTimeRepository designTimeRepository;
    private Map<String, UserWorkspace> userWorkspaces;

    public MultiUserWorkspaceManager() throws WorkspaceException {
        userWorkspaces = new HashMap<String, UserWorkspace>();

        localManager = new LocalWorkspaceManagerImpl();
        try {
            designTimeRepository = new DesignTimeRepositoryImpl();
        } catch (RepositoryException e) {
            throw new WorkspaceException("Cannot init Design Time Repository", e);
        }        
    }

    public UserWorkspace getUserWorkspace(WorkspaceUser user) throws WorkspaceException {
        UserWorkspace uw = userWorkspaces.get(user.getUserId());
        if (uw == null) {
            uw = createUserWorkspace(user);
            userWorkspaces.put(user.getUserId(), uw);
        }

        return uw;
    }

    protected UserWorkspace createUserWorkspace(WorkspaceUser user) throws WorkspaceException {
        LocalWorkspace lw = localManager.getWorkspace(user);
        UserWorkspace uw = new UserWorkspaceImpl(user, lw, designTimeRepository);
        return uw;
    }
}
