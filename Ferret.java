//Error count: 45

import java.util.Scanner;

public class Ferret {
    private final String name;
    private int money;
    private int evilness;
    private boolean cont;

    //constructor
    public Ferret(String name){
        this.name = name;
        money = 0;
        evilness = 0;
        cont = true;
    }

    public void game(){
        int input = 0;
        while(input != -1){
            System.out.println("What shenanigans would you like to commit today? Enter 1 for theft, 2 for arson, 3 for murder, 4 for tax evasion, 5 for politics. Enter -1 if you wish to end the game (why? :( )");
            System.out.println("If you want to see how much money you have, press 6. If you want to see how evil you are, press 7.");
            Scanner i = new Scanner(System.in);
            input = i.nextInt();
            cont = true;
            System.out.println("\n\n");
            if(input == 1){
                theft();
                input = -1;
            }
            else if (input == 2){
                arson();
            }
            else if (input == 3){
                murder();
            }
            else if (input == 4){
                taxEvasion();
            }
            else if (input == 5){
                politics();
            }
            else if (input == 6){
                getMoney();
            }
            else if (input == 7){
                getEvilness();
            }
            else if (input == -1){
                cont = false;
                System.out.println("ok...fine. Bye " + name + ".");
            }
            else{
                System.out.println("Sorry, your tiny little ferret brain can't comprehend that. Please try again.");
            }
        }
        System.out.println("\n\n");
    }


    //me when i code an entire move method just to not use it :(
     /*
     public int move(){
     int movement = 0;
     while ((movement != 1) && (movement != 2) && (movement != 3) && (movement != 4)){
         System.out.println("Where would you like to go? Press 1 for forward, 2 for backward, 3 for right, and 4 for left");
         Scanner input = new Scanner(System.in);
         movement = input.nextInt();
         if ((movement == 1) || (movement == 2) || (movement == 3) || (movement == 4)){
          return movement;
         }//if
     System.out.println("Sorry, your ferret brain can't comprehend that. Please try again");
     }//while
    return -1;
    }//move method
    */



    public void theft(){
        int randomTaxBracket = (int)(Math.random() * 101) + 1;
        int randomMoney;

        if(randomTaxBracket < 45){
            randomMoney = (int)(Math.random() * 300);
            System.out.println("You find a person whose purse is adequately close to the ground. You shimmy into it and nab their wallet. \nYou successfully steal $" + randomMoney);
            money += randomMoney;
            evilness += 4;
        }
        else if (randomTaxBracket < 90){
            randomMoney = (int)(Math.random() * 99700) + 300;
            System.out.println("Someone has left their briefcase alone for too long. You manage to undo the clasp with your magic ferret powers of chaos. \nYou successfully steal $" + randomMoney + ", trampling some important-looking documents in the process. Eh, whatever.");
            money += randomMoney;
            evilness -= 2;
        }
        else if (randomTaxBracket <100){
            randomMoney = (int)(Math.random() * 1000000000) + 10000;
            System.out.println("Some rich person is out on the streets, arrogantly flaunting their wealth. \nLuckily, you are a very capable ferret, who also happens to hate the bourgeoisie and capitalism and Elon Musk. (Is this Elon Musk? Who knows, you're just a ferret.) \nYou succesfully steal $" + randomMoney + ". Good job, you've done your civil service for the year.");
            money += randomMoney;
            evilness -= 8;
        }
        else{
            System.out.println("Your magical ferret powers only go so far...you fail to steal any money. Sucks to be you");
        }
        System.out.println("\n\n");
    }

    public void arson(){
        if (money < 10000){
            System.out.println("Unfortunately, you do not have enough money to complete this endeavour. \nPlease try to commit arson later, when you...\"legally\" acquire more funds. \nI know, society is so classist sometimes, right? Can't even commit a little arson these days.");
        }
        else{
            int random = (int)(Math.random() * 100) + 1;
            if(random<75){
                money -= 10000;
                System.out.println("You spend some money on gasoline and matches. \nYou find a nice enough target for your shenanigans, and douse the walls (as far up as your tiny ferret body can reach) in gasoline.");
                System.out.println("You drop a lit match on the gasoline and watch the building go up in flames. \nYou cackle as the sweet sounds of screams enter your furry little ears.");
                evilness += (int)(Math.random() * 11) + 1;
            }
            else{
                System.out.println("You firebomb a Walmart.");
                evilness -= (int)(Math.random() * 5) + 6;
            }
        }
        System.out.println("\n\n");
    }

