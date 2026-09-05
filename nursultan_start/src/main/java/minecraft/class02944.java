/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04482
 *  minecraft.class04490
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class06929
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class04482;
import minecraft.class04490;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class06929;

public final class class02944<T>
extends Record {
    private final T effect;
    private final Optional<class05957> requirements;

    public class02944(T t, Optional<class05957> optional) {
        this.effect = t;
        this.requirements = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02944.class, "effect;requirements", "effect", "requirements"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02944.class, "effect;requirements", "effect", "requirements"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02944.class, "effect;requirements", "effect", "requirements"}, this);
    }

    public Optional<class05957> y() {
        return this.requirements;
    }

    public static <T> Codec<class02944<T>> N(Codec<T> codec, class06929 class069292) {
        return RecordCodecBuilder.create(instance -> instance.group((App)codec.fieldOf("effect").forGetter(class02944::N), (App)class02944.N(class069292).optionalFieldOf("requirements").forGetter(class02944::y)).apply((Applicative)instance, class02944::new));
    }

    public boolean N(class05908 class059082) {
        if (this.requirements.isEmpty()) {
            return true;
        }
        return this.requirements.get().test((Object)class059082);
    }

    public static Codec<class05957> N(class06929 class069292) {
        return class05957.L.validate(class059572 -> {
            class04482 class044822 = new class04482();
            class05561 class055612 = new class05561((class04490)class044822, class069292);
            class059572.N(class055612);
            if (!class044822.N()) {
                return DataResult.error(() -> "Validation error in enchantment effect condition: " + class044822.y());
            }
            return DataResult.success((Object)class059572);
        });
    }

    public T N() {
        return this.effect;
    }
}

