
import java.util.Scanner;
public class jav{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int arr1=sc.nextInt();
        int arr2=sc.nextInt();
        int a=1;
        int[][] arr=new int[arr1][arr2];
        for(int i=0;i<arr1;i++){
            for(int j=0;j<arr2;j++){
                arr[i][j]=a;
                a++;
            }
        }
        for(int i=0;i<arr1;i++){
            for(int j=0;j<arr2;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}