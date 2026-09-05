/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson.api;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Escaper {
    private static final Set<Character.UnicodeBlock> DEFAULT_BLOCKS;

    private Escaper() {
    }

    static {
        HashSet<Character.UnicodeBlock> hashSet = new HashSet<Character.UnicodeBlock>();
        hashSet.add(Character.UnicodeBlock.BASIC_LATIN);
        DEFAULT_BLOCKS = Collections.unmodifiableSet(hashSet);
    }

    public static String escapeString(String string) {
        return Escaper.escapeString(string, '\"', DEFAULT_BLOCKS);
    }

    public static String escapeString(String string, char c, Set<Character.UnicodeBlock> set) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        block10: for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            switch (c2) {
                case '\\': {
                    stringBuilder.append("\\\\");
                    continue block10;
                }
                case '\r': {
                    stringBuilder.append("\\r");
                    continue block10;
                }
                case '\n': {
                    stringBuilder.append("\\n");
                    continue block10;
                }
                case '\b': {
                    stringBuilder.append("\\b");
                    continue block10;
                }
                case '\f': {
                    stringBuilder.append("\\f");
                    continue block10;
                }
                case '\t': {
                    stringBuilder.append("\\t");
                    continue block10;
                }
                case '\"': {
                    if (c == c2) {
                        stringBuilder.append("\\\"");
                        continue block10;
                    }
                    stringBuilder.append(c2);
                    continue block10;
                }
                case '\'': {
                    if (c == c2) {
                        stringBuilder.append("\\'");
                        continue block10;
                    }
                    stringBuilder.append(c2);
                    continue block10;
                }
                default: {
                    if (Character.isBmpCodePoint(c2)) {
                        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(c2);
                        if (c2 != '\uffff' && !Character.isISOControl(c2) && unicodeBlock != null && set.contains(unicodeBlock)) {
                            stringBuilder.append(c2);
                            continue block10;
                        }
                        stringBuilder.append(Escaper.unicodeEscape(c2));
                        continue block10;
                    }
                    char c3 = string.charAt(++i);
                    int n = Character.toCodePoint(c2, c3);
                    stringBuilder.append(Escaper.unicodeEscape(n));
                }
            }
        }
        return stringBuilder.toString();
    }

    private static String unicodeEscape(int n) {
        String string = "" + Integer.toHexString(n);
        while (string.length() < 4) {
            string = "0" + string;
        }
        return "\\u" + string;
    }
}

