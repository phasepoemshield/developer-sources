/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04167
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04167;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class06643
extends Record
implements class00381<class07280> {
    private final class04167 commonPlayerSpawnInfo;
    private final byte dataToKeep;
    public static final class02362<class04247, class06643> N = class00381.N(class06643::N, class06643::new);
    public static final byte y = 1;
    public static final byte L = 2;
    public static final byte u = 3;

    private class06643(class04247 class042472) {
        this(new class04167(class042472), class042472.readByte());
    }

    public class06643(class04167 class041672, byte by) {
        this.commonPlayerSpawnInfo = class041672;
        this.dataToKeep = by;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06643.class, "commonPlayerSpawnInfo;dataToKeep", "commonPlayerSpawnInfo", "dataToKeep"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06643.class, "commonPlayerSpawnInfo;dataToKeep", "commonPlayerSpawnInfo", "dataToKeep"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06643.class, "commonPlayerSpawnInfo;dataToKeep", "commonPlayerSpawnInfo", "dataToKeep"}, this);
    }

    public byte y() {
        return this.dataToKeep;
    }

    public class04167 N() {
        return this.commonPlayerSpawnInfo;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class04247 class042472) {
        this.commonPlayerSpawnInfo.N(class042472);
        class042472.writeByte((int)this.dataToKeep);
    }

    public boolean N(byte by) {
        return (this.dataToKeep & by) != 0;
    }

    public class02897<class06643> method_65080() {
        return class04248.Nn;
    }
}

