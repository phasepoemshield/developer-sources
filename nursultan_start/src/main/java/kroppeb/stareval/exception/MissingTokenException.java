/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.exception;

import kroppeb.stareval.exception.ParseException;

public class MissingTokenException
extends ParseException {
    public MissingTokenException(String string, int n) {
        super(string + " at index " + n);
    }
}

