/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.libs.snakeyaml.scanner;

import com.viaversion.viaversion.libs.snakeyaml.tokens.Token;

public interface Scanner {
    public Token getToken();

    public void resetDocumentIndex();

    public boolean checkToken(Token.ID ... var1);

    default public boolean checkToken(Token.ID choice) {
        return this.checkToken(new Token.ID[]{choice});
    }

    public Token peekToken();
}

