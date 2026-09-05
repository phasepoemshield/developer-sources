/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner;

import java.util.Arrays;

public final class Constant {
    private static final String ALPHA_S = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
    private static final String LINEBR_S = "\n\u0085\u2028\u2029";
    private static final String FULL_LINEBR_S = "\r\n\u0085\u2028\u2029";
    private static final String NULL_OR_LINEBR_S = "\u0000\r\n\u0085\u2028\u2029";
    private static final String NULL_BL_LINEBR_S = " \u0000\r\n\u0085\u2028\u2029";
    private static final String NULL_BL_T_LINEBR_S = "\t \u0000\r\n\u0085\u2028\u2029";
    private static final String NULL_BL_T_S = "\u0000 \t";
    private static final String URI_CHARS_S = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%";
    public static final Constant LINEBR = new Constant("\n\u0085\u2028\u2029");
    public static final Constant FULL_LINEBR = new Constant("\r\n\u0085\u2028\u2029");
    public static final Constant NULL_OR_LINEBR = new Constant("\u0000\r\n\u0085\u2028\u2029");
    public static final Constant NULL_BL_LINEBR = new Constant(" \u0000\r\n\u0085\u2028\u2029");
    public static final Constant NULL_BL_T_LINEBR = new Constant("\t \u0000\r\n\u0085\u2028\u2029");
    public static final Constant NULL_BL_T = new Constant("\u0000 \t");
    public static final Constant URI_CHARS = new Constant("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
    public static final Constant ALPHA = new Constant("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
    private String content;
    boolean[] contains = new boolean[128];
    boolean noASCII = false;

    public boolean has(int n, String string) {
        return this.has(n) || string.indexOf(n, 0) != -1;
    }

    public boolean has(int n) {
        return n < 128 ? this.contains[n] : this.noASCII && this.content.indexOf(n, 0) != -1;
    }

    private Constant(String string) {
        Arrays.fill(this.contains, false);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            int n = string.codePointAt(i);
            if (n < 128) {
                this.contains[n] = true;
                continue;
            }
            stringBuilder.appendCodePoint(n);
        }
        if (stringBuilder.length() > 0) {
            this.noASCII = true;
            this.content = stringBuilder.toString();
        }
    }

    public boolean hasNo(int n, String string) {
        return !this.has(n, string);
    }

    public boolean hasNo(int n) {
        return !this.has(n);
    }
}

