package org.openl.rules.webstudio.web.repository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.openl.rules.webstudio.web.repository.tree.TreeNode;

/**
 * Used for holding information about repository selected node.
 *
 * @author Pavel Tarasevich
 */
@ManagedBean
@SessionScoped
public class RepositorySelectNodeStateHolder {
    private TreeNode selectedNode;

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    public boolean isProductionRepository() {
        return selectedNode != null && selectedNode.getType().startsWith("prod");
    }
}
