package example.com.hero;
import example.com.matango.Matango;

public class Hero {
    String name = "ミナト";
    int hp = 10;

    public void attack (Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("５ポイントのダメージを与えた！");

    }
}
