/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class02362
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class02362;

public final class class01644
extends Record
implements class01659 {
    private final String brand;
    public static final class02362<class00667, class01644> N = class01659.N(class01644::N, class01644::new);
    public static final class01666<class01644> y = class01659.N("brand");

    private class01644(class00667 class006672) {
        this(class006672.s());
    }

    public class01644(String string) {
        this.brand = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01644.class, "brand", "brand"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01644.class, "brand", "brand"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01644.class, "brand", "brand"}, this);
    }

    public String N() {
        return this.brand;
    }

    private void N(class00667 class006672) {
        class006672.N(this.brand);
    }

    public class01666<class01644> method_56479() {
        return y;
    }
}

