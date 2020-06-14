package com.nhy;



import java.util.ArrayList;
import java.util.HashMap;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 12:10
 * @version: v1.0
 * @modified By:
 */
public class RoomSet {
    private Room currentRoom;
    private ArrayList<Room> rooms = new ArrayList<Room>();

    public void  addRoom(Room room){
        rooms.add(room);
    }

    public Room searchRoomById(String roomId){
        Room room = null;
        for(Room item: rooms){
            if (item.getId().equals(roomId)) {
                room = item;
                break;
            }
        }
        return room;
    }
}
