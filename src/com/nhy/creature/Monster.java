package com.nhy.creature;

import com.nhy.Room;
import com.nhy.RoomSet;
import com.nhy.article.Weapon;

import java.util.ArrayList;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:28
 * @version: v1.0
 * @modified By:
 */
public  class Monster extends Creature {






    @Override
    public void useArticleMethod(Weapon weapon, Creature targetCreature) {
           weapon.useArticleMethod(targetCreature);
    }
    public void lifeChange(int HP){

    }
    public void lifeChange(){

    }
    public void bite(Creature targetCreature,int damagePoint){

    }
    public void teleport(RoomSet roomSet){


    }
}
