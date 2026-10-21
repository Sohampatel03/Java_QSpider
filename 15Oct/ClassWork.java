class ClassWork{
    public static void main(String args[]){
        int a[] = {12,34,56,1,23,67,23,4,7};
        int a2[] = {10,20,30,40,50};
        printEvenIdxVal(a);
        printOddIdxVal(a);
        printAvgEvenNum(a);
        printAvgPositive(a);
        copyArr(a);
        printpositiveEven(a);
        printpositiveOdd(a);
        printSumProAvg(a);
        copyEvenNum(a);
        mergeArr(a,a2);

    }
    static void printEvenIdxVal(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    static void printOddIdxVal(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
         System.out.println();
    }
    static void printAvgEvenNum(int arr[]){
        int count = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
                sum += arr[i];
            }
        }
        System.out.println(sum/count);
    }
    static void printAvgPositive(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>10 && arr[i]%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
         System.out.println();
    }
    static void copyArr(int arr[]){
        int arr2[] = new int[arr.length];
          System.out.print("arr1 - ");
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
            System.out.print(arr[i]+" ");
        }
          System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
         System.out.println();
    }
    static void printpositiveEven(int arr[]){
        for(int i=0;i<arr.length;i++){
            if((arr[i] > 10) && (arr[i]%2 == 0) && (i%2 != 0)){
                System.out.print(arr[i]+" ");
            }
        }
         System.out.println();
    }
    static void printpositiveOdd(int arr[]){
        for(int i=0;i<arr.length;i++){
            if((arr[i] > 10) && (arr[i]%2 != 0) && (i%3 == 0)){
                System.out.print(arr[i]+" ");
            }
        }
         System.out.println();
    }
    static void printSumProAvg(int arr[]){
        int sum =0;
        int pro = 1;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2 != 0) && (i%3 == 0) && (i%2 != 0)){
                sum += arr[i];
                pro *= arr[i];
                count++;
            }
        }
        System.out.println("sum is "+sum);
        System.out.println("product is "+pro);
        System.out.println("Average is "+sum/count);
    }
    static void copyEvenNum(int arr[]){
        int arr2[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                arr2[i] = arr[i];
            }
        }
         System.out.println();
    }
    static void mergeArr(int arr[],int arr2[]){
        int arr3[] = new int[arr.length+arr2.length];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count++;
                arr3[i] = arr[i];
        }
        for(int i=0;i<arr2.length;i++){
                arr3[count] = arr2[i];
                count++;
        }
        System.out.print("Array three is");
        for(int i=0;i<arr3.length;i++){
                System.out.print(arr3[i]+" ");
        }
    }
}