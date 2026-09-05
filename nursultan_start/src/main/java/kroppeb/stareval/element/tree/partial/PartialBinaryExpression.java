/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.element.tree.partial;

import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.element.PriorityOperatorElement;
import kroppeb.stareval.element.tree.BinaryExpressionElement;
import kroppeb.stareval.element.tree.partial.PartialExpression;
import kroppeb.stareval.parser.BinaryOp;

public class PartialBinaryExpression
extends PartialExpression
implements PriorityOperatorElement {
    private final ExpressionElement left;
    private final BinaryOp op;

    public PartialBinaryExpression(ExpressionElement expressionElement, BinaryOp binaryOp) {
        this.left = expressionElement;
        this.op = binaryOp;
    }

    @Override
    public String toString() {
        return "PartialBinaryExpression{ {" + String.valueOf(this.left) + "} " + String.valueOf((Object)this.op) + "}";
    }

    @Override
    public int getPriority() {
        return this.op.priority();
    }

    @Override
    public BinaryExpressionElement resolveWith(ExpressionElement expressionElement) {
        return new BinaryExpressionElement(this.op, this.left, expressionElement);
    }
}

