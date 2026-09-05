/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class04155
 */
package net.fabricmc.fabric.impl.networking.payload;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class04155;
import net.fabricmc.fabric.impl.networking.payload.PayloadHelper;

public final class PacketByteBufLoginQueryRequestPayload
extends Record
implements class04155 {
    private final class01894 id;
    private final class00667 data;

    public PacketByteBufLoginQueryRequestPayload(class01894 class018942, class00667 class006672) {
        this.id = class018942;
        this.data = class006672;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{PacketByteBufLoginQueryRequestPayload.class, "id;data", "id", "data"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{PacketByteBufLoginQueryRequestPayload.class, "id;data", "id", "data"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{PacketByteBufLoginQueryRequestPayload.class, "id;data", "id", "data"}, this);
    }

    public class00667 data() {
        return this.data;
    }

    public void method_52296(class00667 class006672) {
        PayloadHelper.write(class006672, this.data());
    }

    public class01894 comp_1571() {
        return this.id;
    }
}

