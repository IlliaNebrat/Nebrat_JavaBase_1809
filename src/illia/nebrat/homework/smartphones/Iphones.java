package illia.nebrat.homework.smartphones;

class Iphones implements Smartphones, IOS {
    public void call() {
        System.out.println("Making a call on an iPhone...");
    }

    public void sms() {
        System.out.println("Sending an SMS on an iPhone...");
    }

    public void internet() {
        System.out.println("Browsing the internet on an iPhone...");
    }

    public void runIOS() {
        System.out.println("Running iOS on an iPhone...");
    }
}