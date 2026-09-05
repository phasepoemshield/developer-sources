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
 *  minecraft.class02944
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
import minecraft.class02558;
import minecraft.class02944;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class06929;

public final class class02550<T>
extends Record {
    private final class02558 enchanted;
    private final class02558 affected;
    private final T effect;
    private final Optional<class05957> requirements;

    public T L() {
        return this.effect;
    }

    public class02550(class02558 class025582, class02558 class025583, T t, Optional<class05957> optional) {
        this.enchanted = class025582;
        this.affected = class025583;
        this.effect = t;
        this.requirements = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02550.class, "enchanted;affected;effect;requirements", "enchanted", "affected", "effect", "requirements"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02550.class, "enchanted;affected;effect;requirements", "enchanted", "affected", "effect", "requirements"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02550.class, "enchanted;affected;effect;requirements", "enchanted", "affected", "effect", "requirements"}, this);
    }

    public Optional<class05957> u() {
        return this.requirements;
    }

    public class02558 y() {
        return this.affected;
    }

    public static <S> Codec<class02550<S>> y(Codec<S> codec, class06929 class069292) {
        return RecordCodecBuilder.create(instance -> instance.group((App)class02558.field_51686.validate(class025582 -> class025582 != class02558.field_51684 ? DataResult.success((Object)class025582) : DataResult.error(() -> "enchanted must be attacker or victim")).fieldOf("enchanted").forGetter(class02550::N), (App)codec.fieldOf("effect").forGetter(class02550::L), (App)class02944.N((class06929)class069292).optionalFieldOf("requirements").forGetter(class02550::u)).apply((Applicative)instance, (class025582, object, optional) -> new class02550<Object>((class02558)((Object)((Object)class025582)), class02558.field_51685, object, (Optional<class05957>)optional)));
    }

    public static <S> Codec<class02550<S>> N(Codec<S> codec, class06929 class069292) {
        return RecordCodecBuilder.create(instance -> instance.group((App)class02558.field_51686.fieldOf("enchanted").forGetter(class02550::N), (App)class02558.field_51686.fieldOf("affected").forGetter(class02550::y), (App)codec.fieldOf("effect").forGetter(class02550::L), (App)class02944.N((class06929)class069292).optionalFieldOf("requirements").forGetter(class02550::u)).apply((Applicative)instance, class02550::new));
    }

    public boolean N(class05908 class059082) {
        if (this.requirements.isEmpty()) {
            return true;
        }
        return this.requirements.get().test((Object)class059082);
    }

    public class02558 N() {
        return this.enchanted;
    }
}

