package tree;

import org.junit.Test;

/**
 * 树测试类
 * Created by alanzhang211 on 2017/5/19.
 * alanzhang.me
 */
public class TreeTest {
    @Test
    public void testTree() {
        Tree<AbstractNodeData> tree = new Tree<AbstractNodeData>();
        TreeNode<AbstractNodeData> treeRoot = new TreeNode<AbstractNodeData>();
        AbstractNodeData rootData = new FolderNodeData();
        rootData.setNodeId(1);
        rootData.setNodeType(NodeTypeEnum.FOLDER.getType());
        rootData.setNodeName("root_folder");
        treeRoot.setData(rootData);
        tree.setRoot(treeRoot);

        TreeNode<AbstractNodeData> folderNode_1 = new TreeNode<AbstractNodeData>();
        FolderNodeData folderData = new FolderNodeData();
        folderData.setNodeId(1);
        folderData.setNodeType(NodeTypeEnum.FILE.getType());
        folderData.setNodeName("folder_1");
        folderData.setCreateUser("alan");
        folderNode_1.setData(folderData);
        treeRoot.addChild(folderNode_1);

        TreeNode<AbstractNodeData> folderNode_2 = new TreeNode<AbstractNodeData>();
        FolderNodeData folderData_2 = new FolderNodeData();
        folderData_2.setNodeId(1);
        folderData_2.setNodeType(NodeTypeEnum.FILE.getType());
        folderData_2.setNodeName("folder_2");
        folderData_2.setCreateUser("alice");
        folderNode_2.setData(folderData_2);
        treeRoot.addChild(folderNode_2);

        TreeNode<AbstractNodeData> fileNode_1 = new TreeNode<AbstractNodeData>();
        AbstractNodeData fileData_1 = new FolderNodeData();
        fileData_1.setNodeId(1);
        fileData_1.setNodeType(NodeTypeEnum.FILE.getType());
        fileData_1.setNodeName("file_1");
        fileNode_1.setData(fileData_1);
        folderNode_1.addChild(fileNode_1);

        System.out.println("tree="+ tree.toString());
    }
}
