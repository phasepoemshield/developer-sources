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
 *  minecraft.class00837
 *  minecraft.class00845
 *  minecraft.class01425
 *  minecraft.class04492
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06584
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
import minecraft.class00821;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;

public final class class01243
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00845> item;
    private final Optional<class05196> entity;
    public static final Codec<class01243> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class01243::N), (App)class00845.N.optionalFieldOf("item").forGetter(class01243::y), (App)class00821.y.optionalFieldOf("entity").forGetter(class01243::L)).apply(instance, class01243::new));

    public Optional<class05196> L() {
        return this.entity;
    }

    public class01243(Optional<class05196> optional, Optional<class00845> optional2, Optional<class05196> optional3) {
        this.player = optional;
        this.item = optional2;
        this.entity = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01243.class, "player;item;entity", "player", "item", "entity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01243.class, "player;item;entity", "player", "item", "entity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01243.class, "player;item;entity", "player", "item", "entity"}, this);
    }

    public static class06915<class01243> y(class00837 class008372, Optional<class05196> optional) {
        return class01243.N(Optional.empty(), class008372, optional);
    }

    public Optional<class00845> y() {
        return this.item;
    }

    public static class06915<class01243> y(Optional<class05196> optional, class00837 class008372, Optional<class05196> optional2) {
        return class06912.S.N((class06516)new class01243(optional, Optional.of(class008372.y()), optional2));
    }

    public static class06915<class01243> N(class00837 class008372, Optional<class05196> optional) {
        return class06912.S.N((class06516)new class01243(Optional.empty(), Optional.of(class008372.y()), optional));
    }

    public static class06915<class01243> N(Optional<class05196> optional, class00837 class008372, Optional<class05196> optional2) {
        return class06912.C.N((class06516)new class01243(optional, Optional.of(class008372.y()), optional2));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.entity, "entity");
    }

    public boolean N(class06584 class065842, class05908 class059082) {
        if (this.item.isPresent() && !this.item.get().test(class065842)) {
            return false;
        }
        return this.entity.isEmpty() || this.entity.get().N(class059082);
    }
}

