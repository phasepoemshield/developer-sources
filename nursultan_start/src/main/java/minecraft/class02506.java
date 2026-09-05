/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00845
 *  minecraft.class04803
 *  minecraft.class06843
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00845;
import minecraft.class02466;
import minecraft.class02488;
import minecraft.class04803;
import minecraft.class06843;

public final class class02506
extends Record {
    private final Map<class02466, class00845> slots;
    public static final Codec<class02506> N = Codec.unboundedMap(class02488.N, (Codec)class00845.N).xmap(class02506::new, class02506::N);

    public class02506(Map<class02466, class00845> map) {
        this.slots = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02506.class, "slots", "slots"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02506.class, "slots", "slots"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02506.class, "slots", "slots"}, this);
    }

    public boolean N(class06843 class068432) {
        for (Map.Entry<class02466, class00845> entry : this.slots.entrySet()) {
            if (class02506.N(class068432, entry.getValue(), entry.getKey().N())) continue;
            return false;
        }
        return true;
    }

    public Map<class02466, class00845> N() {
        return this.slots;
    }

    private static boolean N(class06843 class068432, class00845 class008452, IntList intList) {
        for (int i = 0; i < intList.size(); ++i) {
            int n = intList.getInt(i);
            class04803 class048032 = class068432.method_32318(n);
            if (class048032 == null || !class008452.test(class048032.N())) continue;
            return true;
        }
        return false;
    }
}

