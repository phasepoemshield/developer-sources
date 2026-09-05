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
 *  minecraft.class05074
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
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class05074;
import minecraft.class05196;
import minecraft.class05946;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class05947
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final class05946<class05074> lootTable;
    public static final Codec<class05947> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class05947::N), (App)class05074.N.fieldOf("loot_table").forGetter(class05947::y)).apply(instance, class05947::new));

    public class05947(Optional<class05196> optional, class05946<class05074> class059462) {
        this.player = optional;
        this.lootTable = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05947.class, "player;lootTable", "player", "lootTable"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05947.class, "player;lootTable", "player", "lootTable"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05947.class, "player;lootTable", "player", "lootTable"}, this);
    }

    public class05946<class05074> y() {
        return this.lootTable;
    }

    public boolean y(class05946<class05074> class059462) {
        return this.lootTable == class059462;
    }

    public static class06915<class05947> N(class05946<class05074> class059462) {
        return class06912.F.N((class06516)new class05947(Optional.empty(), class059462));
    }

    public Optional<class05196> N() {
        return this.player;
    }
}

