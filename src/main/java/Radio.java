public class Radio {
    private int currentStation;
    private int correntVolume;




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

    public int getCorrentVolume() {
        return correntVolume;
    }

    public void setCorrentVolume(int correntVolume) {
        if (correntVolume > 100) {
            return;
        }
        if (correntVolume < 0) {
            return;
        }
        this.correntVolume = correntVolume;
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
