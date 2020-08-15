package tongxin;

/**
 * @author shksart
 * @create 2020-08-14-10:15
 *
 *
 * alt + 鼠标右键 /  command + 鼠标右键 非常有意思的一个功能，适用于梳理代码结构，esc退出
 * 1. 代码格式化： CTRL + ALT + L
 * 2. 大小写转换： CTRL + SHIFT + U
 * 3. 生成常用代码（如getter、setter、constructor等）： ALT + INSERT
 * 4. 跳转到上次编辑的位置： CTRL + SHIFT + BACKSPACE
 * 5. 最近更改的文件： CTRL + E
 * 6. 代码提示： CTRL + SPACE
 * 7. Alt + F1 弹出文件选择目标，这个很好用的
 * 8. 上下移动选中代码： CTRL + SHIFT + ↑/↓
 * 9. 复制行： CTRL + D
 * 10. 切换打开的文件： ALT + ←/→
 * 11.Alt+Enter  :根据上下文自动完成
 * 12.F2 :调到下一个错误
 * 13.Alt+1 :打开左侧目录树
 * 14.Esc :焦点回到编辑器
 * 15.Ctrl+B :跳转到定义或者实现
 * 16.Ctrl+Ctrl :快速运行
 * 17.Ctrl+W :扩展选中区域
 * 18.Ctrl+/ :注释/取消注释
 * 19.Shift+Ctrl+Enter :快速完成当前语句
 * 20.Shift+Ctrl+A :搜索Actions
 * 21.Ctrl + J 自动代码提示（提示的是自己定义的代码格式)
 * 22.Ctrl + N 查找类
 * 23.Ctrl + F 当前代码中查找
 * 24.Ctrl + U 前往父类的方法/父类
 * 25.Ctrl + F1 显示错误
 * 26.Ctrl + 1，2，3，4…. 快速定位到书签代码处(必须先Ctrl+Shift+1,2,3,4…添加书签)
 * 27.Ctrl + 空格 代码补全提示
 * 28.Alt + 方向键 上 或 方向键 下 在方法间快速移动定位
 * 29.Alt + 鼠标左键单击不放,拖动 可以直接方块区域选择（很有用）
 * 30.Shift + F6 重构：重新命名
 * 31.Ctrl + Alt + V 快速引进一个变量名   （使用率最高）
 * 32.在debug模式下，F8下一步，F9下一个断点
 * 33.按TAB+拖动代码标签，可以分开IntelliJ IDEA成多个
 ***********************常用起码模板*****************
 * 34.main函数：输入psvm即可看到提示
 * 35.System.out.println()：输入sout后回车
 * 36.sout变形：soutp(输出方法形参 )/soutm(打印方法名字)/soutv(打印方法中就近的变量)
 * 37.for循环：fori
 * 38.fori变形:iter(数组中增强的for循环)/list.for(集合中增强的for循环)
 * 39.if判断是否为空:ifn
 * 40.prsf:可生成private static final
 * 在模块外或其他模块中使用该模块中的类，会在.iml中添加依赖
 */
public class kuaijiejian {
    static int i = 1;
    static  private int c = 4;


    public static void main(String[] args) {
        System.out.println("数据是" +i);
        f();

        System.out.println();
    }

    public static  void f() {
        System.out.println("数据是" + c);

    }
}
