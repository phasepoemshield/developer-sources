/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03662;
import minecraft.class06584;

public final class class03666
extends Record {
    private final class06584 itemStack;
    private final class03662 itemTransform;

    public class03666(class06584 class065842, class03662 class036622) {
        this.itemStack = class065842;
        this.itemTransform = class036622;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03666.class, "itemStack;itemTransform", "itemStack", "itemTransform"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03666.class, "itemStack;itemTransform", "itemStack", "itemTransform"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03666.class, "itemStack;itemTransform", "itemStack", "itemTransform"}, this);
    }

    public class03662 y() {
        return this.itemTransform;
    }

    public class06584 N() {
        return this.itemStack;
    }
}

