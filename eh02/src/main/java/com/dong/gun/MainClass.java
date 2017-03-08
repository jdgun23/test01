package com.dong.gun;

/**
 * Created by 조동건 on 2017-03-06.
 */
public class MainClass {
    public static void main(String[] args){
        calculation calculation = new calculation();
        calculation.setFirstNum(10);
        calculation.setSecondNum(2);

        calculation.add();
        calculation.sub();
        calculation.multi();
        calculation.div();
    }
}
