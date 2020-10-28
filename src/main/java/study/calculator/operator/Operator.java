package study.calculator.operator;

import study.calculator.Calculator;

public interface Operator {

    boolean isOperator(String expression);
    Integer operate(Operand firstArg, Operand secondArg);
}
