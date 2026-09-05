/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08195
 *  minecraft.class08774
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class08195;
import minecraft.class08774;

final class class07387
extends Record {
    private final class08774 user;
    private final Optional<class08195> permissionLevel;
    private final Optional<Boolean> bypassesPlayerLimit;

    public Optional<Boolean> L() {
        return this.bypassesPlayerLimit;
    }

    class07387(class08774 class087742, Optional<class08195> optional, Optional<Boolean> optional2) {
        this.user = class087742;
        this.permissionLevel = optional;
        this.bypassesPlayerLimit = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07387.class, "user;permissionLevel;bypassesPlayerLimit", "user", "permissionLevel", "bypassesPlayerLimit"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07387.class, "user;permissionLevel;bypassesPlayerLimit", "user", "permissionLevel", "bypassesPlayerLimit"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07387.class, "user;permissionLevel;bypassesPlayerLimit", "user", "permissionLevel", "bypassesPlayerLimit"}, this);
    }

    public Optional<class08195> y() {
        return this.permissionLevel;
    }

    public class08774 N() {
        return this.user;
    }
}

