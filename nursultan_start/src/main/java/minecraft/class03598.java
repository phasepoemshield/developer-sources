/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00570
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00381;
import minecraft.class00570;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03590;
import minecraft.class04248;
import minecraft.class07280;

public final class class03598
extends Record
implements class00381<class07280> {
    private final List<class03590> chunkBiomeData;
    public static final class02362<class00667, class03598> N = class00381.N(class03598::N, class03598::new);
    private static final int L = 0x200000;

    private class03598(class00667 class006672) {
        this(class006672.N_16(class03590::new));
    }

    public class03598(List<class03590> list) {
        this.chunkBiomeData = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03598.class, "chunkBiomeData", "chunkBiomeData"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03598.class, "chunkBiomeData", "chunkBiomeData"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03598.class, "chunkBiomeData", "chunkBiomeData"}, this);
    }

    public List<class03590> N() {
        return this.chunkBiomeData;
    }

    private void N(class00667 class006673) {
        class006673.N_12(this.chunkBiomeData, (class006672, class035902) -> class035902.N((class00667)class006672));
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public static class03598 N(List<class00570> list) {
        return new class03598(list.stream().map(class03590::new).toList());
    }

    public class02897<class03598> method_65080() {
        return class04248.P;
    }
}

