package guru.qa.service.impl;

import guru.qa.service.OperationHandler;

public class ExpOperationHandler implements OperationHandler {

        @Override
        public int invoke ( int first, int second){
            return (int) Math.pow(first, second);
        }
    }
