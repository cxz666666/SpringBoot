package com.data;

import com.data.chart.Graph;
import com.data.chart.Vertex;

import java.util.Arrays;

/**
 * @PackageName: com.data
 * @ClassName: TestGraph
 * @Description: 测试图
 * @author: cxz
 * @date 2019/12/31 16:09
 */
public class TestGraph {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Graph g = new Graph(5);
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);
        //加边
        g.addEdge("A","C");
        g.addEdge("B","C");
        g.addEdge("A","B");
        g.addEdge("B","D");
        g.addEdge("B","E");
        for (int[] i:
             g.getAdjMat()) {
            System.out.println(Arrays.toString(i));
        }
        g.dfs();
    }
}
