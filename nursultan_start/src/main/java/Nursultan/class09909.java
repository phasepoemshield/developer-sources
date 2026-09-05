/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09924;
import Nursultan.class09935;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;

public final class class09909
extends Record
implements class09935 {
    private final class09924 command;

    public class09909(class09924 class099242) {
        Objects.requireNonNull(class099242, "command");
        this.command = class099242;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09909.class, "command", "command"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09909.class, "command", "command"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09909.class, "command", "command"}, this);
    }

    public class09924 N() {
        return this.command;
    }
}

