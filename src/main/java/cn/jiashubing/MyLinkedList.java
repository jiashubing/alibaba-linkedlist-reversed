package cn.jiashubing;

/**
 * 自定义双向链表
 *
 * @author jiashubing
 * @since 2018/3/30
 */
public class MyLinkedList<T> {
    /**
     * 头结点
     */
    private Node<T> head;

    /**
     * 当前节点
     */
    private Node<T> current;

    /**
     * 添加节点
     * 如果头节点为空，则赋值为当前节点
     * 否则，要双向设置，当前节点向后移动一位
     *
     * @param data 当前节点的值
     */
    public void add(T data) {
        if (head == null) {
            head = new Node<T>(data);
            current = head;
        } else {
            Node<T> tmp = new Node<T>(data);
            current.setRight(tmp);
            tmp.setLeft(current);
            current = current.getRight();
        }
    }

    /**
     * 正向打印链表
     *
     * @param node 当前节点
     */
    public void print(Node<T> node) {
        if (node == null) {
            return;
        }

        Node<T> tmp = node;
        while (tmp != null) {
            System.out.print(tmp.getData() + " ");
            tmp = tmp.getRight();
        }
        System.out.println("");
    }


    /**
     * 反向打印链表
     *
     * @param node 当前节点
     */
    public void printRev(Node<T> node) {
        if (node == null) {
            return;
        }

        Node<T> tmp = node;
        while (tmp != null) {
            System.out.print(tmp.getData() + " ");
            tmp = tmp.getLeft();
        }
        System.out.println("");
    }


    /**
     * 链表倒置
     */
    public void reversed() {
        if (head == null || head.getRight() == null) {
            return;
        }
        current = head;
        while(true) {
            //交换左右节点
            Node<T> tmp = head.getLeft();
            head.setLeft(head.getRight());
            head.setRight(tmp);

            //如果左节点为空，则终止，否则循环执行
            if (head.getLeft() == null) {
                return;
            } else {
                head = head.getLeft();
            }
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getCurrent() {
        return current;
    }

}
