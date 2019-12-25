package com.data.huffman.code;

/**
 * @PackageName: com.data.huffman.code
 * @ClassName: Node
 * @Description: 赫夫曼编码节点
 * @author: cxz
 * @date 2019/12/25 9:54
 */
public class Node implements Comparable<Node>{
    Byte data;
    int weight;
    Node left;
    Node right;

    public Node(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    //倒序排序
    @Override
    public int compareTo(Node o) {
        return o.weight-this.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }
}
