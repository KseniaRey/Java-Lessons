public class Card {
    private String suit;  // масть
    private String value; // достоинство, значение  --> Туз, Король, и тд
    /**
     * стоимость(cost): в зависимости от игры карты могут друг друга бить. Чтобы определять, какая карта
     *     // старше другой, вводим эту переменную.
     */
    private int cost;     // стоимость

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Масть: ='" + suit +
                "Достоинство: ='" + value;

    }
}
