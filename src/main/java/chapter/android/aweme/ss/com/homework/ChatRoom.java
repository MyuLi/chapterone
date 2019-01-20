package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ChatRoom extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);


        TextView tv_with_name;
        final TextView ed_say;
        ImageView btn_send_info;
        final TextView tv_content_info;

        ed_say = findViewById(R.id.ed_say);
        tv_with_name = findViewById(R.id.tv_with_name);
        btn_send_info = findViewById(R.id.btn_send_info);
        tv_content_info = findViewById(R.id.tv_content_info);

        Intent i=getIntent();
        tv_with_name.setText(i.getStringExtra("name"));

        btn_send_info.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 tv_content_info.setText(ed_say.getText().toString()+"\n\n");
                 ed_say.setText(null);
                      }
         });


    }
}
