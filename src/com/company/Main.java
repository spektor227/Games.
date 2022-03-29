package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File src = new File("E://Games//src");
        if (src.mkdir())
            System.out.println("Католог - src - создан. ");

        File res = new File("E://Games//res");
        if (res.mkdir())
            System.out.println("Католог - res - создан. ");

        File savegames = new File("E://Games//savegames");
        if (savegames.mkdir())
            System.out.println("Католог - savegames - создан. ");

        File temp = new File("E://Games//temp");
        if (temp.mkdir())
            System.out.println("Католог - temp - создан. ");

        File main = new File("E://Games//src//main");
        if (main.mkdir())
            System.out.println("Католог - src -> main - создан. ");

        File test = new File("E://Games//src//test");
        if (test.mkdir())
            System.out.println("Католог - src -> test - создан. ");

        File mainJava = new File("E://Games//src//main//Main.java");
        try {
            if (mainJava.createNewFile())
                System.out.println("Файл - Main.java - создан. ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utilsJava = new File("E://Games//src//main//Utils.java");
        try {
            if (utilsJava.createNewFile())
                System.out.println("Файл - Utils.java - создан. ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("E://Games//res//drawables");
        if (drawables.mkdir())
            System.out.println("Католог - res -> drawables - создан. ");

        File vectors = new File("E://Games//res//vectors");
        if (vectors.mkdir())
            System.out.println("Католог - res -> vectors - создан. ");

        File icons = new File("E://Games//res//icons");
        if (icons.mkdir())
            System.out.println("Католог - res -> icons - создан. ");

        File temptxt = new File("E://Games//temp//temp.txt");
        try {
            if (temptxt.createNewFile())
                System.out.println("Файл - temp.txt - создан. ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        StringBuilder games = new StringBuilder();
        games.append("Католог - src - создан. \n");
        games.append("Католог - res - создан. \n");
        games.append("Католог - savegames - создан. \n");
        games.append("В катологе - src - создан директорий -> main \n");
        games.append("В катологе - src - создан директорий -> test \n");
        games.append("В катологе - res - создан директорий -> drawables \n");
        games.append("В катологе - res - создан директорий -> vectors \n");
        games.append("В катологе - res - создан директорий -> icons \n");
        games.append("Файл - temp.txt - создан. \n");
        games.append("Файл - Utils.java - создан. \n");
        games.append("Файл - Main.java - создан. \n");
        String text = games.toString();

        try {
            BufferedWriter temp1 = new BufferedWriter(new FileWriter("E://Games//temp//temp.txt"));
            temp1.write(text);
            temp1.append("!");
            temp1.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

