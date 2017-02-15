package demo.article.dyf.mc.articlle;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dyf on 2017/2/13.
 */

public class ArticleModeImple implements ArticleModel {
    List<Article> mCacheArticles = new LinkedList<>();

    @Override
    public void saveArticles(List<Article> articles) {
        mCacheArticles.addAll(articles);
    }

    @Override
    public void loadArticlesFromCache(DataListener<List<Article>> listener) {
        listener.onComplete(mCacheArticles);
    }
}
