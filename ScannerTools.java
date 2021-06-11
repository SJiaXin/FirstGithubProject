package util;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerTools {
    // Scanner静态化
    private static Scanner sc = new Scanner(System.in);

    /**
     * 返回范围之内的整数
     * @param msg   提示语句
     * @param arr   整数范围
     * @return      正确的整数
     */
    public static int getInt(String msg, int...arr) {
        while(true) {
            try {
                System.out.println(msg);
                // 如果在这里输入非整数必定出现异常然后在出现异常的时候我们做对应的处理即可
                int n = sc.nextInt();
                Arrays.sort(arr);
                switch (arr.length) {
                    case 1:
                        if (n >= arr[0])
                            return n;
                        else
                            System.err.println("请输入大于等于" + arr[0] + "的整数");
                        break;
                    case 2:
                        if (n >= arr[0] && n <= arr[1])
                            return n;
                        else
                            System.err.println("请输入" + arr[0] + "~" + arr[1] + "之间的整数");
                        break;
                    case 0:
                        return n;
                }
            } catch (Exception e) {
                System.err.println("您输入的不是整数");
                sc.next();
            }
        }
    }

    /**
     * 返回范围之内的小数
     * @param msg   提示语句
     * @param arr   小数范围
     * @return      正确的整数
     */
    public static double getDouble(String msg, double...arr) {
        while(true) {
            try {
                System.out.println(msg);
                // 如果在这里输入非整数必定出现异常然后在出现异常的时候我们做对应的处理即可
                double n = sc.nextDouble();
                Arrays.sort(arr);
                switch (arr.length) {
                    case 1:
                        if (n >= arr[0])
                            return n;
                        else
                            System.err.println("请输入大于等于" + arr[0] + "的小数");
                        break;
                    case 2:
                        if (n >= arr[0] && n <= arr[1])
                            return n;
                        else
                            System.err.println("请输入" + arr[0] + "~" + arr[1] + "之间的小数");
                        break;
                    case 0:
                        return n;
                }
            } catch (Exception e) {
                System.err.println("您输入的不是小数");
                sc.next();

            }
        }
    }


    /**
     * 返回范围之内的字符串
     * @param msg   提示语句
     * @param arr   字符串长度范围
     * @return      正确的字符串
     */
    public static String getStr(String msg, int...arr) {
        while(true) {
            System.out.println(msg);
            // 如果在这里输入非整数必定出现异常然后在出现异常的时候我们做对应的处理即可
            String n = sc.next();
            Arrays.sort(arr);
            switch (arr.length) {
                case 1:
                    if (n.length() >= arr[0])
                        return n;
                    else
                        System.err.println("请输入长度大于等于" + arr[0] + "的字符串");
                    break;
                case 2:
                    if (n.length() >= arr[0] && n.length() <= arr[1])
                        return n;
                    else
                        System.err.println("请输入长度在" + arr[0] + "~" + arr[1] + "之间的字符串");
                    break;
                case 0:
                    return n;
            }
        }
    }
}
