public class CommentsAndSamples {
    /*
    * Answer from GPT:
    * В Java assertions (утверждения) - это механизм проверки, который позволяет проверять предположения (условия),
    *  которые должны быть истинными во время выполнения программы.

Assertions используются для тестирования программы и убеждения в правильности ее работы. Они упрощают процесс отладки,
поскольку если утверждение не выполняется, то будет сгенерировано исключение AssertionError, указывающее на то,
что в коде есть ошибка.

Вот пример использования утверждений в Java:

int a = 5;
assert a == 5;
*
В данном случае мы утверждаем, что переменная "a" должна быть равна 5. Если это не так, то будет
*  сгенерировано исключение AssertionError.

Теперь рассмотрим, как использовать утверждения для написания юнит тестов.

Юнит тесты - это тесты, которые проверяют работу отдельных модулей (юнитов) программы. Часто они используются
для проверки функций, методов или классов.

Вот пример теста, который использует утверждения для проверки работы метода:

import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testMyMethod() {
        MyClass myClass = new MyClass();
        int result = myClass.myMethod(2, 3);
        assertEquals(5, result);
    }
}
Здесь мы создаем экземпляр класса MyClass, вызываем его метод myMethod с параметрами 2 и 3, и проверяем,
что результат должен быть равен 5 с помощью утверждения assertEquals.

Таким образом, использование утверждений в Java позволяет упростить процесс тестирования и отладки программы.
Они помогают обнаруживать ошибки в коде на ранних стадиях разработки и обеспечивают более надежную
работу программы в целом.
    * */
}
