/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07050
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07050;

public class class10908
extends Record {
    public class07050 hand;
    public int pitch;
    public boolean jump;
    public int inventorySlot;
    public int hotbarSlot;
    public int delayAfter;

    public class07050 L() {
        return this.hand;
    }

    class10908(int n, int n2, class07050 class070502, int n3, boolean bl, int n4) {
        this.hotbarSlot = n;
        this.inventorySlot = n2;
        this.hand = class070502;
        this.pitch = n3;
        this.jump = bl;
        this.delayAfter = n4;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10908.class, "hotbarSlot;inventorySlot;hand;pitch;jump;delayAfter", "hotbarSlot", "inventorySlot", "hand", "pitch", "jump", "delayAfter"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10908.class, "hotbarSlot;inventorySlot;hand;pitch;jump;delayAfter", "hotbarSlot", "inventorySlot", "hand", "pitch", "jump", "delayAfter"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10908.class, "hotbarSlot;inventorySlot;hand;pitch;jump;delayAfter", "hotbarSlot", "inventorySlot", "hand", "pitch", "jump", "delayAfter"}, this);
    }

    public int i() {
        return this.hotbarSlot;
    }

    public int u() {
        return this.inventorySlot;
    }

    public boolean y() {
        return this.jump;
    }

    public int N() {
        return this.pitch;
    }

    public int R() {
        return this.delayAfter;
    }
}

