/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01425
 *  minecraft.class03729
 *  minecraft.class05196
 *  minecraft.class05946
 *  minecraft.class06521
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class03729;
import minecraft.class05196;
import minecraft.class05946;
import minecraft.class06521;

public final class class00841
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final class05946<class06521<?>> recipe;
    public static final Codec<class00841> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00841::N), (App)class06521.M.fieldOf("recipe").forGetter(class00841::y)).apply(instance, class00841::new));

    public class00841(Optional<class05196> optional, class05946<class06521<?>> class059462) {
        this.player = optional;
        this.recipe = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00841.class, "player;recipe", "player", "recipe"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00841.class, "player;recipe", "player", "recipe"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00841.class, "player;recipe", "player", "recipe"}, this);
    }

    public class05946<class06521<?>> y() {
        return this.recipe;
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class03729<?> class037292) {
        return this.recipe == class037292.N();
    }
}

