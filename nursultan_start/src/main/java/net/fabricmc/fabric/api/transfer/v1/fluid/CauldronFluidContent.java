/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01096
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap
 *  net.fabricmc.fabric.impl.transfer.fluid.CauldronStorage
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import java.util.Iterator;
import java.util.List;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01096;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.impl.transfer.fluid.CauldronStorage;
import org.jspecify.annotations.Nullable;

public final class CauldronFluidContent {
    public final class00891 block;
    public final class04651 fluid;
    public final long amountPerLevel;
    public final int maxLevel;
    public final @Nullable class08071 levelProperty;
    private static final ApiProviderMap<class00891, CauldronFluidContent> BLOCK_TO_CAULDRON = ApiProviderMap.create();
    private static final ApiProviderMap<class04651, CauldronFluidContent> FLUID_TO_CAULDRON = ApiProviderMap.create();

    private CauldronFluidContent(class00891 class008912, class04651 class046512, long l, int n, @Nullable class08071 class080712) {
        this.block = class008912;
        this.fluid = class046512;
        this.amountPerLevel = l;
        this.maxLevel = n;
        this.levelProperty = class080712;
    }

    static {
        CauldronFluidContent.registerCauldron(class00869.MZ, class04684.N, 81000L, null);
        CauldronFluidContent.registerCauldron(class00869.Mz, (class04651)class04684.L, 27000L, class01096.M);
        CauldronFluidContent.registerCauldron(class00869.MU, (class04651)class04684.i, 81000L, null);
    }

    public static synchronized CauldronFluidContent registerCauldron(class00891 class008912, class04651 class046512, long l, @Nullable class08071 class080712) {
        CauldronFluidContent cauldronFluidContent;
        CauldronFluidContent cauldronFluidContent2 = (CauldronFluidContent)BLOCK_TO_CAULDRON.get((Object)class008912);
        if (cauldronFluidContent2 != null) {
            return cauldronFluidContent2;
        }
        if (FLUID_TO_CAULDRON.get((Object)class046512) != null) {
            throw new IllegalArgumentException("Fluid already has a mapping for a different block.");
        }
        if (class080712 == null) {
            cauldronFluidContent = new CauldronFluidContent(class008912, class046512, l, 1, null);
        } else {
            List list = class080712.N();
            if (list.size() == 0) {
                throw new RuntimeException("Cauldron should have at least one possible level.");
            }
            int n = Integer.MAX_VALUE;
            int n2 = 0;
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                int n3 = (Integer)iterator.next();
                n = Math.min(n, n3);
                n2 = Math.max(n2, n3);
            }
            if (n != 1 || n2 < 1) {
                throw new IllegalStateException("Minimum level should be 1, and maximum level should be >= 1.");
            }
            cauldronFluidContent = new CauldronFluidContent(class008912, class046512, l, n2, class080712);
        }
        BLOCK_TO_CAULDRON.putIfAbsent((Object)class008912, (Object)cauldronFluidContent);
        FLUID_TO_CAULDRON.putIfAbsent((Object)class046512, (Object)cauldronFluidContent);
        FluidStorage.SIDED.registerForBlocks((class072992, class072092, class005002, class003942, class072112) -> CauldronStorage.get((class07299)class072992, (class07209)class072092), new class00891[]{class008912});
        return cauldronFluidContent;
    }

    public static @Nullable CauldronFluidContent getForBlock(class00891 class008912) {
        return (CauldronFluidContent)BLOCK_TO_CAULDRON.get((Object)class008912);
    }

    public static @Nullable CauldronFluidContent getForFluid(class04651 class046512) {
        return (CauldronFluidContent)FLUID_TO_CAULDRON.get((Object)class046512);
    }

    public int currentLevel(class00500 class005002) {
        if (this.fluid == class04684.N) {
            return 0;
        }
        if (this.levelProperty == null) {
            return 1;
        }
        return (Integer)class005002.L((class08092)this.levelProperty);
    }
}

