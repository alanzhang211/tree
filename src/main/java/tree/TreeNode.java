package tree;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * 树节点
 * Created by alanzhang211 on 2017/5/19.
 * alanzhang.me
 */
public class TreeNode<T> {
    private T data;
    private List<TreeNode<T>> children;

    public TreeNode() {
        super();
        children = new ArrayList<TreeNode<T>>();
    }

    public TreeNode(T data) {
        this();
        setData(data);
    }

    public List<TreeNode<T>> getChildren() {
        return this.children;
    }

    public int getNumberOfChildren() {
        return getChildren().size();
    }

    public boolean hasChildren() {
        return (getNumberOfChildren() > 0);
    }

    /**
     * 设置孩子节点
     * @param children
     */
    public void setChildren(List<TreeNode<T>> children) {
        this.children = children;
    }

    /**
     * 添加孩子节点
     * @param child
     */
    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    /**
     * 指定位置添加节点
     * @param index
     * @param child
     * @throws IndexOutOfBoundsException
     */
    public void addChildAt(int index, TreeNode<T> child) throws IndexOutOfBoundsException {
        children.add(index, child);
    }

    /**
     * 删除子节点
     */
    public void removeChildren() {
        this.children = new ArrayList<TreeNode<T>>();
    }

    /**
     * 删除指定索引的子节点
     * @param index
     * @throws IndexOutOfBoundsException
     */
    public void removeChildAt(int index) throws IndexOutOfBoundsException {
        children.remove(index);
    }

    public TreeNode<T> getChildAt(int index) throws IndexOutOfBoundsException {
        return children.get(index);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return JSON.toJSONString(this.data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TreeNode<?> other = (TreeNode<?>) obj;
        if (data == null) {
            if (other.data != null) {
                return false;
            }
        } else if (!data.equals(other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }
}
