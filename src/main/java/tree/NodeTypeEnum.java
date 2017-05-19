package tree;

/**
 * 节点类型枚举类
 * Created by alanzhang211 on 2017/5/19.
 * alanzhang.me
 */
public enum NodeTypeEnum {
    FOLDER(1,"folder","文件夹"),
    FILE(2,"file","文件");

    private Integer type;
    private String name;
    private String desc;

    NodeTypeEnum(Integer type,String name,String desc) {
        this.type = type;
        this.name = name;
        this.desc = desc;
    }

    public static NodeTypeEnum valueOfId(Integer type) {
        for (NodeTypeEnum nodeTypeEnum : NodeTypeEnum.values()) {
            if (nodeTypeEnum.getType().equals(type)) {
                return nodeTypeEnum;
            }
        }
        return null;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

}
