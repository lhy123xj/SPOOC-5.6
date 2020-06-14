package com.nhy;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:29
 * @version: v1.0
 * @modified By:
 */
public class Utils {
    //[min,max)产生min到min-1的随机数
    // min:0 max:2 产生随机数 0（不砍） 1（砍）
    public static int randomMonsterChop(int min,int max){
        return (int) (Math.random()*(max-min)+min);

    }
}
