class ClassWork{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        printArr(arr);
        printArrReverse(arr);
        printExceptFirst_last(arr);
        printExceptFirstTwo_lastTwo(arr);
        printFirstHalf(arr);
        printLastHalf(arr);
        sum(arr);
        product(arr);
        printEven(arr);
        printOdd(arr);

    }
    static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void printArrReverse(int a[]){
        for(int i=a.length;i>a.length;i--){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void printExceptFirst_last(int a[]){
        for(int i=1;i<a.length-1;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void printExceptFirstTwo_lastTwo(int a[]){
        for(int i=2;i<a.length-2;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void printFirstHalf(int a[]){
        for(int i=0;i<a.length/2;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void printLastHalf(int a[]){
        for(int i=a.length/2;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void sum(int a[]){
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
    static void product(int a[]){
        int pro =1;
        for(int i=0;i<a.length;i++){
            pro *= a[i];
        }
        System.out.println(pro);
    }
    static void printEven(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void printOdd(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
            System.out.print(a[i]);
        }
        System.out.println();
    }
}