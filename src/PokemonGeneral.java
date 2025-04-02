public class PokemonGeneral {
    private String name;
    private String type;
    private int hp;
    private int level;

    public PokemonGeneral(String name, int hp, int level) {
        this.name = name;
        this.hp = hp;
        this.level = level;
    }

    public void sound () {
        System.out.println( "Elke pokemon maakt zijn eigen geluid in de aanval of verdediging om extra kracht te geven");
    }

    public void tackle(String name) {
        System.out.println(name + "doet je nu tackelen");
    }

    public void reward(String name, int hp) {
        this.hp = hp + 10;
        System.out.println(" Gefeliciteerd, je hebt gewonnen " + name + ". Als beloning krijg je 10 healthpoints erbij. ");
        System.out.println(" je nieuwe hp is: " + hp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

