public class SuperHuman extends Human {
private SuperPower superPower;
private String weakness;


    public SuperHuman(String name, SuperPower superPower) {
        super(name);
        this.superPower = superPower;
    }

    public SuperHuman(String name, SuperPower superPower, String weakness) {
        super(name);
        this.superPower = superPower;
        this.weakness = weakness;
    }

    public SuperPower getSuperPower() {
        return superPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public final void useAbility(){
        System.out.println("Doing attack");
    }

    public final void useAbility(String spell){
        System.out.println("Using spell: " + spell);
    }

    public void getInfo(){
        if(weakness != null) {
            System.out.println("Name: " + this.getName() +
                    "\nAge: " + this.getAge() +
                    "\nSuperPower: " + this.getSuperPower() +
                    "\nWeakness: " + this.getWeakness()
            );
        } else {
            System.out.println("Name: " + this.getName() +
                    "\nAge: " + this.getAge() +
                    "\nSuperPower: " + this.getSuperPower()
            );
        }

    }
}
