/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05946
 *  minecraft.class06172
 *  minecraft.class07299
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ListIterator;
import minecraft.class05946;
import minecraft.class06172;
import minecraft.class06699;
import minecraft.class07299;

final class class06701
extends Record {
    final class05946<class07299> dimensionKey;
    final class06172 storage;
    final ListIterator<class06699> files;

    public ListIterator<class06699> L() {
        return this.files;
    }

    class06701(class05946<class07299> class059462, class06172 class061722, ListIterator<class06699> listIterator) {
        this.dimensionKey = class059462;
        this.storage = class061722;
        this.files = listIterator;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06701.class, "dimensionKey;storage;files", "dimensionKey", "storage", "files"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06701.class, "dimensionKey;storage;files", "dimensionKey", "storage", "files"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06701.class, "dimensionKey;storage;files", "dimensionKey", "storage", "files"}, this);
    }

    public class06172 y() {
        return this.storage;
    }

    public class05946<class07299> N() {
        return this.dimensionKey;
    }
}

