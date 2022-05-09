package com.torryharris.practice.vertx;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

import java.util.Iterator;
import java.util.Map;

public class App {

  public static void Input(){
    JSONParser parser=new JSONParser();
    try{
      Object obj=parser.parse(new FileReader("input.json"));
      System.out.println(obj);
      JSONObject json=(JSONObject) obj;
      String firstname=(String)json.get("full name");
      System.out.println("fullname:" +firstname);

      // JSONArray address=(JSONArray) json.get("address");
      Map address=((Map) json.get("address"));

      Iterator<Map.Entry> iterator= address.entrySet().iterator();
      while(iterator.hasNext()){
        Map.Entry pair=iterator.next();
        System.out.println(pair.getKey()+":"+pair.getValue());
      }

      Map ids=((Map) json.get("ids"));

      Iterator<Map.Entry> iterator2= ids.entrySet().iterator();
      while(iterator2.hasNext()){
        Map.Entry pair=iterator2.next();
        System.out.println(pair.getKey()+":"+pair.getValue());
      }

    } catch(Exception e){
      e.printStackTrace();
    }
  }

  public static void main(String args[]){

  }
}
