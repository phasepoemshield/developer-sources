/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.parser;

import kroppeb.stareval.parser.OpResolver;
import kroppeb.stareval.parser.StringReader;

class OpResolver$SingleDualChar<T>
extends OpResolver<T> {
    private final T singleCharOperator;
    private final T doubleCharOperator;
    private final char secondChar;

    OpResolver$SingleDualChar(T t, T t2, char c) {
        this.singleCharOperator = t;
        this.doubleCharOperator = t2;
        this.secondChar = c;
    }

    @Override
    T resolve(StringReader stringReader) {
        if (stringReader.tryRead(this.secondChar)) {
            return this.doubleCharOperator;
        }
        return this.singleCharOperator;
    }
}

