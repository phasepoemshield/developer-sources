/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02875
 *  minecraft.class07830
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02875;
import minecraft.class07441;
import minecraft.class07830;

final class class07462
extends Record {
    final class07830 heightMap;
    final class02875 placement;
    final class07441<?> predicate;

    public class07441<?> L() {
        return this.predicate;
    }

    class07462(class07830 class078302, class02875 class028752, class07441<?> class074412) {
        this.heightMap = class078302;
        this.placement = class028752;
        this.predicate = class074412;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07462.class, "heightMap;placement;predicate", "heightMap", "placement", "predicate"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07462.class, "heightMap;placement;predicate", "heightMap", "placement", "predicate"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07462.class, "heightMap;placement;predicate", "heightMap", "placement", "predicate"}, this);
    }

    public class02875 y() {
        return this.placement;
    }

    public class07830 N() {
        return this.heightMap;
    }
}

