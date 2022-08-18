package Task02;
import java.util.*;

public class Directions {

    public DIRECTIONS currentDirection;
    public enum DIRECTIONS{

        NORTH("Go South"){
            String getCurrentPosition(){
                return String.valueOf(this);
            }

            String NextMove(){
                return this.getMessage();
            }


        },South("Go North"){
            String getCurrentPosition(){
                return String.valueOf(this);
            }

            String NextMove(){
                return this.getMessage();
            }
        },WEST("Go East"){
            String getCurrentPosition(){
                return String.valueOf(this);
            }

            String NextMove(){
                return this.getMessage();
            }
        },EAST("Go West"){
            String getCurrentPosition(){
                return String.valueOf(this);
            }

            String NextMove(){
                return this.getMessage();
            }
        };

        private String Message;
        DIRECTIONS(String Message){
            this.Message=Message;
        }

        public String getMessage(){
            return this.Message;
        }

        abstract String getCurrentPosition();
        abstract String NextMove();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DIRECTIONS dir=DIRECTIONS.valueOf(sc.nextLine());
        System.out.println(dir.getCurrentPosition());
        System.out.println(dir.NextMove());

    }




}
