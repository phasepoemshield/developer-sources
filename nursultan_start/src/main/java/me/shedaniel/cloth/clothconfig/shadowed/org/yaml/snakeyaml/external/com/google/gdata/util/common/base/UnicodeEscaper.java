/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper$2;

public abstract class UnicodeEscaper
implements Escaper {
    private static final int DEST_PAD = 32;
    private static final ThreadLocal<char[]> DEST_TL = new UnicodeEscaper$2();

    protected final String escapeSlow(String string, int n) {
        int n2;
        int n3 = string.length();
        char[] cArray = DEST_TL.get();
        int n4 = 0;
        int n5 = 0;
        while (n < n3) {
            n2 = UnicodeEscaper.codePointAt(string, n, n3);
            if (n2 < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArray2 = this.escape(n2);
            if (cArray2 != null) {
                int n6 = n - n5;
                int n7 = n4 + n6 + cArray2.length;
                if (cArray.length < n7) {
                    int n8 = n7 + (n3 - n) + 32;
                    cArray = UnicodeEscaper.growBuffer(cArray, n4, n8);
                }
                if (n6 > 0) {
                    string.getChars(n5, n, cArray, n4);
                    n4 += n6;
                }
                if (cArray2.length > 0) {
                    System.arraycopy(cArray2, 0, cArray, n4, cArray2.length);
                    n4 += cArray2.length;
                }
            }
            n5 = n + (Character.isSupplementaryCodePoint(n2) ? 2 : 1);
            n = this.nextEscapeIndex(string, n5, n3);
        }
        n2 = n3 - n5;
        if (n2 > 0) {
            int n9 = n4 + n2;
            if (cArray.length < n9) {
                cArray = UnicodeEscaper.growBuffer(cArray, n4, n9);
            }
            string.getChars(n5, n3, cArray, n4);
            n4 = n9;
        }
        return new String(cArray, 0, n4);
    }

    private static final char[] growBuffer(char[] cArray, int n, int n2) {
        char[] cArray2 = new char[n2];
        if (n > 0) {
            System.arraycopy(cArray, 0, cArray2, 0, n);
        }
        return cArray2;
    }

    protected static final int codePointAt(CharSequence charSequence, int n, int n2) {
        if (n < n2) {
            char c;
            if ((c = charSequence.charAt(n++)) < '\ud800' || c > '\udfff') {
                return c;
            }
            if (c <= '\udbff') {
                if (n == n2) {
                    return -c;
                }
                char c2 = charSequence.charAt(n);
                if (Character.isLowSurrogate(c2)) {
                    return Character.toCodePoint(c, c2);
                }
                throw new IllegalArgumentException("Expected low surrogate but got char '" + c2 + "' with value " + c2 + " at index " + n);
            }
            throw new IllegalArgumentException("Unexpected low surrogate character '" + c + "' with value " + c + " at index " + (n - 1));
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    @Override
    public String escape(String string) {
        int n = string.length();
        int n2 = this.nextEscapeIndex(string, 0, n);
        return n2 == n ? string : this.escapeSlow(string, n2);
    }

    protected abstract char[] escape(int var1);

    @Override
    public Appendable escape(Appendable appendable) {
        assert (appendable != null);
        return new UnicodeEscaper$1(this, appendable);
    }

    protected int nextEscapeIndex(CharSequence charSequence, int n, int n2) {
        int n3;
        int n4;
        for (n3 = n; n3 < n2 && (n4 = UnicodeEscaper.codePointAt(charSequence, n3, n2)) >= 0 && this.escape(n4) == null; n3 += Character.isSupplementaryCodePoint(n4) ? 2 : 1) {
        }
        return n3;
    }
}

