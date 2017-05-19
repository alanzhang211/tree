package tree;

/**
 * 抽象节点数据
 * Created by alanzhang211 on 2017/5/19.
 * alanzhang.me
 */
public abstract class AbstractNodeData {
    /**数据id*/
    private Integer nodeId;
    /**节点名称*/
    private String nodeName;
    /**节点类型*/
    private Integer nodeType;
    /**节点图标*/
    private String icon;
    /**描述信息*/
    private String desc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractNodeData that = (AbstractNodeData) o;

        if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;
        if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;
        return nodeType != null ? nodeType.equals(that.nodeType) : that.nodeType == null;
    }

    @Override
    public int hashCode() {
        int result = nodeId != null ? nodeId.hashCode() : 0;
        result = 31 * result + (nodeName != null ? nodeName.hashCode() : 0);
        result = 31 * result + (nodeType != null ? nodeType.hashCode() : 0);
        return result;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
