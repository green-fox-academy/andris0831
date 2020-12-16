package exam.exercises.pirates;

import java.util.Random;

public class Pirate {
    private int drunkLevel = 0;
    private boolean isDead;
    private boolean isCaptain;
    private boolean isAwake;

    public Pirate(boolean isCaptain) {
        this.isCaptain = isCaptain;
    }

    public int getDrunkLevel() {
        return drunkLevel;
    }

    public void setDrunkLevel(int drunkLevel) {
        this.drunkLevel = drunkLevel;
    }

    public void drinkMuchRum(int quantity) {
        if (isDead) {
            System.out.println("He's dead");
        } else {
            drunkLevel += quantity;
        }
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public boolean isAwake() {
        return isAwake;
    }

    public void setAwake(boolean awake) {
        isAwake = awake;
    }

    public void drinkSomeRum() {
        if (isDead) {
            System.out.println("He's dead");
        } else {
            drunkLevel++;
        }
    }

    public void howsItGoing() {
        if (drunkLevel < 0 || drunkLevel <= 4) {
            System.out.println("Pour me annuder");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            isAwake = false;
        }
    }

    public void die() {
        isDead = true;
    }

    public void brawl(Pirate otherPirate) {
        Random random = new Random();
        if (otherPirate.isDead && isDead) {
            int roll = random.nextInt(3 - 1 +1) + 1;
            if (roll == 1) {
                isDead = true;
            } else if (roll == 2) {
                otherPirate.isDead = true;
            } else {
                isDead = true;
                otherPirate.isDead = true;
            }
        }
    }
}
