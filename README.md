# tree
一个简单的树目录组件实现。

# 类图
![类图](https://github.com/alanzhang211/blog-image/raw/master/2017/05/%E5%BC%80%E6%BA%90%E9%82%A3%E4%BA%9B%E4%BA%8B/class.JPG)

+ Tree：树的抽象。属性：root代表树的根。
+ TreeNode:树节点的抽象；属性：data-节点数据（一般为业务数据）；children：子节点。
+ AbstractNodeData：树节点数据的抽象。属性：nodeId-数据id；nodeName-节点名称；nodeType-节点类型；icon-节点图表；desc-数据描述。
