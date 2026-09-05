/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.parsers.format.MultiCharacterFormat
 *  eu.pb4.placeholders.api.parsers.format.SingleCharacterFormat
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.parsers.TagLikeParser$Context;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Format$Tag;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider;
import eu.pb4.placeholders.api.parsers.format.MultiCharacterFormat;
import eu.pb4.placeholders.api.parsers.format.SingleCharacterFormat;

public interface TagLikeParser$Format {
    default public int index() {
        return 0;
    }

    public static TagLikeParser$Format of(String string, String string2, String string3) {
        return new MultiCharacterFormat(string, string2, string3);
    }

    public static TagLikeParser$Format of(char c, char c2, char c3) {
        return new SingleCharacterFormat(c, c2, c3);
    }

    public static TagLikeParser$Format of(char c, char c2) {
        return new SingleCharacterFormat(c, c2);
    }

    default public TagLikeParser$Format$Tag findFirst(String string, int n, TagLikeParser$Provider tagLikeParser$Provider, TagLikeParser$Context tagLikeParser$Context) {
        int n2 = string.length();
        for (int i = n; i < n2; ++i) {
            TagLikeParser$Format$Tag tagLikeParser$Format$Tag = this.findAt(string, i, tagLikeParser$Provider, tagLikeParser$Context);
            if (tagLikeParser$Format$Tag != null) {
                return tagLikeParser$Format$Tag;
            }
            if (string.charAt(i) != '\\' || n2 <= i + 1) continue;
            ++i;
        }
        return null;
    }

    public TagLikeParser$Format$Tag findAt(String var1, int var2, TagLikeParser$Provider var3, TagLikeParser$Context var4);
}

