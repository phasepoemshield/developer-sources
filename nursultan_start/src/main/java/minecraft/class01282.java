/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05018
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01276;
import minecraft.class05018;

public final class class01282
extends Record
implements class01276 {
    private final String serverAddress;

    public class01282(String string) {
        this.serverAddress = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01282.class, "serverAddress", "serverAddress"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01282.class, "serverAddress", "serverAddress"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01282.class, "serverAddress", "serverAddress"}, this);
    }

    public String y() {
        return this.serverAddress;
    }

    @Override
    public boolean N() {
        return !class05018.B((String)this.serverAddress);
    }
}

