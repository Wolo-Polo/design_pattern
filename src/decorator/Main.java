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

    }
}
