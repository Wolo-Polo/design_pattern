package observer.observer;

public class EnglishDisplay implements Observer {

    @Override
    public void update(String data) {
        System.out.println("New data is: " + data);
    }
}
