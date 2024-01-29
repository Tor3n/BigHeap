import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //ListTest.fibbonaciGenerateCycle(100);
        ListTest.recursFibOuter();
    }

    static void fibbonaciGenerateCycle(int limit){
        List<Integer> fibStore = new ArrayList<>();
        fibStore.add(0);
        fibStore.add(1);
        while(true){
            if(fibStore.get(fibStore.size()-1)>limit){
                break;
            }
            fibStore.add(fibStore.get(fibStore.size()-1) + fibStore.get(fibStore.size()-2));
        }
        System.out.println(fibStore);
    }

    static void recursFibOuter(){
        List<Integer> fibStore = new ArrayList<>();

        class FibUtil{
            public int recursFib(int a){
                if(a==2){
                    return 1;
                }else if(a==1){
                    return 0;
                }
                return recursFib(a-1)+recursFib(a-2);
            }
        }

        FibUtil f = new FibUtil();

        System.out.println(f.recursFib(6));
    }
}
