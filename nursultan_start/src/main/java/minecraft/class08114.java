/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class07078
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class07078;

final class class08114
extends Record {
    final class05946<class05074> lootTable;
    final class07078<?> entityType;
    final class06581 item;

    public class06581 L() {
        return this.item;
    }

    class08114(class05946<class05074> class059462, class07078<?> class070782, class06581 class065812) {
        this.lootTable = class059462;
        this.entityType = class070782;
        this.item = class065812;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08114.class, "lootTable;entityType;item", "lootTable", "entityType", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08114.class, "lootTable;entityType;item", "lootTable", "entityType", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08114.class, "lootTable;entityType;item", "lootTable", "entityType", "item"}, this);
    }

    public class07078<?> y() {
        return this.entityType;
    }

    public class05946<class05074> N() {
        return this.lootTable;
    }
}

