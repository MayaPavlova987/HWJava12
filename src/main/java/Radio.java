public class Radio {
    private int currentStation;
    private int currentVolume;



    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }


    public void next() {
        if (currentStation != 9) { //если тек станция не равно макс(9), увелич на единицу, иначе переключи на о
            currentStation++;
        } else {
            currentStation = 0;

        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }
}
