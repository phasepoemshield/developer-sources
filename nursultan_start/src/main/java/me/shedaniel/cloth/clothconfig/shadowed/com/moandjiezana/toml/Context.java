/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Identifier;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;

class Context {
    final Identifier identifier;
    final AtomicInteger line;
    final Results$Errors errors;

    public Context(Identifier identifier, AtomicInteger atomicInteger, Results$Errors results$Errors) {
        this.identifier = identifier;
        this.line = atomicInteger;
        this.errors = results$Errors;
    }

    public Context with(Identifier identifier) {
        return new Context(identifier, this.line, this.errors);
    }
}

