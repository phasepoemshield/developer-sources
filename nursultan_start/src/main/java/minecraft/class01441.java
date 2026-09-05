/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 *  org.joml.Vector2i
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06584;
import org.joml.Vector2i;

final class class01441
extends Record {
    final class06584 item;
    final Vector2i start;
    final Vector2i end;
    final long time;

    public Vector2i L() {
        return this.end;
    }

    class01441(class06584 class065842, Vector2i vector2i, Vector2i vector2i2, long l) {
        this.item = class065842;
        this.start = vector2i;
        this.end = vector2i2;
        this.time = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01441.class, "item;start;end;time", "item", "start", "end", "time"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01441.class, "item;start;end;time", "item", "start", "end", "time"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01441.class, "item;start;end;time", "item", "start", "end", "time"}, this);
    }

    public long u() {
        return this.time;
    }

    public Vector2i y() {
        return this.start;
    }

    public class06584 N() {
        return this.item;
    }
}

