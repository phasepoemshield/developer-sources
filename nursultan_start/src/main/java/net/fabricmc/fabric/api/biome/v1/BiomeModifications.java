/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  minecraft.class01016
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04336
 *  minecraft.class05946
 *  minecraft.class07078
 *  minecraft.class07428
 *  minecraft.class07829
 *  minecraft.class07852
 */
package net.fabricmc.fabric.api.biome.v1;

import com.google.common.base.Preconditions;
import java.util.function.Predicate;
import minecraft.class01016;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04336;
import minecraft.class05946;
import minecraft.class07078;
import minecraft.class07428;
import minecraft.class07829;
import minecraft.class07852;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;

public final class BiomeModifications {
    public static BiomeModification create(class01894 class018942) {
        return new BiomeModification(class018942);
    }

    private BiomeModifications() {
    }

    public static void addSpawn(Predicate<BiomeSelectionContext> predicate, class07428 class074282, class07078<?> class070782, int n, int n2, int n3) {
        Preconditions.checkArgument((class070782.i() != class07428.field_17715 ? 1 : 0) != 0, (Object)"Cannot add spawns for entities with spawnGroup=MISC since they'd be replaced by pigs.");
        class01894 class018942 = class04206.M.y(class070782);
        Preconditions.checkState((boolean)class04206.M.u(class070782).isPresent(), (String)"Unregistered entity type: %s", class070782);
        BiomeModifications.create(class018942).add(ModificationPhase.ADDITIONS, predicate, biomeModificationContext -> biomeModificationContext.getSpawnSettings().addSpawn(class074282, new class01016(class070782, n2, n3), n));
    }

    public static void addCarver(Predicate<BiomeSelectionContext> predicate, class05946<class07829<?>> class059462) {
        BiomeModifications.create(class059462.N()).add(ModificationPhase.ADDITIONS, predicate, biomeModificationContext -> biomeModificationContext.getGenerationSettings().addCarver(class059462));
    }

    public static void addFeature(Predicate<BiomeSelectionContext> predicate, class07852 class078522, class05946<class04336> class059462) {
        BiomeModifications.create(class059462.N()).add(ModificationPhase.ADDITIONS, predicate, biomeModificationContext -> biomeModificationContext.getGenerationSettings().addFeature(class078522, class059462));
    }
}

