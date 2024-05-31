import java.util.Scanner;
public class Game
{
    public static void main(String[] args){
        //introduction
        String name = "";


        System.out.println("Welcome. What is your name?");
        Scanner input = new Scanner(System.in);
        name = input.next();
        System.out.println("Wonderful. Well, that doesn't matater tot anymore. Your name is now Epsilon. You may find this surprising, but you are also a ferret. As ferrets often are, you were the subject of government experimentation. But that's not important right now, because, more importantly, you were placed on this Earth for one single goal: wreak absolute havoc.\n\n");



        Ferret ferret = new Ferret(name);
        while(ferret.getCont()){
            ferret.game();
        }
    }

}