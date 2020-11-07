public class Fangfa {
    static class fun {
        public void func(Calculate per, int a, int b) {
            System.out.println(per.jisuan(a, b));
        }

    }

    static class jiafa implements Calculate {
        public double jisuan(double a, double b) {
            return a + b;
        }
    }

    static class jianfa implements Calculate {
        public double jisuan(double a, double b) {
            return a - b;
        }
    }

    static class chengfa implements Calculate {
        public double jisuan(double a, double b) {
            return a * b;
        }
    }

    static class chufa implements Calculate {
        public double jisuan(double a, double b) {
            if (b == 0) {

                return -1;
            } else {
                return a / b;
            }
        }
    }
}
