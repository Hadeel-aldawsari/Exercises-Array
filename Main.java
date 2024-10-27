import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //1.Write a Java program to test if the first and the last element of an array of
        //integers are same. The length of the array must be greater than or equal to

        int[] q1= {50,-20, 0, 30, 40, 60, 10};
        boolean equal=true;
        if(q1[0]==q1[q1.length-1]){
            System.out.println("Q1: "+equal);
        }else System.out.println("Q1: "+!equal);



        //2.Write a Java program to find the numbers greater than the average of the
        //numbers of a given array.

        int [] q2={1, 4, 17, 7, 25, 3, 100};
        ArrayList <Integer>average_list =new ArrayList<>();
        int average=0;
        for (int item :q2){
            average=average+item;
        }
        average=average/q2.length;
        for (int num : q2){
            if (num>average){
                average_list.add(num);
            }
        }
        System.out.println("Q2: average is: "+ average);
        System.out.println("The number grater than average are: "+average_list);


        //3.Write a Java program to get the larger value between first and last
        //element of an array of integers.

        int[] q3={20, 30, 40};
        int largest=q3[0];
        for (int i = 0; i <q3.length; i++) {
            if(q3[i]>largest)
                largest=q3[i];
        }
        System.out.println("Larger value between first and last element: "+largest);

        //4.Write a Java program to swap the first and last elements of an array and
        //create a new array.

        int[]q4={20, 30, 40};
        int swap=q4[0];
        q4[0]=q4[q4.length-1];
        q4[q4.length-1]=swap;
        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(q4));

        // Q5)Write a program that places the odd elements of an array before the
        //even elements.
        //ArrayList<Integer> Q5 =new ArrayList<>();
        int []q5={2,3,40,1,5,9,4,10,7};
        int current=0;
        //int j=0;
        for(int i=0;i<q5.length;i++){
                for(int j=i+1;j<q5.length;j++){
                    if(q5[i]%2==0 && q5[j]%2 !=0 ){
                        current=q5[i];
                    q5[i]=q5[j];
               q5[j]=current;
                }

            }
        }
        System.out.println("array after places the odd elements: "+Arrays.toString(q5));



        //Q6. Write a program that test the equality of two arrays.
        int[] q6_1={2,3,6,6,4};
        int[] q6_2={2,3,6,6,4};
        int i =0;
       boolean equality=true;
        do{
            if(q6_1.length!= q6_2.length){
                equality=false;
                break;
            } else if (q6_1[i]!=q6_2[i]) {
                equality=false;
                break;
            }else i++;

        }while(equality && i<q6_1.length);
        System.out.println("The result of equality: "+equality);








    }
}