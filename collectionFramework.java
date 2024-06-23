
import java.util.TreeMap;

import  java.util.PriorityQueue;

import  java.util.TreeSet;

import  java.util.LinkedHashMap;

import  java.util.Vector;

import  java.util.Stack;

import  java.util.Scanner;

import  java.util.Set;

import  java.util.HashMap;

import  java.util.Arrays;

import  java.util.ArrayList;

import  java.util.LinkedList;

import  java.util.ArrayDeque;

import java.util.HashSet;

import java.util.Hashtable;

// In this Program I will do of all Practical of Each Collection

// Framework's And Predefined Data Structure Class into come from util package

//You Can Replace It all Library With import java.util.*;

// But i imported all Library for Easy To Understands

//I thing You Learn Something to this my code


class collectionFramework {
    Scanner sc= new Scanner(System.in);
    public void treeMethod(){

        TreeMap<String,Integer> tree=new  TreeMap<String, Integer>();
        tree.put("Name 1 ", 93);
        tree.put("name 2  ", 85);
        tree.put("Name 1", 84);
        tree.put("Name 3", 91);
        tree.put("Name 15", 90);
        tree.put("Name 2", 71);
        tree.put("Name 1", 83);
        tree.put("Name 9", 88);

        System.out.println("This all Key and pair of Tree : ");
        System.out.println("Im printing element : ");
        System.out.println(tree);
    }
    public void setLink(){

        LinkedHashMap<Integer,String> lm=new LinkedHashMap<>();

        System.out.println("In this Data Structure we are Taking Inpute from User: ");
        int m,i;
        System.out.println("Enter size of LinkedHashMap: ");
        m=sc.nextInt();

        for(i=0;i<m;i++){
            int input1;
            String input2;
            input1=sc.nextInt();
            input2=sc.nextLine();
            lm.put(input1,input2);
        }

        System.out.println("Given Value By User: \n"+lm);
    }
    public void vectorMethod(){

        Vector<String> v=new Vector<>();
        v.add("Vishal  ");
        v.add("Ritik");
        v.add("Vijay");
        v.add("Ajay");
        v.add("Ma'am ");
        v.add("Java ");
        v.add("Python");
        v.add("Machine Learning ");

        System.out.println("Here i'm Printing Vector element : ");
        System.out.println(v);
        System.out.println("This is Input Field : ");
        int i,n;
        Vector<Integer> ve=new Vector<>();
        System.out.println("Enter Size of Vector : ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            int vec;
            vec=sc.nextInt();
            ve.add(vec);
        }
        System.out.println("Your Entered Value in Vector: "+ve);
    }
    public void linkedList(){
        //Linded List Data Structure
        LinkedList<Integer> list=new LinkedList<>();

        list.add(98);
        list.add(91);
        list.add(92);
        list.add(87);
        list.add(78);
        list.add(92);
        list.add(61);
        list.add(76);
        list.add(90);

        System.out.println("I'm Printing Linked List Element : ");
        System.out.println(list);

    }
    public void arrayList(){
   //Array List Data Structure
        ArrayList<Double> arr=new ArrayList<>();

        arr.add(32.90);
        arr.add(31.864);
        arr.add(30.356);
        arr.add(38.24);
        arr.add(33.62);
        arr.add(39.321);
        arr.add(31.7823);
        arr.add(34.26);
        arr.add(32.778);

        System.out.println("I'm Printing ArrayList element : ");
        System.out.println("I thing You understatd ok Alright : ");
        System.out.println(arr);

    }
    public void hashMap(){

        //Hash Map Data Structure

        HashMap<String,Integer> hash=new HashMap<>();

        hash.put("Tanmay_Sir", 9);
        hash.put("Dinesh_Sir", 8);
        hash.put("Vijay_Sir", 10);
        hash.put("Shilpi_Ma'am", 9);
        hash.put("Ojaswee_Ma'am", 10);
        hash.put("Gurveen_Ma'am", 7);

        System.out.println("here i'm doing rate of all faculty member: ");
        System.out.println("In Key is name of faculty and value is Rating ");
        System.out.println(hash);
    }
    public void hashTree(){
        //Tree Set Data Structure:

        HashSet<Integer> set=new HashSet<>();

        set.add(21);
        set.add(31);
        set.add(41);
        set.add(62);
        set.add(31);
        System.out.println("here i'm practice of hashset Program in JAVA :");
        System.out.println(set);
    }
    public void priorityQueue(){

        //Priority Queue in Data Structure

        PriorityQueue<Integer> pqueue=new PriorityQueue<>();

        pqueue.add(21);
        pqueue.add(8);
        pqueue.add(3);
        pqueue.add(7);
        pqueue.add(13);
        pqueue.add(18);
        pqueue.add(81);
        pqueue.add(28);
        pqueue.add(12);
        System.out.println("Here i'm doing practical of Priority Queue:  ");
        System.out.println("One Im[portant things About Priority Queue : ");
        System.out.println("Priority Queue is always return decending order element :");
        System.out.println(pqueue);
    }
    public void treeSet(){
        //Tree set Data Structure

        TreeSet<Double> ob=new TreeSet<>();

        ob.add(21.78);
        ob.add(31.67);
        ob.add(23.67);
        ob.add(26.98);
        ob.add(44.74);
        ob.add(54.912);
        ob.add(50.18);
        ob.add(425.56);

        System.out.println("Program of treeset : ");
        System.out.println(ob);
    }
    public void hashTableMethod(){

        //hash Table in Data Structure

        Hashtable<Integer,String> hash=new Hashtable<>();
        hash.put(10,"Mayur");
        hash.put(20,"Mohan");
        hash.put(30,"John");
        hash.put(21,"Adesh");
        hash.put(13,"Hemant");
        hash.put(19,"Arun");
        hash.put(15,"Jyoti");
        hash.put(16,"Om");
        hash.put(19,"Varun");
        System.out.println("This is PreInsert Value ");

        System.out.println(hash);
        System.out.println("Taken value from user: ");
        Integer h,j=0;
        HashMap <Integer,String>h1=new HashMap<>();
        String str;
        System.out.println("Enter size of HashTable: ");
        h=sc.nextInt();
        System.out.println("Enter Value and key pair String and Integer : ");

        for(j=0;j<h;j++){
            int temp;
            temp=sc.nextInt();
            String temp2;
            temp2=sc.nextLine();
            h1.put(temp,temp2);
        }
        System.out.println("This is User Given Data : "+h1);
    }
    public void stackMethod(){

        //Stack Data Structure :

        Stack<Integer> s=new Stack();
        s.push(20);
        s.push(10);
        s.push(28);
        s.push(34);
        s.push(11);
        s.push(19);
        s.push(14);
        s.push(11);
        s.push(19);
        s.push(29);
        System.out.println("All Element of Stack Data \n Structure : ");
        System.out.println(s);

    }
    public void linkedHashMap(){
        int i,n,temp;
        String str;
        System.out.println("Enter The valeu of n : ");
        n= sc.nextInt();
        LinkedHashMap<String,Integer> hashMap= new LinkedHashMap<>();
ArrayList<String> arr= new ArrayList<>();
        for (i=0; i<n; i++){
            str= sc.next();
            arr.add(str);
            temp= sc.nextInt();
            hashMap.put(str,temp);
        }
        try {
            System.out.println("Itration of Hashmap: ");

            for (i = 0; i < n; i++) {
                hashMap.get(arr.get(i));
            }
        }
        catch (Exception e){
            System.out.println("Somthing Went Wrong : The Error type is : ");
            e.printStackTrace();
        }
        finally {
            System.out.println("if any Exception Occure Still this BLock is Running How to Possible let's See ");
            System.out.println("Key Value pair of Hashmap : "+hashMap);
        }
    }
    public void ArrQue(){

        ArrayDeque<Integer> arr=new ArrayDeque<>();
        Integer i=0,n;

        System.out.println("Enter size of Queue : ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            int c;
            c=sc.nextInt();
            arr.push(c);
        }
        System.out.println("All Element of Array Queue : "+arr);
    }
    public static void main(String[] args) {

        collectionFramework object =new collectionFramework();

        object.linkedHashMap();
        /*

        object.setLink();

        object.treeMethod();

        object.arrayList();

        object.hashMap();

        object.treeSet();

        object.hashTree();

        object.linkedList();

        object.vectorMethod();

        object.priorityQueue();

        object.hashTableMethod();

        object.stackMethod();

        object.ArrQue();
*/
    }
}