/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06595;
import minecraft.class06611;

public final class class06613
extends Record
implements class06611 {
    private final double x;
    private final double y;
    private final class06595 buttonInfo;

    public class06613(double d, double d2, class06595 class065952) {
        this.x = d;
        this.y = d2;
        this.buttonInfo = class065952;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06613.class, "x;y;buttonInfo", "x", "y", "buttonInfo"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06613.class, "x;y;buttonInfo", "x", "y", "buttonInfo"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06613.class, "x;y;buttonInfo", "x", "y", "buttonInfo"}, this);
    }

    public double n() {
        return this.x;
    }

    public double t() {
        return this.y;
    }

    public int v() {
        return this.G().v();
    }

    @Override
    public int y() {
        return this.G().y();
    }

    @Override
    public int N() {
        return this.v();
    }

    public class06595 G() {
        return this.buttonInfo;
    }
}

