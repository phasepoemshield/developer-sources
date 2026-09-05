/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03106;
import minecraft.class04248;
import minecraft.class07280;

public final class class03132
extends Record
implements class00381<class07280> {
    private final float tickRate;
    private final boolean isFrozen;
    public static final class02362<class00667, class03132> N = class00381.N(class03132::N, class03132::new);

    private class03132(class00667 class006672) {
        this(class006672.readFloat(), class006672.readBoolean());
    }

    public class03132(float f, boolean bl) {
        this.tickRate = f;
        this.isFrozen = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03132.class, "tickRate;isFrozen", "tickRate", "isFrozen"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03132.class, "tickRate;isFrozen", "tickRate", "isFrozen"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03132.class, "tickRate;isFrozen", "tickRate", "isFrozen"}, this);
    }

    public boolean y() {
        return this.isFrozen;
    }

    public float N() {
        return this.tickRate;
    }

    private void N(class00667 class006672) {
        class006672.writeFloat(this.tickRate);
        class006672.writeBoolean(this.isFrozen);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public static class03132 N(class03106 class031062) {
        return new class03132(class031062.R(), class031062.E());
    }

    public class02897<class03132> method_65080() {
        return class04248.Ll;
    }
}

