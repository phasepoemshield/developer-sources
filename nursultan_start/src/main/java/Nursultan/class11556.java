/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class07209
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class07209;

public class class11556
extends Record {
    public class07209 pos;
    public class00500 blockState;

    public class11556(class07209 class072092, class00500 class005002) {
        this.pos = class072092;
        this.blockState = class005002;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11556.class, "pos;blockState", "pos", "blockState"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11556.class, "pos;blockState", "pos", "blockState"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11556.class, "pos;blockState", "pos", "blockState"}, this);
    }

    public class00500 y() {
        return this.blockState;
    }

    public class07209 N() {
        return this.pos;
    }
}

