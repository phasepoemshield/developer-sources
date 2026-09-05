/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01002
 *  minecraft.class01016
 *  minecraft.class01043
 *  minecraft.class04523
 *  minecraft.class04540
 *  minecraft.class07078
 *  minecraft.class07428
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$SpawnSettingsContext
 */
package net.fabricmc.fabric.impl.biome.modification;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiPredicate;
import minecraft.class01002;
import minecraft.class01016;
import minecraft.class01043;
import minecraft.class04523;
import minecraft.class04540;
import minecraft.class07078;
import minecraft.class07428;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl;

class BiomeModificationContextImpl$SpawnSettingsContextImpl
implements BiomeModificationContext.SpawnSettingsContext {
    private final class01002 spawnSettings;
    private final EnumMap<class07428, List<class04523<class01016>>> fabricSpawners;
    final /* synthetic */ BiomeModificationContextImpl this$0;

    BiomeModificationContextImpl$SpawnSettingsContextImpl(BiomeModificationContextImpl biomeModificationContextImpl) {
        this.this$0 = biomeModificationContextImpl;
        this.spawnSettings = this.this$0.biome.N();
        this.fabricSpawners = new EnumMap(class07428.class);
        this.unfreezeSpawners();
        this.unfreezeSpawnCost();
    }

    public void freeze() {
        this.freezeSpawners();
        this.freezeSpawnCosts();
    }

    private void freezeSpawnCosts() {
        this.spawnSettings.R = ImmutableMap.copyOf((Map)this.spawnSettings.R);
    }

    private void unfreezeSpawnCost() {
        this.spawnSettings.R = new HashMap(this.spawnSettings.R);
    }

    private void freezeSpawners() {
        HashMap<class07428, class04540> hashMap = new HashMap<class07428, class04540>(this.spawnSettings.i);
        for (Map.Entry<class07428, List<class04523<class01016>>> entry : this.fabricSpawners.entrySet()) {
            if (entry.getValue().isEmpty()) {
                hashMap.put(entry.getKey(), class04540.N());
                continue;
            }
            hashMap.put(entry.getKey(), class04540.N(entry.getValue()));
        }
        this.spawnSettings.i = ImmutableMap.copyOf(hashMap);
    }

    private void unfreezeSpawners() {
        this.fabricSpawners.clear();
        for (class07428 class074282 : class07428.values()) {
            class04540 class045402 = (class04540)this.spawnSettings.i.get(class074282);
            if (class045402 != null) {
                this.fabricSpawners.put(class074282, new ArrayList(class045402.u()));
                continue;
            }
            this.fabricSpawners.put(class074282, new ArrayList());
        }
    }

    public void setCreatureSpawnProbability(float f) {
        this.spawnSettings.u = f;
    }

    public void addSpawn(class07428 class074282, class01016 class010162, int n) {
        Objects.requireNonNull(class074282);
        Objects.requireNonNull(class010162);
        this.fabricSpawners.get(class074282).add((class04523<class01016>)new class04523((Object)class010162, n));
    }

    public void clearSpawnCost(class07078<?> class070782) {
        this.spawnSettings.R.remove(class070782);
    }

    public void setSpawnCost(class07078<?> class070782, double d, double d2) {
        Objects.requireNonNull(class070782);
        this.spawnSettings.R.put(class070782, new class01043(d2, d));
    }

    public List<class04523<class01016>> getSpawnEntries(class07428 class074282) {
        Objects.requireNonNull(class074282);
        return Collections.unmodifiableList(this.fabricSpawners.get(class074282));
    }

    public boolean removeSpawns(BiPredicate<class07428, class01016> biPredicate) {
        boolean bl = false;
        for (class07428 class074282 : class07428.values()) {
            if (!this.fabricSpawners.get(class074282).removeIf(class045232 -> biPredicate.test(class074282, (class01016)class045232.N()))) continue;
            bl = true;
        }
        return bl;
    }
}

