public class Main {
    public static void main(String[] args) {

        FirePokemon burnMan = new FirePokemon("Burnman", 3, 10, 80, "benzine", 5);
        WaterPokemon blupie = new WaterPokemon("blupie", 10, 3, 5, 70);
        GrassPokemon leafpie = new GrassPokemon("Leafpie", 10, 3, 10, 20);
        ElectricPokemon blizzard = new ElectricPokemon("blizzard", 10, 3, 80, "flashwhite");

        System.out.println();
        System.out.println("mijn naam is : " + burnMan.getName());
        burnMan.sound();
        System.out.println("en ik hou van " + burnMan.getFood());
        System.out.print(burnMan.getName());
        burnMan.flameThrower(burnMan.getTemperatureAttack());
        System.out.print(burnMan.getName());
        burnMan.pyroBall(burnMan.getAmountOfBalls());

        System.out.println();
        System.out.println("mijn naam is : " + blupie.getName() );
        blupie.sound();
        System.out.println("en ik weeg wel " + blupie.getWeight() + " kilogram!" );
        blupie.hydroPump(blupie.getSpeedWaterHydroPump());
        blupie.surf();

        System.out.println();
        System.out.println("mijn naam is : " + leafpie.getName());
        leafpie.sound();
        System.out.println(" en ik ben wel " + leafpie.getHeight() + "centimeter lang. ");
        System.out.print(leafpie.getName());
        leafpie.leaveBlade(leafpie.getDefenseStrength());


    }
}

