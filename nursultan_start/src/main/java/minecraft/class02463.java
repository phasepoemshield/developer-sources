/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class02489;
import minecraft.class02491;
import minecraft.class06338;
import org.slf4j.Logger;

public final class class02463
extends Record
implements class02489 {
    private final int offset;
    private final Optional<Integer> size;
    private static final Logger i = LogUtils.getLogger();
    public static final MapCodec<class02463> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.T.optionalFieldOf("offset", (Object)0).forGetter(class02463::y), (App)class06338.T.optionalFieldOf("size").forGetter(class02463::L)).apply(instance, class02463::new));

    public Optional<Integer> L() {
        return this.size;
    }

    public class02463(int n) {
        this(n, Optional.empty());
    }

    public class02463(int n, Optional<Integer> optional) {
        this.offset = n;
        this.size = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02463.class, "offset;size", "offset", "size"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02463.class, "offset;size", "offset", "size"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02463.class, "offset;size", "offset", "size"}, this);
    }

    public int y() {
        return this.offset;
    }

    @Override
    public <T> List<T> N(List<T> list, List<T> list2, int n) {
        ImmutableList immutableList;
        int n2 = list.size();
        if (this.offset > n2) {
            i.error("Cannot replace when offset is out of bounds");
            return list;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(list.subList(0, this.offset));
        builder.addAll(list2);
        int n3 = this.offset + this.size.orElse(list2.size());
        if (n3 < n2) {
            builder.addAll(list.subList(n3, n2));
        }
        if ((immutableList = builder.build()).size() > n) {
            i.error("Contents overflow in section replacement");
            return list;
        }
        return immutableList;
    }

    @Override
    public class02491 N() {
        return class02491.field_49857;
    }
}

