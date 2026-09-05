/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper;

class UnicodeEscaper$1
implements Appendable {
    int pendingHighSurrogate = -1;
    char[] decodedChars = new char[2];
    final /* synthetic */ Appendable val$out;
    final /* synthetic */ UnicodeEscaper this$0;

    UnicodeEscaper$1(UnicodeEscaper unicodeEscaper, Appendable appendable) {
        this.this$0 = unicodeEscaper;
        this.val$out = appendable;
    }

    @Override
    public Appendable append(char c) throws IOException {
        if (this.pendingHighSurrogate != -1) {
            if (!Character.isLowSurrogate(c)) {
                throw new IllegalArgumentException("Expected low surrogate character but got '" + c + "' with value " + c);
            }
            char[] cArray = this.this$0.escape(Character.toCodePoint((char)this.pendingHighSurrogate, c));
            if (cArray != null) {
                this.outputChars(cArray, cArray.length);
            } else {
                this.val$out.append((char)this.pendingHighSurrogate);
                this.val$out.append(c);
            }
            this.pendingHighSurrogate = -1;
        } else if (Character.isHighSurrogate(c)) {
            this.pendingHighSurrogate = c;
        } else {
            if (Character.isLowSurrogate(c)) {
                throw new IllegalArgumentException("Unexpected low surrogate character '" + c + "' with value " + c);
            }
            char[] cArray = this.this$0.escape(c);
            if (cArray != null) {
                this.outputChars(cArray, cArray.length);
            } else {
                this.val$out.append(c);
            }
        }
        return this;
    }

    @Override
    public Appendable append(CharSequence charSequence, int n, int n2) throws IOException {
        int n3 = n;
        if (n3 < n2) {
            char[] cArray;
            int n4;
            int n5 = n3;
            if (this.pendingHighSurrogate != -1) {
                if (!Character.isLowSurrogate((char)(n4 = charSequence.charAt(n3++)))) {
                    throw new IllegalArgumentException("Expected low surrogate character but got " + (char)n4);
                }
                cArray = this.this$0.escape(Character.toCodePoint((char)this.pendingHighSurrogate, (char)n4));
                if (cArray != null) {
                    this.outputChars(cArray, cArray.length);
                    ++n5;
                } else {
                    this.val$out.append((char)this.pendingHighSurrogate);
                }
                this.pendingHighSurrogate = -1;
            }
            while (true) {
                if ((n3 = this.this$0.nextEscapeIndex(charSequence, n3, n2)) > n5) {
                    this.val$out.append(charSequence, n5, n3);
                }
                if (n3 == n2) break;
                n4 = UnicodeEscaper.codePointAt(charSequence, n3, n2);
                if (n4 < 0) {
                    this.pendingHighSurrogate = -n4;
                    break;
                }
                cArray = this.this$0.escape(n4);
                if (cArray != null) {
                    this.outputChars(cArray, cArray.length);
                } else {
                    int n6 = Character.toChars(n4, this.decodedChars, 0);
                    this.outputChars(this.decodedChars, n6);
                }
                n5 = n3 += Character.isSupplementaryCodePoint(n4) ? 2 : 1;
            }
        }
        return this;
    }

    @Override
    public Appendable append(CharSequence charSequence) throws IOException {
        return this.append(charSequence, 0, charSequence.length());
    }

    private void outputChars(char[] cArray, int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            this.val$out.append(cArray[i]);
        }
    }
}

