/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import java.util.function.Consumer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;

class Jankson$ParserFrame<T> {
    private ParserContext<T> context;
    private Consumer<T> consumer;
    private int startLine = 0;
    private int startCol = 0;

    static /* synthetic */ int access$102(Jankson$ParserFrame jankson$ParserFrame, int n) {
        jankson$ParserFrame.startLine = n;
        return jankson$ParserFrame.startLine;
    }

    static /* synthetic */ ParserContext access$000(Jankson$ParserFrame jankson$ParserFrame) {
        return jankson$ParserFrame.context;
    }

    static /* synthetic */ int access$100(Jankson$ParserFrame jankson$ParserFrame) {
        return jankson$ParserFrame.startLine;
    }

    public Consumer<T> consumer() {
        return this.consumer;
    }

    static /* synthetic */ int access$200(Jankson$ParserFrame jankson$ParserFrame) {
        return jankson$ParserFrame.startCol;
    }

    public Jankson$ParserFrame(ParserContext<T> parserContext, Consumer<T> consumer) {
        this.context = parserContext;
        this.consumer = consumer;
    }

    public ParserContext<T> context() {
        return this.context;
    }

    static /* synthetic */ int access$202(Jankson$ParserFrame jankson$ParserFrame, int n) {
        jankson$ParserFrame.startCol = n;
        return jankson$ParserFrame.startCol;
    }

    public void supply() throws SyntaxError {
        this.consumer.accept(this.context.getResult());
    }
}

