/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.parser;

import kroppeb.stareval.exception.ParseException;
import kroppeb.stareval.parser.StringReader;

abstract class OpResolver<T> {
    OpResolver() {
    }

    abstract T resolve(StringReader var1) throws ParseException;
}

