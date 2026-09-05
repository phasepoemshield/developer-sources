/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class07049
 *  minecraft.class07078
 *  net.fabricmc.fabric.impl.lookup.entity.EntityApiLookupImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.lookup.v1.entity;

import java.util.function.BiFunction;
import minecraft.class01894;
import minecraft.class07049;
import minecraft.class07078;
import net.fabricmc.fabric.api.lookup.v1.entity.EntityApiLookup$EntityApiProvider;
import net.fabricmc.fabric.impl.lookup.entity.EntityApiLookupImpl;
import org.jspecify.annotations.Nullable;

public interface EntityApiLookup<A, C> {
    public @Nullable EntityApiLookup$EntityApiProvider<A, C> getProvider(class07078<?> var1);

    public static <A, C> EntityApiLookup<A, C> get(class01894 class018942, Class<A> clazz, Class<C> clazz2) {
        return EntityApiLookupImpl.get((class01894)class018942, clazz, clazz2);
    }

    public @Nullable A find(class07049 var1, C var2);

    public class01894 getId();

    public Class<A> apiClass();

    public void registerSelf(class07078<?> ... var1);

    public void registerFallback(EntityApiLookup$EntityApiProvider<A, C> var1);

    public void registerForTypes(EntityApiLookup$EntityApiProvider<A, C> var1, class07078<?> ... var2);

    default public <T extends class07049> void registerForType(BiFunction<T, C, @Nullable A> biFunction, class07078<T> class070782) {
        this.registerForTypes((class070492, object) -> biFunction.apply(class070492, object), class070782);
    }

    public Class<C> contextClass();
}

