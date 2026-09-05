/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.element.token;

import kroppeb.stareval.element.AccessibleExpressionElement;
import kroppeb.stareval.element.token.Token;

public class IdToken
extends Token
implements AccessibleExpressionElement {
    private final String id;

    public IdToken(String string) {
        this.id = string;
    }

    @Override
    public String toString() {
        return "Id{" + this.id + "}";
    }

    public String getId() {
        return this.id;
    }
}

