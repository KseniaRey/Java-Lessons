public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();             // создаем колоду. Объект класса Deck
        deck.generateDeck();                // В объекте класса Deck генерируем колоду
        deck.distributeCards();             // Команда объекту раздать карты игрокам
        System.out.println("Колода до раздачи карт");
        deck.display();
        Card[] player1 = deck.getPlayer1(); // Получаем карты первого игрока
        Card[] player2 = deck.getPlayer2(); // Карты второго игрока

        System.out.println("Колода после раздачи карт");
        deck.display();

        System.out.println("Карты первого игрока");
        for (int i = 0; i < player1.length; i++) {
            System.out.println(player1[i]);
        }
        System.out.println("Карты второго игрока");
        for (int i = 0; i < player2.length; i++) {
            System.out.println(player2[i]);
        }
        Deck deck1 = new Deck();
        deck1.generateDeck();
        System.out.println("Вторая колода");
        deck1.display();

        Player vlad = new Player("Vlad", player1);
        Player masha = new Player("Masha", player2);

        System.out.println("Колода Влада: ");
        vlad.displayCards();
        System.out.println("Колода Маши: ");
        masha.displayCards();

        vlad.makeMove(2);
        masha.makeMove(4);

    }


}