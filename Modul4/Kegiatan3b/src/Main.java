import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int levelPlayer1, levelPlayer2;
        int inputPlayer1, inputPlayer2;
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("List Characters");
        System.out.println("1. Assassin\n2. Tank\n3. Mage");
        System.out.print("Choose Character for Player 1 : ");
        inputPlayer1 = scanner.nextInt();
        System.out.print("Choose Character for Player 2 : ");
        inputPlayer2 = scanner.nextInt();

        if (inputPlayer1 == 1 && inputPlayer2 == 1) {
            System.out.print("Input Level for Player 1 : ");
            levelPlayer1 = scanner.nextInt();
            System.out.print("Input Level for Player 2 : ");
            levelPlayer2 = scanner.nextInt();

            // START MAIN CODE

            Assassin assassin = new Assassin(levelPlayer1);
            Assassin assassin2 = new Assassin(levelPlayer2);

            System.out.println("===PLAYER 1===");
            assassin.printStat(levelPlayer1);

            System.out.println("===PLAYER 2===");
            assassin2.printStat(levelPlayer2);

            System.out.println("Input Anything to Start");
            scanner.next();

            System.out.println("----------FIGHT BEGIN----------");

            do {
                System.out.println("-----ROUND " + i + "-----");
                System.out.println("---PLAYER 1 TURN---");
                assassin.spawnIntro();
                assassin2.attack(assassin);
                assassin2.checkStatus(2);

                System.out.println("---PLAYER 2 TURN---");
                assassin2.spawnIntro();
                assassin.attack(assassin2);
                assassin.checkStatus(1);

                if (assassin.getLifeStatus() == false) {
                    System.out.println("Player 2 WIN The Game");
                } else {
                    System.out.println("Player 1 WIN The Game");
                }

                i++;
            } while (assassin.getLifeStatus() == true && assassin2.getLifeStatus() == true);

            // END MAIN CODE

        } else if (inputPlayer1 == 2 && inputPlayer2 == 2) {
            System.out.print("Input Level for Player 1 : ");
            levelPlayer1 = scanner.nextInt();
            System.out.print("Input Level for Player 2 : ");
            levelPlayer2 = scanner.nextInt();

            Tank tank = new Tank(levelPlayer1);
            Tank tank2 = new Tank(levelPlayer2);

            System.out.println("===PLAYER 1===");
            tank.printStat(levelPlayer1);

            System.out.println("===PLAYER 2===");
            tank2.printStat(levelPlayer2);

            System.out.println("Input Anything to Start");
            scanner.next();

            System.out.println("----------FIGHT BEGIN----------");

            do {
                System.out.println("-----ROUND " + i + "-----");
                System.out.println("---PLAYER 1 TURN---");
                tank.spawnIntro();
                tank2.attack(tank);
                tank2.checkStatus(2);

                System.out.println("---PLAYER 2 TURN---");
                tank2.spawnIntro();
                tank.attack(tank2);
                tank.checkStatus(1);

                if (tank.getLifeStatus() == false) {
                    System.out.println("Player 2 WIN The Game");
                } else {
                    System.out.println("Player 1 WIN The Game");
                }

                i++;
            } while (tank.getLifeStatus() == true && tank2.getLifeStatus() == true);
        } else if (inputPlayer1 == 3 && inputPlayer2 == 3) {
            System.out.print("Input Level for Player 1 : ");
            levelPlayer1 = scanner.nextInt();
            System.out.print("Input Level for Player 2 : ");
            levelPlayer2 = scanner.nextInt();

            Mage mage = new Mage(levelPlayer1);
            Mage mage2 = new Mage(levelPlayer2);

            System.out.println("===PLAYER 1===");
            mage.printStat(levelPlayer1);

            System.out.println("===PLAYER 2===");
            mage.printStat(levelPlayer2);

            System.out.println("Input Anything to Start");
            scanner.next();

            System.out.println("----------FIGHT BEGIN----------");

            do {
                System.out.println("-----ROUND " + i + "-----");
                System.out.println("---PLAYER 1 TURN---");
                mage.spawnIntro();
                mage2.attack(mage);
                mage2.checkStatus(2);

                System.out.println("---PLAYER 2 TURN---");
                mage2.spawnIntro();
                mage.attack(mage2);
                mage.checkStatus(1);

                if (mage.getLifeStatus() == false) {
                    System.out.println("Player 2 WIN The Game");
                } else {
                    System.out.println("Player 1 WIN The Game");
                }

                i++;
            } while (mage.getLifeStatus() == true && mage2.getLifeStatus() == true);
        } else if ((inputPlayer1 == 1 && inputPlayer2 == 2) || (inputPlayer1 == 2 && inputPlayer2 == 1)) {
            System.out.print("Input Level for Player 1 : ");
            levelPlayer1 = scanner.nextInt();
            System.out.print("Input Level for Player 2 : ");
            levelPlayer2 = scanner.nextInt();

            Assassin assassin = new Assassin(levelPlayer1);
            Tank tank = new Tank(levelPlayer2);

            System.out.println("===PLAYER 1===");
            assassin.printStat(levelPlayer1);

            System.out.println("===PLAYER 2===");
            assassin.printStat(levelPlayer2);

            System.out.println("Input Anything to Start");
            scanner.next();

            System.out.println("----------FIGHT BEGIN----------");

            do {
                System.out.println("-----ROUND " + i + "-----");
                System.out.println("---PLAYER 1 TURN---");
                assassin.spawnIntro();
                tank.attack(assassin);
                tank.checkStatus(2);

                System.out.println("---PLAYER 2 TURN---");
                tank.spawnIntro();
                assassin.attack(tank);
                assassin.checkStatus(1);

                if (assassin.getLifeStatus() == false) {
                    System.out.println("Player 2 WIN The Game");
                } else {
                    System.out.println("Player 1 WIN The Game");
                }

                i++;
            } while (assassin.getLifeStatus() == true && tank.getLifeStatus() == true);
        } else if ((inputPlayer1 == 1 && inputPlayer2 == 3) || (inputPlayer1 == 3 && inputPlayer2 == 1)) {
            System.out.print("Input Level for Player 1 : ");
            levelPlayer1 = scanner.nextInt();
            System.out.print("Input Level for Player 2 : ");
            levelPlayer2 = scanner.nextInt();

            Assassin assassin = new Assassin(levelPlayer1);
            Mage mage = new Mage(levelPlayer2);

            System.out.println("===PLAYER 1===");
            assassin.printStat(levelPlayer1);

            System.out.println("===PLAYER 2===");
            assassin.printStat(levelPlayer2);

            System.out.println("Input Anything to Start");
            scanner.next();

            System.out.println("----------FIGHT BEGIN----------");

            do {
                System.out.println("-----ROUND " + i + "-----");
                System.out.println("---PLAYER 1 TURN---");
                assassin.spawnIntro();
                mage.attack(assassin);
                mage.checkStatus(2);

                System.out.println("---PLAYER 2 TURN---");
                mage.spawnIntro();
                assassin.attack(mage);
                assassin.checkStatus(1);

                if (assassin.getLifeStatus() == false) {
                    System.out.println("Player 2 WIN The Game");
                } else {
                    System.out.println("Player 1 WIN The Game");
                }

                i++;
            } while (assassin.getLifeStatus() == true && mage.getLifeStatus() == true);
        } else if (((inputPlayer1 == 2 && inputPlayer2 == 3) || (inputPlayer1 == 3 && inputPlayer2 == 2))) {
            System.out.print("Input Level for Player 1 : ");
            levelPlayer1 = scanner.nextInt();
            System.out.print("Input Level for Player 2 : ");
            levelPlayer2 = scanner.nextInt();

            Tank tank = new Tank(levelPlayer1);
            Mage mage = new Mage(levelPlayer2);

            System.out.println("===PLAYER 1===");
            tank.printStat(levelPlayer1);

            System.out.println("===PLAYER 2===");
            tank.printStat(levelPlayer2);

            System.out.println("Input Anything to Start");
            scanner.next();

            System.out.println("----------FIGHT BEGIN----------");

            do {
                System.out.println("-----ROUND " + i + "-----");
                System.out.println("---PLAYER 1 TURN---");
                tank.spawnIntro();
                mage.attack(tank);
                mage.checkStatus(2);

                System.out.println("---PLAYER 2 TURN---");
                mage.spawnIntro();
                tank.attack(mage);
                tank.checkStatus(1);

                if (tank.getLifeStatus() == false) {
                    System.out.println("Player 2 WIN The Game");
                } else {
                    System.out.println("Player 1 WIN The Game");
                }

                i++;
            } while (tank.getLifeStatus() == true && mage.getLifeStatus() == true);
        } else {

        }

        scanner.close();
    }
}