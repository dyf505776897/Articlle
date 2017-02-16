package demo.article.dyf.mc.articlle;

import java.util.List;

import demo.article.dyf.mc.articlle.entity.Article;

/**
 * Created by dyf on 2017/2/13.
 */
//接口M
public interface ArticleModel {
    public void saveArticles(List<Article> articles);
    public void loadArticlesFromCache(DataListener<List<Article>> listener);
}
