package exam.exercises.pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> ship = new ArrayList<>();
    private Pirate captain;
    private boolean isWinnerShip;
    private int pirateOnBoard = 1;

    public Ship(Pirate captain) {
        this.captain = captain;
    }

    public int getPirateOnBoard() {
        return ship.size() + 1;
    }

    public void setPirateOnBoard(int change) {
        pirateOnBoard += change;
    }

    public boolean getIsWinnerShip() {
        return isWinnerShip;
    }

    public void setIsWinnerShip(boolean isWinnerShip) {
        this.isWinnerShip = isWinnerShip;
    }

    public void setCaptainComsumedRum(int quantity) {
        captain.drinkMuchRum(quantity);
    }




    public void fillShip() {
        Random random = new Random();
        int crewSize = random.nextInt(10 - 2 + 4) + 5;
        for (int i = 0; i < crewSize; i++) {
            ship.add(new Pirate(true));
            pirateOnBoard++;
        }
    }

    public boolean battle(Ship otherShip) {
        Random random = new Random();
        int crewAliveCurrentShip = getPirateOnBoard();
        int crewAliveOtherShip = otherShip.getPirateOnBoard();
        int currentCaptainConsumedRum = captain.getDrunkLevel();
        int otherCaptainConsumedRum = otherShip.captain.getDrunkLevel();
        if (crewAliveCurrentShip - currentCaptainConsumedRum > crewAliveOtherShip - otherCaptainConsumedRum) {
            isWinnerShip = true;

        } else if (crewAliveCurrentShip - currentCaptainConsumedRum < crewAliveOtherShip - otherCaptainConsumedRum) {
            isWinnerShip = false;
        } else {
            int decider = random.nextInt(3 - 2 + 1) + 1;
            isWinnerShip = decider == 1;
        }
        return isWinnerShip;
    }

    public static void afterBattle(Ship winnerShip, Ship loserShip) {
        Random random = new Random();
        int randomRum = random.nextInt(6 - 2 + 1) + 1;
        winnerShip.captain.drinkMuchRum(randomRum);
        int randomOtherLoss = random.nextInt(loserShip.getPirateOnBoard() - 1 + 1) + 1;
        for (int i = 0; i < randomOtherLoss; i++) {
            loserShip.ship.get(loserShip.ship.size() - i - 1).setDead(true);
        }
    }





}
