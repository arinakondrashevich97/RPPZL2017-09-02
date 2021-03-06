package by.it.group573602.bulka.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        BigInteger [ ] nambersOfFibo = new BigInteger[n+1];
        nambersOfFibo[0]= BigInteger.ZERO;
        nambersOfFibo[1]=BigInteger.ONE;
        nambersOfFibo[2]=BigInteger.ONE;
        for (int i=3; i<=n; i++)
            nambersOfFibo[i]=(nambersOfFibo[i-1]).add(nambersOfFibo[i-2]);
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)
        return nambersOfFibo[n];
    }

}

