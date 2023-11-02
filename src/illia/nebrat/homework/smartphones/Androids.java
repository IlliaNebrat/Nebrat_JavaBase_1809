package illia.nebrat.homework.smartphones;

class Androids implements Smartphones, LinuxOS {
    public void call() {
        System.out.println("Making a call on an Android phone...");
    }

    public void sms() {
        System.out.println("Sending an SMS on an Android phone...");
    }

    public void internet() {
        System.out.println("Browsing the internet on an Android phone...");
    }

    public void runLinux() {
        System.out.println("Running Linux on an Android phone...");
    }
}
