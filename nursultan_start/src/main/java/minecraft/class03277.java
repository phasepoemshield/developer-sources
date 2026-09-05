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
 *  minecraft.class07438
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class07438;

public final class class03277
extends Record
implements class00381<class07280> {
    private final int id;
    private final float yaw;
    public static final class02362<class00667, class03277> N = class00381.N(class03277::N, class03277::new);

    public class03277(int n, float f) {
        this.id = n;
        this.yaw = f;
    }

    private class03277(class00667 class006672) {
        this(class006672.E(), class006672.readFloat());
    }

    public class03277(class07438 class074382) {
        this(class074382.method_5628(), class074382.method_48157());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03277.class, "id;yaw", "id", "yaw"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03277.class, "id;yaw", "id", "yaw"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03277.class, "id;yaw", "id", "yaw"}, this);
    }

    public float y() {
        return this.yaw;
    }

    public int N() {
        return this.id;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class006672.L(this.id);
        class006672.writeFloat(this.yaw);
    }

    public class02897<class03277> method_65080() {
        return class04248.c;
    }
}

