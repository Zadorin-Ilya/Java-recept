public class Main {
    public static void main(String[] args) {

        int eaters = 5; // сколько людей будут есть

        int water = 3000; // миллилитров воды
        int potatoes = 5; // картофелин
        int chicken = 6; // курмных бедр
        int spices = 10; // ложек специй

        System.out.printf("сварили суп. На одного человека вышло: ");
        System.out.printf((water / eaters) + " миллилитров воды");
        System.out.printf((potatoes / eaters) + " картофелин(а)");
        System.out.printf((chicken / eaters) + " куриных(ое) бедер(ро)");
        System.out.printf((spices / eaters) + " ложек(ка) специй");
    }
}
