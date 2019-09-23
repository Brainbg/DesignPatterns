package com.brainbg.designpattern.composite.fileSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/23
 *     desc   :组件-目录
 * </pre>
 */
public abstract class Dir {
    /**
     * 存储文件夹下所有的元素
     */
    protected List<Dir> dirs = new ArrayList<>();
    /**
     * 文件或文件夹名
     */
    protected String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加一个文件或者文件夹
     *
     * @param dir 文件或者文件夹
     */
    public abstract void addDir(Dir dir);

    /**
     * 移除一个文件或者文件夹
     *
     * @param dir 文件或者文件夹
     */
    public abstract void removeDir(Dir dir);

    /**
     * 清空文件夹下所有元素
     */
    public abstract void clear();

    /**
     * 打印文件系统的目录结构
     */
    public abstract void printTree(int level);

    /**
     * 获取文件夹下所有的文件或子文件夹
     *
     * @return 所有的文件或子文件夹
     */
    public abstract List<Dir> getFiles();
}
