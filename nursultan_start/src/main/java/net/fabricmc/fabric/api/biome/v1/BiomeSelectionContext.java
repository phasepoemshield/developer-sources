/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class01255
 *  minecraft.class03238
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04336
 *  minecraft.class04748
 *  minecraft.class05946
 */
package net.fabricmc.fabric.api.biome.v1;

import java.util.List;
import java.util.Optional;
import minecraft.class00780;
import minecraft.class01255;
import minecraft.class03238;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04336;
import minecraft.class04748;
import minecraft.class05946;

public interface BiomeSelectionContext {
    default public boolean hasFeature(class05946<class03238<?, ?>> class059462) {
        List list = this.getBiome().L().L();
        for (class03543 class035432 : list) {
            for (class03556 class035562 : class035432) {
                if (!((class04336)class035562.N()).N().anyMatch(class032382 -> this.getFeatureKey((class03238<?, ?>)class032382).orElse(null) == class059462)) continue;
                return true;
            }
        }
        return false;
    }

    public class03556<class00780> getBiomeRegistryEntry();

    public Optional<class05946<class04336>> getPlacedFeatureKey(class04336 var1);

    public boolean hasTag(class03530<class00780> var1);

    public class00780 getBiome();

    public boolean validForStructure(class05946<class04748> var1);

    default public boolean hasPlacedFeature(class05946<class04336> class059462) {
        List list = this.getBiome().L().L();
        for (class03543 class035432 : list) {
            for (class03556 class035562 : class035432) {
                if (this.getPlacedFeatureKey((class04336)class035562.N()).orElse(null) != class059462) continue;
                return true;
            }
        }
        return false;
    }

    public Optional<class05946<class04748>> getStructureKey(class04748 var1);

    public boolean canGenerateIn(class05946<class01255> var1);

    public Optional<class05946<class03238<?, ?>>> getFeatureKey(class03238<?, ?> var1);

    public class05946<class00780> getBiomeKey();
}

