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
import jdk.jfr.consumer.RecordedEvent;

public final class class02299
extends Record {
    private final String level;
    private final String dimension;
    private final int x;
    private final int z;

    public int L() {
        return this.x;
    }

    public class02299(String string, String string2, int n, int n2) {
        this.level = string;
        this.dimension = string2;
        this.x = n;
        this.z = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02299.class, "level;dimension;x;z", "level", "dimension", "x", "z"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02299.class, "level;dimension;x;z", "level", "dimension", "x", "z"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02299.class, "level;dimension;x;z", "level", "dimension", "x", "z"}, this);
    }

    public int u() {
        return this.z;
    }

    public String y() {
        return this.dimension;
    }

    public static class02299 N(RecordedEvent recordedEvent) {
        return new class02299(recordedEvent.getString("level"), recordedEvent.getString("dimension"), recordedEvent.getInt("chunkPosX"), recordedEvent.getInt("chunkPosZ"));
    }

    public String N() {
        return this.level;
    }
}

