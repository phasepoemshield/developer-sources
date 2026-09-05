/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00751
 *  minecraft.class01029
 *  minecraft.class03529
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class05946
 *  minecraft.class06391
 *  minecraft.class07829
 *  minecraft.class07852
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$GenerationSettingsContext
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.biome.modification;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00751;
import minecraft.class01029;
import minecraft.class03529;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class05946;
import minecraft.class06391;
import minecraft.class07829;
import minecraft.class07852;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl;
import org.jspecify.annotations.Nullable;

class BiomeModificationContextImpl$GenerationSettingsContextImpl
implements BiomeModificationContext.GenerationSettingsContext {
    private final class00751<class07829<?>> carvers;
    private final class00751<class04336> features;
    private final class01029 generationSettings;
    boolean rebuildFeatures;
    final /* synthetic */ BiomeModificationContextImpl this$0;

    BiomeModificationContextImpl$GenerationSettingsContextImpl(BiomeModificationContextImpl biomeModificationContextImpl) {
        this.this$0 = biomeModificationContextImpl;
        this.carvers = this.this$0.registries.L(class04227.ND);
        this.features = this.this$0.registries.L(class04227.ys);
        this.generationSettings = this.this$0.biome.L();
        this.unfreezeFeatures();
        this.rebuildFeatures = false;
    }

    public void freeze() {
        this.freezeFeatures();
        if (this.rebuildFeatures) {
            this.rebuildFlowerFeatures();
        }
    }

    private <T> class03543<T> plus(@Nullable class03543<T> class035432, class03556<T> class035562) {
        if (class035432 == null) {
            return class03543.N((class03556[])new class03556[]{class035562});
        }
        ArrayList<class03556<T>> arrayList = new ArrayList<class03556<T>>(class035432.N().toList());
        arrayList.add(class035562);
        return class03543.N(arrayList);
    }

    private void unfreezeFeatures() {
        this.generationSettings.u = new ArrayList(this.generationSettings.u);
    }

    private void freezeFeatures() {
        this.generationSettings.u = ImmutableList.copyOf((Collection)this.generationSettings.u);
        this.generationSettings.R = Suppliers.memoize(() -> this.generationSettings.u.stream().flatMap(class03543::N).map(class03556::N).collect(Collectors.toSet()));
    }

    public void addCarver(class05946<class07829<?>> class059462) {
        this.generationSettings.L = this.plus((class03543)this.generationSettings.L, (class03556)BiomeModificationContextImpl.getEntry(this.carvers, class059462));
    }

    private void rebuildFlowerFeatures() {
        this.generationSettings.i = Suppliers.memoize(() -> (List)this.generationSettings.u.stream().flatMap(class03543::N).map(class03556::N).flatMap(class04336::N).filter(class032382 -> class032382.y() == class06391.u).collect(ImmutableList.toImmutableList()));
    }

    public void addFeature(class07852 class078522, class05946<class04336> class059462) {
        List list = this.generationSettings.u;
        int n = class078522.ordinal();
        while (n >= list.size()) {
            list.add(class03543.N(Collections.emptyList()));
        }
        class03529<class04336> class035292 = BiomeModificationContextImpl.getEntry(this.features, class059462);
        if (((class03543)list.get(n)).N(class035292)) {
            return;
        }
        list.set(n, this.plus((class03543)((class03543)list.get(n)), (class03556)class035292));
        this.rebuildFeatures = true;
    }

    public boolean removeCarver(class05946<class07829<?>> class059462) {
        class07829 class078292 = (class07829)BiomeModificationContextImpl.getEntry(this.carvers, class059462).N();
        ArrayList<class03556> arrayList = new ArrayList<class03556>(this.generationSettings.L.N().toList());
        if (arrayList.removeIf(class035562 -> class035562.N() == class078292)) {
            this.generationSettings.L = class03543.N(arrayList);
            return true;
        }
        return false;
    }

    public boolean removeFeature(class07852 class078522, class05946<class04336> class059462) {
        List list;
        class04336 class043362 = (class04336)BiomeModificationContextImpl.getEntry(this.features, class059462).N();
        int n = class078522.ordinal();
        if (n >= (list = this.generationSettings.u).size()) {
            return false;
        }
        class03543 class035432 = (class03543)list.get(n);
        ArrayList<class03556> arrayList = new ArrayList<class03556>(class035432.N().toList());
        if (arrayList.removeIf(class035562 -> class035562.N() == class043362)) {
            list.set(n, class03543.N(arrayList));
            this.rebuildFeatures = true;
            return true;
        }
        return false;
    }
}

