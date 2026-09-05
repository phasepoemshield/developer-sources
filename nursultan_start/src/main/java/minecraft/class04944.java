/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04719
 *  minecraft.class08314
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import minecraft.class04719;
import minecraft.class04959;
import minecraft.class08314;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class04944
extends Record {
    private final Instant startDate;
    private final int daysLeft;
    private final class04959 type;
    private static final Logger u = LogUtils.getLogger();

    public class04959 L() {
        return this.type;
    }

    public class04944(Instant instant, int n, class04959 class049592) {
        this.startDate = instant;
        this.daysLeft = n;
        this.type = class049592;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04944.class, "startDate;daysLeft;type", "startDate", "daysLeft", "type"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04944.class, "startDate;daysLeft;type", "startDate", "daysLeft", "type"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04944.class, "startDate;daysLeft;type", "startDate", "daysLeft", "type"}, this);
    }

    public int y() {
        return this.daysLeft;
    }

    private static class04959 y(@Nullable String string) {
        try {
            if (string != null) {
                return class04959.valueOf(string);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return class04959.field_19443;
    }

    public static class04944 N(String string) {
        try {
            JsonObject jsonObject = class08314.N((String)string).getAsJsonObject();
            return new class04944(class04719.y((String)"startDate", (JsonObject)jsonObject), class04719.N((String)"daysLeft", (JsonObject)jsonObject, (int)0), class04944.y(class04719.N((String)"subscriptionType", (JsonObject)jsonObject, null)));
        }
        catch (Exception exception) {
            u.error("Could not parse Subscription", (Throwable)exception);
            return new class04944(Instant.EPOCH, 0, class04959.field_19443);
        }
    }

    public Instant N() {
        return this.startDate;
    }
}

