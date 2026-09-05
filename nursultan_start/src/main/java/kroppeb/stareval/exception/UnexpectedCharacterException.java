/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.exception;

import kroppeb.stareval.exception.ParseException;

public class UnexpectedCharacterException
extends ParseException {
    private UnexpectedCharacterException(String string) {
        super(string);
    }

    public UnexpectedCharacterException(String string, char c, int n) {
        this("Expected to read " + string + " but got '" + c + "' at index " + n);
    }

    public UnexpectedCharacterException(char c, int n) {
        this("Read an unexpected character '" + c + "' at index " + n);
    }

    public UnexpectedCharacterException(char c, char c2, int n) {
        this("Expected to read '" + c + "' but got '" + c2 + "' at index " + n);
    }
}

