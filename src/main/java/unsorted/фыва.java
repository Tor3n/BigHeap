package unsorted;

import java.util.HashMap;


public class פûגא {

    public static void main(String[] args) {
        פûגא פ = new פûגא();
        פ.halotest();
    }



    int halotest(){
        Beanb bean14 = new Beanb();
        this.CheckObjectReference(bean14, InType.A, 33);
        this.CheckObjectReference(bean14, InType.B,  "kk");
        //this.CheckObjectReference(bean14, bean14.d);
        System.out.println("int value is: "+bean14.a);
        System.out.println("int value is: "+bean14.b);
        setNull(bean14.b=null);
        System.out.println(bean14.b);
        System.out.println("hehe: "+InType.A.toString());
        System.out.println(false&&true);
        return 1;
    }

    int CheckObjectReference(Beanb bean,InType field, Object value){
        bean.setValue(field, value);
        return 1;
    }

    void setNull(Object field){
        field=null;
    }

    public enum InType {
        A,
        B,
        D,
    }

    public class Beanb{
        int a;
        String b;
        Double d;
        Object[] keyTable;

        Beanb(){

        }

        void setValue(InType key, Object value){

            switch (key){
                case A: {
                    this.a=(int) value;
                    return;
                }
                case B: {
                    this.b=(String) value;
                    return;
                }
            }

            //System.out.println(keyTable[0]);
            //System.out.println(a);
        }



    }

}
