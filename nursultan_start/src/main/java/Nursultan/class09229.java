/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11854
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11854;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09229
extends Record {
    public int generation;
    public class11854 previous;
    public int direction;
    public boolean active;
    public class11854 displayed;

    public class11854 L() {
        return this.previous;
    }

    private class09229(class11854 class118542, class11854 class118543, int n, int n2, boolean bl) {
        this.displayed = class118542;
        this.previous = class118543;
        this.direction = n;
        this.generation = n2;
        this.active = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09229.class, "displayed;previous;direction;generation;active", "displayed", "previous", "direction", "generation", "active"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09229.class, "displayed;previous;direction;generation;active", "displayed", "previous", "direction", "generation", "active"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09229.class, "displayed;previous;direction;generation;active", "displayed", "previous", "direction", "generation", "active"}, this);
    }

    boolean B() {
        return this.active && this.previous != null;
    }

    public boolean i() {
        return this.active;
    }

    public int u() {
        return this.direction;
    }

    static class09229 y(class11854 class118542) {
        return new class09229(class118542, null, 0, 0, false);
    }

    public class11854 y() {
        return this.displayed;
    }

    class09229 N(class11854 class118542) {
        if (class118542 == this.displayed) {
            return this;
        }
        return new class09229(class118542, this.displayed, Integer.signum(class118542.ordinal() - this.displayed.ordinal()), this.generation + 1, true);
    }

    public int N() {
        return this.generation;
    }

    class09229 R() {
        if (!this.active && this.previous == null) {
            return this;
        }
        return new class09229(this.displayed, null, this.direction, this.generation, false);
    }
}

