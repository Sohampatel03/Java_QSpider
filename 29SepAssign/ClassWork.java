class ClassWork{
    public static void main(String args[]){
        // printForwardNumber();
        // printForwardEven();
        // printForwardOdd();
        // printForwardTable();
        // printReverseNumber();
        // printReverseEven();
        // printReverseOdd();
        printReverseTable();
    }
    public static void printForwardNumber(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 10);
    }

    public static void printForwardEven(){
        int i = 1;
        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }while(i <= 10);
    }

    public static void printForwardOdd(){
        int i = 1;
        do{
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }while(i <= 10);
    }

    public static void printForwardTable(){
        int j = 10;
        int i = 1;
        do{
            System.out.println(j+"*"+i+"="+(j*i));
            i++;
        }while(i <= 10);
    }
    public static void printReverseNumber(){
        int i = 10;
        do{
            System.out.println(i);
            i--;
        }while(i >= 1);
    }

    public static void printReverseEven(){
        int i = 10;
        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i--;
        }while(i >= 1);
    }

    public static void printReverseOdd(){
        int i = 10;
        do{
            if(i % 2 != 0){
                System.out.println(i);
            }
            i--;
        }while(i >= 1);
    }

    public static void printReverseTable(){
        int j = 10;
        int i = 10;
        do{
            System.out.println(j+"*"+i+"="+(j*i));
            i--;
        }while(i >= 1);
    }
}