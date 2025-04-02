public class WaterPokemon extends PokemonGeneral {
    int weight;
    int speedWaterHydroPump;

    public WaterPokemon(String name, int hp, int level, int weight, int speedWaterHydroPump) {
        super(name, hp, level);
        this.weight = weight;
        this.speedWaterHydroPump = speedWaterHydroPump;
    }



    @Override
    public void sound (){
        System.out.println("bblluurrpp bblluurrpp is mijn geluid");
    }

    public void hydroPump(int speedWaterHydroPump) {
        System.out.println("Daar ga je!!! "+ this.getName() + " schiet je nu omver met " + speedWaterHydroPump + " waterkracht");
    }

    public void surf() {
        System.out.println("Pak me dan! Ha, ha, ik surf lekker weg op deze golf." );

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeedWaterHydroPump() {
        return speedWaterHydroPump;
    }

    public void setSpeedWaterHydroPump(int speedWaterHydroPump) {
        this.speedWaterHydroPump = speedWaterHydroPump;
    }
}
