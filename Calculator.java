
    import java.util.Scanner;

    class Calculator {

        public static void main(String[] args) {
            Fangfa.fun i = new Fangfa.fun();
            Fangfa.jiafa s1 = new Fangfa.jiafa();
            Fangfa.jianfa s2 = new Fangfa.jianfa();
            Fangfa.chengfa s3 = new Fangfa.chengfa();
            Fangfa.chufa s4 = new Fangfa.chufa();
            System.out.println("请输入你要计算的两个数字:");
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            int str = scanner.nextInt();
            int str2 = scanner2.nextInt();
            int a = str;
            int b = str2;
            System.out.println("请输入您想要计算的方式(+，-，*，/):");
            Scanner scanner3 = new Scanner(System.in);
            String zifu1 = scanner3.next();
            scanner3.nextLine();
            while (true) {
                if (zifu1.equals("+")) {

                    System.out.print("加法结果:");
                    i.func(s1, a, b);
                    break;

                } else if (zifu1.equals("-")) {
                    System.out.print("减法结果:");
                    i.func(s2, a, b);
                    break;

                } else if (zifu1.equals("*")) {
                    System.out.print("乘法结果:");
                    i.func(s3, a, b);
                    break;
                } else if (zifu1.equals("/")) {
                    System.out.print("除法结果:");
                    i.func(s4, a, b);
                    break;

                } else {
                    System.out.println("非法输入!不要来闹好吗");
                    break;
                }
            }

        }
    }









