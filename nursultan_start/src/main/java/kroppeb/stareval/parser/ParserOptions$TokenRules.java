/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.parser;

import kroppeb.stareval.parser.ParserOptions$TokenRules$1;

public interface ParserOptions$TokenRules {
    public static final ParserOptions$TokenRules DEFAULT = new ParserOptions$TokenRules$1();

    public static boolean isLetter(char c) {
        return ParserOptions$TokenRules.isLowerCaseLetter(c) || ParserOptions$TokenRules.isUpperCaseLetter(c);
    }

    public static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    default public boolean isIdStart(char c) {
        return ParserOptions$TokenRules.isLetter(c) || c == '_';
    }

    default public boolean isIdPart(char c) {
        return this.isIdStart(c) || ParserOptions$TokenRules.isNumber(c);
    }

    default public boolean isNumberPart(char c) {
        return this.isNumberStart(c) || ParserOptions$TokenRules.isLetter(c);
    }

    public static boolean isUpperCaseLetter(char c) {
        return c >= 'A' && c <= 'Z';
    }

    default public boolean isAccessStart(char c) {
        return this.isIdStart(c) || ParserOptions$TokenRules.isNumber(c);
    }

    default public boolean isAccessPart(char c) {
        return this.isAccessStart(c);
    }

    public static boolean isLowerCaseLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    default public boolean isNumberStart(char c) {
        return ParserOptions$TokenRules.isNumber(c) || c == '.';
    }
}

