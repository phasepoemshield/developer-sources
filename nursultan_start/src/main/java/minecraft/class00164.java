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

public final class class00164
extends Record {
    private final String id;
    private final int argCount;

    public class00164(String string, int n) {
        this.id = string;
        this.argCount = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00164.class, "id;argCount", "id", "argCount"}, this, object);
    }

    public String toString() {
        return this.id + "/" + this.argCount;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00164.class, "id;argCount", "id", "argCount"}, this);
    }

    public int y() {
        return this.argCount;
    }

    public String N() {
        return this.id;
    }
}

