/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11827
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09279;
import Nursultan.class11827;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class09261
extends Record
implements class09279 {
    public int formatVersion;
    public class11827 preset;
    public byte[] data;

    public byte[] L() {
        return this.data;
    }

    public class09261(class11827 class118272, int n, byte[] byArray) {
        this.preset = class118272;
        this.formatVersion = n;
        this.data = byArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09261.class, "preset;formatVersion;data", "preset", "formatVersion", "data"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09261.class, "preset;formatVersion;data", "preset", "formatVersion", "data"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09261.class, "preset;formatVersion;data", "preset", "formatVersion", "data"}, this);
    }

    @Override
    public void y(class11940 class119402) {
        this.preset.N(class119402);
        class119402.y(this.formatVersion);
        class119402.N(this.data);
    }

    public int y() {
        return this.formatVersion;
    }

    public static class09261 N(class11940 class119402) {
        return new class09261(class11827.y((class11940)class119402), class119402.R(), class119402.u(0x100000));
    }

    public class11827 N() {
        return this.preset;
    }
}

