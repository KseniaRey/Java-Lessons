public class Player {
    private String name;
    private Card[] cards;

    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    /**
     * Метод для отображения карт игрока. Если карта есть, вывести ее, если нет, вывести нулл
     */
    public void displayCards(){
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                System.out.println("null");
            } else {
                System.out.println(cards[i].toString());
            }
            }
        }

    /**
     * Метод для того, чтобы сделать ход
     * Выводим карту и имя игрока
     * @param number удаление карты
     */
    public void makeMove(int number){
        System.out.println(name + " сделал ход: " + cards[number]);
        cards[number] = null;
    }
}
