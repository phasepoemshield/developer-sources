/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.TelemetryEvent
 *  com.mojang.authlib.minecraft.TelemetrySession
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02108
 *  minecraft.class02129
 */
package minecraft;

import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02108;
import minecraft.class02129;

public final class class04199
extends Record {
    private final class02129 type;
    private final class02108 properties;
    public static final Codec<class04199> N = class02129.y.dispatchStable(class04199::N, class02129::L);

    public class04199(class02129 class021292, class02108 class021082) {
        class021082.y().forEach(class021172 -> {
            if (!class021292.N(class021172)) {
                throw new IllegalArgumentException("Property '" + class021172.y() + "' not expected for event: '" + class021292.N() + "'");
            }
        });
        this.type = class021292;
        this.properties = class021082;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04199.class, "type;properties", "type", "properties"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04199.class, "type;properties", "type", "properties"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04199.class, "type;properties", "type", "properties"}, this);
    }

    public class02108 y() {
        return this.properties;
    }

    public class02129 N() {
        return this.type;
    }

    public TelemetryEvent N(TelemetrySession telemetrySession) {
        return this.type.N(telemetrySession, this.properties);
    }
}

