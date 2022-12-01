package command;

public class Main {
    public static void main(String[] args) {
        // ok tôi có 1 cái đèn
        Light light = new Light();
        // và tôi có 1 cái điều khiển có 2 nút, và tôi muốn dùng nó để điều khiển cái đèn của tôi
        // tôi đóng gói cái api thao tác với cái đèn lại và việc của tôi là chỉ cần thao tác với cái remote thôi
        Remote remote = new Remote(new LightOnCommand(light), new LightOffCommand(light)); // <- tại đây tôi đã đóng gói các yêu cầu (bật/tắt) thành các đối tượng
        remote.turnOn();
        remote.turnOff();
        // sau này tôi có thể tái xử dụng cái remote đó để điều khiển 1 thiết bị khác với 1 command khác
        // ok done
    }
}
