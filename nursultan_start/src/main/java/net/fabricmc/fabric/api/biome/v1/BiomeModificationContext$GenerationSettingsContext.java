/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04336
 *  minecraft.class05946
 *  minecraft.class07829
 *  minecraft.class07852
 */
package net.fabricmc.fabric.api.biome.v1;

import minecraft.class04336;
import minecraft.class05946;
import minecraft.class07829;
import minecraft.class07852;

public interface BiomeModificationContext$GenerationSettingsContext {
    public void addCarver(class05946<class07829<?>> var1);

    public void addFeature(class07852 var1, class05946<class04336> var2);

    public boolean removeCarver(class05946<class07829<?>> var1);

    default public boolean removeFeature(class05946<class04336> class059462) {
        boolean bl = false;
        for (class07852 class078522 : class07852.values()) {
            if (!this.removeFeature(class078522, class059462)) continue;
            bl = true;
        }
        return bl;
    }

    public boolean removeFeature(class07852 var1, class05946<class04336> var2);
}

