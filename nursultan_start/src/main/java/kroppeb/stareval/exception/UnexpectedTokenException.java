/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.exception;

import kroppeb.stareval.exception.ParseException;

public class UnexpectedTokenException
extends ParseException {
    public UnexpectedTokenException(String string, int n) {
        super(string + " at index " + n);
    }
}

