class BB {
    public int number=2;

    private void method1(){
        System.out.println("some private method");
    }
    public void method2(){
        System.out.println("some public method inside b");
    }
}

 class C extends B {
     public int number=1;
     public void method2(){
         System.out.println("method2 inside C");
     }
     public void method1(){
         System.out.println("method 1");
     }

    public static void main(String[] args) {
        B b = new C();
        b.method2();

        System.out.println((b).number);
        b.methodC();
    }
}