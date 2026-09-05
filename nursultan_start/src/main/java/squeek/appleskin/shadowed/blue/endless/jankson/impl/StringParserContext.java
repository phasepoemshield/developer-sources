/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.Jankson
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl;

import java.util.Locale;
import squeek.appleskin.shadowed.blue.endless.jankson.Jankson;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive;
import squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ParserContext;

public class StringParserContext
implements ParserContext<JsonPrimitive> {
    private static final String HEX_DIGITS = "0123456789abcdefABCDEF";
    private int quote;
    private boolean escape = false;
    private int unicodeUs = 0;
    private StringBuilder builder = new StringBuilder();
    private boolean complete = false;
    private String unicodeSequence = "";

    @Override
    public boolean consume(int n, Jankson jankson) {
        if (this.escape) {
            if (this.unicodeUs > 0) {
                if (n == 117 || n == 85) {
                    ++this.unicodeUs;
                    return true;
                }
                if (HEX_DIGITS.indexOf(n) != -1) {
                    this.unicodeSequence = this.unicodeSequence + (char)n;
                    if (this.unicodeSequence.length() == 4) {
                        this.emitUnicodeSequence(jankson);
                        this.escape = false;
                    }
                    return true;
                }
                this.emitUnicodeSequence(jankson);
                this.escape = false;
                return false;
            }
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
                case 85: 
                case 117: {
                    this.escape = true;
                    this.unicodeUs = 1;
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
        return JsonPrimitive.of((String)this.builder.toString());
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

    private void emitUnicodeSequence(Jankson jankson) {
        if (this.unicodeUs > 1) {
            --this.unicodeUs;
            this.builder.append("\\");
            for (int i = 0; i < this.unicodeUs; ++i) {
                this.builder.append('u');
            }
            while (this.unicodeSequence.length() < 4) {
                this.unicodeSequence = "0" + this.unicodeSequence;
            }
            this.builder.append(this.unicodeSequence.toLowerCase(Locale.ROOT));
        } else {
            char[] cArray;
            int n = (int)Long.parseLong(this.unicodeSequence, 16);
            for (char c : cArray = Character.toChars(n)) {
                this.builder.append(c);
            }
        }
        this.unicodeUs = 0;
        this.unicodeSequence = "";
        this.escape = false;
    }
}

