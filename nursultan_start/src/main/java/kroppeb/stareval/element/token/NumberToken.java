/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.element.token;

import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.element.token.Token;

public class NumberToken
extends Token
implements ExpressionElement {
    private final String number;

    public NumberToken(String string) {
        this.number = string;
    }

    @Override
    public String toString() {
        return "Number{" + this.number + "}";
    }

    public String getNumber() {
        return this.number;
    }
}

