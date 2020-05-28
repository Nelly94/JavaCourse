package model;

public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {

        Parking p = new Parking("PKG01", "Parking Massena");
        p.park(new UnregisteredTruck("Ford","aaa"));
        p.park(new UnregisteredTruck("Ford","bbb"));
        p.park(new UnregisteredTruck("Ford","ccc"));
        p.park(new UnregisteredTruck("Ford","ddd"));
        p.park(new UnregisteredTruck("Ford","eee"));
        p.park(new UnregisteredTruck("Ford","fff"));
        p.park(new UnregisteredTruck("Ford","ggg"));
        p.park(new UnregisteredTruck("Ford","hhh"));
        p.park(new UnregisteredTruck("Ford","iii"));
        p.park(new UnregisteredTruck("Ford","jjj"));
        p.park(new UnregisteredTruck("Ford","kkk"));
        p.park(new UnregisteredTruck("Ford","lll"));
        p.park(new UnregisteredTruck("Ford","mmm"));
        p.park(new UnregisteredTruck("Ford","nnn"));
        p.park(new UnregisteredTruck("Ford","ooo"));
        p.park(new UnregisteredTruck("Ford","ppp"));






    }

}
