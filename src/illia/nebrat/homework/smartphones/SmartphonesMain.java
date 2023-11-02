package illia.nebrat.homework.smartphones;

public class SmartphonesMain {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids();
        Smartphones iphone = new Iphones();

        ((LinuxOS) androidPhone).runLinux();
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();

        ((IOS) iphone).runIOS();
        iphone.call();
        iphone.sms();
        iphone.internet();

    }
}
