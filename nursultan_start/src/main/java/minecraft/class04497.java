/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04480;
import minecraft.class04482;

final class class04497
extends Record {
    final class04482 source;
    final class04480 problem;

    class04497(class04482 class044822, class04480 class044802) {
        this.source = class044822;
        this.problem = class044802;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04497.class, "source;problem", "source", "problem"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04497.class, "source;problem", "source", "problem"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04497.class, "source;problem", "source", "problem"}, this);
    }

    public class04480 y() {
        return this.problem;
    }

    public class04482 N() {
        return this.source;
    }
}

