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

public final class class01240
extends Record
implements class01276 {
    private final String realmId;

    public class01240(String string) {
        this.realmId = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01240.class, "realmId", "realmId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01240.class, "realmId", "realmId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01240.class, "realmId", "realmId"}, this);
    }

    public String y() {
        return this.realmId;
    }

    @Override
    public boolean N() {
        return !class05018.B((String)this.realmId);
    }
}

