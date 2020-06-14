package com.nhy.article;

import com.nhy.Room;
import com.nhy.creature.Creature;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 12:53
 * @version: v1.0
 * @modified By:
 */
public abstract class Article {
    private String id;
    private String description;
    private int value;
    private Creature currentOwner;
    private Room currentRoom;

    public void useArticleMethod(Creature creature){}

    public void useArticleMethod(){}



    public Article(){

    }

    public Article(String id, String description, int value, Creature currentOwner, Room currentRoom) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.currentOwner = currentOwner;
        this.currentRoom = currentRoom;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Creature getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(Creature currentOwner) {
        this.currentOwner = currentOwner;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
