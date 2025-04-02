public class ElectricPokemon extends PokemonGeneral {
    int voltPower;
    String colorSkin;

    public ElectricPokemon(String name, int hp, int level, int voltPower, String colorSkin) {
        super(name, hp, level);
        super.setType("Electric");
        this.voltPower = voltPower;
        this.colorSkin = colorSkin;
    }


    @Override
    public void sound() {
        System.out.println("kkrrieee,krrieee is mijn geluid");
    }

    @Override
    public void tackle(String name) {
        System.out.println(name + " tackelt je nu en je krijgt er een stroomstoot bij en verliest 2 Hp");
    }

    public void electroBall(int voltPower) {
        System.out.println(this.getName() + "gooit een electroball van " + voltPower + "volt.");
    }

    public int getVoltPower() {
        return voltPower;
    }

    public void setVoltPower(int voltPower) {
        this.voltPower = voltPower;
    }

    public String getColorSkin() {
        return colorSkin;
    }

    public void setColorSkin(String colorSkin) {
        this.colorSkin = colorSkin;
    }
}
