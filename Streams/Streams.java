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
/* 
// Q5 . count numbers divisible by 3:
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(10,60,50,70,20,90,80,30);
        long cnt = list.stream()
        .filter(x -> x % 3 == 0)
        .count();
        System.out.println(cnt);
    }
*/
/*
//Q6. remove duplicate elements:
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5);
        List<Integer> ans = list.stream()
        .distinct()
        .toList();
        System.out.println(ans);
    }
*/
/* 
// Q7 : sort string by length:
    public static void main(String[]args){
        List<String> names = Arrays.asList("Apple", "Hi", "Banana", "Cat", "Programming");
        List<String> ans = names.stream()
        .sorted(Comparator.comparingInt(String::length))
        .toList();
        System.out.println(ans);
    }
*/
/* 
//Q8 : Find the second largest number
    public static void main(String[]args){
        List<Integer> nums = Arrays.asList(10, 20, 40, 30, 40, 50);
        int s_largest = nums.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .get();

        System.out.println(s_largest);
    }
*/
/* 
//Q9. fins all names starting with a:
    public static void main(String[]args){
        List<String> names = Arrays.asList("Ayush", "Aparna", "Himanshi", "Tanisha", "Shriya");
        names.stream()
        .filter(x -> x.startsWith("A"))
        .forEach(System.out::println);
    }
*/
/* 
//Q10. Convert all strings to uppercase
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ayush", "Aparna", "Himanshi", "Tanisha", "Shriya");
        List<String> ans = names.stream()
        .map(String::toUpperCase)
        .toList();
        System.out.println(ans);
    }
*/
/*
//Q11. Find frequency of each word
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "python", "java","c++", "python", "java");
        Map<String,Long> freq = words.stream()
        .collect(Collectors.groupingBy(
            x -> x,
            Collectors.counting()
        ));
        System.out.println(freq);
    }
*/
/* 
// Q12. find freq of characters in a string
    public static void main(String[] args) {
        String s = "banana";
        Map<Character , Long> map = s.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
            c -> c,
            Collectors.counting()
        ));
        System.out.println(map);
    }
*/
/*
//Q13. find duplicate elements:
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);
        Set<Integer> set = new HashSet<>();
        nums.stream()
        .filter(n-> !set.add(n))
        .forEach(System.out::println);
    }
*/

//Q14 : 
}
