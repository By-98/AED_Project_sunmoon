package com.example.naver_gps;

import java.util.ArrayList;

public class AedList {

    ArrayList<Aed> list = new ArrayList<>();
    AedRead aedRead = new AedRead();

    AedList(){

        aedRead.set(this);
    }


}
