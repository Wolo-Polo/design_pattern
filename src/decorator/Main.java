package decorator;

public class Main {
    public static void main(String[] args) {
        // sua, thach dua, tran chau
        Component yogurt = new MainComponent("Sữa chua", 15);
        yogurt = new OptionComponent("Thạch dừa", 3, yogurt);
        yogurt = new OptionComponent("Hoa quả", 5, yogurt);
        System.out.println(yogurt.getDescription() + ": " + yogurt.getPrice());

        // tra, tran chau, thach dua
        Component milktea = new MainComponent("Trà sữa", 18);
        milktea = new OptionComponent("Trân châu", 4, milktea);
        milktea = new OptionComponent("Đường đen", 2, milktea);
        System.out.println(milktea.getDescription() + ": " + milktea.getPrice());

        // cái này cũng làm được nè: trà đổ vào sữa :)))
        ComponentV2 teamilk = new ComponentV2("Trà", 10, null);
        teamilk = new ComponentV2("Sữa", 10, teamilk);
        teamilk = new ComponentV2("Đậu đỏ", 5, teamilk);
        // tèn ten, ta có trà-sữa-đậu đỏ
        System.out.println(teamilk.getDescription() + ": " + teamilk.getPrice());
        // giải pháp này thế nào ???
    }
}
