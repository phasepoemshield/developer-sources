/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00808
 *  minecraft.class01281
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class07001
 *  minecraft.class07078
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00808;
import minecraft.class01281;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04483;
import minecraft.class04540;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class07001;
import minecraft.class07078;

public final class class04513
extends Record {
    private final int spawnRange;
    private final float totalMobs;
    private final float simultaneousMobs;
    private final float totalMobsAddedPerPlayer;
    private final float simultaneousMobsAddedPerPlayer;
    private final int ticksBetweenSpawn;
    private final class04540<class00808> spawnPotentialsDefinition;
    private final class04540<class05946<class05074>> lootTablesToEject;
    private final class05946<class05074> itemsToDropWhenOminous;
    public static final class04513 N = class04513.y().N();
    public static final Codec<class04513> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)1, (int)128).optionalFieldOf("spawn_range", (Object)class04513.N.spawnRange).forGetter(class04513::L), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).optionalFieldOf("total_mobs", (Object)Float.valueOf(class04513.N.totalMobs)).forGetter(class04513::u), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", (Object)Float.valueOf(class04513.N.simultaneousMobs)).forGetter(class04513::i), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", (Object)Float.valueOf(class04513.N.totalMobsAddedPerPlayer)).forGetter(class04513::R), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", (Object)Float.valueOf(class04513.N.simultaneousMobsAddedPerPlayer)).forGetter(class04513::M), (App)Codec.intRange((int)0, (int)Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", (Object)class04513.N.ticksBetweenSpawn).forGetter(class04513::B), (App)class00808.L.optionalFieldOf("spawn_potentials", class04540.N()).forGetter(class04513::Z), (App)class04540.N(class05074.N).optionalFieldOf("loot_tables_to_eject", class04513.N.lootTablesToEject).forGetter(class04513::z), (App)class05074.N.optionalFieldOf("items_to_drop_when_ominous", class04513.N.itemsToDropWhenOminous).forGetter(class04513::U)).apply(instance, class04513::new));
    public static final Codec<class03556<class04513>> L = class01281.N((class05946)class04227.yl, y);

    public int L() {
        return this.spawnRange;
    }

    public float M() {
        return this.simultaneousMobsAddedPerPlayer;
    }

    public class04513(int n, float f, float f2, float f3, float f4, int n2, class04540<class00808> class045402, class04540<class05946<class05074>> class045403, class05946<class05074> class059462) {
        this.spawnRange = n;
        this.totalMobs = f;
        this.simultaneousMobs = f2;
        this.totalMobsAddedPerPlayer = f3;
        this.simultaneousMobsAddedPerPlayer = f4;
        this.ticksBetweenSpawn = n2;
        this.spawnPotentialsDefinition = class045402;
        this.lootTablesToEject = class045403;
        this.itemsToDropWhenOminous = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04513.class, "spawnRange;totalMobs;simultaneousMobs;totalMobsAddedPerPlayer;simultaneousMobsAddedPerPlayer;ticksBetweenSpawn;spawnPotentialsDefinition;lootTablesToEject;itemsToDropWhenOminous", "spawnRange", "totalMobs", "simultaneousMobs", "totalMobsAddedPerPlayer", "simultaneousMobsAddedPerPlayer", "ticksBetweenSpawn", "spawnPotentialsDefinition", "lootTablesToEject", "itemsToDropWhenOminous"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04513.class, "spawnRange;totalMobs;simultaneousMobs;totalMobsAddedPerPlayer;simultaneousMobsAddedPerPlayer;ticksBetweenSpawn;spawnPotentialsDefinition;lootTablesToEject;itemsToDropWhenOminous", "spawnRange", "totalMobs", "simultaneousMobs", "totalMobsAddedPerPlayer", "simultaneousMobsAddedPerPlayer", "ticksBetweenSpawn", "spawnPotentialsDefinition", "lootTablesToEject", "itemsToDropWhenOminous"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04513.class, "spawnRange;totalMobs;simultaneousMobs;totalMobsAddedPerPlayer;simultaneousMobsAddedPerPlayer;ticksBetweenSpawn;spawnPotentialsDefinition;lootTablesToEject;itemsToDropWhenOminous", "spawnRange", "totalMobs", "simultaneousMobs", "totalMobsAddedPerPlayer", "simultaneousMobsAddedPerPlayer", "ticksBetweenSpawn", "spawnPotentialsDefinition", "lootTablesToEject", "itemsToDropWhenOminous"}, this);
    }

    public int B() {
        return this.ticksBetweenSpawn;
    }

    public class04540<class00808> Z() {
        return this.spawnPotentialsDefinition;
    }

    public float i() {
        return this.simultaneousMobs;
    }

    public class05946<class05074> U() {
        return this.itemsToDropWhenOminous;
    }

    public class04540<class05946<class05074>> z() {
        return this.lootTablesToEject;
    }

    public float u() {
        return this.totalMobs;
    }

    public int y(int n) {
        return (int)Math.floor(this.simultaneousMobs + this.simultaneousMobsAddedPerPlayer * (float)n);
    }

    public static class04483 y() {
        return new class04483();
    }

    public class04513 N(class07078<?> class070782) {
        class07001 class070012 = new class07001();
        class070012.N_67("id", class04206.M.y(class070782).toString());
        class00808 class008082 = new class00808(class070012, Optional.empty(), Optional.empty());
        return new class04513(this.spawnRange, this.totalMobs, this.simultaneousMobs, this.totalMobsAddedPerPlayer, this.simultaneousMobsAddedPerPlayer, this.ticksBetweenSpawn, class04540.N(class008082), this.lootTablesToEject, this.itemsToDropWhenOminous);
    }

    public long N() {
        return 160L;
    }

    public int N(int n) {
        return (int)Math.floor(this.totalMobs + this.totalMobsAddedPerPlayer * (float)n);
    }

    public float R() {
        return this.totalMobsAddedPerPlayer;
    }
}

