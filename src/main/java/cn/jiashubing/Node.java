package cn.jiashubing;

/**
 * 自定义节点
 *
 * @author jiashubing
 * @since 2018/3/30
 */
class Node<T> {

    /**
     * 当前值
     */
    private T data;

    /**
     * 左节点
     */
    private Node<T> left;

    /**
     * 右节点
     */
    private Node<T> right;

    Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    T getData() {
        return data;
    }

    void setData(T data) {
        this.data = data;
    }

    Node<T> getLeft() {
        return left;
    }

    void setLeft(Node<T> left) {
        this.left = left;
    }

    Node<T> getRight() {
        return right;
    }

    void setRight(Node<T> right) {
        this.right = right;
    }
}
