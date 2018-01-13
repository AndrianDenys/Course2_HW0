public abstract class Character {
    private int hp;
    private int power;
    private boolean isALive;

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public boolean isALive() {
        return isALive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character character = (Character) o;

        if (hp != character.hp) return false;
        if (power != character.power) return false;
        return isALive == character.isALive;
    }

    @Override
    public int hashCode() {
        int result = hp;
        result = 31 * result + power;
        result = 31 * result + (isALive ? 1 : 0);
        return result;
    }
}
