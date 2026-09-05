/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.Jankson
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl;

import squeek.appleskin.shadowed.blue.endless.jankson.Jankson;
import squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError;

public interface ParserContext<T> {
    public boolean consume(int var1, Jankson var2) throws SyntaxError;

    public T getResult() throws SyntaxError;

    public boolean isComplete();

    public void eof() throws SyntaxError;
}