    public void murder(){
        int randomTaxBracket = (int)(Math.random() * 101) + 1;

        if(randomTaxBracket < 35){
            System.out.println("You see some random person in an alleyway. You would kill them, but even ferrets have standards. \nYou leave them alone, but manage to stick a knife (laced with the deadly poison, a bullet to the head,) in some other dude blaming climate change on ferrets. \nThe nerve, honestly.");
            evilness += 2;
        }
        else if (randomTaxBracket < 65){
            System.out.println("You kill a lawyer. \nNow, this lawyer might be a good lawyer, but, you see, the creator of this silly goofy little game has a moral obligation to dislike lawyers so...good job? I guess?");
            evilness -= 2;
        }
        else if (randomTaxBracket <75){
            System.out.println("You kill Elon Musk. Excellent job, you've done a great service to humanity.");
            evilness -= 10;
        }
        else{
            System.out.println("Your magical ferret powers only go so far...you fail to murder anyone. Sucks to be you");
        }
        System.out.println("\n\n");
    }

    public void taxEvasion(){
        double answer;
        double userAnswer;
        boolean correct = false;

        System.out.println("According to Google, in order to successfully commit tax fraud, you need to be good at math. \nCorrectly answer this problem in order to commit tax fraud and go your merry, albeit furry, way. \nAnswer in decimal form or with a whole number. Round all decimal answers to the third decimal.\n");
        int prblm = (int)(Math.random()*15) + 1;

        if(prblm == 1){
            System.out.println("If the integral of g(x)dx from 4 to -10 = -3 and the integral of g(x)dx from 4 to 6 = 5, then the integral of g(x)dx from -10 to 6 = ?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 8;
            if(answer == userAnswer){correct = true;}
        }//prblm1
        else if (prblm == 2){
            System.out.println("Let y = f(x) be the solution to the differential equation dy/dx = x-y with initial condition f(2) = 8. \nWhat is the approximation for f(3) obtained by using Euler's method with two steps of equal length, starting at x = 2?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 3.75;
            if(answer == userAnswer){correct = true;}
        }//prblm2
        else if (prblm == 3){
            System.out.println("What is the sum of the bounds of the interval of convergence for the series notated as the sum from n=0 to infinity of ((x+2)^n)/(2^n)");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = -4;
            if(answer == userAnswer){correct = true;}
        }//prblm3
        else if (prblm == 4){
            System.out.println("If the infinite series notated as S = the sum from n=1 to infinity of (-1)^(n+1) * (2/n) is appoximated by Pk = the sum from n=1 to k of (-1)^(n+1) * (2/n), \nwhat is the least value of k for which the alternating series error bound guarantees that |S-Pk| < 0.03?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 66;
            if(answer == userAnswer){correct = true;}
        }//prblm4
        else if (prblm == 5){
            System.out.println("The velocity vector of a particle moving in the xy-plane has components given by dx/dt = sin(t^2) and dy/dt = e^(cos(t)). At time t = 4, the position of the particle is (2, 1). \nWhat is the y coordinate of the position vector at time = 3?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 0.590;
            if(answer == userAnswer){correct = true;}
        }//prblm5
        else if (prblm == 6){
            System.out.println("If g is a twice-differentiable function, where g(1) = 0.5 and the limit of g(x) as x approaches infinity = 4, \nthen the integral of g'(x)dx from 1 to infinity is ?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 3.5;
            if(answer == userAnswer){correct = true;}
        }//prblm6
        else if (prblm == 7){
            System.out.println("The position of an object moving along a path in the xy-plane is given by the parametric equations x(t) = 5sin(pi * t) and y(t) = (2t-1)^2. \nThe speed of the particle at time t=0 is ?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 16.209;
            if(answer == userAnswer){correct = true;}
        }//prblm7
        else if (prblm == 8){
            System.out.println("The continuous function f(x) is positive and has a domain x>0. If the asymptotes of the graph of f(x) are x = 0 and y = 2, \nthen what is the value of the limit of f(x) as x approaches infinity?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 2;
            if(answer == userAnswer){correct = true;}
        }//prblm8
        else if (prblm == 9){
            System.out.println("Let H(x) be the antiderivative of (x^3 + sin(x))/(x^2 + 2). If H(5) = pi, then H(2) = ?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = -5.867;
            if(answer == userAnswer){correct = true;}
        }//prblm9
        else if (prblm == 10){
            System.out.println("A cube with edges of length x centimeters has volume V(x) = x^3 cubic centimeters. \nThe volume is increasing at a constant rate of 40 cubic centimeters per minute. \nAt the instant when x = 2, what is the rate of change of x, in centimeters per minute, with respect to time?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 3.333;
            if(answer == userAnswer){correct = true;}
        }//prblm10
        else if (prblm == 11){
            System.out.println("The number of students in a cafeteria is modeled by the function P(x) that satisfies the logistic differential equation dP/dt = (1/2000)P(200-P), \nwhere t is the time in seconds and P(0) = 25. \nWhat is the greatest rate of change, in students per second, of the number of students in the cafeteria?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 5;
            if(answer == userAnswer){correct = true;}
        }//prblm11
        else if (prblm == 12){
            System.out.println("Let f(x) be the function with f(0) = 1/pi^2, f(2) = 1/pi^2, and the derivative given by f'(x) = (x+1)cos(pi * x). \nHow many values of x in the open interval (0, 2) satisfy the conclusion of the Mean Value Theorem for the function f on the closed interval [0, 2]?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 2;
            if(answer == userAnswer){correct = true;}
        }//prblm12
        else if (prblm == 13){
            System.out.println("What is the radius of convergence of the Maclaurin series for 2x/(1+x^2)?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 1;
            if(answer == userAnswer){correct = true;}
        }//prblm13
        else if (prblm == 14){
            System.out.println("If the average value of a continuous function f on the interval [-2, 4] is 12, what is the integral of f(x)/8 dx from -2 to 4?.");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 9;
            if(answer == userAnswer){correct = true;}
        }//prblm14
        else if (prblm == 15){
            System.out.println("A particle moves in the xy-plane so that its position for t>=0 is given by the parametric equations x = ln(t+1) and y = kt^2, where k is a positive constant. \nThe line tangent to the particle's path at the point where t=3 has slope 8. what is the value of k?");
            Scanner input = new Scanner(System.in);
            userAnswer = input.nextDouble();
            answer = 0.333;
            if(answer == userAnswer){correct = true;}
        }//prblm15

        if(correct){
            System.out.println("\n\nCongrats!! You can do basic math!!! You successfully commit tax evasion.");
            money += (int)(Math.random() * 50000) + 10000;
            evilness += 35;
        }
        else{
            System.out.println("You're too bad at math to successfully commit tax evasion. Please try again once you have a basic knowledge of elementary-level math.");
        }
        System.out.println("\n\n");

    }//tax evasion


    public void politics(){
        if(evilness < 100){
            System.out.println("Sorry, you can't do politics just yet. Try upping your evilness by committing more crimes, and come back later!");
        }
        else if(money < 500000){
            System.out.println("Sorry, you're too low-class to be a politician. Try getting more money (or being born rich, idiot), and come back later!");
        }
         else {
            int success = (int)(Math.random() * 2) + 1;
            if(success == 1){
                System.out.println("You buy a pristine suit from Brooks Brothers (as all politicians do) and somehow become the Libertarian, third-party presidential candidate. \nYou win all of the presidential debates by biting your opponents (for some reason, they all fall ill and die of disease within a week), \nand win the election because you are the only candidate alive by the time November rolls around. \nWoohoo!!! Epsilon for president!! You convert America into a dictatorship, and place yourself at the head. \nAs a genetically-modified ferret, your lifespan is significantly increased, and you rule with an iron fist until a group of rebels eventually dethrone you, millions of years later. \nYou are remembered for eons as a horrible, cruel, leader, just as you wanted. Congrats!!");
                money += 1000000;
                evilness += 1000000000;
            }
            else{
                System.out.println("You are the victim of ferret racism, and are booed off the stage. \nAngered and miserable, you set fire to the stage during one of the presidential debates, and America is left scrambling as all major political officials perish in the fire. \nYou would stick around to see what happens in the aftermath, but you're on a boat to the other side of the world, ready to start again from scratch. \nMaybe you'll have better chances succeeding politically there.");
                evilness = 0;
                money = 0;
            }
        }
    }

    public void getMoney(){
        System.out.println("Current balance: $" + money + "\n");
    }
    public void getEvilness(){
        System.out.println("Current evilness level: " + evilness + "\n");
    }
    public boolean getCont(){
        return cont;
    }

  /*
    public int money(){
        return money;
    }
    public int evilness(){
        return evilness;
    }
    */
}
