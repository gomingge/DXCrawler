import java.util.Scanner;

//	(1)模拟Arrays.toString(int[] arr);方法，自己封装一个public static String toString(int[] arr);
//	(2)如果int类型数组arr为null，toString方法返回字符串"null"
//	(3)如果int类型数组arr长度为0，toString方法返回字符串"[]"
//	(4)如果int类型数组arr的内容为{1,2,3,4,5},toString方法返回字符串"[1, 2, 3, 4, 5]"
public class Test01 {
    public static void main(String[] args) {
        for (int i = 3; i >0; i--) {
            System.out.println("请输入用户名");
            String manual = new Scanner(System.in).nextLine();
            System.out.println("请输入密码");
            String password = new Scanner(System.in).nextLine();
            String s = "刘德华";
            if ( s =="刘德华" && manual.equals("admin") ){
                System.out.println(manual);
                System.out.println("登录成功");
                break;
            }
            if (s != "刘德华"){
                System.out.println(manual);
                System.out.println("用户名错误, 您还有"+(i-1)+"次机会");

            }else if (password != "admin") {

                System.out.println("密码错误, 您还有"+(i-1)+"次机会");

            }
        }




    }}
