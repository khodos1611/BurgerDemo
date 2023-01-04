class Burger{

    boolean bun;
    boolean cheeze;
    boolean grass;
    boolean souse;
    int meat;

    //regular burger
    Burger(){
        bun = true;
        cheeze = true;
        grass = true;
        souse = true;
        meat = 1;
        System.out.println("This is a regular burger : bun, 1 meat, cheese, grass and souse.");
    }
    //diet burger
    Burger(boolean souse){
        bun = true;
        cheeze = true;
        grass = true;
        this.souse = souse;
        meat = 1;
        System.out.println("This is a diet burger without souse: bun, 1 meat, cheese, grass.");
    }
    //double meat burger
    Burger(int meat){
        bun = true;
        cheeze = true;
        grass = true;
        souse = true;
        this.meat = meat;
        System.out.println("This is a double meat burger : bun, 2 meat, cheese, grass and souse");
    }
}

public class BurgerDemo {
    public static void main(String[] args) {
        Burger regularBurger = new Burger();
        Burger dietBurger = new Burger(false);
        Burger doubleBurger = new Burger(2);
    }
}
