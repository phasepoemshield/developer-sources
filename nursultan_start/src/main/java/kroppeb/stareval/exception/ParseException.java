/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.exception;

public abstract class ParseException
extends Exception {
    public ParseException(String string, Throwable throwable, boolean bl, boolean bl2) {
        super(string, throwable, bl, bl2);
    }

    public ParseException(Throwable throwable) {
        super(throwable);
    }

    public ParseException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public ParseException(String string) {
        super(string);
    }

    public ParseException() {
    }
}

