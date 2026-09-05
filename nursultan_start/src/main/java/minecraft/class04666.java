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
import minecraft.class06584;

final class class04666
extends Record {
    private final class06584 categoryItem;
    private final class06584 unlockedItem;

    class04666(class06584 class065842, class06584 class065843) {
        this.categoryItem = class065842;
        this.unlockedItem = class065843;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04666.class, "categoryItem;unlockedItem", "categoryItem", "unlockedItem"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04666.class, "categoryItem;unlockedItem", "categoryItem", "unlockedItem"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04666.class, "categoryItem;unlockedItem", "categoryItem", "unlockedItem"}, this);
    }

    public class06584 y() {
        return this.unlockedItem;
    }

    public class06584 N() {
        return this.categoryItem;
    }
}

