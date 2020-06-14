package com.nhy.creature;

import com.nhy.Room;
import com.nhy.article.Weapon;

import java.util.ArrayList;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:28
 * @version: v1.0
 * @modified By:
 */
public abstract class Creature {
    private String id;
    private String description;
    private int HPvalue;
    private Weapon currentWeapon;
    private ArrayList<Weapon> weapons=new ArrayList<Weapon>();
    private Room currentRoom;
    private ArrayList<Room> rooms = new ArrayList<Room>();





    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Creature(String id, String description, int HPvalue, Weapon currentWeapon, ArrayList<Weapon> weapons, Room currentRoom, ArrayList<Room> rooms) {
        this.id = id;
        this.description = description;
        this.HPvalue = HPvalue;
        this.currentWeapon = currentWeapon;
        this.weapons = weapons;
        this.currentRoom = currentRoom;
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }




    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public abstract void useArticleMethod(Weapon weapon, Creature targetCreature);


    public  void lifeChange(int HP){}

    public Creature(){
    }

    public Creature(String id, String description, int HPvalue) {
        this.id = id;
        this.description = description;
        this.HPvalue = HPvalue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHPvalue() {
        return HPvalue;
    }

    public void setHPvalue(int HPvalue) {
        this.HPvalue = HPvalue;
    }

}
