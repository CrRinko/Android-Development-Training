package cn.aurora_x.android.drawview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/**
 * Created by Rinko on 2016/10/19.
 */
class DrawView extends View {

    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        Path path = new Path();
        path.moveTo(0, 50);
        path.lineTo(90, 50);
        path.lineTo(30, 0);
        path.lineTo(30, 100);
        path.lineTo(90, 20);
        path.lineTo(0, 50);
        path.close();
        canvas.drawPath(path, paint);
    }


}
