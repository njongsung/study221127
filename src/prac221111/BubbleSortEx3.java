package prac221111;

import java.util.Scanner;

public class BubbleSortEx3 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }


    //버블 정렬
    static void bubbleSort(int[]a, int n){
        for (int i=0;i<n-1;i++){
            int k=0;
            while (k < n - 1) {
                int last = n-1;
                for (int j=n-1;j>k;j--) {
                    if(a[j-1]>a[j])
                        swap(a, j-1, j);
                        last=j;
                }
                k=last;
            }


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("bubbleSort v1");
        System.out.print("요솟수의 개수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i=0; i<nx; i++){
            System.out.print("x["+i+"]: ");
            x[i]=sc.nextInt();
        }

        bubbleSort(x,nx);

        System.out.println("오름차순으로 정렬했습니다");
        for (int i=0; i<nx; i++){
            System.out.println("x["+i+"]: "+x[i]);
        }

    }
}
