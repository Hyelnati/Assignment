package myPhoneApp.television;
public class Television {
    boolean isOn;
    int volume;
    int channels;

    public void toggle() {
        if (isOn){
            isOn = false;
        }
        else isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increaseVolume(int number) {

        if (number < 100 ){
            volume = volume + number;
        } else if (number >= 100) {
            volume = 100;
        }

    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume(int number) {
        if (number <= 100){
            volume = volume -number;
        } else if (number < 0) {
            volume = 0;
        }

    }

    public void channels(int number) {

        if (number == 1){
            System.out.println("Aljazeera");
        }
        else if (number ==2){
            System.out.println("CNN");
        }
        else if (number == 3){
            System.out.println("AIT");
        }
        else if (number == 4){
            System.out.println("ZeeWorld");

        }else if (number == 5){
            System.out.println("NTA");

        }else if (number == 6){
            System.out.println("StandardTV");
        }else if (number == 7){
            System.out.println("News Line");
        }
        else if (number == 8){
            System.out.println("Telemundo");
        }
        else if (number == 9){
            System.out.println("Novella");
        }
        else if (number == 10){
            System.out.println("Rock TV");

        }else System.out.println("Enter a range between 1 to 10");

    }
    public int getChannels(){
        return channels;
    }
}
