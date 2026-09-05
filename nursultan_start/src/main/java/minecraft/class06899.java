/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04480
 *  minecraft.class05074
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04480;
import minecraft.class05074;
import minecraft.class05946;

public final class class06899
extends Record
implements class04480 {
    private final class05946<class05074> id;

    public class06899(class05946<class05074> class059462) {
        this.id = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06899.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06899.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06899.class, "id", "id"}, this);
    }

    public class05946<class05074> y() {
        return this.id;
    }

    public String N() {
        return "Missing built-in table: " + String.valueOf(this.id.N());
    }
}

