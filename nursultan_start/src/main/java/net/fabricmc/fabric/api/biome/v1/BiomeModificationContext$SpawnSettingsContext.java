/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01016
 *  minecraft.class04523
 *  minecraft.class07078
 *  minecraft.class07428
 */
package net.fabricmc.fabric.api.biome.v1;

import java.util.List;
import java.util.function.BiPredicate;
import minecraft.class01016;
import minecraft.class04523;
import minecraft.class07078;
import minecraft.class07428;

public interface BiomeModificationContext$SpawnSettingsContext {
    default public boolean removeSpawnsOfEntityType(class07078<?> class070782) {
        return this.removeSpawns((class074282, class010162) -> class010162.N() == class070782);
    }

    public void setCreatureSpawnProbability(float var1);

    public void addSpawn(class07428 var1, class01016 var2, int var3);

    public void clearSpawnCost(class07078<?> var1);

    public void setSpawnCost(class07078<?> var1, double var2, double var4);

    default public void clearSpawns() {
        this.removeSpawns((class074282, class010162) -> true);
    }

    default public void clearSpawns(class07428 class074282) {
        this.removeSpawns((class074283, class010162) -> class074283 == class074282);
    }

    public List<class04523<class01016>> getSpawnEntries(class07428 var1);

    public boolean removeSpawns(BiPredicate<class07428, class01016> var1);
}

