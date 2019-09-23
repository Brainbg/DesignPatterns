package com.brainbg.designpattern.composite.fileSystem;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/23
 *     desc   :
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        //下面例子描述：C盘下有1个文件“log.txt” 和 3个文件夹“Program Files”、
        //“Intel”、“Windows”，文件夹中也分别有文件或文件夹。

        //创建一个目录对象表示C盘
        Folder diskC = new Folder("C:");

        //log.txt 文件，添加到c盘目录中
        diskC.addDir(new File("log.txt"));

        //Program Files 文件夹下有program.txt文件和WindowsApps文件夹，文件夹里还有一个Apps.exe
        Folder folderProgram = new Folder("Program Files");
        folderProgram.addDir(new File("program.txt"));
        Folder folderApps = new Folder("WindowsApps");
        folderApps.addDir(new File("Apps.exe"));
        folderApps.addDir(new File("Appsx.exe"));
        folderApps.addDir(new File("Appsxx.exe"));
        folderProgram.addDir(folderApps);

        //Intel 文件夹
        Folder folderIntel = new Folder("Intel");
        folderIntel.addDir(new File("net.exe"));
        Folder folderLogs = new Folder("Logs");
        folderLogs.addDir(new File("Log.zip"));
        folderIntel.addDir(folderLogs);

        //Windows 文件夹
        Folder folderWindows = new Folder("Windows");
        folderWindows.addDir(new File("win.ini"));
        Folder folderFonts = new Folder("Fonts");
        folderFonts.addDir(new File("华文中宋.TTF"));
        folderWindows.addDir(folderFonts);

        //把所有文件夹都添加到c盘目录
        diskC.addDir(folderProgram);
        diskC.addDir(folderIntel);
        diskC.addDir(folderWindows);

        //打印目录树结构
        diskC.printTree(0);
    }
}
