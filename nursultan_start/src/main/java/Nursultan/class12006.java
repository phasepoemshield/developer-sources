/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11910
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00176
 *  minecraft.class00381
 *  minecraft.class00539
 *  minecraft.class06202
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class11910;
import Nursultan.class12040;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00176;
import minecraft.class00381;
import minecraft.class00539;
import minecraft.class06202;
import minecraft.class07510;

public class class12006
extends Record
implements class12040 {
    public byte button;
    public short slot;
    public class07510 actionType;
    public Int2ObjectMap<class00176> modifiedStacks;
    public class00176 itemStackHash;
    public int revision;
    public int syncId;

    public class07510 L() {
        return this.actionType;
    }

    public Int2ObjectMap<class00176> M() {
        return this.modifiedStacks;
    }

    public class12006(int n, int n2, short s, byte by, class07510 class075102, class00176 class001762, Int2ObjectMap<class00176> int2ObjectMap) {
        this.syncId = n;
        this.revision = n2;
        this.slot = s;
        this.button = by;
        this.actionType = class075102;
        this.itemStackHash = class001762;
        this.modifiedStacks = int2ObjectMap;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class12006.class, "syncId;revision;slot;button;actionType;itemStackHash;modifiedStacks", "syncId", "revision", "slot", "button", "actionType", "itemStackHash", "modifiedStacks"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class12006.class, "syncId;revision;slot;button;actionType;itemStackHash;modifiedStacks", "syncId", "revision", "slot", "button", "actionType", "itemStackHash", "modifiedStacks"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class12006.class, "syncId;revision;slot;button;actionType;itemStackHash;modifiedStacks", "syncId", "revision", "slot", "button", "actionType", "itemStackHash", "modifiedStacks"}, this);
    }

    public class00176 i() {
        return this.itemStackHash;
    }

    @Override
    public void accept(class06202 class062022) {
        class11910.N((class00381)new class00539(this.syncId, this.revision, this.slot, this.button, this.actionType, this.modifiedStacks, this.itemStackHash));
    }

    public int u() {
        return this.revision;
    }

    public int y() {
        return this.syncId;
    }

    public short N() {
        return this.slot;
    }

    public byte R() {
        return this.button;
    }
}

