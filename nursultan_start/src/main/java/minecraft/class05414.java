/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03252
 *  minecraft.class05946
 *  minecraft.class08548
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03252;
import minecraft.class05946;
import minecraft.class08548;

public final class class05414
extends Record {
    private final class08548 assets;
    final class05946<class03252> materialKey;

    public class05414(class08548 class085482, class05946<class03252> class059462) {
        this.assets = class085482;
        this.materialKey = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05414.class, "assets;materialKey", "assets", "materialKey"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05414.class, "assets;materialKey", "assets", "materialKey"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05414.class, "assets;materialKey", "assets", "materialKey"}, this);
    }

    public class05946<class03252> y() {
        return this.materialKey;
    }

    public class08548 N() {
        return this.assets;
    }
}

