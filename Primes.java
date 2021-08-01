import java.util.*;

public class Primes {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      text();
      boolean test = true;
      while (test) {
         System.out.print("What is the range you are looking for? (press -1 to leave) ");
         int n = scan.nextInt();
         if(n == -1) {
            System.out.println("Thank you for using my program :) ");
            test = false;
         } else if (n < 2) {
            System.out.println("Wrong index! Your value should be greater or equal to 2.\n");
         } else {
            System.out.println("Here are the prime numbers from 2 to " + n);
            System.out.println(primeFinder(n));
            System.out.println();
         }
      }
   }

   public static Queue<Integer> primeFinder(int n) {
      Queue<Integer> q = new LinkedList<Integer>();
      for (int i = 2; i <= n; i++) {
         q.add(i);
      }
      Queue<Integer> result = new LinkedList<Integer>();
      while(!q.isEmpty()) {
         int i = q.poll();
         boolean test = true;
         for(int b = 2; b < i; b++) {
            if(i % b == 0) {
               test = false;
            }
         }
         if(test) {
            result.add(i);
         }
      }
      return result;
   }
   
   public static void text() {
      System.out.println("Hello User,");
      System.out.println("This program will help you find out all");
      System.out.println("the prime number within a certain range.");
      System.out.println("");
      System.out.println("For example, here are the prime numbers");
      System.out.println("from 2 to 100: ");
      System.out.println(primeFinder(100));
      System.out.println("");
   }
}