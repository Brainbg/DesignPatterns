package com.brainbg.designpattern.command.drawingBoards;

import android.graphics.Canvas;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public interface IDraw {
    void draw(Canvas canvas);

    void undo();
}
