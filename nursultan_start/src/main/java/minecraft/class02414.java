/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02430
 *  minecraft.class02433
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import minecraft.class01894;
import minecraft.class02430;
import minecraft.class02433;

public final class class02414
extends Record {
    private final Map<class01894, class02430> internalTargets;
    private final List<class02433> passes;
    public static final Codec<class02414> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.unboundedMap((Codec)class01894.N, (Codec)class02430.N).optionalFieldOf("targets", Map.of()).forGetter(class02414::N), (App)class02433.N.listOf().optionalFieldOf("passes", List.of()).forGetter(class02414::y)).apply(instance, class02414::new));

    public class02414(Map<class01894, class02430> map, List<class02433> list) {
        this.internalTargets = map;
        this.passes = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02414.class, "internalTargets;passes", "internalTargets", "passes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02414.class, "internalTargets;passes", "internalTargets", "passes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02414.class, "internalTargets;passes", "internalTargets", "passes"}, this);
    }

    public List<class02433> y() {
        return this.passes;
    }

    public Map<class01894, class02430> N() {
        return this.internalTargets;
    }
}

