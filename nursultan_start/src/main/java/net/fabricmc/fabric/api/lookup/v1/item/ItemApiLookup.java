/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 *  net.fabricmc.fabric.impl.lookup.item.ItemApiLookupImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.lookup.v1.item;

import minecraft.class01894;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup$ItemApiProvider;
import net.fabricmc.fabric.impl.lookup.item.ItemApiLookupImpl;
import org.jspecify.annotations.Nullable;

public interface ItemApiLookup<A, C> {
    public @Nullable ItemApiLookup$ItemApiProvider<A, C> getProvider(class06581 var1);

    public static <A, C> ItemApiLookup<A, C> get(class01894 class018942, Class<A> clazz, Class<C> clazz2) {
        return ItemApiLookupImpl.get((class01894)class018942, clazz, clazz2);
    }

    public @Nullable A find(class06584 var1, C var2);

    public class01894 getId();

    public Class<A> apiClass();

    public void registerSelf(class07310 ... var1);

    public void registerFallback(ItemApiLookup$ItemApiProvider<A, C> var1);

    public Class<C> contextClass();

    public void registerForItems(ItemApiLookup$ItemApiProvider<A, C> var1, class07310 ... var2);
}

