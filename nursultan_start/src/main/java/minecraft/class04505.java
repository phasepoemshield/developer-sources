/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00808
 *  minecraft.class01487
 *  minecraft.class05074
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import minecraft.class00808;
import minecraft.class01487;
import minecraft.class05074;
import minecraft.class05946;

public final class class04505
extends Record {
    final Set<UUID> detectedPlayers;
    final Set<UUID> currentMobs;
    final long cooldownEndsAt;
    final long nextMobSpawnsAt;
    final int totalMobsSpawned;
    final Optional<class00808> nextSpawnData;
    final Optional<class05946<class05074>> ejectingLootTable;
    public static final MapCodec<class04505> B = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01487.y.lenientOptionalFieldOf("registered_players", Set.of()).forGetter(class04505::N), (App)class01487.y.lenientOptionalFieldOf("current_mobs", Set.of()).forGetter(class04505::y), (App)Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", (Object)0L).forGetter(class04505::L), (App)Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", (Object)0L).forGetter(class04505::u), (App)Codec.intRange((int)0, (int)Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", (Object)0).forGetter(class04505::i), (App)class00808.y.lenientOptionalFieldOf("spawn_data").forGetter(class04505::R), (App)class05074.N.lenientOptionalFieldOf("ejecting_loot_table").forGetter(class04505::M)).apply(instance, class04505::new));

    public long L() {
        return this.cooldownEndsAt;
    }

    public Optional<class05946<class05074>> M() {
        return this.ejectingLootTable;
    }

    public class04505(Set<UUID> set, Set<UUID> set2, long l, long l2, int n, Optional<class00808> optional, Optional<class05946<class05074>> optional2) {
        this.detectedPlayers = set;
        this.currentMobs = set2;
        this.cooldownEndsAt = l;
        this.nextMobSpawnsAt = l2;
        this.totalMobsSpawned = n;
        this.nextSpawnData = optional;
        this.ejectingLootTable = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04505.class, "detectedPlayers;currentMobs;cooldownEndsAt;nextMobSpawnsAt;totalMobsSpawned;nextSpawnData;ejectingLootTable", "detectedPlayers", "currentMobs", "cooldownEndsAt", "nextMobSpawnsAt", "totalMobsSpawned", "nextSpawnData", "ejectingLootTable"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04505.class, "detectedPlayers;currentMobs;cooldownEndsAt;nextMobSpawnsAt;totalMobsSpawned;nextSpawnData;ejectingLootTable", "detectedPlayers", "currentMobs", "cooldownEndsAt", "nextMobSpawnsAt", "totalMobsSpawned", "nextSpawnData", "ejectingLootTable"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04505.class, "detectedPlayers;currentMobs;cooldownEndsAt;nextMobSpawnsAt;totalMobsSpawned;nextSpawnData;ejectingLootTable", "detectedPlayers", "currentMobs", "cooldownEndsAt", "nextMobSpawnsAt", "totalMobsSpawned", "nextSpawnData", "ejectingLootTable"}, this);
    }

    public int i() {
        return this.totalMobsSpawned;
    }

    public long u() {
        return this.nextMobSpawnsAt;
    }

    public Set<UUID> y() {
        return this.currentMobs;
    }

    public Set<UUID> N() {
        return this.detectedPlayers;
    }

    public Optional<class00808> R() {
        return this.nextSpawnData;
    }
}

