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
 *  minecraft.class04492
 *  minecraft.class05196
 *  minecraft.class05908
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
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class07669
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05196> entity;
    public static final Codec<class07669> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class07669::N), (App)class00821.y.optionalFieldOf("entity").forGetter(class07669::L)).apply(instance, class07669::new));

    public Optional<class05196> L() {
        return this.entity;
    }

    public class07669(Optional<class05196> optional, Optional<class05196> optional2) {
        this.player = optional;
        this.entity = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07669.class, "player;entity", "player", "entity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07669.class, "player;entity", "player", "entity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07669.class, "player;entity", "player", "entity"}, this);
    }

    public static class06915<class07669> y() {
        return class06912.d.N((class06516)new class07669(Optional.empty(), Optional.empty()));
    }

    public static class06915<class07669> N(class00810 class008102) {
        return class06912.d.N((class06516)new class07669(Optional.empty(), Optional.of(class00821.N((class00810)class008102))));
    }

    public boolean N(class05908 class059082) {
        return this.entity.isEmpty() || this.entity.get().N(class059082);
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.entity, "entity");
    }
}

