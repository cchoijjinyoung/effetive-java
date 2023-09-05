package item19.coderemove;

public class SoundProgram {
    private int volume;
    private int preVolume;

    public void mute() {
        makeMute();
    }

    public void unMute() {
        makeUnMute();
    }

    public void plueButton() {
        makeSoundUpPrint();
        makePlusButton();
    }

    public void minusButton() {
        makeSoundUpPrint();
        makeMinusButton();
    }

    public void soundUpPrint () {
        makeSoundUpPrint();
    }

    public void soundDownPrint () {
        makeSoundDownPrint();
    }

    private void makeSoundUpPrint() {
        System.out.println("소리가 1 증가했습니다. ");
    }

    private void makeSoundDownPrint() {
        System.out.println("소리가 1 감소했습니다. ");
    }

    private void makeMute() {
        preVolume = volume;
        volume = 0;
    }

    private void makeUnMute() {
        volume = preVolume;
    }

    private void makePlusButton() {
        volume++;
    }

    private void makeMinusButton() {
        volume--;
    }

}
