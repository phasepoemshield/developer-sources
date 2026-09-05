/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03230
 *  minecraft.class07321
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;
import minecraft.class03230;
import minecraft.class07321;

public final class class00323
extends Record
implements class03230 {
    private final Duration duration;
    private final class07321 chunkPos;
    private final String structureName;
    private final String level;
    private final boolean success;

    public String L() {
        return this.structureName;
    }

    public class00323(Duration duration, class07321 class073212, String string, String string2, boolean bl) {
        this.duration = duration;
        this.chunkPos = class073212;
        this.structureName = string;
        this.level = string2;
        this.success = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00323.class, "duration;chunkPos;structureName;level;success", "duration", "chunkPos", "structureName", "level", "success"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00323.class, "duration;chunkPos;structureName;level;success", "duration", "chunkPos", "structureName", "level", "success"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00323.class, "duration;chunkPos;structureName;level;success", "duration", "chunkPos", "structureName", "level", "success"}, this);
    }

    public boolean i() {
        return this.success;
    }

    public String u() {
        return this.level;
    }

    public class07321 y() {
        return this.chunkPos;
    }

    public static class00323 N(RecordedEvent recordedEvent) {
        return new class00323(recordedEvent.getDuration(), new class07321(recordedEvent.getInt("chunkPosX"), recordedEvent.getInt("chunkPosX")), recordedEvent.getString("structure"), recordedEvent.getString("level"), recordedEvent.getBoolean("success"));
    }

    public Duration N() {
        return this.duration;
    }
}

