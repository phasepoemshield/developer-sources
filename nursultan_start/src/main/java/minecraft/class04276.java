/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00821
 *  minecraft.class01425
 *  minecraft.class04492
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06925
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
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06925;

public final class class04276
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05196> location;
    public static final Codec<class04276> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class04276::N), (App)class05196.N.optionalFieldOf("location").forGetter(class04276::y)).apply(instance, class04276::new));

    public class04276(Optional<class05196> optional, Optional<class05196> optional2) {
        this.player = optional;
        this.location = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04276.class, "player;location", "player", "location"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04276.class, "player;location", "player", "location"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04276.class, "player;location", "player", "location"}, this);
    }

    public Optional<class05196> y() {
        return this.location;
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        this.location.ifPresent(class051962 -> class044922.N(class051962, class06925.T, "location"));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class05908 class059082) {
        return this.location.isEmpty() || this.location.get().N(class059082);
    }
}

