package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);
        getAllChildViewCount();
    }
    private int count = 0;
    public int getAllChildViewCount() {
        ViewGroup viewGroup = getWindow().getDecorView().findViewById(android.R.id.content);
        ViewGroup rootView = (ViewGroup)viewGroup.getChildAt(0);
        traversalView(rootView);

        TextView tv_content_info;
        tv_content_info = findViewById(R.id.tv_content_info);

        tv_content_info.setText("共有"+count+"view"+"\n");
        Log.d("count",count+"");
        return 0;
    }
    private void traversalView(ViewGroup rootview) {
        for (int i = 0; i < rootview.getChildCount(); i++){
            View child_view = rootview.getChildAt(i);
            if(child_view instanceof ViewGroup){
                traversalView((ViewGroup) child_view);
            }
            else count++;
        }
        count++;
    }
}
