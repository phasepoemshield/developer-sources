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
import minecraft.class06468;

public final class class06450
extends Record {
    private final String text;
    final class06468 chatMethod;

    public class06450(String string, class06468 class064682) {
        this.text = string;
        this.chatMethod = class064682;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06450.class, "text;chatMethod", "text", "chatMethod"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06450.class, "text;chatMethod", "text", "chatMethod"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06450.class, "text;chatMethod", "text", "chatMethod"}, this);
    }

    public class06468 y() {
        return this.chatMethod;
    }

    public String N() {
        return this.text;
    }
}

