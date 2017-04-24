package com.tjnu.xuan.midterm.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.tjnu.xuan.midterm.R;

public class Cartoon_9 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoon_9);

        final Animation rotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);	//获取“旋转”动画资源
        final Animation translate= AnimationUtils.loadAnimation(this, R.anim.anim_translate);	//获取“平移”动画资源
        final Animation scale=AnimationUtils.loadAnimation(this, R.anim.anim_scale);	//获取“缩放”动画资源
        final Animation alpha=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);	//获取“透明度变化”动画资源
        final ImageView iv=(ImageView)findViewById(R.id.imageView1);	//获取要应用动画效果的ImageView
        Button button1=(Button)findViewById(R.id.button1);	//获取“旋转”按钮
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                iv.startAnimation(rotate);		//播放“旋转”动画

            }
        });

    }
//    //记录蝴蝶ImageView当前的位置
//    private float curX = 0;
//    private float curY = 30;
//    //记录蝴蝶ImageView下一个位置的座标
//    float nextX = 0;
//    float nextY = 0;
//    @Override
//    public void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_shared_preferences_10);
//        //获取显示蝴蝶的ImageView组件
//        final ImageView imageView = (ImageView)findViewById(R.id.butterfly);
//        final Handler handler = new Handler()
//        {
//            @Override
//            public void handleMessage(Message msg)
//            {
//                if (msg.what == 0x123)
//                {
//                    //横向上一直向右飞
//                    if(nextX > 320)
//                    {
//                        curX = nextX = 0;
//                    }
//                    else
//                    {
//                        nextX += 8;
//                    }
//                    //纵向上可以随机上下
//                    nextY = curY + (float)(Math.random() * 10 - 5);
//                    //设置显示蝴蝶的ImageView发生位移改变
//                    TranslateAnimation anim
//                            = new TranslateAnimation(curX , nextX , curY , nextY);
//                    curX = nextX;
//                    curY = nextY;
//                    anim.setDuration(200);
//                    //开始位移动画
//                    imageView.startAnimation(anim);
//                }
//            }
//        };
//        final AnimationDrawable butterfly = (AnimationDrawable)imageView
//                .getBackground();
//        imageView.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                //开始播放蝴蝶振翅的逐帧动画
//                butterfly.start();
//                //通过定制器控制每0.2秒运行一次TranslateAnimation动画
//                new Timer().schedule(new TimerTask()
//                {
//                    @Override
//                    public void run()
//                    {
//                        handler.sendEmptyMessage(0x123);
//                    }
//
//                }, 0, 200);
//            }
//        });
//    }

}
