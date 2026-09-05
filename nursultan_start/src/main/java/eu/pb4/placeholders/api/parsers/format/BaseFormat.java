/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Context
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Format
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Format$Tag
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Provider
 */
package eu.pb4.placeholders.api.parsers.format;

import eu.pb4.placeholders.api.parsers.TagLikeParser;

public interface BaseFormat
extends TagLikeParser.Format {
    public static final char[] DEFAULT_ARGUMENT_WRAPPER = new char[]{'\"', '\'', '`'};
    public static final char[] LEGACY_ARGUMENT_WRAPPER = new char[]{'\''};

    public boolean hasArgument();

    public int matchArgument(String var1, int var2);

    public char[] argumentWrappers();

    public int matchEnd(String var1, int var2);

    public int matchStart(String var1, int var2);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    default public TagLikeParser.Format.Tag findAt(String string, int n, TagLikeParser.Provider provider, TagLikeParser.Context context) {
        if (string.charAt(n) == '\\') {
            return null;
        }
        int n2 = this.matchStart(string, n);
        if (n2 == 0) {
            return null;
        }
        String string2 = null;
        String string3 = "";
        char c = '\u0000';
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = string.length();
        block0: for (int i = n + n2; i < n3; ++i) {
            char c2 = string.charAt(i);
            boolean bl = true;
            int n4 = 0;
            if (c != '\u0000') {
                if (c2 == c) {
                    c = '\u0000';
                }
                stringBuilder.append(c2);
                continue;
            }
            if (c2 == '\\') {
                if (i + 1 >= string.length()) continue;
                stringBuilder.append(string.charAt(++i));
                continue;
            }
            if (string2 != null) {
                for (char c3 : this.argumentWrappers()) {
                    if (c2 != c3) continue;
                    stringBuilder.append(c2);
                    c = c2;
                    continue block0;
                }
            }
            if (string2 == null && this.hasArgument() && (n4 = this.matchArgument(string, i)) <= 0) {
                bl = false;
                n4 = 0;
            }
            int n5 = 0;
            if (n4 == 0) {
                bl = true;
                n5 = this.matchEnd(string, i);
                if (n5 <= 0) {
                    bl = false;
                    n5 = 0;
                }
            }
            if (bl) {
                String string4 = stringBuilder.toString();
                if (string2 == null) {
                    if (!provider.isValidTag(string4, context)) return null;
                    string2 = string4;
                    stringBuilder = new StringBuilder();
                    if (n5 != 0) return new TagLikeParser.Format.Tag(n, i + n5, string2, string3);
                    continue;
                }
                string3 = string4;
                return new TagLikeParser.Format.Tag(n, i + n5, string2, string3);
            }
            stringBuilder.append(c2);
        }
        return null;
    }

    public int endLength();
}

