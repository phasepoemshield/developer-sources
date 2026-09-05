/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class07209;

final class class01571
extends Record {
    final class07209 pos;
    final class00500 oldState;

    class01571(class07209 class072092, class00500 class005002) {
        this.pos = class072092;
        this.oldState = class005002;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01571.class, "pos;oldState", "pos", "oldState"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01571.class, "pos;oldState", "pos", "oldState"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01571.class, "pos;oldState", "pos", "oldState"}, this);
    }

    public class00500 y() {
        return this.oldState;
    }

    public class07209 N() {
        return this.pos;
    }
}

