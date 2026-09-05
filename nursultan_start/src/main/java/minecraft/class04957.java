/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04719
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.UUID;
import minecraft.class04719;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class04957
extends Record {
    private final String invitationId;
    private final String realmName;
    private final String realmOwnerName;
    private final UUID realmOwnerUuid;
    private final Instant date;
    private static final Logger R = LogUtils.getLogger();

    public String L() {
        return this.realmOwnerName;
    }

    public class04957(String string, String string2, String string3, UUID uUID, Instant instant) {
        this.invitationId = string;
        this.realmName = string2;
        this.realmOwnerName = string3;
        this.realmOwnerUuid = uUID;
        this.date = instant;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04957.class, "invitationId;realmName;realmOwnerName;realmOwnerUuid;date", "invitationId", "realmName", "realmOwnerName", "realmOwnerUuid", "date"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04957.class, "invitationId;realmName;realmOwnerName;realmOwnerUuid;date", "invitationId", "realmName", "realmOwnerName", "realmOwnerUuid", "date"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04957.class, "invitationId;realmName;realmOwnerName;realmOwnerUuid;date", "invitationId", "realmName", "realmOwnerName", "realmOwnerUuid", "date"}, this);
    }

    public Instant i() {
        return this.date;
    }

    public UUID u() {
        return this.realmOwnerUuid;
    }

    public String y() {
        return this.realmName;
    }

    public String N() {
        return this.invitationId;
    }

    public static @Nullable class04957 N(JsonObject jsonObject) {
        try {
            return new class04957(class04719.N((String)"invitationId", (JsonObject)jsonObject, (String)""), class04719.N((String)"worldName", (JsonObject)jsonObject, (String)""), class04719.N((String)"worldOwnerName", (JsonObject)jsonObject, (String)""), class04719.N((String)"worldOwnerUuid", (JsonObject)jsonObject, (UUID)class07536.R), class04719.y((String)"date", (JsonObject)jsonObject));
        }
        catch (Exception exception) {
            R.error("Could not parse PendingInvite", (Throwable)exception);
            return null;
        }
    }
}

