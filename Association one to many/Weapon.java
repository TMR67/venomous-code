class Weapon {
    public String weaponName;
    public int damage;
    public Player player;
    public Weapon(String weaponName, int damage,Player player) {
        this.weaponName = weaponName;
        this.damage = damage;
		this.player=player;
    }

    public void weaponDetails() {
        System.out.println("Weapon Name: " + weaponName);
        System.out.println("Name of the role"+player.role);
    }
}
