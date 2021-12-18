package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        Weapon weapon = new Weapon();
        weapon.setNameOfWeapon("AK-47");
        weapon.setTypeOfWeapon("FireArms");
        boss.setWeapon(weapon);

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(15);
        skeleton1.setQuantityOfArrows(50);
        Weapon weapon1 = new Weapon();
        weapon1.setTypeOfWeapon("SmallArms");
        weapon1.setNameOfWeapon("Bow");
        skeleton1.setWeapon(weapon1);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(150);
        skeleton2.setDamage(20);
        skeleton2.setQuantityOfArrows(45);
        Weapon weapon2 = new Weapon();
        weapon2.setTypeOfWeapon("SmallArms");
        weapon2.setNameOfWeapon("Arballet");
        skeleton2.setWeapon(weapon2);

        System.out.println("Boss\n" + boss.printInfo()
                + "\nSkeleton1\n" + skeleton1.printInfo() + "\nSkeleton2\n" + skeleton2.getInfo());
    }
}
