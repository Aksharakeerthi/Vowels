# Vowels
import java.io.*;
import java.util.*;
public class Vowels{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the letters");
n=sc.nextInt();
if(n == 'a' || n =='e' || n == 'i' || n == 'o' || n =='u'){
System.out.println("Letters is vowels");
}
else
System.out.println("Letters is consonant");
}
}
