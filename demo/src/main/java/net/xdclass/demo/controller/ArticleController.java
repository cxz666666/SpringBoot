package net.xdclass.demo.controller;

import net.xdclass.demo.domain.Article;
import net.xdclass.demo.repository.ArticleRepository;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: net.xdclass.demo.controller
 * @ClassName: ArticleController
 * @Description: 搜索
 * @author: cxz
 * @date 2019/11/18 14:35
 */
@RestController
@RequestMapping("api/v1/article")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("save")
    public Object save(){
        Article article = new Article();
        article.setId(1L);
        article.setPv(888);
        article.setContent("this is 第二内容");
        article.setTitle("i");
        article.setSummary("概要搜索");
        articleRepository.save(article);
        return "成功";
    }

    @GetMapping("search")
    public Object search(String title){
        QueryBuilder queryBuilder = QueryBuilders.matchQuery("title", title);
        Iterable<Article> articles = articleRepository.search(queryBuilder);

        return articles;
    }

}
