package net.xdclass.demo.repository;

import net.xdclass.demo.domain.Article;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @PackageName: net.xdclass.demo.repository
 * @ClassName: ArticleRepository
 * @Description:
 * @author: cxz
 * @date 2019/11/18 14:18
 */
@Component
@Document(indexName = "blog", type = "acticle", shards = 1, replicas = 0)
public interface ArticleRepository extends ElasticsearchRepository<Article, Long> {
}
