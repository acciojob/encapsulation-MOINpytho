package com.driver;

public class Main {
  public static void main(String[] args) {
          RWOnly r = new RWOnly();
//        r.name = "asd";
//        System.out.print(r.name);
//        java: name has private access in com.driver.RWOnly
          r.setName("me");
          System.out.println(r.getName());
    }
}
