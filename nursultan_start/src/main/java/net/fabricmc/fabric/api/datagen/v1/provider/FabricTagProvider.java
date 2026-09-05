/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01225
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class03530
 *  minecraft.class05946
 *  minecraft.class07028
 *  minecraft.class08292
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import minecraft.class00751;
import minecraft.class01225;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class03530;
import minecraft.class05946;
import minecraft.class07028;
import minecraft.class08292;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider$AliasGroupBuilder;

public abstract class FabricTagProvider<T>
extends class07028<T> {
    private final FabricDataOutput output;
    private final Map<class01894, FabricTagProvider$AliasGroupBuilder> aliasGroupBuilders = new HashMap<class01894, FabricTagProvider$AliasGroupBuilder>();

    static /* synthetic */ class01225 access$000(FabricTagProvider fabricTagProvider, class03530 class035302) {
        return fabricTagProvider.method_27169(class035302);
    }

    static /* synthetic */ class05946 access$100(FabricTagProvider fabricTagProvider) {
        return fabricTagProvider.field_40957;
    }

    static /* synthetic */ class05946 access$200(FabricTagProvider fabricTagProvider) {
        return fabricTagProvider.field_40957;
    }

    static /* synthetic */ class05946 access$400(FabricTagProvider fabricTagProvider) {
        return fabricTagProvider.field_40957;
    }

    static /* synthetic */ class05946 access$300(FabricTagProvider fabricTagProvider) {
        return fabricTagProvider.field_40957;
    }

    public FabricTagProvider(FabricDataOutput fabricDataOutput, class05946<? extends class00751<T>> class059462, CompletableFuture<class01929> completableFuture) {
        super((class01996)fabricDataOutput, class059462, completableFuture);
        this.output = fabricDataOutput;
    }

    protected class08292<class05946<T>, T> builder(class03530<T> class035302) {
        class01225 class012252 = this.method_27169(class035302);
        return class08292.N((class01225)class012252);
    }

    public Map<class01894, FabricTagProvider$AliasGroupBuilder> getAliasGroupBuilders() {
        return Collections.unmodifiableMap(this.aliasGroupBuilders);
    }

    public abstract void method_10514(class01929 var1);

    protected FabricTagProvider$AliasGroupBuilder aliasGroup(String string) {
        class01894 class018943 = class01894.N((String)this.output.getModId(), (String)string);
        return this.aliasGroupBuilders.computeIfAbsent(class018943, class018942 -> new FabricTagProvider$AliasGroupBuilder(this));
    }

    protected FabricTagProvider$AliasGroupBuilder aliasGroup(class01894 class018943) {
        return this.aliasGroupBuilders.computeIfAbsent(class018943, class018942 -> new FabricTagProvider$AliasGroupBuilder(this));
    }
}

