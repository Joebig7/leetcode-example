package com.mamba.other.geek._01_array;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/2/20 20:31
 * @description 实现数组操作
 */
public class Array {

    //定义数组的长度
    private int size;

    //定义元素的个数
    private int count;

    //定义数组
    private Object[] data;

    //构造方法
    public Array(int length) {
        deterParam(length);
        this.data = new Object[10];
        this.size = length;
    }

    //增加元素
    public boolean add(Object obj) {
        if (count == size) {
            throw new ArrayIndexOutOfBoundsException("数组的空间已经满了");
        }

        data[count++] = obj;

        return true;
    }

    //删除元素
    public Object remove(int index) {
        deterParam(index);
        Object old = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        return old;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (data[i] == obj) {
                System.arraycopy(data, i + 1, data, i, size - i - 1);
            }
        }

        return true;
    }

    //修改元素
    public Object set(int index, Object obj) {
        deterParam(index);
        Object old = data[index];
        data[index] = obj;
        return old;
    }


    //查找元素
    public Object get(int index) {
        deterParam(index);
        return data[index];
    }

    //返回当前数组长度
    public int count() {
        return count;
    }

    //判断参数
    private void deterParam(int var1) {
        if (var1 <= 0) {
            throw new IllegalArgumentException("数组的长度不能小于0");
        }
    }

    public static void main(String[] args) {
        Array array = new Array(10);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(4);
        array.add(4);
        array.add(4);
        array.add(4);
        array.add(4);
        array.add(4);

        array.remove(2);
        array.set(5, 8);
        System.out.println(array.get(5));
    }
}