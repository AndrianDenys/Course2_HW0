import java.util.ArrayList;
import java.util.List;

public class Enemy_factory {
    private List<String> enemyTypes = new ArrayList<String>();
    private int hp;
    private int power;
    private int lvl;
    private String enemyName;

    public Enemy_factory(int hp, int power, int lvl, String enemyName) {
        this.hp = hp;
        this.power = power;
        this.lvl = lvl;
        this.enemyName = enemyName;
    }
}
