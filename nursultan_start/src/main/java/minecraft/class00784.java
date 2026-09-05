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
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class00784
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05196> zombie;
    private final Optional<class05196> villager;
    public static final Codec<class00784> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00784::N), (App)class00821.y.optionalFieldOf("zombie").forGetter(class00784::L), (App)class00821.y.optionalFieldOf("villager").forGetter(class00784::u)).apply(instance, class00784::new));

    public Optional<class05196> L() {
        return this.zombie;
    }

    public class00784(Optional<class05196> optional, Optional<class05196> optional2, Optional<class05196> optional3) {
        this.player = optional;
        this.zombie = optional2;
        this.villager = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00784.class, "player;zombie;villager", "player", "zombie", "villager"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00784.class, "player;zombie;villager", "player", "zombie", "villager"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00784.class, "player;zombie;villager", "player", "zombie", "villager"}, this);
    }

    public Optional<class05196> u() {
        return this.villager;
    }

    public static class06915<class00784> y() {
        return class06912.j.N((class06516)new class00784(Optional.empty(), Optional.empty(), Optional.empty()));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.zombie, "zombie");
        class044922.N(this.villager, "villager");
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class05908 class059082, class05908 class059083) {
        if (this.zombie.isPresent() && !this.zombie.get().N(class059082)) {
            return false;
        }
        return !this.villager.isPresent() || this.villager.get().N(class059083);
    }
}

