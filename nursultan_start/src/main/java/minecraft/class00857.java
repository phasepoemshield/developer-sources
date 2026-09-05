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
 *  minecraft.class04492
 *  minecraft.class04770
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00764;
import minecraft.class00798;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class04770;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07072;

public final class class00857
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class00798> damage;
    private final Optional<class05196> entity;
    public static final Codec<class00857> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00857::N), (App)class00798.N.optionalFieldOf("damage").forGetter(class00857::L), (App)class00821.y.optionalFieldOf("entity").forGetter(class00857::u)).apply(instance, class00857::new));

    public Optional<class00798> L() {
        return this.damage;
    }

    public class00857(Optional<class05196> optional, Optional<class00798> optional2, Optional<class05196> optional3) {
        this.player = optional;
        this.damage = optional2;
        this.entity = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00857.class, "player;damage;entity", "player", "damage", "entity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00857.class, "player;damage;entity", "player", "damage", "entity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00857.class, "player;damage;entity", "player", "damage", "entity"}, this);
    }

    public Optional<class05196> u() {
        return this.entity;
    }

    public static class06915<class00857> y(Optional<class00821> optional) {
        return class06912.B.N((class06516)new class00857(Optional.empty(), Optional.empty(), class00821.N(optional)));
    }

    public static class06915<class00857> y() {
        return class06912.B.N((class06516)new class00857(Optional.empty(), Optional.empty(), Optional.empty()));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.entity, "entity");
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class00857> N(Optional<class00798> optional, Optional<class00821> optional2) {
        return class06912.B.N((class06516)new class00857(Optional.empty(), optional, class00821.N(optional2)));
    }

    public static class06915<class00857> N(class00764 class007642, Optional<class00821> optional) {
        return class06912.B.N((class06516)new class00857(Optional.empty(), Optional.of(class007642.y()), class00821.N(optional)));
    }

    public boolean N(class04770 class047702, class05908 class059082, class07072 class070722, float f, float f2, boolean bl) {
        if (this.damage.isPresent() && !this.damage.get().N(class047702, class070722, f, f2, bl)) {
            return false;
        }
        return !this.entity.isPresent() || this.entity.get().N(class059082);
    }

    public static class06915<class00857> N(Optional<class00798> optional) {
        return class06912.B.N((class06516)new class00857(Optional.empty(), optional, Optional.empty()));
    }

    public static class06915<class00857> N(class00764 class007642) {
        return class06912.B.N((class06516)new class00857(Optional.empty(), Optional.of(class007642.y()), Optional.empty()));
    }
}

