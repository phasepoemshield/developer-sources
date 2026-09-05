/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01225
 *  minecraft.class01929
 *  minecraft.class03530
 *  minecraft.class05946
 *  minecraft.class08292
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class01225;
import minecraft.class01929;
import minecraft.class03530;
import minecraft.class05946;
import minecraft.class08292;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public abstract class FabricTagProvider$FabricValueLookupTagProvider<T>
extends FabricTagProvider<T> {
    private final Function<T, class05946<T>> valueToKey;

    protected FabricTagProvider$FabricValueLookupTagProvider(FabricDataOutput fabricDataOutput, class05946<? extends class00751<T>> class059462, CompletableFuture<class01929> completableFuture, Function<T, class05946<T>> function) {
        super(fabricDataOutput, class059462, completableFuture);
        this.valueToKey = function;
    }

    protected class08292<T, T> valueLookupBuilder(class03530<T> class035302) {
        class01225 class012252 = this.method_27169(class035302);
        return class08292.N((class01225)class012252).N(this.valueToKey);
    }
}

