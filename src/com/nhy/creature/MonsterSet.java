package com.nhy.creature;

import com.nhy.creature.Monster;

import java.util.ArrayList;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:28
 * @version: v1.0
 * @modified By:
 */
public class MonsterSet {
    private ArrayList<Monster> monsters=new ArrayList<Monster>();

    public Monster get(String id){
        Monster monster = null;
        for (Monster item:monsters){
            if(true == id.equals(item.getId())){
                monster = item;
                break;
            }
        }
        return monster;
    }

    public MonsterSet() {

    }

    public MonsterSet(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }
}
