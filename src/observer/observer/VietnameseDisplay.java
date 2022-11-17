package observer.observer;

public class VietnameseDisplay implements Observer {

    @Override
    public void update(String data) {
        System.out.println("Dữ liệu mới là: " + data);
    }
}
