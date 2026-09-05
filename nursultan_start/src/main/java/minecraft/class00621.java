/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class05075
 *  minecraft.class09002
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class05075;
import minecraft.class09002;

public final class class00621
extends Record {
    private final Optional<class05075> defaultMusic;
    private final Optional<class05075> creativeMusic;
    private final Optional<class05075> underwaterMusic;
    public static final class00621 N = new class00621(Optional.empty(), Optional.empty(), Optional.empty());
    public static final class00621 y = new class00621(Optional.of(class09002.M), Optional.of(class09002.y), Optional.empty());
    public static final Codec<class00621> L = RecordCodecBuilder.create(instance -> instance.group((App)class05075.N.optionalFieldOf("default").forGetter(class00621::N), (App)class05075.N.optionalFieldOf("creative").forGetter(class00621::y), (App)class05075.N.optionalFieldOf("underwater").forGetter(class00621::L)).apply(instance, class00621::new));

    public Optional<class05075> L() {
        return this.underwaterMusic;
    }

    public class00621(Optional<class05075> optional, Optional<class05075> optional2, Optional<class05075> optional3) {
        this.defaultMusic = optional;
        this.creativeMusic = optional2;
        this.underwaterMusic = optional3;
    }

    public class00621(class03556<class04891> class035562) {
        this(class09002.N(class035562));
    }

    public class00621(class05075 class050752) {
        this(Optional.of(class050752), Optional.empty(), Optional.empty());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00621.class, "defaultMusic;creativeMusic;underwaterMusic", "defaultMusic", "creativeMusic", "underwaterMusic"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00621.class, "defaultMusic;creativeMusic;underwaterMusic", "defaultMusic", "creativeMusic", "underwaterMusic"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00621.class, "defaultMusic;creativeMusic;underwaterMusic", "defaultMusic", "creativeMusic", "underwaterMusic"}, this);
    }

    public Optional<class05075> y() {
        return this.creativeMusic;
    }

    public Optional<class05075> N() {
        return this.defaultMusic;
    }

    public class00621 N(class05075 class050752) {
        return new class00621(this.defaultMusic, this.creativeMusic, Optional.of(class050752));
    }

    public Optional<class05075> N(boolean bl, boolean bl2) {
        if (bl2 && this.underwaterMusic.isPresent()) {
            return this.underwaterMusic;
        }
        if (bl && this.creativeMusic.isPresent()) {
            return this.creativeMusic;
        }
        return this.defaultMusic;
    }
}

