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

public final class class03547
extends Record {
    final long delay;
    final long period;
    final String title;
    final String message;

    public String L() {
        return this.title;
    }

    public class03547(long l, long l2, String string, String string2) {
        this.delay = l != 0L ? l : l2;
        this.period = l2;
        this.title = string;
        this.message = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03547.class, "delay;period;title;message", "delay", "period", "title", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03547.class, "delay;period;title;message", "delay", "period", "title", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03547.class, "delay;period;title;message", "delay", "period", "title", "message"}, this);
    }

    public String u() {
        return this.message;
    }

    public long y() {
        return this.period;
    }

    public long N() {
        return this.delay;
    }
}

