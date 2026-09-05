/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Constant
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error;

import java.io.Serializable;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Constant;

public final class Mark
implements Serializable {
    private String name;
    private int index;
    private int line;
    private int column;
    private int[] buffer;
    private int pointer;

    public int[] getBuffer() {
        return this.buffer;
    }

    public int getColumn() {
        return this.column;
    }

    public Mark(String string, int n, int n2, int n3, char[] cArray, int n4) {
        this(string, n, n2, n3, Mark.toCodePoints(cArray), n4);
    }

    public Mark(String string, int n, int n2, int n3, int[] nArray, int n4) {
        this.name = string;
        this.index = n;
        this.line = n2;
        this.column = n3;
        this.buffer = nArray;
        this.pointer = n4;
    }

    @Deprecated
    public Mark(String string, int n, int n2, int n3, String string2, int n4) {
        this(string, n, n2, n3, string2.toCharArray(), n4);
    }

    public String toString() {
        String string = this.get_snippet();
        StringBuilder stringBuilder = new StringBuilder(" in ");
        stringBuilder.append(this.name);
        stringBuilder.append(", line ");
        stringBuilder.append(this.line + 1);
        stringBuilder.append(", column ");
        stringBuilder.append(this.column + 1);
        stringBuilder.append(":\n");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public String getName() {
        return this.name;
    }

    public int getIndex() {
        return this.index;
    }

    private static int[] toCodePoints(char[] cArray) {
        int[] nArray = new int[Character.codePointCount(cArray, 0, cArray.length)];
        int n = 0;
        int n2 = 0;
        while (n < cArray.length) {
            int n3;
            nArray[n2] = n3 = Character.codePointAt(cArray, n);
            n += Character.charCount(n3);
            ++n2;
        }
        return nArray;
    }

    private boolean isLineBreak(int n) {
        return Constant.NULL_OR_LINEBR.has(n);
    }

    public String get_snippet(int n, int n2) {
        int n3;
        float f = (float)n2 / 2.0f - 1.0f;
        int n4 = this.pointer;
        String string = "";
        while (n4 > 0 && !this.isLineBreak(this.buffer[n4 - 1])) {
            if (!((float)(this.pointer - --n4) > f)) continue;
            string = " ... ";
            n4 += 5;
            break;
        }
        String string2 = "";
        int n5 = this.pointer;
        while (n5 < this.buffer.length && !this.isLineBreak(this.buffer[n5])) {
            if (!((float)(++n5 - this.pointer) > f)) continue;
            string2 = " ... ";
            n5 -= 5;
            break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (n3 = 0; n3 < n; ++n3) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(string);
        for (n3 = n4; n3 < n5; ++n3) {
            stringBuilder.appendCodePoint(this.buffer[n3]);
        }
        stringBuilder.append(string2);
        stringBuilder.append("\n");
        for (n3 = 0; n3 < n + this.pointer - n4 + string.length(); ++n3) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("^");
        return stringBuilder.toString();
    }

    public String get_snippet() {
        return this.get_snippet(4, 75);
    }

    public int getLine() {
        return this.line;
    }

    public int getPointer() {
        return this.pointer;
    }
}

