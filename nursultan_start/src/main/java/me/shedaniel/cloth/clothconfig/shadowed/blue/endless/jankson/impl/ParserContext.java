/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;

public interface ParserContext<T> {
    public boolean consume(int var1, Jankson var2) throws SyntaxError;

    public T getResult() throws SyntaxError;

    public boolean isComplete();

    public void eof() throws SyntaxError;
}

