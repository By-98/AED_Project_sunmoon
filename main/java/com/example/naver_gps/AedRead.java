package com.example.naver_gps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class AedRead {


    String readString =null;



    void set(AedList al) {

        File file = new File("/data/data/com.example.naver_gps/files/Aed/AedLocation.txt");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            while ((readString = bf.readLine()) != null) {
                Aed aed = new Aed();
                StringTokenizer st = new StringTokenizer(readString, ",");
                aed.hardness = Double.parseDouble(st.nextToken());//문자열을 실수로
                aed.latitude = Double.parseDouble(st.nextToken());//문자열을 실수로
                aed.place = st.nextToken();
                aed.location = st.nextToken();
                al.list.add(aed);


            }
            bf.close();

        } catch (Exception e) {
        }

    }


}
