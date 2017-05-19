package tree;

/**
 * 文件夹节点数据
 * Created by alanzhang211 on 2017/5/19.
 * alanzhang.me
 */
public class FolderNodeData extends AbstractNodeData {
    /**创建人员*/
    private String createUser;

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}
