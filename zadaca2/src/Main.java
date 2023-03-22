public class Main {
    public static void main(String[] args) {

        // Prvi zadatak

        int moneyInDrawer = 70;
        int billAmount = 20;
        int givenMoney = 90;
        int change = givenMoney - billAmount;

        if (billAmount <= 0) {
            if (billAmount < 0) {
                System.out.println("Did you maybe break something?");
            } else {
                System.out.println("You didnt buy anything did you?");
            }
        }


        if (moneyInDrawer > 100) {
            System.out.println("You have too much money");
        } else if (change > moneyInDrawer) {
            System.out.println("You do not have enough money in drawer!");
        } else if (change <= moneyInDrawer && moneyInDrawer > 0) {

            int bam20 = change / 20;
            change = change % 20;

            int bam10 = change / 10;
            change = change % 10;

            int bam2 = change / 2;
            change = change % 2;

            int bam1 = change;

            System.out.println("Change:");
            if (bam20 > 0) {
                System.out.println(bam20 + " x 20 BAM");
            }
            if (bam10 > 0) {
                System.out.println(bam10 + " x 10 BAM");
            }
            if (bam2 > 0) {
                System.out.println(bam2 + " x 2 BAM");
            }
            if (bam1 > 0) {
                System.out.println(bam1 + " x 1 BAM");
            }
        }

        // Drugi zadatak

        int r = 2; //given in cm
        float PI = 3.14159265358979323846F;
        float area = r * r * PI;
        System.out.println("Circle area is: " + area + " cm2");

        //Treci zadatak

        int numA = 18;
        int numB = 3;

        if (numA > 10 && numA % 3 == 0 && numA < 10000 && numA % numB == 0) {
            System.out.println("The entered numbers meet all conditions");
        } else {
            System.out.println("The entered numbers do not meet one or more conditions");
        }

            // Cetvrti zadatak

        int numbA = 25;
        int numbB = 10;

        if (numbA > numbB) {
            System.out.println(numbA + numbB);

            } else if (numbB > numbA) {
                System.out.println(numbB - numbA);
            } else if (numbA == numbB) {
                System.out.println(numbA * numbB);
            }

            // Peti zadatak

            int x = 78;
            int y = ((x + x + 6) / 2) - x;
            if (y % 2 == 0) {
                System.out.println("The number y is: " + y + " and is divisible by 2");
            } else
                System.out.println("The number y is: " + y + " and is not divisible by 2");

            // Sesti zadatak

            int numberA = 5;
            int numberB = 8;
            int numberC = 4;
            int numberD = 6;

            if ((numberA > 0 && numberB > 0) || (numberC > 0 && numberD > 0)) {
                int sum = numberA + numberB + numberC + numberD;
                System.out.println("The sum of all numbers is: " + sum);

                if (sum > 100) {
                    if (sum % 2 == 0) {
                        System.out.println("And that sum divided by 2 is: " + sum / 2);
                    } else {
                        sum = sum - 1;
                        if (sum % 2 == 0) {
                            System.out.println("And that sum divided by 2 is: " + sum / 2);
                        } else {
                            System.out.println("The number is still not divisible by 2");
                        }
                    }
                } else {
                    System.out.println("The number is not greater then 100");
                }
            }


        }
    }