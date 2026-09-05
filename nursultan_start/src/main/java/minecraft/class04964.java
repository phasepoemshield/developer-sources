/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08314
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.Set;
import minecraft.class08314;
import org.slf4j.Logger;

public final class class04964
extends Record {
    private final Set<String> ops;
    private static final Logger y = LogUtils.getLogger();

    public class04964(Set<String> set) {
        this.ops = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04964.class, "ops", "ops"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04964.class, "ops", "ops"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04964.class, "ops", "ops"}, this);
    }

    public Set<String> N() {
        return this.ops;
    }

    public static class04964 N(String string) {
        HashSet<String> hashSet = new HashSet<String>();
        try {
            JsonObject jsonObject = class08314.N((String)string).getAsJsonObject();
            JsonElement jsonElement = jsonObject.get("ops");
            if (jsonElement.isJsonArray()) {
                for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                    hashSet.add(jsonElement2.getAsString());
                }
            }
        }
        catch (Exception exception) {
            y.error("Could not parse Ops", (Throwable)exception);
        }
        return new class04964(hashSet);
    }
}

