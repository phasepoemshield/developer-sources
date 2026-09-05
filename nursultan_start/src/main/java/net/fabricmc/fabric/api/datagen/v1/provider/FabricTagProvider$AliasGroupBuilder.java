/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class05946
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class05946;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public final class FabricTagProvider$AliasGroupBuilder {
    private final List<class03530<T>> tags = new ArrayList();
    final /* synthetic */ FabricTagProvider this$0;

    FabricTagProvider$AliasGroupBuilder(FabricTagProvider fabricTagProvider) {
        this.this$0 = fabricTagProvider;
    }

    @SafeVarargs
    public final FabricTagProvider$AliasGroupBuilder add(class03530<T> ... class03530Array) {
        for (class03530 class035302 : class03530Array) {
            this.add((class03530<T>)class035302);
        }
        return this;
    }

    public FabricTagProvider$AliasGroupBuilder add(class01894 class018942) {
        this.tags.add(class03530.N((class05946)FabricTagProvider.access$300(this.this$0), (class01894)class018942));
        return this;
    }

    public FabricTagProvider$AliasGroupBuilder add(class01894 ... class01894Array) {
        for (class01894 class018942 : class01894Array) {
            this.tags.add(class03530.N((class05946)FabricTagProvider.access$400(this.this$0), (class01894)class018942));
        }
        return this;
    }

    public FabricTagProvider$AliasGroupBuilder add(class03530<T> class035302) {
        if (class035302.N() != FabricTagProvider.access$100(this.this$0)) {
            throw new IllegalArgumentException("Tag " + String.valueOf(class035302) + " isn't from the registry " + String.valueOf(FabricTagProvider.access$200(this.this$0)));
        }
        this.tags.add(class035302);
        return this;
    }

    public List<class03530<T>> getTags() {
        return Collections.unmodifiableList(this.tags);
    }
}

