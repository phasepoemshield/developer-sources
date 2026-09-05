/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.Jankson
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl;

import squeek.appleskin.shadowed.blue.endless.jankson.Jankson;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive;
import squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ParserContext;

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
        return JsonPrimitive.of((String)this.token);
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

