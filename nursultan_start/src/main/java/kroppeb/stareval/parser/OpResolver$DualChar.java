/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.parser;

import kroppeb.stareval.exception.ParseException;
import kroppeb.stareval.parser.OpResolver;
import kroppeb.stareval.parser.StringReader;

class OpResolver$DualChar<T>
extends OpResolver<T> {
    private final T op;
    private final char secondChar;

    OpResolver$DualChar(T t, char c) {
        this.op = t;
        this.secondChar = c;
    }

    @Override
    T resolve(StringReader stringReader) throws ParseException {
        stringReader.read(this.secondChar);
        return this.op;
    }
}

