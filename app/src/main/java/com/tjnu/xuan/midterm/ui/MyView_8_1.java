package com.tjnu.xuan.midterm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by a1231 on 17/4/20.
 */

public class MyView_8_1 extends View{
    public MyView_8_1(Context context, AttributeSet set)
    {
        super(context, set);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint=new Paint();
        paint.setAntiAlias(true);//使用抗锯齿功能
        paint.setColor(Color.GREEN);
//        //绘制机器人的头
//        RectF rectf_head=new RectF(110,30,200,120);
//        //rectf_head.offset(100, 20);//设置在X轴上偏移100像素，Y轴上偏移20像素
//        canvas.drawArc(rectf_head, 190, 160, false, paint);//绘制弧
//        /*.drawArc参数1：圆的范围大小；参数2：起始角度 ；
//        参数3：圆心角角度，360为圆，180为半圆；
//        参数4：中心 ；参数5：画笔Paint；*/
//        //绘制眼睛
//        paint.setColor(Color.WHITE);
//        canvas.drawCircle(135, 53, 4, paint);//绘制圆
//        canvas.drawCircle(175, 53, 4, paint);//绘制圆
//        paint.setColor(Color.GREEN);
//        //绘制天线
//        paint.setStrokeWidth(2);//设置触笔的宽度
//        canvas.drawLine(120, 15, 135, 35, paint);//绘制线
//        canvas.drawLine(190, 15, 175, 35, paint);//绘制线
//        //绘制身体
//        canvas.drawRect(110,75,200,150, paint);//绘制矩形
//        RectF rectf_body=new RectF(110,140,200,160);
//        canvas.drawRoundRect(rectf_body, 10, 10, paint);//绘制圆角矩形
//        /*参数说明
//        rect：RectF对象。
//        rx：x方向上的圆角半径。
//        ry：y方向上的圆角半径。
//        paint：绘制时所使用的画笔。*/
//
//        //绘制胳膊
//        RectF rectf_arm=new RectF(85,75,105,140);
//        canvas.drawRoundRect(rectf_arm, 10, 10, paint);
//        rectf_arm.offset(120, 0);//设置在X轴上偏移120像素
//        canvas.drawRoundRect(rectf_arm, 10, 10, paint);
//        //绘制腿
//        RectF rectf_leg=new RectF(125,150,145,200);
//        canvas.drawRoundRect(rectf_leg, 10, 10, paint);
//        rectf_leg.offset(40, 0);//设置在X轴上偏移40像素
//        canvas.drawRoundRect(rectf_leg, 10, 10, paint);
        canvas.drawCircle(135,53,100,paint); //x轴，y轴，半径，作用类
        paint.setColor(Color.WHITE);
        canvas.drawCircle(0,0,100,paint);

        super.onDraw(canvas);
    }
}
