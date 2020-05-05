package com.example.roomwebapp;

import java.util.ArrayList;
import java.util.List;

public class RoomServices {
    private static List<Room> rooms = new ArrayList<>();

    static {
        for (int i=0; i<10;i++){
            rooms.add(new Room(i, "Rooms" + i, "R"+i,"Q"));
        }
    }

    public List<Room> getAllRooms(){
        return rooms;
    }
}
