import java.util.*;
public class pat16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of *");
        n=in.nextInt();
        int c=n+1;
        for(int i=1;i<=(n+1)/2;i++){
            for(int j=1;j<=n;j++){
                    if(i==1||i==j||((i+j)==c)&&(i<=j)){
                    System.out.print("*");}
                    else if(i==n&&j==n){
                        System.out.print("*"); 
                    }else{System.out.print(" ");}
                }
            System.out.println(" ");
        }
    }
}


