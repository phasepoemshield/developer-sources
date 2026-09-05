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
import minecraft.class04719;
import minecraft.class08314;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class04979
extends Record {
    private final @Nullable String newsLink;
    private static final Logger y = LogUtils.getLogger();

    public class04979(@Nullable String string) {
        this.newsLink = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04979.class, "newsLink", "newsLink"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04979.class, "newsLink", "newsLink"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04979.class, "newsLink", "newsLink"}, this);
    }

    public @Nullable String N() {
        return this.newsLink;
    }

    public static class04979 N(String string) {
        String string2 = null;
        try {
            JsonObject jsonObject = class08314.N((String)string).getAsJsonObject();
            string2 = class04719.N((String)"newsLink", (JsonObject)jsonObject, null);
        }
        catch (Exception exception) {
            y.error("Could not parse RealmsNews", (Throwable)exception);
        }
        return new class04979(string2);
    }
}

