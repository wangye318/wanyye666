import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.print.Book;



//        int c=1,b=0;
//
//        for(int a=0,a<9,a++){
//            System.out.println("水仙花啊啊啊"+a*a*a+b*b*b+c*c*c);
//               }
//        int a=66;
//        switch (a){
//            case(0):
//                System.out.print("lll");
//                break;
//            case(1):
//                System.out.print("kkk");
//                break;
//            case(2):
//                System.out.print("ddd");
//                break;
//            default:
//                System.out.print("ooo");
//        String str1="hello your grace";
//        System.out.print("\""+str1+"\"的长度为："+str1.length());
//        int [][]a={{1,2,3},{4,5,6}};
//        System.out.println(a.length);
//        System.out.print(a[0].length);
//        public static void main(String[]args){
//            int [][] arr=new int[][]{{4,5,6},{2,3,9}};
//            int [][]arrtrans=new int[arr[0].length][arr.length];
//            for(int i=0;i<arr.length;i++){
//                for(int j=0;j<arr[0].length;j++){
//                    arrtrans[j][i]=arr[i][j];
//                }
//            }
//            for(int i=0;i<arrtrans.length;i++){
//                for(int j=0;j<arrtrans[0].length;j++){
//                    System.out.print(arrtrans[i][j]);
//                }
//                System.out.println();
//            }
//        }
//            public static void main(String[] args) {
//                for(int a=100;a<=999;a++){
//                    int b,c,d;
//                    b=a/100%10;
//                    c=a/10%10;
//                    d=a%10;
//                    int i=b*b*b+c*c*c+d*d*d;
//                    if(a==i){
//                        System.out.println("水仙花儿emmm"+i);
//                    }
//
//                }
//                int k=1+5*5*5+3*3*3;
//                System.out.println("kkk"+k);

                  class Person{
                    private String name;
                    private int age;
                    private Boot boot;
                    public Person (String name,int age){
                        this.setName(name);
                        this.setAge(age);

                    }
                    public String getName(){
                        return  name;
                    }
                    public void  setName(String n){
                        name=n;
                    }
                    public int getAge(){
                        return  age;

                    }
                    public  void  setAge(int a){
                        age=a;
                    }

                    public Boot getBoot() {
                        return boot;
                    }

                    public void setBoot(Boot b) {
                        boot = b;
                    }
                }
                class Boot {
                    private String title;
                    private float price;
                    private Person person;
                    public Boot (String title,float price){
                        this.setTitle(title);
                        this.setPrice(price);
                    }

                    public void setTitle(String t){
                        title=t;
                    }
                    public String getTitle(){
                        return  title;
                    }


                    public void setPrice(float p) {
                        price = p;
                    }
                    public  float getPrice(){
                        return  price;
                    }

                    public void setPerson(Person person) {
                        this.person = person;
                    }

                    public Person getPerson() {
                        return person;
                    }

                }
                public class ant {
                public static void main(String[] args) {

                        Person per=new Person("赵云",30);
                        Boot bk=new Boot("《资治通鉴》",89.6f);
                        bk.setPerson(per);
                        per.setBoot(bk);
                        System.out.println("从人找书>>>>"+per.getName()+"年龄--"+per.getAge()+
                                "书名--"+per.getBoot().getTitle()+"价格--" +per.getBoot().getPrice());
                        System.out.println("从书找人>>>>"+per.getBoot().getTitle()+
                                "价格--"+per.getBoot().getPrice()+"姓名--"+per.getName()+"年龄--"+per.getAge());
                    }



                }













