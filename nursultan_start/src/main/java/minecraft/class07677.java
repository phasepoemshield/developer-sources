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
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class00845;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;

public final class class07677
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05196> villager;
    private final Optional<class00845> item;
    public static final Codec<class07677> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class07677::N), (App)class00821.y.optionalFieldOf("villager").forGetter(class07677::L), (App)class00845.N.optionalFieldOf("item").forGetter(class07677::u)).apply(instance, class07677::new));

    public Optional<class05196> L() {
        return this.villager;
    }

    public class07677(Optional<class05196> optional, Optional<class05196> optional2, Optional<class00845> optional3) {
        this.player = optional;
        this.villager = optional2;
        this.item = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07677.class, "player;villager;item", "player", "villager", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07677.class, "player;villager;item", "player", "villager", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07677.class, "player;villager;item", "player", "villager", "item"}, this);
    }

    public Optional<class00845> u() {
        return this.item;
    }

    public static class06915<class07677> y() {
        return class06912.v.N((class06516)new class07677(Optional.empty(), Optional.empty(), Optional.empty()));
    }

    public boolean N(class05908 class059082, class06584 class065842) {
        if (this.villager.isPresent() && !this.villager.get().N(class059082)) {
            return false;
        }
        return !this.item.isPresent() || this.item.get().test(class065842);
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class07677> N(class00810 class008102) {
        return class06912.v.N((class06516)new class07677(Optional.of(class00821.N((class00810)class008102)), Optional.empty(), Optional.empty()));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.villager, "villager");
    }
}

