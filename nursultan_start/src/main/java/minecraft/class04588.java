/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00810
 *  minecraft.class00821
 *  minecraft.class01425
 *  minecraft.class05196
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class05196;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class04588
extends Record
implements class01425 {
    private final Optional<class05196> player;
    public static final Codec<class04588> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class04588::N)).apply(instance, class04588::new));

    public class04588(Optional<class05196> optional) {
        this.player = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04588.class, "player", "player"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04588.class, "player", "player"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04588.class, "player", "player"}, this);
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class04588> N(class00810 class008102) {
        return class06912.x.N((class06516)new class04588(Optional.of(class00821.N((class00810)class008102))));
    }
}

