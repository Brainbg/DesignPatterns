package com.brainbg.designpattern.composite.fileSystem;

import java.util.List;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/23
 *     desc   : 树枝-文件夹
 * </pre>
 */
public class Folder extends Dir {

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void removeDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void printTree(int level) {
        StringBuilder tab = new StringBuilder();
        StringBuilder line = new StringBuilder();
        for (int i = 1; i <= level; i++) {
            tab.append("    ");
            line.append(" - ");
        }
        System.out.println(tab + "╙" + line + " " + name);
        level += 1;
        if (null != dirs) {
            for (Dir dir : dirs) {
                dir.printTree(level);
            }
        }
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
