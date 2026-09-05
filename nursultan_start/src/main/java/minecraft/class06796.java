/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02678
 *  minecraft.class03556
 *  minecraft.class06581
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02678;
import minecraft.class03556;
import minecraft.class06581;

public final class class06796
extends Record {
    private final class03556<class06581> item;
    private final class02678 components;

    public class06796(class03556<class06581> class035562, class02678 class026782) {
        this.item = class035562;
        this.components = class026782;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06796.class, "item;components", "item", "components"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06796.class, "item;components", "item", "components"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06796.class, "item;components", "item", "components"}, this);
    }

    public class02678 y() {
        return this.components;
    }

    public class03556<class06581> N() {
        return this.item;
    }
}

