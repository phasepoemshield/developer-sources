/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00891
 *  minecraft.class03607
 *  minecraft.class06338
 *  minecraft.class08855
 *  minecraft.class08866
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00891;
import minecraft.class03607;
import minecraft.class06338;
import minecraft.class08855;
import minecraft.class08866;

public final class class04125
extends Record {
    private final List<class03607> selectors;
    public static final Codec<class04125> N = class06338.y((Codec)class03607.N.listOf()).xmap(class04125::new, class04125::N);

    public class04125(List<class03607> list) {
        this.selectors = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04125.class, "selectors", "selectors"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04125.class, "selectors", "selectors"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04125.class, "selectors", "selectors"}, this);
    }

    public List<class03607> N() {
        return this.selectors;
    }

    public class08855 N(class00507<class00891, class00500> class005072) {
        ImmutableList.Builder builder = ImmutableList.builderWithExpectedSize((int)this.selectors.size());
        for (class03607 class036072 : this.selectors) {
            builder.add((Object)new class08866(class036072.N(class005072), (Object)class036072.y()));
        }
        return new class08855((List)builder.build());
    }
}

