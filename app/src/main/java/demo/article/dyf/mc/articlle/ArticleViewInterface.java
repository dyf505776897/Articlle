package demo.article.dyf.mc.articlle;

import java.util.List;

/**
 * Created by dyf on 2017/2/10.
 */

public interface ArticleViewInterface {

    public void showArticles(List<Article> articles); //展示数据
    public void showLoading(); //显示进度条
    public void hideLoading(); //隐藏进度条
}
