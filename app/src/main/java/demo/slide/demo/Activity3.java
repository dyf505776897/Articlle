package demo.slide.demo;

import android.graphics.Color;

import com.example.yuyu.slideactivity.base.BaseActivity;

/**
 * Created by yuyu on 2015/10/26.
 */
public class Activity3 extends BaseActivity {

    @Override
    protected int setBackgroundColor() {
        return Color.GRAY;
    }

    @Override
    protected String setButtonText() {
        return "第三个Activity";
    }

}
