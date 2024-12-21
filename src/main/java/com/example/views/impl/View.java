package com.example.views.impl;

import java.util.List;
import java.util.Scanner;

import com.example.views.IView;

public abstract class View<T> implements IView<T>{
    public abstract void displayMenu();
    public abstract void handleUserInput();
        protected static Scanner scanner;

        public static void setScanner(Scanner scanner){
            View.scanner=scanner;
        }
        
        public void afficher(List<T> dataList){
            dataList.forEach(System.out::println);
        }
    }



    
