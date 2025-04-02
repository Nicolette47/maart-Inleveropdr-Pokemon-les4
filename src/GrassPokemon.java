public class GrassPokemon extends PokemonGeneral {
    int defenseStrength;
    int height;


    public GrassPokemon(String name, int hp, int level, int defenseStrength, int height) {
        super(name, hp, level);
        this.defenseStrength = defenseStrength;
        this.height = height;
    }


@Override
    public void sound (){
        System.out.println("slushhhh, slushhh is mijn geluid");
    }

    public void leaveBlade(int defenseStrength){
        System.out.println(" snijd je nu met een kracht van " + defenseStrength+ " scherpe bladranden door de midden! ");
    }

    @Override
    public void reward(String name, int hp) {
        this.setHp(this.getHp() + 20);
        System.out.println("Gefeliciteerd, je hebt gewonnen. " + name + " dit is zo knap, omdat je maar zo klein en fragiel bent. Als beloning krijg je 20 healthpoints erbij. ");
        System.out.println(" je nieuwe hp is: " + this.getHp());
    }

    public int getDefenseStrength() {
        return defenseStrength;
    }

    public void setDefenseStrength(int defenseStrength) {
        this.defenseStrength = defenseStrength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
