package example.com.hero;
import example.com.matango.Matango;

public class Hero {
    public String name = "ミナト";
    public int hp = 10;

    public void attack (Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("５ポイントのダメージを与えた！");
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }

    public Hero() {
        System.out.println("Heroのコンストラクタが動作");
    }
}
