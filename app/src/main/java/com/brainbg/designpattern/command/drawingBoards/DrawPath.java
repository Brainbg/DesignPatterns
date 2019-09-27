package com.brainbg.designpattern.command.drawingBoards;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public class DrawPath implements IDraw {
    public Path path;
    public Paint paint;

    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath(path, paint);
    }

    @Override
    public void undo() {

    }
}
