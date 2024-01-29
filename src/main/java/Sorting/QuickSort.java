package Sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class QuickSort {
    static Random r = new Random();

    public static void main(String[] args) {
        Integer[] teset = new Integer[]{55, 3, 8, 88, 1, 88};
        System.out.println(Arrays.deepToString(quickSrt(teset)));

        //ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 77, 5));
        //Integer[] aaa =  arA.toArray(new Integer[]{});
        //ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
        //ArrayList<Integer> b = ;

    }


    public static Integer[] quickSrt(Integer[] input){
        int baseIn = r.nextInt(input.length);
        Integer[] base = new Integer[1];
        base[0] = input[baseIn];
        System.out.println("base chosen: "+base[0]);

        Object[] raw = splitSwap(base, input);
        Integer[] aa = (Integer[]) raw[0];
        Integer[] bb = (Integer[]) raw[1];
        base = (Integer[]) raw[2];

        if(aa.length>=2){
            aa = quickSrt(aa);
        }
        if(bb.length>=2){
            bb = quickSrt(bb);
        }

        Integer[] result = new Integer[input.length];
        if(aa.length>0){
            System.arraycopy(aa, 0, result, 0, aa.length);
        }

        //int basePos = aa.length==0 ? 0 : aa.length;

        if(base.length>1){
            System.arraycopy(base, 0, result, aa.length, base.length);
        } else if(base.length==1){
            result[aa.length]=base[0];
        }

        if(bb.length>0){
            System.arraycopy(bb, 0, result, aa.length+base.length, bb.length);
        }

        return result;
    }

    /*Params:
src – the source array.
srcPos – starting position in the source array.
dest – the destination array.
destPos – starting position in the destination data.
length – the number of array elements to be copied.

arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);*/

    public static Object[] splitSwap(Integer[] base, Integer[] input ){
        // a - < base
        // b - > base
        // base - == base
        int initBase = base[0];
        Integer[] aa=new Integer[input.length];
        int aaI = 0;
        Integer[] bb=new Integer[input.length];
        int bbI = 0;
        base=new Integer[input.length];
        int baseI = 0;

        for (int i = 0; i < input.length; i++) {
            if((int) input[i] == initBase){
                base[baseI] = input[i];
                baseI++;
            }else if((int) input[i] < initBase){
                aa[aaI] = input[i];
                aaI++;
            }else if((int) input[i] > initBase){
                bb[bbI] = input[i];
                bbI++;
            }
        }

        Integer[] aa1=new Integer[aaI];
        Integer[] bb1=new Integer[bbI];
        Integer[] base1=new Integer[baseI];
        System.arraycopy(aa, 0, aa1, 0, aaI);
        System.arraycopy(bb, 0, bb1, 0, bbI);
        System.arraycopy(base, 0, base1, 0, baseI);

        return new Object[]{aa1, bb1, base1};
    }
}
