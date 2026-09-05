/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.element.tree;

import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.parser.UnaryOp;

public record UnaryExpressionElement(UnaryOp op, ExpressionElement inner) implements ExpressionElement
{
    public String toString() {
        return "UnaryExpr{" + String.valueOf((Object)this.op) + " {" + String.valueOf(this.inner) + "} }";
    }
}

