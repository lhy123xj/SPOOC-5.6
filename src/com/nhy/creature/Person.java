package com.nhy.creature;

import com.nhy.Room;
import com.nhy.Ui;
import com.nhy.article.Weapon;

import java.util.ArrayList;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:28
 * @version: v1.0
 * @modified By:
 */
public class Person extends Creature {
    public String id;
    public String discription;
    public Room currentRoom;
    public int HPvalue;

    @Override
    public int getHPvalue() {
        return HPvalue;
    }

    @Override
    public void setHPvalue(int HPvalue) {
        this.HPvalue = HPvalue;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public Room getCurrentRoom() {
        return currentRoom;
    }

    @Override
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }


    @Override
    public void useArticleMethod(Weapon weapon, Creature targetCreature) {
        weapon.useArticleMethod(targetCreature);
    }

    public void  go(String targetRoomId){
        Room room;

        room=currentRoom.searchReachableRoomById(targetRoomId,currentRoom.getReachableRooms());

        if(room != null){
            this.currentRoom = room;
            Ui.displayReachableRooms(this);
        }else {
            Ui.displayNoRoom();
        }
    }

    public Room getCurrenRoom() {
        return currentRoom;
    }

    public void setCurrenRoom(Room currenRoom) {
        this.currentRoom = currenRoom;
    }

    public Person(String id, String description, int HPvalue, Weapon currentWeapon, ArrayList<Weapon> weapons, Room currentRoom, ArrayList<Room> rooms, Room currenRoom) {
        super(id, description, HPvalue, currentWeapon, weapons, currentRoom, rooms);
        this.currentRoom = currentRoom;
    }

    public Person(){

    }
    public void lifeChange(int HP){

    }
    public void lifeChange(){

    }

}
