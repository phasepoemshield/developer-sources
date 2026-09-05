/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00176
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07510
 *  minecraft.class08051
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00176;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07510;
import minecraft.class08051;

public final class class00539
extends Record
implements class00381<class08051> {
    private final int containerId;
    private final int stateId;
    private final short slotNum;
    private final byte buttonNum;
    private final class07510 clickType;
    private final Int2ObjectMap<class00176> changedSlots;
    private final class00176 carriedItem;
    private static final int Z = 128;
    private static final class02362<class04247, Int2ObjectMap<class00176>> z = class02389.N(Int2ObjectOpenHashMap::new, (class02362)class02389.i.N_10(Short::intValue, Integer::shortValue), (class02362)class00176.y, (int)128);
    public static final class02362<class04247, class00539> N = class02362.N((class02362)class02389.l, class00539::N, (class02362)class02389.B, class00539::y, (class02362)class02389.i, class00539::L, (class02362)class02389.L, class00539::u, (class02362)class07510.field_58134, class00539::M, z, class00539::B, (class02362)class00176.y, class00539::Z, class00539::new);

    public short L() {
        return this.slotNum;
    }

    public class07510 M() {
        return this.clickType;
    }

    public class00539(int n, int n2, short s, byte by, class07510 class075102, Int2ObjectMap<class00176> int2ObjectMap, class00176 class001762) {
        int2ObjectMap = Int2ObjectMaps.unmodifiable(int2ObjectMap);
        this.containerId = n;
        this.stateId = n2;
        this.slotNum = s;
        this.buttonNum = by;
        this.clickType = class075102;
        this.changedSlots = int2ObjectMap;
        this.carriedItem = class001762;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00539.class, "containerId;stateId;slotNum;buttonNum;clickType;changedSlots;carriedItem", "containerId", "stateId", "slotNum", "buttonNum", "clickType", "changedSlots", "carriedItem"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00539.class, "containerId;stateId;slotNum;buttonNum;clickType;changedSlots;carriedItem", "containerId", "stateId", "slotNum", "buttonNum", "clickType", "changedSlots", "carriedItem"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00539.class, "containerId;stateId;slotNum;buttonNum;clickType;changedSlots;carriedItem", "containerId", "stateId", "slotNum", "buttonNum", "clickType", "changedSlots", "carriedItem"}, this);
    }

    public Int2ObjectMap<class00176> B() {
        return this.changedSlots;
    }

    public class00176 Z() {
        return this.carriedItem;
    }

    public byte u() {
        return this.buttonNum;
    }

    public int y() {
        return this.stateId;
    }

    public int N() {
        return this.containerId;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12076(this);
    }

    public class02897<class00539> method_65080() {
        return class04248.yJ;
    }
}

