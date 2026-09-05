/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public final class class01164
extends Record {
    private final @Nullable class07049 sourceEntity;
    private final @Nullable class00500 affectedState;

    public class01164(@Nullable class07049 class070492, @Nullable class00500 class005002) {
        this.sourceEntity = class070492;
        this.affectedState = class005002;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01164.class, "sourceEntity;affectedState", "sourceEntity", "affectedState"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01164.class, "sourceEntity;affectedState", "sourceEntity", "affectedState"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01164.class, "sourceEntity;affectedState", "sourceEntity", "affectedState"}, this);
    }

    public @Nullable class00500 y() {
        return this.affectedState;
    }

    public static class01164 N(@Nullable class07049 class070492, @Nullable class00500 class005002) {
        return new class01164(class070492, class005002);
    }

    public @Nullable class07049 N() {
        return this.sourceEntity;
    }

    public static class01164 N(@Nullable class07049 class070492) {
        return new class01164(class070492, null);
    }

    public static class01164 N(@Nullable class00500 class005002) {
        return new class01164(null, class005002);
    }
}

