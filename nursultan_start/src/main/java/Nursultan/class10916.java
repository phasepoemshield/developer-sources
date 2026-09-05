/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class07209
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class07209;

public class class10916
extends Record {
    public boolean open;
    public class07209 pos;
    public class00494 shape;
    public class00500 state;

    public class07209 L() {
        return this.pos;
    }

    class10916(class00500 class005002, class00494 class004942, class07209 class072092, boolean bl) {
        this.state = class005002;
        this.shape = class004942;
        this.pos = class072092;
        this.open = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10916.class, "state;shape;pos;open", "state", "shape", "pos", "open"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10916.class, "state;shape;pos;open", "state", "shape", "pos", "open"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10916.class, "state;shape;pos;open", "state", "shape", "pos", "open"}, this);
    }

    public boolean u() {
        return this.open;
    }

    public class00500 y() {
        return this.state;
    }

    public class00494 N() {
        return this.shape;
    }
}

