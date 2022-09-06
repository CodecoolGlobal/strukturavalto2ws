public class Reactor {
    private int storedUranium;
    private boolean isOnMaintanence;

    public void setStoredUranium(int storedUranium) {
        this.storedUranium = storedUranium;
    }

    public boolean isOnMaintanence() {
        return isOnMaintanence;
    }

    public void setOnMaintanence(boolean onMaintanence) {
        isOnMaintanence = onMaintanence;
    }

    public Reactor(int storedUranium){
        this.storedUranium = storedUranium;
    }

    public int getStoredUranium() {
        return storedUranium;
    }

    public void addUranium(int uraniumToAdd){
        storedUranium += uraniumToAdd;
    }

    public int generateSteam(int waterIntake) throws NotEnoughUraniumException {
        if(waterIntake > storedUranium){
            throw new NotEnoughUraniumException();
        }
        storedUranium -= waterIntake;
        return waterIntake;
    }
}
