/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class01255
 *  minecraft.class03238
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class04748
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext
 */
package net.fabricmc.fabric.impl.biome.modification;

import java.util.Optional;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class01255;
import minecraft.class03238;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class04748;
import minecraft.class05946;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

public class BiomeSelectionContextImpl
implements BiomeSelectionContext {
    private final class01042 dynamicRegistries;
    private final class05946<class00780> key;
    private final class00780 biome;
    private final class03556<class00780> entry;

    public BiomeSelectionContextImpl(class01042 class010422, class05946<class00780> class059462, class00780 class007802) {
        this.dynamicRegistries = class010422;
        this.key = class059462;
        this.biome = class007802;
        this.entry = class010422.L(class04227.NA).y(this.key);
    }

    public class03556<class00780> getBiomeRegistryEntry() {
        return this.entry;
    }

    public Optional<class05946<class04336>> getPlacedFeatureKey(class04336 class043362) {
        class00751 class007512 = this.dynamicRegistries.L(class04227.ys);
        return class007512.u((Object)class043362);
    }

    public boolean hasTag(class03530<class00780> class035302) {
        class00751 class007512 = this.dynamicRegistries.L(class04227.NA);
        return class007512.y(this.getBiomeKey()).N(class035302);
    }

    public class00780 getBiome() {
        return this.biome;
    }

    public boolean validForStructure(class05946<class04748> class059462) {
        class04748 class047482 = (class04748)this.dynamicRegistries.L(class04227.yj).L(class059462);
        if (class047482 == null) {
            return false;
        }
        return class047482.y().N(this.getBiomeRegistryEntry());
    }

    public Optional<class05946<class04748>> getStructureKey(class04748 class047482) {
        class00751 class007512 = this.dynamicRegistries.L(class04227.yj);
        return class007512.u((Object)class047482);
    }

    public boolean canGenerateIn(class05946<class01255> class059462) {
        class01255 class012552 = (class01255)this.dynamicRegistries.L(class04227.yI).L(class059462);
        if (class012552 == null) {
            return false;
        }
        return class012552.y().u().L().stream().anyMatch(class035562 -> class035562.N() == this.biome);
    }

    public Optional<class05946<class03238<?, ?>>> getFeatureKey(class03238<?, ?> class032382) {
        class00751 class007512 = this.dynamicRegistries.L(class04227.Nh);
        return class007512.u(class032382);
    }

    public class05946<class00780> getBiomeKey() {
        return this.key;
    }
}

