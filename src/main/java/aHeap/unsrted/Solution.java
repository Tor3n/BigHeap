package aHeap.unsrted;

public class Solution {
    public static void main(String[] args) {
        Root r = new Root();
        StringBuilder bldr = r.getBuilder();
        //System.out.println(bldr);
        bldr.append(" appended");
        System.out.println("bldr is "+bldr+" +hashcode: "+bldr.hashCode());
        StringBuilder bldr2 = r.getBuilder();
        System.out.println("what is there now?"+bldr2+" + hashcode: "+bldr2.hashCode());

        StringBuilder blder3 = new StringBuilder(r.getBuilder());
        blder3.append("XYU");
        System.out.println("this should be new object"+blder3+" + hashcode: "+blder3.hashCode());

        StringBuilder bldr4 = r.getBuilder();
        System.out.println("what is there now?"+bldr4+" + hashcode: "+bldr4.hashCode());
    }
  /*  public static void main(String[] s) {
        A a = new C();
        a.method2();
    }

    public static class A {
        private void method1() {
            System.out.println("A class, method1");
            (new B()).method1();
        }

        public void method2() {
            System.out.println("A class, method2");
            (new A()).method1();
        }
    }

    public static class B extends A {
        public void method1() {
            System.out.println("B class, method1");
            //super.method2();
        }

        private void method22() {
            System.out.println("B class, method22");
        }
    }

    public static class C extends B {
        public void method1() {
            System.out.println("C class, method1");
        }

        public void method2() {
            System.out.println("C class, method2");
            super.method22();
        }
    }*/
}