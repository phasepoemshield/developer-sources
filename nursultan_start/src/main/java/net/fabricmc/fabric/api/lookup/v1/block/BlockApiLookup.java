/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class07209
 *  minecraft.class07299
 *  net.fabricmc.fabric.impl.lookup.block.BlockApiLookupImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.lookup.v1.block;

import java.util.function.BiFunction;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class07209;
import minecraft.class07299;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup$BlockApiProvider;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup$BlockEntityApiProvider;
import net.fabricmc.fabric.impl.lookup.block.BlockApiLookupImpl;
import org.jspecify.annotations.Nullable;

public interface BlockApiLookup<A, C> {
    public @Nullable BlockApiLookup$BlockApiProvider<A, C> getProvider(class00891 var1);

    public static <A, C> BlockApiLookup<A, C> get(class01894 class018942, Class<A> clazz, Class<C> clazz2) {
        return BlockApiLookupImpl.get((class01894)class018942, clazz, clazz2);
    }

    default public @Nullable A find(class07299 class072992, class07209 class072092, C c) {
        return this.find(class072992, class072092, null, null, c);
    }

    public @Nullable A find(class07299 var1, class07209 var2, @Nullable class00500 var3, @Nullable class00394 var4, C var5);

    public class01894 getId();

    public Class<A> apiClass();

    public void registerSelf(class00404<?> ... var1);

    public void registerFallback(BlockApiLookup$BlockApiProvider<A, C> var1);

    public Class<C> contextClass();

    default public <T extends class00394> void registerForBlockEntity(BiFunction<? super T, C, @Nullable A> biFunction, class00404<T> class004042) {
        this.registerForBlockEntities((class003942, object) -> biFunction.apply(class003942, object), class004042);
    }

    public void registerForBlockEntities(BlockApiLookup$BlockEntityApiProvider<A, C> var1, class00404<?> ... var2);

    public void registerForBlocks(BlockApiLookup$BlockApiProvider<A, C> var1, class00891 ... var2);
}

