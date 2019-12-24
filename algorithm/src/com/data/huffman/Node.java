package com.data.huffman;

/**
 * @PackageName: com.data.huffman
 * @ClassName: Node
 * @Description: 赫夫曼树节点
 * @author: cxz
 * @date 2019/12/24 16:51
 */
public class Node implements Comparable<Node>{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Node o) {
        return -(this.value-o.value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
