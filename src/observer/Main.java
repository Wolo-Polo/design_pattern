package observer;

import observer.observer.EnglishDisplay;
import observer.observer.Observer;
import observer.observer.VietnameseDisplay;
import observer.subject.DataPool;

public class Main {
    public static void main(String[] args) {
        DataPool dataPool = new DataPool();

        Observer vi = new VietnameseDisplay();
        Observer en = new EnglishDisplay();

        dataPool.setData("abc");
        // chưa đăng kí, chưa hiển thị liệu khi thay đổi

        dataPool.registerObserver(vi);
        dataPool.registerObserver(en);
        dataPool.setData("def");
        // đã đăng kí, hiển thị dữ liệu khi thay đổi

        dataPool.removeObserver(vi);
        dataPool.setData("123");
        // hủy đăng kí, không nhận được dữ liệu mới nữa
    }
}
