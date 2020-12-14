package Test;

import java.util.Arrays;

public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {

        String[] str={"aa","bb","cc"};
        int[] arr = {10, 20, 30};
        System.out.println(str);

       String[] bb =  Arrays.copyOf(str,4);
        System.out.println(bb.length);
       for (int i=0;i<bb.length;i++){
           System.out.println(bb[i]);
       }
    }
}
