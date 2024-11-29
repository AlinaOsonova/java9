public class Radio {
    private int currentNumber;
    private int soundVolume;
    private int maxStation = 9;

    public Radio() {
        this.maxStation = maxStation;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }
    public void setCurrentNumber(int currentNumber) {
        if (currentNumber > maxStation) {
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
        if (currentNumber != maxStation) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = 0;
        }

    }

    public void prev() {
        if (currentNumber != 0) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxStation;
        }
    }
}

