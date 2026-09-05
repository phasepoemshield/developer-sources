/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class08584;

public final class class08556<Context, Condition extends class08584<Context>>
extends Record {
    private final Optional<Condition> condition;
    private final int priority;

    public class08556(Optional<Condition> optional, int n) {
        this.condition = optional;
        this.priority = n;
    }

    public class08556(int n) {
        this((Condition)Optional.empty(), n);
    }

    public class08556(Condition Condition, int n) {
        this(Optional.of(Condition), n);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08556.class, "condition;priority", "condition", "priority"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08556.class, "condition;priority", "condition", "priority"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08556.class, "condition;priority", "condition", "priority"}, this);
    }

    public int y() {
        return this.priority;
    }

    public static <Context, Condition extends class08584<Context>> Codec<class08556<Context, Condition>> N(Codec<Condition> codec) {
        return RecordCodecBuilder.create(instance -> instance.group((App)codec.optionalFieldOf("condition").forGetter(class08556::N), (App)Codec.INT.fieldOf("priority").forGetter(class08556::y)).apply((Applicative)instance, class08556::new));
    }

    public Optional<Condition> N() {
        return this.condition;
    }
}

