/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class12009
extends Record {
    public int blockIndex;
    public int binding;

    public class12009(int n, int n2) {
        this.blockIndex = n;
        this.binding = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class12009.class, "blockIndex;binding", "blockIndex", "binding"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class12009.class, "blockIndex;binding", "blockIndex", "binding"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class12009.class, "blockIndex;binding", "blockIndex", "binding"}, this);
    }

    public int y() {
        return this.blockIndex;
    }

    public int N() {
        return this.binding;
    }
}

