/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02303
 *  minecraft.class02362
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02303;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public final class class02861
extends Record
implements class00381<class07280> {
    private final long[] sample;
    private final class02303 debugSampleType;
    public static final class02362<class00667, class02861> N = class00381.N(class02861::N, class02861::new);

    private class02861(class00667 class006672) {
        this(class006672.u(), (class02303)class006672.y(class02303.class));
    }

    public class02861(long[] lArray, class02303 class023032) {
        this.sample = lArray;
        this.debugSampleType = class023032;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02861.class, "sample;debugSampleType", "sample", "debugSampleType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02861.class, "sample;debugSampleType", "sample", "debugSampleType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02861.class, "sample;debugSampleType", "sample", "debugSampleType"}, this);
    }

    public class02303 y() {
        return this.debugSampleType;
    }

    private void N(class00667 class006672) {
        class006672.N(this.sample);
        class006672.N((Enum)this.debugSampleType);
    }

    public long[] N() {
        return this.sample;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class02861> method_65080() {
        return class04248.O;
    }
}

