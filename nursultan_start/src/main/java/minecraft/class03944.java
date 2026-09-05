/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01482
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01482;

public class class03944
extends class01482 {
    private final Predicate<String> N;

    public class03944(Schema schema, String string, Predicate<String> predicate) {
        super(schema, string);
        this.N = predicate.negate();
    }

    protected <T> Stream<Dynamic<T>> N(Stream<Dynamic<T>> stream) {
        return stream.filter(this::N);
    }

    private <T> boolean N(Dynamic<T> dynamic) {
        return dynamic.get("type").asString().result().filter(this.N).isPresent();
    }
}

