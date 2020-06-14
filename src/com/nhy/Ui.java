package com.nhy;

import com.nhy.creature.Creature;
import com.nhy.creature.Monster;
import com.nhy.creature.Person;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:25
 * @version: v1.0
 * @modified By:
 */
public class Ui {

    public static void displayIntro(Person person){
        System.out.println("欢迎来到 老八秘制小汉堡儿 小游戏，这里是老八，奥利给，造它就完了！");
        System.out.println("老八又想做既实惠，还管饱的秘制小汉堡儿了，可是老八缺少做汉堡儿的配料，你能帮助他吗？");
        System.out.println("  -----------------");
        System.out.println(" |_________________|");
        System.out.println(" V  ___   <8>  ___ V");
        System.out.println("（   Q           Q  ）");
        System.out.println(" |       |  |       |");
        System.out.println("  \\       \\/       /");
        System.out.println("   \\     ____    / ");
        System.out.println("     \\_________/  ");
        System.out.println("请输入：help 查看游戏命令");


    }
    public  static void  displayReachableRooms (Person person){
        System.out.println("现在你在"+person.getCurrentRoom().getId()+"("+person.getCurrentRoom().toString()+")");
        System.out.println("出口有：");
        for(String key : person.getCurrentRoom().getReachableRooms().keySet()){
            System.out.print(key + "("+person.getCurrentRoom().getReachableRooms().get(key).getDescription()+")"+" ");

        }
        System.out.println();
    }
    public static void  displayStaus(Sense sense){


        System.out.println("---------------------------------------------------------");
        System.out.println(sense.getPerson().getDescription()+"血量:"+sense.getPerson().getHPvalue());
        System.out.println("你的武器是："+sense.getPerson().getCurrentWeapon().getDescription());
        System.out.print("这里有：");
        for(Monster item:sense.getMonsterSet().getMonsters()){
            System.out.print(item.getId()+"("+item.getDescription()+")血量:"+item.getHPvalue()+
                    "（武器:"+item.getCurrentWeapon().getDescription()+")\t");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");

    }
    public static void displayHelpMsg(){
        System.out.println("迷路了吗？ 命令我老八:--chop--bye--go--");
        System.out.println("如：\t go r2");
    }

    public static void displayBye(){
        System.out.println("老铁再见！");
    }
    public static void displayNoRoom(){System.out.println("那里没地儿走了！");}
    public static void displayErrorCmdMsg(){
        System.out.println("这命令我老八可不会做。");
    }
    public static void displayDamageMsg(Creature attackCreature, Creature targetCreature){
        System.out.println(attackCreature.getDescription()+"对"+targetCreature.getDescription()+"造成"
                +attackCreature.getCurrentWeapon().getDamagePoints()+"伤害");

    }
}

