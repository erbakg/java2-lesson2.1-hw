public final class SuperWarrior extends SuperHuman {
    private Guild guild;

    public SuperWarrior(String name, SuperPower superPower, Guild guild) {
        super(name, superPower);
        this.guild = guild;
    }

    public SuperWarrior(String name, SuperPower superPower, String weakness, Guild guild) {
        super(name, superPower, weakness);
        this.guild = guild;
    }

    public Guild getGuild() {
        return guild;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Guild name: " + this.guild.getName() +
                "\nGuild speciality: " + this.guild.getSpeciality()
        );
    }
}
