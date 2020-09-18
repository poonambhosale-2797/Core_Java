import java.util.Scanner;

class Sumeo{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int ar[]=new int[8];

        for(int i=0;i<8;i++){

            ar[i]=sc.nextInt();
        }

        int sume=0;
        int sumo=0;
        
        for(int i=0;i<8;i++){
            
            if(ar[i] % 2 == 0){

            sume+=ar[i];
            }
        else{
            sumo=sumo+ar[i];
        }

        }
        System.out.println("sum of even="+sume);
        System.out.println("sum of odd="+sumo);
                
    }
}