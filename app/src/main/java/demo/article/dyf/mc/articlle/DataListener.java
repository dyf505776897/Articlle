package demo.article.dyf.mc.articlle;

import java.util.Collection;
import java.util.List;

/**
 * Created by dyf on 2017/2/13.
 */

public interface DataListener<T extends Collection<T>> {

    /** Called before request. */
    public void onComplete(List<T> response);

}
