package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.math.BigDecimal;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //CHECKED precisa tratar com try-catch
        BigDecimal b = null;
//        b.add(BigDecimal.ONE); //java.lang.NullPointerException: Cannot invoke "java.math.BigDecimal.add(java.math.BigDecimal)" because "b" is null

        int[] nums = {1,2};
//        System.out.println(nums[2]); //java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2


        //UNCHECKED nao precisa tratar com try-catch
    }
}
