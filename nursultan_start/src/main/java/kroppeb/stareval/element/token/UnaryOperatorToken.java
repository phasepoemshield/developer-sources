/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.element.token;

import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.element.PriorityOperatorElement;
import kroppeb.stareval.element.token.Token;
import kroppeb.stareval.element.tree.UnaryExpressionElement;
import kroppeb.stareval.parser.UnaryOp;

public class UnaryOperatorToken
extends Token
implements PriorityOperatorElement {
    private final UnaryOp op;

    public UnaryOperatorToken(UnaryOp unaryOp) {
        this.op = unaryOp;
    }

    @Override
    public String toString() {
        return "UnaryOp{" + String.valueOf((Object)this.op) + "}";
    }

    @Override
    public int getPriority() {
        return -1;
    }

    @Override
    public UnaryExpressionElement resolveWith(ExpressionElement expressionElement) {
        return new UnaryExpressionElement(this.op, expressionElement);
    }
}

