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
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04719;
import minecraft.class08314;
import org.slf4j.Logger;

public final class class04945
extends Record {
    private final String downloadLink;
    private final String resourcePackUrl;
    private final String resourcePackHash;
    private static final Logger u = LogUtils.getLogger();

    public String L() {
        return this.resourcePackHash;
    }

    public class04945(String string, String string2, String string3) {
        this.downloadLink = string;
        this.resourcePackUrl = string2;
        this.resourcePackHash = string3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04945.class, "downloadLink;resourcePackUrl;resourcePackHash", "downloadLink", "resourcePackUrl", "resourcePackHash"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04945.class, "downloadLink;resourcePackUrl;resourcePackHash", "downloadLink", "resourcePackUrl", "resourcePackHash"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04945.class, "downloadLink;resourcePackUrl;resourcePackHash", "downloadLink", "resourcePackUrl", "resourcePackHash"}, this);
    }

    public String y() {
        return this.resourcePackUrl;
    }

    public static class04945 N(String string) {
        JsonObject jsonObject = class08314.N((String)string).getAsJsonObject();
        try {
            return new class04945(class04719.N((String)"downloadLink", (JsonObject)jsonObject, (String)""), class04719.N((String)"resourcePackUrl", (JsonObject)jsonObject, (String)""), class04719.N((String)"resourcePackHash", (JsonObject)jsonObject, (String)""));
        }
        catch (Exception exception) {
            u.error("Could not parse WorldDownload", (Throwable)exception);
            return new class04945("", "", "");
        }
    }

    public String N() {
        return this.downloadLink;
    }
}

