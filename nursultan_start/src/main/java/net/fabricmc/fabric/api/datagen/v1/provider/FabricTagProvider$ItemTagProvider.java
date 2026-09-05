/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01225
 *  minecraft.class01929
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class06581
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class00891;
import minecraft.class01225;
import minecraft.class01929;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class06581;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider$BlockTagProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider$FabricValueLookupTagProvider;
import org.jspecify.annotations.Nullable;

public abstract class FabricTagProvider$ItemTagProvider
extends FabricTagProvider$FabricValueLookupTagProvider<class06581> {
    private final @Nullable Function<class03530<class00891>, class01225> blockTagBuilderProvider;

    public FabricTagProvider$ItemTagProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture, @Nullable FabricTagProvider$BlockTagProvider fabricTagProvider$BlockTagProvider) {
        super(fabricDataOutput, class04227.F, completableFuture, class065812 -> class065812.i().B());
        this.blockTagBuilderProvider = fabricTagProvider$BlockTagProvider == null ? null : class035302 -> FabricTagProvider.access$000(fabricTagProvider$BlockTagProvider, class035302);
    }

    public FabricTagProvider$ItemTagProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        this(fabricDataOutput, completableFuture, null);
    }

    public void copy(class03530<class00891> class035302, class03530<class06581> class035303) {
        class01225 class012252 = Objects.requireNonNull(this.blockTagBuilderProvider, "Pass Block tag provider via constructor to use copy").apply(class035302);
        class01225 class012253 = this.method_27169(class035303);
        class012252.y().forEach(arg_0 -> ((class01225)class012253).N(arg_0));
    }
}

