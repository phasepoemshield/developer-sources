/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceSet
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01587
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04750
 *  net.caffeinemc.mods.sodium.client.services.FluidRendererFactory
 */
package net.caffeinemc.mods.sodium.client.model.color;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceSet;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01587;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04750;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.color.DefaultColorProviders;
import net.caffeinemc.mods.sodium.client.model.color.DefaultColorProviders$FoliageColorProvider;
import net.caffeinemc.mods.sodium.client.model.color.DefaultColorProviders$GrassColorProvider;
import net.caffeinemc.mods.sodium.client.model.color.interop.BlockColorsExtension;
import net.caffeinemc.mods.sodium.client.services.FluidRendererFactory;

public class ColorProviderRegistry {
    private final Reference2ReferenceMap<class00891, ColorProvider<class00500>> blocks = new Reference2ReferenceOpenHashMap();
    private final Reference2ReferenceMap<class04651, ColorProvider<class04688>> fluids = new Reference2ReferenceOpenHashMap();
    private final ReferenceSet<class00891> overridenBlocks;

    public ColorProviderRegistry(class01587 class015872) {
        Reference2ReferenceMap<class00891, class04750> reference2ReferenceMap = BlockColorsExtension.getProviders(class015872);
        for (Reference2ReferenceMap.Entry entry : reference2ReferenceMap.reference2ReferenceEntrySet()) {
            this.blocks.put((Object)((class00891)entry.getKey()), DefaultColorProviders.adapt((class04750)entry.getValue()));
        }
        this.overridenBlocks = BlockColorsExtension.getOverridenVanillaBlocks(class015872);
        this.installOverrides();
    }

    private void registerBlocks(ColorProvider<class00500> colorProvider, class00891 ... class00891Array) {
        for (class00891 class008912 : class00891Array) {
            if (this.overridenBlocks.contains((Object)class008912)) continue;
            this.blocks.put((Object)class008912, colorProvider);
        }
    }

    public ColorProvider<class00500> getColorProvider(class00891 class008912) {
        return (ColorProvider)this.blocks.get((Object)class008912);
    }

    public ColorProvider<class04688> getColorProvider(class04651 class046512) {
        return (ColorProvider)this.fluids.get((Object)class046512);
    }

    private void registerFluids(ColorProvider<class04688> colorProvider, class04651 ... class04651Array) {
        for (class04651 class046512 : class04651Array) {
            this.fluids.put((Object)class046512, colorProvider);
        }
    }

    private void installOverrides() {
        this.registerBlocks(DefaultColorProviders$GrassColorProvider.BLOCKS, class00869.Z, class00869.yY, class00869.yk, class00869.MF, class00869.vh, class00869.it, class00869.zk, class00869.zw);
        this.registerBlocks(DefaultColorProviders$FoliageColorProvider.BLOCKS, class00869.NV, class00869.Nc, class00869.NX, class00869.Np, class00869.Rc, class00869.NA);
        this.registerBlocks(FluidRendererFactory.getInstance().getWaterBlockColorProvider(), class00869.K, class00869.PN);
        this.registerFluids(FluidRendererFactory.getInstance().getWaterColorProvider(), new class04651[]{class04684.L, class04684.y});
    }
}

