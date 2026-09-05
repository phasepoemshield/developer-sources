/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00849;
import minecraft.class03556;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07438;

public final class class00834
extends Record {
    private final Map<class03556<class07084>, class00849> effectMap;
    public static final Codec<class00834> N = Codec.unboundedMap((Codec)class07084.N, class00849.N).xmap(class00834::new, class00834::N);

    public class00834(Map<class03556<class07084>, class00849> map) {
        this.effectMap = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00834.class, "effectMap", "effectMap"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00834.class, "effectMap", "effectMap"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00834.class, "effectMap", "effectMap"}, this);
    }

    public boolean N(class07438 class074382) {
        return this.N(class074382.method_6088());
    }

    public Map<class03556<class07084>, class00849> N() {
        return this.effectMap;
    }

    public boolean N(Map<class03556<class07084>, class07055> map) {
        for (Map.Entry<class03556<class07084>, class00849> entry : this.effectMap.entrySet()) {
            class07055 class070552 = map.get(entry.getKey());
            if (entry.getValue().N(class070552)) continue;
            return false;
        }
        return true;
    }

    public boolean N(class07049 class070492) {
        class07438 class074382;
        return class070492 instanceof class07438 && this.N((class074382 = (class07438)class070492).method_6088());
    }
}

