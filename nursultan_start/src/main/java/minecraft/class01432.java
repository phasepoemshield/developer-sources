/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  minecraft.class06562
 *  minecraft.class08019
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01385;
import minecraft.class06338;
import minecraft.class06562;
import minecraft.class08019;

final class class01432
extends Record
implements class01385 {
    private final Object2BooleanMap<String> criterions;
    public static final Codec<class01432> N = class06338.R((Codec)Codec.STRING).xmap(class01432::new, class01432::N);

    class01432(Object2BooleanMap<String> object2BooleanMap) {
        this.criterions = object2BooleanMap;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01432.class, "criterions", "criterions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01432.class, "criterions", "criterions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01432.class, "criterions", "criterions"}, this);
    }

    public Object2BooleanMap<String> N() {
        return this.criterions;
    }

    @Override
    public boolean test(class08019 class080192) {
        for (Object2BooleanMap.Entry entry : this.criterions.object2BooleanEntrySet()) {
            class06562 class065622 = class080192.L((String)entry.getKey());
            if (class065622 != null && class065622.N() == entry.getBooleanValue()) continue;
            return false;
        }
        return true;
    }
}

