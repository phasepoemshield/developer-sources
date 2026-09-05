/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00949
 *  minecraft.class08985
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00949;
import minecraft.class08985;

final class class04846
extends Record {
    final class00949 description;
    final class08985 source;

    class04846(class00949 class009492, class08985 class089852) {
        this.description = class009492;
        this.source = class089852;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04846.class, "description;source", "description", "source"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04846.class, "description;source", "description", "source"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04846.class, "description;source", "description", "source"}, this);
    }

    public class08985 y() {
        return this.source;
    }

    public class00949 N() {
        return this.description;
    }
}

