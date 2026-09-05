/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Identifier$Type;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Keys;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.StringValueReaderWriter;

class Identifier {
    static final Identifier INVALID = new Identifier("", null);
    private static final String ALLOWED_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890_-";
    private final String name;
    private final Identifier$Type type;

    private Identifier(String string, Identifier$Type identifier$Type) {
        this.name = string;
        this.type = identifier$Type;
    }

    String getName() {
        return this.name;
    }

    static Identifier from(String string, Context context) {
        boolean bl;
        Identifier$Type identifier$Type;
        if ((string = string.trim()).startsWith("[[")) {
            identifier$Type = Identifier$Type.TABLE_ARRAY;
            bl = Identifier.isValidTableArray(string, context);
        } else if (string.startsWith("[")) {
            identifier$Type = Identifier$Type.TABLE;
            bl = Identifier.isValidTable(string, context);
        } else {
            identifier$Type = Identifier$Type.KEY;
            bl = Identifier.isValidKey(string, context);
        }
        if (!bl) {
            return INVALID;
        }
        return new Identifier(Identifier.extractName(string), identifier$Type);
    }

    private static boolean isValidKey(String string, Context context) {
        if (string.trim().isEmpty()) {
            context.errors.invalidKey(string, context.line.get());
            return false;
        }
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == '\"' && (i == 0 || string.charAt(i - 1) != '\\')) {
                if (!bl && i > 0 && string.charAt(i - 1) != '.') {
                    context.errors.invalidKey(string, context.line.get());
                    return false;
                }
                bl = !bl;
                continue;
            }
            if (bl || ALLOWED_CHARS.indexOf(c) != -1) continue;
            context.errors.invalidKey(string, context.line.get());
            return false;
        }
        return true;
    }

    boolean isKey() {
        return this.type == Identifier$Type.KEY;
    }

    boolean isTable() {
        return this.type == Identifier$Type.TABLE;
    }

    private static String extractName(String string) {
        boolean bl = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == '\"' && (i == 0 || string.charAt(i - 1) != '\\')) {
                bl = !bl;
                stringBuilder.append('\"');
                continue;
            }
            if (!bl && Character.isWhitespace(c)) continue;
            stringBuilder.append(c);
        }
        return StringValueReaderWriter.STRING_VALUE_READER_WRITER.replaceUnicodeCharacters(stringBuilder.toString());
    }

    String getBareName() {
        if (this.isKey()) {
            return this.name;
        }
        if (this.isTable()) {
            return this.name.substring(1, this.name.length() - 1);
        }
        return this.name.substring(2, this.name.length() - 2);
    }

    private static boolean isValidTableArray(String string, Context context) {
        String string2;
        boolean bl = true;
        if (!string.endsWith("]]")) {
            bl = false;
        }
        if ((string2 = string.substring(2, string.length() - 2).trim()).isEmpty() || string2.charAt(0) == '.' || string2.endsWith(".")) {
            bl = false;
        }
        if (!bl) {
            context.errors.invalidTableArray(string, context.line.get());
            return false;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = true;
        boolean bl5 = true;
        for (int i = 0; i < string2.length(); ++i) {
            char c = string2.charAt(i);
            if (!bl) break;
            if (c == '\"') {
                if (!bl4) {
                    bl = false;
                    continue;
                }
                if (bl2 && string2.charAt(i - 1) != '\\') {
                    bl5 = false;
                    bl3 = true;
                    bl4 = false;
                    continue;
                }
                if (bl2) continue;
                bl2 = true;
                bl4 = true;
                continue;
            }
            if (bl2) continue;
            if (c == '.') {
                if (bl3) {
                    bl5 = true;
                    bl3 = false;
                    bl4 = true;
                    continue;
                }
                context.errors.emptyImplicitTable(string, context.line.get());
                return false;
            }
            if (Character.isWhitespace(c)) {
                char c2 = string2.charAt(i - 1);
                if (Character.isWhitespace(c2) || c2 == '.' || c2 == '\"') continue;
                bl5 = false;
                bl3 = true;
                bl4 = true;
                continue;
            }
            if (bl5 && ALLOWED_CHARS.indexOf(c) > -1) {
                bl5 = true;
                bl3 = true;
                bl4 = false;
                continue;
            }
            bl = false;
        }
        if (!bl) {
            context.errors.invalidTableArray(string, context.line.get());
            return false;
        }
        return true;
    }

    boolean isTableArray() {
        return this.type == Identifier$Type.TABLE_ARRAY;
    }

    private static boolean isValidTable(String string, Context context) {
        String string2;
        boolean bl = true;
        if (!string.endsWith("]")) {
            bl = false;
        }
        if ((string2 = string.substring(1, string.length() - 1).trim()).isEmpty() || string2.charAt(0) == '.' || string2.endsWith(".")) {
            bl = false;
        }
        if (!bl) {
            context.errors.invalidTable(string, context.line.get());
            return false;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = true;
        boolean bl5 = true;
        for (int i = 0; i < string2.length(); ++i) {
            char c = string2.charAt(i);
            if (!bl) break;
            if (Keys.isQuote(c)) {
                if (!bl4) {
                    bl = false;
                    continue;
                }
                if (bl2 && string2.charAt(i - 1) != '\\') {
                    bl5 = false;
                    bl3 = true;
                    bl4 = false;
                    continue;
                }
                if (bl2) continue;
                bl2 = true;
                bl4 = true;
                continue;
            }
            if (bl2) continue;
            if (c == '.') {
                if (bl3) {
                    bl5 = true;
                    bl3 = false;
                    bl4 = true;
                    continue;
                }
                context.errors.emptyImplicitTable(string, context.line.get());
                return false;
            }
            if (Character.isWhitespace(c)) {
                char c2 = string2.charAt(i - 1);
                if (Character.isWhitespace(c2) || c2 == '.') continue;
                bl5 = false;
                bl3 = true;
                bl4 = true;
                continue;
            }
            if (bl5 && ALLOWED_CHARS.indexOf(c) > -1) {
                bl5 = true;
                bl3 = true;
                bl4 = false;
                continue;
            }
            bl = false;
        }
        if (!bl) {
            context.errors.invalidTable(string, context.line.get());
            return false;
        }
        return true;
    }
}

