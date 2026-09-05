/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonPrimitive;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;

public class TokenParserContext
implements ParserContext<JsonPrimitive> {
    private String token = "";
    private boolean complete = false;

    @Override
    public boolean consume(int n, Jankson jankson) throws SyntaxError {
        if (this.complete) {
            return false;
        }
        if (n == 126 || Character.isUnicodeIdentifierPart(n)) {
            if (n < 65535) {
                this.token = this.token + (char)n;
                return true;
            }
            int n2 = n - 65536;
            int n3 = (n2 >>> 10) + 55296;
            int n4 = (n2 & 0x3FF) + 56320;
            this.token = this.token + (char)n3;
            this.token = this.token + (char)n4;
            return true;
        }
        this.complete = true;
        return false;
    }

    @Override
    public JsonPrimitive getResult() throws SyntaxError {
        return new JsonPrimitive(this.token);
    }

    @Override
    public boolean isComplete() {
        return this.complete;
    }

    public TokenParserContext(int n) {
        this.token = this.token + (char)n;
    }

    @Override
    public void eof() throws SyntaxError {
        this.complete = true;
    }
}

