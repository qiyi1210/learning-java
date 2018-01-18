package day5;

import java.net.SocketPermission;

public class MethodDemo {
    //把共同的200行代码抽离到方法中
    static void DoWork (){
        System.out.println("共同的200行代码");
    }
    public static void main(String[] args) {
        System.out.println("代码片段A!");
        MethodDemo.DoWork();//调用方法DoWork
    }
}

/* 方法定义格式：
 *[修饰符]  返回值得类型（八大基本数据类型+引用类型）  方法名称（[形式参数……]）{
 *          方法体
 *          （如果方法需要调用返回者返回一个结果，此时使用return值）
 *  }
 *  方法中的术语：
 *  修饰符：public static等 static表示方法属于类，直接使用类名调用即可。现在都使用static修饰
 *  返回值类型：
 * 方法定义的位置：
 *      1）在类中定义；在java中最小的程序单元是类
 *      2）方法定义在方法之外，方法和方法是兄弟关系
 *      3)方法定义的先后顺序不受影响
 *方法必须要调用，才能生效（看着菜单点菜）
 * 如果方法使用了static修饰
 *         此时我们使用方法 类的名称 +“.“ + 方法名(参数);
 * 如果方法没有使用static修饰：
 *         此时我们得使用方法所在类的对象来调用，暂且不讨论面向对象
 *
 * main主方法由JVM负责调用，我们只需要启用JVM就可以了。
 * */
