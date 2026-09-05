/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class06794
 *  minecraft.class07689
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class06794;
import minecraft.class07689;

public class class10580
extends Record {
    public int end;
    public int start;
    public class06794 selector;

    public class06794 L() {
        return this.selector;
    }

    public class10580(int n, int n2, class06794 class067942) {
        this.start = n;
        this.end = n2;
        this.selector = class067942;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10580.class, "start;end;selector", "start", "end", "selector"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10580.class, "start;end;selector", "start", "end", "selector"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10580.class, "start;end;selector", "start", "end", "selector"}, this);
    }

    public int y() {
        return this.start;
    }

    public int N() {
        return this.end;
    }

    public class00392 N(class07689 class076892) {
        return class00392.y((String)class076892.toString());
    }
}

