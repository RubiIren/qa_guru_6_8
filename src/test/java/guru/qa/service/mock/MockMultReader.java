package guru.qa.service.mock;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockMultReader implements Reader {
    @Override
    public int readFirstArg() {
        return 8;
    }

    @Override
    public int readSecondArg() {
        return 4;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.DEL;
    }
}
