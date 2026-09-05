/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonPrimitive;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;

public class StringParserContext
implements ParserContext<JsonPrimitive> {
    private int quote;
    private boolean escape = false;
    private StringBuilder builder = new StringBuilder();
    private boolean complete = false;

    @Override
    public boolean consume(int n, Jankson jankson) {
        if (this.escape) {
            this.escape = false;
            switch (n) {
                case 98: {
                    this.builder.append('\b');
                    return true;
                }
                case 102: {
                    this.builder.append('\f');
                    return true;
                }
                case 110: {
                    this.builder.append('\n');
                    return true;
                }
                case 10: {
                    return true;
                }
                case 114: {
                    this.builder.append('\r');
                    return true;
                }
                case 116: {
                    this.builder.append('\t');
                    return true;
                }
                case 34: {
                    this.builder.append('\"');
                    return true;
                }
                case 39: {
                    this.builder.append('\'');
                    return true;
                }
                case 92: {
                    this.builder.append('\\');
                    return true;
                }
            }
            this.builder.append((char)n);
            return true;
        }
        if (n == this.quote) {
            this.complete = true;
            return true;
        }
        if (n == 92) {
            this.escape = true;
            return true;
        }
        if (n == 10) {
            this.complete = true;
            return false;
        }
        if (n < 65535) {
            this.builder.append((char)n);
            return true;
        }
        int n2 = n - 65536;
        int n3 = (n2 >>> 10) + 55296;
        int n4 = (n2 & 0x3FF) + 56320;
        this.builder.append((char)n3);
        this.builder.append((char)n4);
        return true;
    }

    @Override
    public JsonPrimitive getResult() {
        return new JsonPrimitive(this.builder.toString());
    }

    @Override
    public boolean isComplete() {
        return this.complete;
    }

    public StringParserContext(int n) {
        this.quote = n;
    }

    @Override
    public void eof() throws SyntaxError {
        throw new SyntaxError("Expected to find '" + (char)this.quote + "' to end a String, found EOF instead.");
    }
}

