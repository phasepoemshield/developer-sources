/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00329
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00329;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public final class class07378
extends Record
implements class00381<class08051> {
    private final int containerId;
    private final class00329 recipe;
    private final boolean useMaxItems;
    public static final class02362<class00667, class07378> N = class02362.N((class02362)class02389.l, class07378::N, (class02362)class00329.N, class07378::y, (class02362)class02389.y, class07378::L, class07378::new);

    public boolean L() {
        return this.useMaxItems;
    }

    public class07378(int n, class00329 class003292, boolean bl) {
        this.containerId = n;
        this.recipe = class003292;
        this.useMaxItems = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07378.class, "containerId;recipe;useMaxItems", "containerId", "recipe", "useMaxItems"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07378.class, "containerId;recipe;useMaxItems", "containerId", "recipe", "useMaxItems"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07378.class, "containerId;recipe;useMaxItems", "containerId", "recipe", "useMaxItems"}, this);
    }

    public class00329 y() {
        return this.recipe;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12061(this);
    }

    public int N() {
        return this.containerId;
    }

    public class02897<class07378> method_65080() {
        return class04248.yD;
    }
}

