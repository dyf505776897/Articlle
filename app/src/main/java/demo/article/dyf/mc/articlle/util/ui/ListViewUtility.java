package demo.article.dyf.mc.articlle.util.ui;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListViewUtility {
	/**
	 * 为解决 scrowview 下面的 listview 完全显示
	 * 
	 * 计算listview的高度
	 * @param listView
	 */
	public static void setListViewHeightBasedOnChildren(ListView listView) {  
		ListAdapter listAdapter = listView.getAdapter();   
		if (listAdapter == null) {  
			// pre-condition  
			return;  
		}  

		int totalHeight = 0;  
		for (int i = 0; i < listAdapter.getCount(); i++) {  
			View listItem = listAdapter.getView(i, null, listView);  
			listItem.measure(0, MeasureSpec.UNSPECIFIED);  
			totalHeight += listItem.getMeasuredHeight()-76;  
		}  

		ViewGroup.LayoutParams params = listView.getLayoutParams();  
		params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));  
		listView.setLayoutParams(params);  
	}  
}
