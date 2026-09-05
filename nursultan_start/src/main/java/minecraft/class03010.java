/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03028
 *  minecraft.class03979
 *  minecraft.class04039
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class03003;
import minecraft.class03014;
import minecraft.class03028;
import minecraft.class03979;
import minecraft.class04039;

final class class03010
extends Record
implements class03028 {
    private final List<class03028> sequence;
    static final class03979<class03010> N = class03979.N((MapCodec)class03028.y.listOf().xmap(class03010::new, class03010::y).fieldOf("sequence"));

    class03010(List<class03028> list) {
        this.sequence = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03010.class, "sequence", "sequence"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03010.class, "sequence", "sequence"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03010.class, "sequence", "sequence"}, this);
    }

    public List<class03028> y() {
        return this.sequence;
    }

    public class03003 apply(class04039 class040392) {
        if (this.sequence.size() == 1) {
            return (class03003)this.sequence.get(0).apply((Object)class040392);
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (class03028 class030282 : this.sequence) {
            builder.add((Object)((class03003)class030282.apply((Object)class040392)));
        }
        return new class03014((List<class03003>)builder.build());
    }

    public class03979<? extends class03028> N() {
        return N;
    }
}

