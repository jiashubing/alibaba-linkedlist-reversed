# alibaba-linkedlist-reversed
题目要求：实现一个双向链表的倒置功能（1->2->3 变成 3->2->1) 时间：3天之内 提交：代码、测试用例 希望可以写成一个Java小项目，可以看到单元测试部分。 

# 实现
最关键的是自定义节点Node 和自定义双向链表MyLinkedList 两个类，倒置的方法放在自定义链表类里reversed() ，具体的说明都在代码中

- 自定义节点类Node.java，有三个参数 ：T data（当前值）、Node<T> left（左节点）、Node<T> right（右节点）
- 自定义双向链表类MyLinkedList.java，有两个参数：Node<T> head（头结点）、Node<T> current（当前节点，也是最后一个节点）
	- 添加节点的方法void add(T data)：添加的第一个节点Node，它的左节点为null，最后一个节点的右节点也为null，中间的每个节点的左右节点都有值
	- 倒置链表的方法reversed()：把每个节点的左右节点交换，并且把链表的首尾节点也交换，就可以了。这里需要考虑的是循环的终止条件。