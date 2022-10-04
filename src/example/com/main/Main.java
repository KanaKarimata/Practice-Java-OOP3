package example.com.main;

import example.com.hero.Hero;
import example.com.poisonmatango.PoisonMatango;
import example.com.superhero.SuperHero;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();
        SuperHero sh = new SuperHero();
        sh.run();
        PoisonMatango pm = new PoisonMatango('A');
        pm.attack(h);
    }
}
