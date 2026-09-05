/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class03952
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;
import minecraft.class03952;

public abstract class class08360
extends class03952 {
    public class08360(Schema schema, String string, Predicate<String> predicate) {
        super(schema, string, predicate);
    }

    protected abstract <T> Dynamic<T> N(Dynamic<T> var1);

    protected final Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

