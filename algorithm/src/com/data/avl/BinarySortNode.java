package com.data.avl;

/**
 * @PackageName: com.data.avl
 * @ClassName: BinarySortNode
 * @Description: 平衡树节点
 * @author: cxz
 * @date 2019/12/26 15:32
 */
public class BinarySortNode {
    int value;
    BinarySortNode left;
    BinarySortNode right;

    public BinarySortNode(int value) {
        this.value = value;
    }

    /**
     * 返回当前节点的高度
     * @return
     */
    public int height() {
        return Math.max(left == null?0:left.height(), right == null?0:right.height()) + 1;
    }

    /**
     * 获取左子树的高度
     * @return
     */
    public int leftHeight(){
        if (left == null) {
            return 0;
        }
        return left.height();
    }

    /**
     * 获取右子树的高度
     * @return
     */
    public int rightHeight(){
        if (right == null) {
            return 0;
        }
        return right.height();
    }

    /**
     * 向子树添加节点
     *
     * @param node
     */
    public void add(BinarySortNode node) {
        if (node == null) {
            return;
        }
        //判断传入的节点的值比当前子树的根节点的值大还是小
        if (node.value < this.value) {
            //左子节点为空
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
        //查询是否平衡
        //进行右旋转
        if (leftHeight() - rightHeight() >= 2) {
            //双旋转
            if (left!=null && left.leftHeight()<left.rightHeight()) {
                //先左旋转
                left.leftRotate();
                //再右旋转
                rightRotate();
            } else { //单旋转
                rightRotate();
            }
        }
        //左旋转
        if (leftHeight()-rightHeight() <= -2) {
            //双旋转
            if (right != null && right.rightHeight() < right.leftHeight()){
                right.rightRotate();
                leftRotate();
            } else { //单旋转
                leftRotate();
            }
        }
    }

    /**
     * 左旋转
     */
    private void leftRotate() {
        //把新节点的值设置为当前节点的值
        BinarySortNode newLeft = new BinarySortNode(value);
        //把新节点的左节点设置为当前节点的左节点
        newLeft.left = left;
        //把新节点的右节点设置为右节点的左节点
        newLeft.right = right.left;
        //把当前节点的值设置为当前节点的右节点的值
        value = right.value;
        //把当前右节点设置为当前的右节点的右节点
        right = right.right;
        //把当前左节点设置为新节点
        left = newLeft;
    }

    /**
     * 右旋转
     */
    private void rightRotate() {
        //创建一个新节点，值等于当前节点的值
        BinarySortNode newRight = new BinarySortNode(value);
        //把新节点的右子树设置为当前节点的右子树
        newRight.right = this.right;
        //把新节点的左子树设置为当前节点的左子树的右子树
        newRight.left = this.left.right;
        //把当前节点的值换为左子节点的值
        value = this.left.value;
        //把当前节点的左子树设置为左子树的左子树
        left = this.left.left;
        //把当前节点的右子树设置为新节点
        right = newRight;
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public void midShow(BinarySortNode node) {
        if (node == null) {
            return;
        }
        midShow(node.left);
        System.out.println(node.value);
        midShow(node.right);
    }

    /**
     * 查找节点
     * @param value
     * @return
     */
    public BinarySortNode search(int value) {
        if (this.value == value) {
            return this;
        } else if (value < this.value) {
            if (left == null) {
                return null;
            }
            return left.search(value);
        } else {
            if (right == null) {
                return null;
            }
            return right.search(value);
        }
    }

    /**
     * 搜索父节点
     * @param value
     * @return
     */
    public BinarySortNode searchParent(int value) {
        if (this.left != null && this.left.value == value || this.right != null && this.right.value == value){
            return this;
        } else {
            if (value < this.value && this.left != null) {
                return this.left.searchParent(value);
            } else if (value > this.value && this.right != null){
                return this.right.searchParent(value);
            }
            return null;
        }
    }
}
