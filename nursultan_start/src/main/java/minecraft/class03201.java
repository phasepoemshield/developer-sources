/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00549
 *  minecraft.class00893
 *  minecraft.class07321
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;
import minecraft.class00549;
import minecraft.class00893;
import minecraft.class03230;
import minecraft.class07321;

public final class class03201
extends Record
implements class03230 {
    private final Duration duration;
    private final class07321 chunkPos;
    private final class00893 worldPos;
    private final class00549 status;
    private final String level;

    public class00893 L() {
        return this.worldPos;
    }

    public class03201(Duration duration, class07321 class073212, class00893 class008932, class00549 class005492, String string) {
        this.duration = duration;
        this.chunkPos = class073212;
        this.worldPos = class008932;
        this.status = class005492;
        this.level = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03201.class, "duration;chunkPos;worldPos;status;level", "duration", "chunkPos", "worldPos", "status", "level"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03201.class, "duration;chunkPos;worldPos;status;level", "duration", "chunkPos", "worldPos", "status", "level"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03201.class, "duration;chunkPos;worldPos;status;level", "duration", "chunkPos", "worldPos", "status", "level"}, this);
    }

    public String i() {
        return this.level;
    }

    public class00549 u() {
        return this.status;
    }

    public class07321 y() {
        return this.chunkPos;
    }

    public static class03201 N(RecordedEvent recordedEvent) {
        return new class03201(recordedEvent.getDuration(), new class07321(recordedEvent.getInt("chunkPosX"), recordedEvent.getInt("chunkPosX")), new class00893(recordedEvent.getInt("worldPosX"), recordedEvent.getInt("worldPosZ")), class00549.N((String)recordedEvent.getString("status")), recordedEvent.getString("level"));
    }

    @Override
    public Duration N() {
        return this.duration;
    }
}

