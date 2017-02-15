package demo.article.dyf.mc.articlle;

import java.util.List;

/**
 * Created by dyf on 2017/2/10.
 */
//作为view和model的中间人
public class ArticlePresenter {
    //ArtcleView 接口,代表了view的接口角色
    ArticleViewInterface mArticleView;
    //文章数据的model,也就是model的角色
    ArticleModel mArticleModel = new ArticleModelImpl();
    //从网络获取文章的api
    ArticleAPI mArticleApi = new ArticleAPIImpl();

    public ArticlePresenter(ArticleViewInterface viewInterface){
        mArticleView = viewInterface;
    }

    //获取文章,也就是我们的业务逻辑
    public void fetchArticles(){
        mArticleView.showLoading();
        mAriticleApi.fetchArticles(new DataListener<List<Article>>(){
            @Override
            public void onComplete(List<Article> result) {
                //数据加载完，调用View的showArticles函数将数据传递给View显示
                mArticleView.showArticles(result);
                mArticleView.hideLoading();
                //存储到数据库
                mArticleModel.saveArticles(result);
            }
        });
    }

    public void loadArticlesFromDB(){
        mArticleModel.loadArticlesFromCache(new DataListener<List<Article>>() {
            @Override
            public void onComplete(List<Article> result) {
                //从数据库加载
                mArticleView.showArticles(result);
            }
        });
    }




}
