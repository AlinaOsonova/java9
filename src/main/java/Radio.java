public class Radio {
    private int currentNumber;
    private int soundVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber > 9) {
            return;
        }
        if (currentNumber < 0) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > 100) {
            return;
        }
        if (soundVolume < 0) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void next() {
        if (currentNumber != 9) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = 0;
        }

    }

    public void prev() {
        if (currentNumber != 0) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = 9;
        }
    }

}
