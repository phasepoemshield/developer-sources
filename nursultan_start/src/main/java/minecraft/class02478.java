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
import minecraft.class02489;
import minecraft.class02491;
import minecraft.class06338;
import org.slf4j.Logger;

public final class class02478
extends Record
implements class02489 {
    private final int offset;
    private static final Logger u = LogUtils.getLogger();
    public static final MapCodec<class02478> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.T.optionalFieldOf("offset", (Object)0).forGetter(class02478::y)).apply(instance, class02478::new));

    public class02478(int n) {
        this.offset = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02478.class, "offset", "offset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02478.class, "offset", "offset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02478.class, "offset", "offset"}, this);
    }

    public int y() {
        return this.offset;
    }

    @Override
    public <T> List<T> N(List<T> list, List<T> list2, int n) {
        int n2 = list.size();
        if (this.offset > n2) {
            u.error("Cannot insert when offset is out of bounds");
            return list;
        }
        if (n2 + list2.size() > n) {
            u.error("Contents overflow in section insertion");
            return list;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(list.subList(0, this.offset));
        builder.addAll(list2);
        builder.addAll(list.subList(this.offset, n2));
        return builder.build();
    }

    @Override
    public class02491 N() {
        return class02491.field_49858;
    }
}

