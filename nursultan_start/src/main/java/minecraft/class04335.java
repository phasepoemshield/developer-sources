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

public final class class04335
extends Record {
    private final String direction;
    private final String protocolId;
    private final String packetId;

    public String L() {
        return this.packetId;
    }

    public class04335(String string, String string2, String string3) {
        this.direction = string;
        this.protocolId = string2;
        this.packetId = string3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04335.class, "direction;protocolId;packetId", "direction", "protocolId", "packetId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04335.class, "direction;protocolId;packetId", "direction", "protocolId", "packetId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04335.class, "direction;protocolId;packetId", "direction", "protocolId", "packetId"}, this);
    }

    public String y() {
        return this.protocolId;
    }

    public String N() {
        return this.direction;
    }

    public static class04335 N(RecordedEvent recordedEvent) {
        return new class04335(recordedEvent.getString("packetDirection"), recordedEvent.getString("protocolId"), recordedEvent.getString("packetId"));
    }
}

