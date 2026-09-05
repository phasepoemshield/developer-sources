/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01289
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07438
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import minecraft.class01289;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07438;
import org.slf4j.Logger;

public final class class05781<E extends class07438> {
    private final Collection<? extends class05378<?>> N;
    private final Collection<? extends class05340<? extends class05355<? super E>>> y;
    private final Codec<class01289<E>> L;

    class05781(Collection<? extends class05378<?>> collection, Collection<? extends class05340<? extends class05355<? super E>>> collection2) {
        this.N = collection;
        this.y = collection2;
        this.L = class01289.y(collection, collection2);
    }

    public class01289<E> N(Dynamic<?> dynamic) {
        return this.L.parse(dynamic).resultOrPartial(arg_0 -> ((Logger)class01289.N).error(arg_0)).orElseGet(() -> new class01289(this.N, this.y, ImmutableList.of(), () -> this.L));
    }
}

