package net.xdclass.demo.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @PackageName: net.xdclass.demo.domain
 * @ClassName: Article
 * @Description: 文章对象
 * @author: cxz
 * @date 2019/11/18 14:12
 */
@Document(indexName = "blog", type = "article")
public class Article implements Serializable {

    private static final Long serialVersionUId = 1L;

    private long id;

    private String title;

    private String summary;

    private String content;

    private int pv;
    
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
}
