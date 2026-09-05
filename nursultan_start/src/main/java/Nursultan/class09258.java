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

public non-sealed class class09258
extends Record
implements class09279 {
    public class11827 preset;

    public class09258(class11827 class118272) {
        this.preset = class118272;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09258.class, "preset", "preset"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09258.class, "preset", "preset"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09258.class, "preset", "preset"}, this);
    }

    @Override
    public void y(class11940 class119402) {
        this.preset.N(class119402);
    }

    public class11827 N() {
        return this.preset;
    }

    public static class09258 N(class11940 class119402) {
        return new class09258(class11827.y((class11940)class119402));
    }
}

