/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.parser;

import kroppeb.stareval.parser.OpResolver;
import kroppeb.stareval.parser.StringReader;

class OpResolver$SingleChar<T>
extends OpResolver<T> {
    private final T op;

    OpResolver$SingleChar(T t) {
        this.op = t;
    }

    @Override
    T resolve(StringReader stringReader) {
        return this.op;
    }
}

