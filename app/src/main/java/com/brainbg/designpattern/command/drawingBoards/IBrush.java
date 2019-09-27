package com.brainbg.designpattern.command.drawingBoards;

import android.graphics.Path;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public interface IBrush {
    void down(Path path, float x, float y);
    void move(Path path, float x, float y);
    void up(Path path, float x, float y);
}
