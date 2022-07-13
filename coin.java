
public class coin {
 public static void main(String[] args){
        int result = 0;
        int omote = 0;
        int ura = 0;
        System.out.println("Tossing a coin...");
        for(int i = 1; i <= 3; i ++){
        int coin = new java.util.Random().nextInt(2);
        if(coin == 0){
        omote++;
        System.out.println("Round"+i+": Heads");
        } else if(coin == 1){
        ura++;
        System.out.println("Round"+i+": Tails");
        }
        }
        
        System.out.println("Heads:"+ omote +",Tails:"+ ura);
        if(omote>ura){
            System.out.println("You won");
        }
        else System.out.println("You lost");
        }  
    }