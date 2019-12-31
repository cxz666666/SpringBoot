package com.data.chart;

/**
 * @PackageName: com.data.chart
 * @ClassName: Vertex
 * @Description: 顶点类
 * @author: cxz
 * @date 2019/12/31 15:56
 */
public class Vertex {
    private String value;
    public boolean visited;

    @Override
    public String toString() {
        return "Vertex{" +
                "value='" + value + '\'' +
                '}';
    }

    public Vertex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
