/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01296
 *  minecraft.class04995
 *  minecraft.class07299
 */
package net.caffeinemc.mods.lithium.common.util.tuples;

import minecraft.class00734;
import minecraft.class01296;
import minecraft.class04995;
import minecraft.class07299;

public record WorldSectionBox(class07299 world, int chunkX1, int chunkY1, int chunkZ1, int chunkX2, int chunkY2, int chunkZ2) {
    public static WorldSectionBox entityAccessBox(class07299 class072992, class00734 class007342) {
        int n = class01296.N((double)(class007342.N - 2.0));
        int n2 = class01296.N((double)(class007342.y - 4.0));
        int n3 = class01296.N((double)(class007342.L - 2.0));
        int n4 = class01296.N((double)(class007342.u + 2.0)) + 1;
        int n5 = class01296.N((double)class007342.i) + 1;
        int n6 = class01296.N((double)(class007342.R + 2.0)) + 1;
        return new WorldSectionBox(class072992, n, n2, n3, n4, n5, n6);
    }

    public int numSections() {
        return (this.chunkX2 - this.chunkX1) * (this.chunkY2 - this.chunkY1) * (this.chunkZ2 - this.chunkZ1);
    }

    public static WorldSectionBox relevantFluidBox(class07299 class072992, class00734 class007342) {
        int n = class01296.N((int)class04995.N((double)class007342.N));
        int n2 = class01296.N((int)class04995.N((double)class007342.y));
        int n3 = class01296.N((int)class04995.N((double)class007342.L));
        int n4 = class01296.N((int)class04995.N((double)class007342.u)) + 1;
        int n5 = class01296.N((int)class04995.N((double)class007342.i)) + 1;
        int n6 = class01296.N((int)class04995.N((double)class007342.R)) + 1;
        return new WorldSectionBox(class072992, n, n2, n3, n4, n5, n6);
    }

    public boolean matchesRelevantBlocksBox(class00734 class007342) {
        return class01296.N((int)(class04995.N((double)class007342.N) - 1)) == this.chunkX1 && class01296.N((int)(class04995.N((double)class007342.y) - 1)) == this.chunkY1 && class01296.N((int)(class04995.N((double)class007342.L) - 1)) == this.chunkZ1 && class01296.N((int)(class04995.L((double)class007342.u) + 1)) + 1 == this.chunkX2 && class01296.N((int)(class04995.L((double)class007342.i) + 1)) + 1 == this.chunkY2 && class01296.N((int)(class04995.L((double)class007342.R) + 1)) + 1 == this.chunkZ2;
    }

    public static WorldSectionBox relevantExpandedBlocksBox(class07299 class072992, class00734 class007342) {
        int n = class01296.N((int)(class04995.N((double)class007342.N) - 1));
        int n2 = class01296.N((int)(class04995.N((double)class007342.y) - 1));
        int n3 = class01296.N((int)(class04995.N((double)class007342.L) - 1));
        int n4 = class01296.N((int)(class04995.N((double)class007342.u) + 1)) + 1;
        int n5 = class01296.N((int)(class04995.N((double)class007342.i) + 1)) + 1;
        int n6 = class01296.N((int)(class04995.N((double)class007342.R) + 1)) + 1;
        return new WorldSectionBox(class072992, n, n2, n3, n4, n5, n6);
    }
}

