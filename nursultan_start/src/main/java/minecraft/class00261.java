/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
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
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public final class class00261
extends Record
implements class00381<class07280> {
    private final float yRot;
    private final boolean relativeY;
    private final float xRot;
    private final boolean relativeX;
    public static final class02362<class00667, class00261> N = class02362.N((class02362)class02389.E, class00261::N, (class02362)class02389.y, class00261::y, (class02362)class02389.E, class00261::L, (class02362)class02389.y, class00261::u, class00261::new);

    public float L() {
        return this.xRot;
    }

    public class00261(float f, boolean bl, float f2, boolean bl2) {
        this.yRot = f;
        this.relativeY = bl;
        this.xRot = f2;
        this.relativeX = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00261.class, "yRot;relativeY;xRot;relativeX", "yRot", "relativeY", "xRot", "relativeX"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00261.class, "yRot;relativeY;xRot;relativeX", "yRot", "relativeY", "xRot", "relativeX"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00261.class, "yRot;relativeY;xRot;relativeX", "yRot", "relativeY", "xRot", "relativeX"}, this);
    }

    public boolean u() {
        return this.relativeX;
    }

    public boolean y() {
        return this.relativeY;
    }

    public float N() {
        return this.yRot;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00261> method_65080() {
        return class04248.NP;
    }
}

