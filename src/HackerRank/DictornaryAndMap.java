package HackerRank;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

// ------------ input------------
//3
//sam 99912222
//tom 11122222
//harry 12299933
//sam
//edward
//harry



// -------------Output------------
//sam=99912222
//Not found
//harry=12299933

public class DictornaryAndMap {

	public static void main(String[] args) {
		
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Map<String,Integer> directory = new HashMap<String,Integer>();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          directory.put(name,phone);
      }
      
      while(in.hasNext()){
          String s = in.next();
          if(!directory.containsKey(s)){
              System.out.println("Not found");
              continue;
          }
          System.out.println(s + "=" + directory.get(s));
      }
      System.out.println("Done");
      in.close();
  }
}
