/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07049
 *  minecraft.class08036
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import minecraft.class03987;
import minecraft.class04009;
import minecraft.class07049;
import minecraft.class08036;

public final class class04001
extends Record
implements Comparator<class07049> {
    private final class03987 angerManagement;

    protected class04001(class03987 class039872) {
        this.angerManagement = class039872;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04001.class, "angerManagement", "angerManagement"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04001.class, "angerManagement", "angerManagement"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04001.class, "angerManagement", "angerManagement"}, this);
    }

    public class03987 N() {
        return this.angerManagement;
    }

    @Override
    public int compare(class07049 class070492, class07049 class070493) {
        boolean bl;
        if (class070492.equals((Object)class070493)) {
            return 0;
        }
        int n = this.angerManagement.i.getOrDefault((Object)class070492, 0);
        int n2 = this.angerManagement.i.getOrDefault((Object)class070493, 0);
        this.angerManagement.L = Math.max(this.angerManagement.L, Math.max(n, n2));
        boolean bl2 = class04009.N(n).u();
        if (bl2 != (bl = class04009.N(n2).u())) {
            return bl2 ? -1 : 1;
        }
        boolean bl3 = class070492 instanceof class08036;
        boolean bl4 = class070493 instanceof class08036;
        if (bl3 != bl4) {
            return bl3 ? -1 : 1;
        }
        return Integer.compare(n2, n);
    }
}

