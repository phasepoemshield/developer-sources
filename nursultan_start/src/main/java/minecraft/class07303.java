/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00891;
import minecraft.class07209;

public final class class07303
extends Record {
    private final class07209 pos;
    private final class00891 block;
    private final int paramA;
    private final int paramB;

    public int L() {
        return this.paramA;
    }

    public class07303(class07209 class072092, class00891 class008912, int n, int n2) {
        this.pos = class072092;
        this.block = class008912;
        this.paramA = n;
        this.paramB = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07303.class, "pos;block;paramA;paramB", "pos", "block", "paramA", "paramB"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07303.class, "pos;block;paramA;paramB", "pos", "block", "paramA", "paramB"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07303.class, "pos;block;paramA;paramB", "pos", "block", "paramA", "paramB"}, this);
    }

    public int u() {
        return this.paramB;
    }

    public class00891 y() {
        return this.block;
    }

    public class07209 N() {
        return this.pos;
    }
}

