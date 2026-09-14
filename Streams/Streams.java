package Streams;
import java.util.*;
import java.util.stream.*;


public class Streams {
/*
// Q1. Filter even numbers and find their squares

  public static void main(String[]args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> res = list.stream()
        .filter(x -> x % 2 == 0)
        .map(x -> x*x)
        .toList();

        System.out.println(res);
    }
*/
/* 
//Q2. find number greater than 50 in sorted order:
    public static void main(String[]args){
       List<Integer> list = Arrays.asList(10,60,50,70,20,90,80,30);
        list.stream()
        .filter(x -> x > 50)
        .sorted()
        .forEach(System.out::println);
    }
*/
/* 
//Q3. Find maximum number using stream
public static void main(String[]args){
        List<Integer> list = Arrays.asList(10,60,50,70,20,90,80,30);
        int maxi = list.stream()
        .max(Integer::compareTo)
        .get();
        System.out.print(maxi);
    }
*/
/* 
//Q4. Find the sum of all numbers:
public static void main(String[]args){
        List<Integer> list = Arrays.asList(10,60,50,70,20,90,80,30);
        int sum = list.stream()
        .reduce(0 , (a,b)-> a+b);

        System.out.print(sum);

    }
*/

}
