/*
 * Decompiled with CFR 0.152.
 */
package wrench_wrapper.relocated.org.quiltmc.parsers.json;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import wrench_wrapper.relocated.org.quiltmc.parsers.json.JsonFormat$EnumUnboxingLocalUtility;
import wrench_wrapper.relocated.org.quiltmc.parsers.json.MalformedSyntaxException;

public final class JsonReader
implements Closeable {
    public final Reader in;
    public final char[] buffer;
    public int pos;
    public int limit;
    public int lineNumber;
    public int lineStart;
    public int peeked;
    public int peekedNumberLength;
    public String peekedString;
    public int[] stack;
    public int stackSize;
    public String[] pathNames;
    public int[] pathIndices;
    public final int format;

    /*
     * Unable to fully structure code
     */
    public final int nextNonWhitespace(boolean var1_1) {
        var2_3 = this.buffer;
        var3_4 = this.pos;
        var4_6 = this.limit;
        while (true) {
            block14: {
                block15: {
                    block16: {
                        block13: {
                            if (var3_4 == var4_6) {
                                this.pos = var3_4;
                                if (!this.fillBuffer(1)) {
                                    if (!var1_1) {
                                        return -1;
                                    }
                                    throw new EOFException("End of input" + this.locationString());
                                }
                                var3_4 = this.pos;
                                var4_6 = this.limit;
                            }
                            var5_7 = var3_4 + 1;
                            var6_8 = var2_3[var3_4];
                            if (var6_8 != '\n') break block13;
                            ++this.lineNumber;
                            this.lineStart = var5_7;
                            break block14;
                        }
                        if (var6_8 == ' ' || var6_8 == '\r' || var6_8 == '\t') break block14;
                        if (var6_8 == '\u000b' || var6_8 == '\f') break block15;
                        if (var6_8 == '\u2028') break block15;
                        if (var6_8 == '\u2029' || var6_8 == '\ufeff' || Character.getType((int)var6_8) == 12) break block15;
                        this.pos = var5_7;
                        if (var6_8 != '/') break block16;
                        if (var5_7 == var4_6) {
                            this.pos = var3_4;
                            ++this.pos;
                            if (!this.fillBuffer(2)) {
                                return var6_8;
                            }
                        }
                        this.assertJsonc();
                        var3_4 = this.pos;
                        var4_6 = var2_3[var3_4];
                        if (var4_6 != 42) {
                            if (var4_6 != 47) {
                                return var6_8;
                            }
                            this.pos = var3_4 + 1;
                            while (this.pos < this.limit || this.fillBuffer(1)) {
                                v0 = this.pos;
                                this.pos = var3_4 = v0 + 1;
                                var4_6 = this.buffer[v0];
                                if (var4_6 == 10) {
                                    ++this.lineNumber;
                                    this.lineStart = var3_4;
                                    break;
                                }
                                if (var4_6 != 13) continue;
                            }
                            var3_4 = this.pos;
                            var4_6 = this.limit;
                            continue;
                        }
                        this.pos = var3_4 + 1;
                        var3_5 = "*/";
                        var4_6 = 2;
                        block2: while (true) {
                            block17: {
                                if (this.pos + var4_6 > this.limit && !this.fillBuffer(var4_6)) {
                                    var1_2 = "Unterminated comment";
                                    throw new MalformedSyntaxException(this, var1_2);
                                }
                                var5_7 = this.pos;
                                if (this.buffer[var5_7] != '\n') break block17;
                                ++this.lineNumber;
                                this.lineStart = var5_7 + 1;
                                ** GOTO lbl69
                            }
                            for (var5_7 = 0; var5_7 < var4_6; ++var5_7) {
                                if (this.buffer[this.pos + var5_7] == var3_5.charAt(var5_7)) continue;
lbl69:
                                // 2 sources

                                ++this.pos;
                                continue block2;
                            }
                            break;
                        }
                        var3_4 = this.pos + 2;
                        var4_6 = this.limit;
                        continue;
                    }
                    return var6_8;
                }
                this.assertJson5();
            }
            var3_4 = var5_7;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final String nextUnquotedValue() {
        var1_1 = null;
        var2_2 = 0;
        block3: while (true) {
            block9: {
                if ((var3_3 = this.pos) + var2_2 < this.limit) {
                    switch (this.buffer[var3_3 + var2_2]) {
                        default: {
                            ++var2_2;
                            continue block3;
                        }
                        case '\t': 
                        case '\n': 
                        case '\f': 
                        case '\r': 
                        case ' ': 
                        case ',': 
                        case ':': 
                        case '[': 
                        case ']': 
                        case '{': 
                        case '}': {
                            ** if (var1_1 != null) goto lbl-1000
                        }
                    }
                }
                if (var2_2 >= this.buffer.length) break block9;
                if (this.fillBuffer(var2_2 + 1)) {
                    continue;
                }
                break;
            }
            if (var1_1 == null) {
                var1_1 = v0;
                v0 = new StringBuilder(Math.max(var2_2, 16));
            }
            v1 = this;
            v2 = this;
            var3_4 = v2.buffer;
            var1_1.append(var3_4, v2.pos, var2_2);
            v1.pos += var2_2;
            var2_2 = 0;
            if (!v1.fillBuffer(1)) ** break;
        }
        if (var1_1 == null) lbl-1000:
        // 2 sources

        {
            var1_1 = v3;
            v4 = this;
            var3_5 = v4.buffer;
            v3 = new String(var3_5, v4.pos, var2_2);
        } else lbl-1000:
        // 2 sources

        {
            v5 = var1_1;
            v6 = this;
            var1_1 = v6.buffer;
            var1_1 = v5.append((char[])var1_1, v6.pos, var2_2).toString();
        }
        this.pos += var2_2;
        return var1_1;
    }

    public final String nextQuotedValue(char c) {
        char[] cArray = this.buffer;
        StringBuilder stringBuilder = null;
        do {
            int n;
            int n2 = this.pos;
            int n3 = n = this.limit;
            n = n2;
            int n4 = n3;
            while (n2 < n4) {
                int n5 = n2 + 1;
                if ((n2 = cArray[n2]) == c) {
                    this.pos = n5;
                    int n6 = n5 - n - 1;
                    if (stringBuilder == null) {
                        return new String(cArray, n, n6);
                    }
                    StringBuilder stringBuilder2 = stringBuilder;
                    stringBuilder2.append(cArray, n, n6);
                    return stringBuilder2.toString();
                }
                if (n2 == 92) {
                    this.pos = n5;
                    n2 = n5 - n;
                    n4 = n2 - 1;
                    if (stringBuilder == null) {
                        StringBuilder stringBuilder3;
                        int n7 = n2 * 2;
                        StringBuilder stringBuilder4 = stringBuilder3;
                        stringBuilder3 = new StringBuilder(Math.max(n7, 16));
                        stringBuilder = stringBuilder4;
                    }
                    stringBuilder.append(cArray, n, n4);
                    if (this.pos == this.limit && !this.fillBuffer(1)) {
                        String string = "Unterminated escape sequence";
                        throw new MalformedSyntaxException(this, string);
                    }
                    n2 = this.pos;
                    this.pos = n = n2 + 1;
                    n4 = this.buffer[n2];
                    switch (n4) {
                        default: {
                            String string = "Invalid escape sequence " + n4;
                            throw new MalformedSyntaxException(this, string);
                        }
                        case 117: {
                            if (n2 + 5 > this.limit && !this.fillBuffer(4)) {
                                String string = "Unterminated escape sequence";
                                throw new MalformedSyntaxException(this, string);
                            }
                            n2 = 0;
                            n4 = n + 4;
                            for (n = this.pos; n < n4; ++n) {
                                String string;
                                n5 = this.buffer[n];
                                n2 = (char)(n2 << 4);
                                if (n5 >= 48 && n5 <= 57) {
                                    n2 = (char)(n5 - 48 + n2);
                                    continue;
                                }
                                if (n5 >= 97 && n5 <= 102) {
                                    n2 = (char)(n5 - 87 + n2);
                                    continue;
                                }
                                if (n5 >= 65 && n5 <= 70) {
                                    n2 = (char)(n5 - 55 + n2);
                                    continue;
                                }
                                String string2 = string;
                                string = new String(this.buffer, this.pos, 4);
                                throw new NumberFormatException("\\u".concat(string2));
                            }
                            this.pos += 4;
                            n4 = n2;
                            break;
                        }
                        case 116: {
                            n4 = 9;
                            break;
                        }
                        case 114: {
                            n4 = 13;
                            break;
                        }
                        case 110: {
                            n4 = 10;
                            break;
                        }
                        case 102: {
                            n4 = 12;
                            break;
                        }
                        case 98: {
                            n4 = 8;
                            break;
                        }
                        case 10: 
                        case 13: {
                            ++this.lineNumber;
                            this.lineStart = n;
                        }
                        case 34: 
                        case 39: 
                        case 47: 
                        case 92: 
                    }
                    stringBuilder.append((char)n4);
                    n2 = this.pos;
                    int n8 = n = this.limit;
                    n = n2;
                    n4 = n8;
                    continue;
                }
                if (n2 == 10) {
                    ++this.lineNumber;
                    this.lineStart = n5;
                }
                n2 = n5;
            }
            if (stringBuilder == null) {
                StringBuilder stringBuilder5;
                int n9 = (n2 - n) * 2;
                StringBuilder stringBuilder6 = stringBuilder5;
                stringBuilder5 = new StringBuilder(Math.max(n9, 16));
                stringBuilder = stringBuilder6;
            }
            stringBuilder.append(cArray, n, n2 - n);
            this.pos = n2;
        } while (this.fillBuffer(1));
        String string = "Unterminated string";
        throw new MalformedSyntaxException(this, string);
    }

    public final String locationString() {
        JsonReader jsonReader = this;
        int n = jsonReader.lineNumber + 1;
        return " at line " + n + " column " + (jsonReader.pos - this.lineStart + 1) + " path " + this.path();
    }

    public final boolean fillBuffer(int n) {
        block3: {
            JsonReader jsonReader = this;
            char[] cArray = jsonReader.buffer;
            int n2 = this.pos;
            jsonReader.lineStart -= n2;
            int n3 = jsonReader.limit;
            if (n3 != n2) {
                this.limit = n3 -= n2;
                System.arraycopy(cArray, n2, cArray, 0, n3);
            } else {
                this.limit = 0;
            }
            this.pos = 0;
            do {
                n2 = this.limit;
                if ((n2 = this.in.read(cArray, n2, cArray.length - n2)) == -1) break block3;
                JsonReader jsonReader2 = this;
                jsonReader2.limit = n2 = jsonReader2.limit + n2;
                if (jsonReader2.lineNumber != 0 || (n3 = this.lineStart) != 0 || n2 <= 0 || cArray[0] != '\ufeff') continue;
                ++this.pos;
                this.lineStart = n3 + 1;
                ++n;
            } while (n2 < n);
            return true;
        }
        return false;
    }

    public final boolean isLiteral(char c) {
        switch (c) {
            default: {
                return true;
            }
            case '#': 
            case '/': 
            case ';': 
            case '=': 
            case '\\': {
                String string = "This file may be valid in lenient GSON, but it is not valid in any format we support.";
                throw new MalformedSyntaxException(this, string);
            }
            case '\t': 
            case '\n': 
            case '\f': 
            case '\r': 
            case ' ': 
            case ',': 
            case ':': 
            case '[': 
            case ']': 
            case '{': 
            case '}': 
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int doPeek() {
        block58: {
            block61: {
                block62: {
                    block63: {
                        block64: {
                            block65: {
                                block66: {
                                    block67: {
                                        block53: {
                                            block56: {
                                                block60: {
                                                    block59: {
                                                        block57: {
                                                            block55: {
                                                                var1_1 /* !! */  = this.stack;
                                                                var2_22 = this.stackSize - 1;
                                                                var3_26 = this.stack[var2_22];
                                                                if (var3_26 != 1) break block55;
                                                                var1_1 /* !! */ [var2_22] = 2;
                                                                break block56;
                                                            }
                                                            if (var3_26 != 2) break block57;
                                                            var1_2 = this.nextNonWhitespace(true);
                                                            if (var1_2 != 44) {
                                                                if (var1_2 == 93) {
                                                                    this.peeked = 4;
                                                                    return 4;
                                                                }
                                                                var1_3 = "Unterminated array";
                                                                throw new MalformedSyntaxException(this, var1_3);
                                                            }
                                                            break block56;
                                                        }
                                                        if (var3_26 == 3 || var3_26 == 5) break block58;
                                                        if (var3_26 != 4) break block59;
                                                        var1_1 /* !! */ [var2_22] = 5;
                                                        var1_4 = this.nextNonWhitespace(true);
                                                        if (var1_4 != 58) {
                                                            if (var1_4 != 61) {
                                                                var1_5 = "Expected ':'";
                                                                throw new MalformedSyntaxException(this, var1_5);
                                                            }
                                                            var1_6 = "This file may be valid in lenient GSON, but it is not valid in any format we support.";
                                                            throw new MalformedSyntaxException(this, var1_6);
                                                        }
                                                        break block56;
                                                    }
                                                    if (var3_26 != 6) break block60;
                                                    var1_1 /* !! */ [var2_22] = 7;
                                                    break block56;
                                                }
                                                if (var3_26 == 7) {
                                                    if (this.nextNonWhitespace(false) == -1) {
                                                        this.peeked = 20;
                                                        return 20;
                                                    }
                                                    var1_1 /* !! */  = (int[])"This file may be valid in lenient GSON, but it is not valid in any format we support.";
                                                    throw new MalformedSyntaxException(this, (String)var1_1 /* !! */ );
                                                }
                                                if (var3_26 == 8) break block61;
                                            }
                                            var1_7 = this.nextNonWhitespace(true);
                                            if (var1_7 == 34) break block62;
                                            if (var1_7 == 39) break block63;
                                            if (var1_7 == 44) break block64;
                                            if (var1_7 == 91) break block65;
                                            if (var1_7 == 93) break block66;
                                            if (var1_7 == 123) break block67;
                                            this.pos = var1_7 = this.pos - 1;
                                            if ((var1_7 = this.buffer[var1_7]) != 116 && var1_7 != 84) {
                                                if (var1_7 != 102 && var1_7 != 70) {
                                                    if (var1_7 != 110 && var1_7 != 78) lbl-1000:
                                                    // 3 sources

                                                    {
                                                        while (true) {
                                                            var1_8 = 0;
                                                            break block53;
                                                            break;
                                                        }
                                                    }
                                                    var1_9 = "null";
                                                    var2_23 = "NULL";
                                                    var3_26 = 7;
                                                    var3_27 = var2_23;
                                                    var2_22 = var3_26;
                                                } else {
                                                    var1_9 = "false";
                                                    var2_24 = "FALSE";
                                                    var3_26 = 6;
                                                    var3_27 = var2_24;
                                                    var2_22 = var3_26;
                                                }
                                            } else {
                                                var1_9 = "true";
                                                var2_25 = "TRUE";
                                                var3_26 = 5;
                                                var3_27 = var2_25;
                                                var2_22 = var3_26;
                                            }
                                            var4_28 = var1_9.length();
                                            for (var5_29 = 1; var5_29 < var4_28; ++var5_29) {
                                                if (this.pos + var5_29 >= this.limit && !this.fillBuffer(var5_29 + 1) || (var6_30 = this.buffer[this.pos + var5_29]) != var1_9.charAt(var5_29) && var6_30 != var3_27.charAt(var5_29)) ** GOTO lbl-1000
                                            }
                                            if (this.pos + var4_28 >= this.limit && !this.fillBuffer(var4_28 + 1) || !this.isLiteral(this.buffer[this.pos + var4_28])) ** break;
                                            ** while (true)
                                            this.pos += var4_28;
                                            this.peeked = var2_22;
                                            var1_8 = var2_22;
                                        }
                                        if (var1_8 != 0) {
                                            return var1_8;
                                        }
                                        var1_10 /* !! */  = this.buffer;
                                        var2_22 = this.pos;
                                        var3_26 = this.limit;
                                        var4_28 = 0;
                                        var5_29 = 0;
                                        var6_30 = 0;
                                        while (true) {
                                            block54: {
                                                block68: {
                                                    block69: {
                                                        if (var2_22 + var6_30 != var3_26) break block68;
                                                        if (var6_30 != var1_10 /* !! */ .length) break block69;
                                                        var1_11 = 0;
                                                        ** GOTO lbl161
                                                    }
                                                    if (!this.fillBuffer(var6_30 + '\u0001')) ** GOTO lbl125
                                                    var2_22 = this.pos;
                                                    var3_26 = this.limit;
                                                }
                                                var7_31 = var2_22 + var6_30;
                                                var8_32 = var1_10 /* !! */ [var7_31];
                                                switch (var8_32) {
                                                    default: {
                                                        if (var4_28 == 0) ** GOTO lbl111
                                                        if (var8_32 >= '0' && var8_32 <= '9' || var8_32 >= 'a' && var8_32 <= 'f' || var8_32 >= 'A' && var8_32 <= 'F') break block54;
                                                        if (this.isLiteral(var8_32)) {
                                                            var1_10 /* !! */  = (char[])("unexpected character " + var8_32);
                                                            throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                                        }
                                                        ** GOTO lbl125
lbl111:
                                                        // 1 sources

                                                        if (var8_32 < '0' || var8_32 > '9') ** GOTO lbl124
                                                        if (var5_29 == 1 || var5_29 == 0) ** GOTO lbl121
                                                        if (var5_29 == 3) {
                                                            var5_29 = 4;
                                                        } else if (var5_29 == 5 || var5_29 == 6) {
                                                            while (true) {
                                                                var5_29 = 7;
                                                                ** GOTO lbl205
                                                                break;
                                                            }
                                                        }
                                                        break block54;
lbl121:
                                                        // 2 sources

                                                        while (true) {
                                                            var5_29 = 2;
                                                            break block54;
                                                            break;
                                                        }
lbl124:
                                                        // 1 sources

                                                        if (this.isLiteral(var8_32)) ** GOTO lbl135
lbl125:
                                                        // 3 sources

                                                        if (var5_29 == 9) {
                                                            this.peekedNumberLength = var6_30;
                                                            this.peeked = var1_11 = 16;
                                                        } else {
                                                            if (var5_29 != 8 && var5_29 != 2 && var5_29 != 4 && var5_29 != 7 && !this.isJson5(var1_12 = var5_29 == 3)) {
                                                                var1_13 = "unable to parse number";
                                                                throw new MalformedSyntaxException(this, var1_13);
                                                            }
                                                            this.peekedNumberLength = var6_30;
                                                            this.peeked = var1_11 = 15;
                                                        }
                                                        ** GOTO lbl161
lbl135:
                                                        // 1 sources

                                                        var1_10 /* !! */  = (char[])("unexpected character " + var8_32);
                                                        throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                                    }
                                                    case 'X': 
                                                    case 'x': {
                                                        if (var5_29 != 8) ** GOTO lbl145
                                                        this.assertJson5();
                                                        var4_28 = 9;
                                                        v0 = var5_29 = 1;
                                                        var5_29 = var4_28;
                                                        var4_28 = v0;
                                                        break block54;
lbl145:
                                                        // 1 sources

                                                        var1_10 /* !! */  = (char[])"unexpected character x";
                                                        throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                                    }
                                                    case 'N': {
                                                        this.assertJson5();
                                                        if (var5_29 != 0 || !this.literal(var1_10 /* !! */ , (int)var7_31, "NaN")) ** GOTO lbl153
                                                        this.peekedNumberLength = var6_30 + 3;
                                                        this.peeked = var1_11 = 17;
                                                        ** GOTO lbl161
lbl153:
                                                        // 1 sources

                                                        var1_10 /* !! */  = (char[])"unexpected char N";
                                                        throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                                    }
                                                    case 'I': {
                                                        this.assertJson5();
                                                        if (var5_29 != 0 && var5_29 != 1 || !this.literal(var1_10 /* !! */ , (int)var7_31, "Infinity")) break;
                                                        this.peekedNumberLength = var6_30 + 8;
                                                        var1_11 = var5_29 == 0 ? 18 : 19;
                                                        this.peeked = var1_11;
lbl161:
                                                        // 5 sources

                                                        if (var1_11 != 0) {
                                                            return var1_11;
                                                        }
                                                        if (!this.isLiteral(this.buffer[this.pos])) {
                                                            var1_14 = "Expected value";
                                                            throw new MalformedSyntaxException(this, var1_14);
                                                        }
                                                        var1_15 = "This file may be valid in lenient GSON, but it is not valid in any format we support.";
                                                        throw new MalformedSyntaxException(this, var1_15);
                                                    }
                                                    case 'E': 
                                                    case 'e': {
                                                        if (var5_29 != 9) {
                                                            if (var5_29 != 8 && var5_29 != 2 && var5_29 != 4 && !this.isJson5((boolean)(var5_29 = var5_29 == 3 ? 1 : 0))) {
                                                                var1_10 /* !! */  = (char[])("unexpected exponent " + var8_32);
                                                                throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                                            }
                                                            var5_29 = 5;
                                                        }
                                                        break block54;
                                                    }
                                                    case '0': {
                                                        if (var5_29 != 0 && var5_29 != 1) {
                                                            if (var5_29 != 9 && var5_29 != 4 && var5_29 != 7) {
                                                                if (var5_29 == 5 || var5_29 == 6) ** continue;
                                                                if (var5_29 != 8) ** continue;
                                                                var1_10 /* !! */  = (char[])"unexpected leading zero";
                                                                throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                                            }
                                                        } else {
                                                            var5_29 = 8;
                                                        }
                                                        break block54;
                                                    }
                                                    case '.': {
                                                        if (var5_29 != 2 && var5_29 != 8 && !this.isJson5(var7_31 = var5_29 == 0) && !this.isJson5((boolean)(var5_29 = var5_29 == 1 ? 1 : 0))) {
                                                            var1_10 /* !! */  = (char[])"unexpected decimal marker";
                                                            throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                                        }
                                                        var5_29 = 3;
                                                        break block54;
                                                    }
                                                    case '-': {
                                                        if (var5_29 != 0) ** GOTO lbl195
                                                        var5_29 = 1;
                                                        break block54;
lbl195:
                                                        // 1 sources

                                                        if (var5_29 == 5) {
                                                            while (true) {
                                                                var5_29 = 6;
                                                                break block54;
                                                                break;
                                                            }
                                                        }
                                                        var1_10 /* !! */  = (char[])"unexpected negative sign";
                                                        throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                                    }
                                                    case '+': 
                                                }
                                                if (var5_29 == 5) ** continue;
                                                var7_31 = var5_29 == 0;
                                                if (!this.isJson5(var7_31)) break;
                                            }
                                            ++var6_30;
                                        }
                                        var1_10 /* !! */  = (char[])"unexpected positive sign";
                                        throw new MalformedSyntaxException(this, (String)var1_10 /* !! */ );
                                    }
                                    this.peeked = 1;
                                    return 1;
                                }
                                if (var3_26 != 1) {
                                    this.assertJsonc();
                                }
                                this.peeked = 4;
                                return 4;
                            }
                            this.peeked = 3;
                            return 3;
                        }
                        var1_16 = "Unexpected value";
                        throw new MalformedSyntaxException(this, var1_16);
                    }
                    this.assertJson5();
                    this.peeked = 8;
                    return 8;
                }
                this.peeked = 9;
                return 9;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        var1_1 /* !! */ [var2_22] = 4;
        if (var3_26 == 5 && (var1_17 = this.nextNonWhitespace(true)) != 44) {
            if (var1_17 != 59) {
                if (var1_17 == 125) {
                    this.peeked = 2;
                    return 2;
                }
                var1_18 = "Unterminated object";
                throw new MalformedSyntaxException(this, var1_18);
            }
            var1_19 = "This file may be valid in lenient GSON, but it is not valid in any format we support.";
            throw new MalformedSyntaxException(this, var1_19);
        }
        var1_20 = this.nextNonWhitespace(true);
        if (var1_20 != 34) {
            if (var1_20 != 39) {
                if (var1_20 != 125) {
                    this.assertJson5();
                    --this.pos;
                    if (this.isLiteral((char)var1_20)) {
                        this.peeked = 14;
                        return 14;
                    }
                    var1_21 = "Expected name";
                    throw new MalformedSyntaxException(this, var1_21);
                }
                if (var3_26 == 5) {
                    this.assertJsonc();
                }
                this.peeked = 2;
                return 2;
            }
            this.assertJson5();
            this.peeked = 12;
            return 12;
        }
        this.peeked = 13;
        return 13;
    }

    public JsonReader(InputStreamReader object) {
        JsonReader jsonReader = this;
        InputStreamReader inputStreamReader = object;
        this.buffer = new char[1024];
        this.pos = 0;
        this.limit = 0;
        this.lineNumber = 0;
        this.lineStart = 0;
        this.peeked = 0;
        int[] nArray = new int[32];
        object = nArray;
        JsonReader jsonReader2 = this;
        jsonReader2.stack = (int[])object;
        jsonReader2.stackSize = 1;
        nArray[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        jsonReader.in = inputStreamReader;
        jsonReader.format = 3;
    }

    public final String toString() {
        return "JsonReader" + this.locationString();
    }

    @Override
    public final void close() {
        JsonReader jsonReader = this;
        jsonReader.peeked = 0;
        jsonReader.stack[0] = 8;
        jsonReader.stackSize = 1;
        jsonReader.in.close();
    }

    public final int peek() {
        int n = this.peeked;
        if (n == 0) {
            n = this.doPeek();
        }
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 20: {
                return 10;
            }
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                return 7;
            }
            case 12: 
            case 13: 
            case 14: {
                return 5;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return 6;
            }
            case 7: {
                return 9;
            }
            case 5: 
            case 6: {
                return 8;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 1;
            }
            case 2: {
                return 4;
            }
            case 1: 
        }
        return 3;
    }

    public final String path() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder = new StringBuilder("$");
        int n = this.stackSize;
        block4: for (int i = 0; i < n; ++i) {
            switch (this.stack[i]) {
                default: {
                    continue block4;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder2.append('.');
                    String string = this.pathNames[i];
                    if (string == null) continue block4;
                    stringBuilder2.append(string);
                    continue block4;
                }
                case 1: 
                case 2: {
                    stringBuilder2.append('[').append(this.pathIndices[i]).append(']');
                }
            }
        }
        return stringBuilder2.toString();
    }

    public final void push(int n) {
        int n2 = this.stackSize;
        int[] nArray = this.stack;
        if (n2 == this.stack.length) {
            JsonReader jsonReader = this;
            jsonReader.stack = Arrays.copyOf(nArray, n2 *= 2);
            jsonReader.pathIndices = Arrays.copyOf(jsonReader.pathIndices, n2);
            jsonReader.pathNames = Arrays.copyOf(jsonReader.pathNames, n2);
        }
        int n3 = this.stackSize;
        this.stackSize = n3 + 1;
        this.stack[n3] = n;
    }

    public final boolean literal(char[] cArray, int n, String string) {
        String string2 = string;
        char[] cArray2 = string2.toCharArray();
        int n2 = string2.length();
        for (int i = 0; i < n2; ++i) {
            if (cArray2[i] == cArray[i + n]) continue;
            return false;
        }
        return this.isLiteral(cArray[string.length() + n]) ^ true;
    }

    public final boolean isJson5(boolean bl) {
        if (bl && this.format != 3) {
            String string = "Invalid syntax found for parsing mode " + JsonFormat$EnumUnboxingLocalUtility.stringValueOf(this.format) + ", but it is valid in JSON5";
            throw new MalformedSyntaxException(this, string);
        }
        return bl;
    }

    public final void assertJson5() {
        if (this.format == 3) {
            return;
        }
        String string = "Invalid syntax found for parsing mode " + JsonFormat$EnumUnboxingLocalUtility.stringValueOf(this.format) + ", but it is valid in JSON5";
        throw new MalformedSyntaxException(this, string);
    }

    public final void assertJsonc() {
        int n = this.format;
        if (n != 2 && n != 3) {
            String string = "Invalid syntax found for parsing mode " + JsonFormat$EnumUnboxingLocalUtility.stringValueOf(this.format) + ", but it is valid  inJSONC or JSON5";
            throw new MalformedSyntaxException(this, string);
        }
    }
}

