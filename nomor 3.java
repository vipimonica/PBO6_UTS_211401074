package src;
using namespace std;

public class Character {
    private String nama;
    private int health;
    private String weapon;
    private int attackPower;
    private int mana;

    // Constructor
    public Character(String nama, int health, String weapon, int attackPower, int mana) {
        this.nama = nama;
        this.health = health;
        this.weapon = weapon;
        this.attackPower = attackPower;
        this.mana = mana;
        print();
    }

    public void attack(Character musuh) {
        if (this.mana >= 5) {
            this.mana -= 5;
            int demage = this.attackPower;
            musuh.defend(demage);
            System.out.println(this.nama + " menyerang " + musuh.getNama() + " dengan " + this.weapon);
            System.out.println(musuh.getNama() + " terkena demage sebanyak " + demage);
        } else {
            System.out.println("Maaf, " + this.nama + " tidak bisa menyerang karena mana tidak cukup");
        }
    }

    public void defend(int demage) {
        this.health -= demage;
        System.out.println(this.nama + " terkena demage sebanyak " + demage);
    }

    public void print() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Health: " + this.health);
        System.out.println("Weapon: " + this.weapon);
        System.out.println("Attack Power: " + this.attackPower);
        System.out.println("Mana: " + this.mana);
    }

    // Getter dan Setter
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
