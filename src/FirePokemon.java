public class FirePokemon extends PokemonGeneral {
    int temperatureAttack;
    String food;
    int amountOfBalls;

    public FirePokemon(String name, int level, int hp, int temperatureAttack, String food, int amountOfBalls) {
        super(name, level, hp);
        this.temperatureAttack = temperatureAttack;
        this.food = food;
        this.amountOfBalls = amountOfBalls;
    }


    @Override
    public void sound() {
        System.out.println("Ffoehhh, Ffoehhh is mijn geluid");
    }

    public void flameThrower(int temperatureAttack) {
        System.out.println( " gebruikt de flamethrower met een temperatuur van " + temperatureAttack);
    }

    public void pyroBall( ) {
        if (this.amountOfBalls > 0) {
            System.out.println( " gooit nu een pyroball. ");
            this.amountOfBalls--;
            System.out.println("Je hebt nog " + getAmountOfBalls()  + " over. ");
        } else {
            System.out.println( " heeft geen pyroballs meer om mee te gooien");
        }
    }

    public int getTemperatureAttack() {
        return temperatureAttack;
    }

    public void setTemperatureAttack(int temperatureAttack) {
        this.temperatureAttack = temperatureAttack;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAmountOfBalls() {
        return amountOfBalls;
    }

    public void setAmountOfBalls(int amountOfBalls) {
        this.amountOfBalls = amountOfBalls;
    }
}
