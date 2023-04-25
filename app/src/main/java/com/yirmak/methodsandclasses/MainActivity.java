package com.yirmak.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");

        testMethod();

        System.out.println(math(3, 5));

        System.out.println(newMethod("Luna"));

        username = "Yirmak";

        games();

        breeds();

    }

    public void breeds() {

        catsBreed cats = new catsBreed("Luna", 3, "Black and white");
        cats.age = 2;
        System.out.println(cats.age);

    }


    public void games() {

        //instance

        Gamers play = new Gamers("Kirke", "Feign", 25);
        System.out.println(play.game);
    }



    public void testMethod() {
        username = "France";
        int x = 4 + 4;
        x = 9;
        System.out.println("x değeri: " + x);

    }
    public int math(int a, int b) {
        username = "England";
        int x = 11;

        System.out.println("x: " + x);
        return a + b;
    }

    public String newMethod(String string) {
        username = "Poland";
        return string + "new Method";
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("on pause called");
    }












}