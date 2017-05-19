package tree;

import com.alibaba.fastjson.JSON;

/**
 * 树
 * Created by alanzhang211 on 2017/5/19.
 * alanzhang.me
 */
public class Tree<T> {
    private TreeNode<T> root;

    public Tree() {
        super();
    }

    public TreeNode<T> getRoot() {
        return this.root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    /**
     * 获取树节点个数
     * @return
     */
    public int getNumberOfNodes() {
        int numberOfNodes = 0;

        if(root != null) {
            numberOfNodes = getNumberOfNodes(root) + 1; //1 for the root!
        }

        return numberOfNodes;
    }

    /**
     * 获取指定节点下的走节点个数
     * @param node
     * @return
     */
    private int getNumberOfNodes(TreeNode<T> node) {
        int numberOfNodes = node.getNumberOfChildren();

        for(TreeNode<T> child : node.getChildren()) {
            numberOfNodes += getNumberOfNodes(child);
        }

        return numberOfNodes;
    }

    /**
     * 判断节点是否存在
     * @param dataToFind
     * @return
     */
    public boolean exists(T dataToFind) {
        return (find(dataToFind) != null);
    }

    /**
     * 查找
     * @param dataToFind
     * @return
     */
    public TreeNode<T> find(T dataToFind) {
        TreeNode<T> returnNode = null;

        if(root != null) {
            returnNode = search(root, dataToFind);
        }

        return returnNode;
    }

    /**
     *
     * @param currentNode
     * @param dataToFind
     * @return
     */
    private TreeNode<T> search(TreeNode<T> currentNode, T dataToFind) {
        TreeNode<T> returnNode = null;
        int i = 0;

        if (currentNode.getData().equals(dataToFind)) {
            returnNode = currentNode;
        }

        else if(currentNode.hasChildren()) {
            i = 0;
            while(returnNode == null && i < currentNode.getNumberOfChildren()) {
                returnNode = search(currentNode.getChildAt(i), dataToFind);
                i++;
            }
        }

        return returnNode;
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty() {
        return (root == null);
    }

    public String toString() {
        return JSON.toJSONString(this);
    }
}
