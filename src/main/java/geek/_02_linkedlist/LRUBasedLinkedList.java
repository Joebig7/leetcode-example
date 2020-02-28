package geek._02_linkedlist;

import java.util.Objects;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/2/28 16:34
 * @description 基于单链表LRU算法（java） 当缓存满了的时候，可以基于这种规则进行数据的淘汰
 */
public class LRUBasedLinkedList<T> {

    private static final int DEFAULT_CAPACITY = 3;

    //头结点
    private Node<T> head;

    //尾结点
    private Node<T> tail;

    //链表容量
    private int capacity;

    //结点数量
    private int count;

    //初始化链表
    public LRUBasedLinkedList() {
        this.capacity = DEFAULT_CAPACITY;
    }

    //添加元素(将元素加入缓存)
    public boolean add(T element) {
        //空链表
        if (count == 0) {
            head = new Node(element, null);
            count++;
            return true;
        }

        Node preOldNode = traverseList(element);
        //遍历链表
        if (Objects.nonNull(preOldNode)) {
            //删除元素，插入新元素
            deleteOldNode(preOldNode);
        } else {
            //不存在则需要在头结点加入元素
            insertHeadNode(element);
        }
        return true;
    }

    //删除旧的节点
    private void deleteOldNode(Node preNode) {
        Node oldNode = preNode.next;
        preNode.setNext(oldNode.getNext());
        oldNode.setData(null);
        oldNode = null;
        count--;
    }

    //遍历链表判断元素是否已经存在
    private Node traverseList(T element) {
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.next.getData().equals(element)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    private void insertHeadNode(T element) {
        //判断链表长度是否已经满了
        if (count == capacity) {
            //链表已经满了,将尾部节点删除
            deleteTailNode();
            Node newNode = new Node(element, head);
            head = newNode;
        } else {
            Node temp = head;
            Node newNode = new Node(element, temp);
            head = newNode;
            count++;
        }
    }

    //删除尾部节点
    private void deleteTailNode() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.next == null) {
                tail.setData(null);
                tail = temp;
                tail.setNext(null);
            }
            temp = head.next;
        }

    }


    public void printAll() {
        Node temp = head;
        do {
            System.out.println("info === " + temp.getData());
            temp = temp.getNext();
        } while (temp != null);

    }


    //链表结点对象
    private class Node<T> {
        private T data;
        private Node next;

        public Node() {

        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LRUBasedLinkedList<String> basedLinkedList = new LRUBasedLinkedList<>();

        basedLinkedList.add("username=zjf");
        basedLinkedList.add("username=joe");
        basedLinkedList.add("username=rose");
        basedLinkedList.printAll();
    }

}