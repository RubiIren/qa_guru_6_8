package guru.qa.service;

import guru.qa.service.impl.DelOperationHandler;
import guru.qa.service.impl.MinusOperationHandler;
import guru.qa.service.impl.MultOperationHandler;
import guru.qa.service.impl.SumOperationHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationHandlerTest {

    private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        int sum = handler.invoke(8, 4);
        Assertions.assertEquals(12, sum);
    }

    @Test
    void multTest() {
        handler = new MultOperationHandler();
        Assertions.assertEquals(32, handler.invoke(8, 4));
    }

    @Test
    void minusTest() {
        handler = new MinusOperationHandler();
        Assertions.assertEquals(4, handler.invoke(8, 4));
    }

    @Test
    void delTest() {
        handler = new DelOperationHandler();
        Assertions.assertEquals(2, handler.invoke(8, 4));
    }
}