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

public class MyView_8_1 extends View {
    public MyView_8_1(Context context, AttributeSet set) {
        super(context, set);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15);
//        paint.setShadowLayer(10, 15, 15, Color.GREEN);

        canvas.drawRGB(155, 155, 155);
        canvas.drawCircle(100, 150, 100, paint);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(300, 150, 100, paint);
        paint.setColor(Color.RED);
        canvas.drawCircle(500, 150, 100, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(200, 250, 100, paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(400, 250, 100, paint);
    }
}
