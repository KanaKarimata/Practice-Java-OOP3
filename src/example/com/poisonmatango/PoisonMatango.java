package example.com.poisonmatango;

import example.com.matango.Matango;
import example.com.hero.Hero;

public class PoisonMatango extends Matango {
    public int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonCount > 0) {
            System.out.println("さらに毒の胞子をばら撒いた！");
            int dmg = h.hp / 5;
            h.hp -= dmg;
            System.out.println(dmg + "ポイントのダメージ");
            this.poisonCount --;
        }
    }
}
