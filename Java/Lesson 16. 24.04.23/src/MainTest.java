import org.junit.jupiter.api.*;

// эта конфигурация не зависит от конфигурации мейна, ее нужно создать справа сверху:
//EditConfiguration --> на плюс сверху слева --> выбрать JUnit --> назвать --> указать класс и ОК

class MainTest {
    Calculator calculator = new Calculator();   // создаем объект класса калькулятор

    /**
     * @BeforeAll --> также аннотация. Должен быть static, в противном случае выдаст ошибку.
     * Живет в Metaspace
     */
    @BeforeAll                                  // Должен быть static, чтобы он принадлежал классу и отрабатывал для каждого объекта класса
    public static void start(){                 // Поскольку это статик, то находится в Metaspace
        System.out.println("Начало тестирования");
    }
    @Test                                       //-->  с помощью этого делаем метод тестовым
    public void testSum(){
        Assertions.assertEquals(4, calculator.sum(2,2)); // число 4 - то, что мы ожидаем, дальше проверка
        // Assertions - В Java assertions (утверждения) - это механизм проверки, который позволяет
        // проверять предположения (условия), которые должны быть истинными во время выполнения программы.
    }

    @Test
    public void testSub(){
        Assertions.assertEquals(3, calculator.sub(7,4));
    }

    @Test
    public void testMul(){
        Assertions.assertEquals(12, calculator.mul(4,3));
    }

    @Test
    public void testDiv(){
        Assertions.assertEquals(2.0, calculator.div(10,5)); // тут 2.0 потому что деление через double, а не инт
    }

    // УПРАВЛЕНИЕ ТЕСТАМИ С ПОМОЩЬЮ АННОТАЦИЙ

    @BeforeEach
    public void beforeEach(){
        System.out.println("Вывести перед тестом");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Вывести после теста");
    }

    /**
     * По аналогии с BeforeAll должен быть статичным, чтобы отрабатывать для всех объектов
     */
    @AfterAll
    public static void end(){
        System.out.println("Тестирование закончено");
    }

}