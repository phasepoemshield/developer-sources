/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04719
 *  minecraft.class05398
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04719;
import minecraft.class05398;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class04982
extends Record {
    private final String id;
    private final String name;
    private final String version;
    private final String author;
    private final String link;
    private final @Nullable String image;
    private final String trailer;
    private final String recommendedPlayers;
    private final class05398 type;
    private static final Logger z = LogUtils.getLogger();

    public String L() {
        return this.version;
    }

    public String M() {
        return this.trailer;
    }

    public class04982(String string, String string2, String string3, String string4, String string5, @Nullable String string6, String string7, String string8, class05398 class053982) {
        this.id = string;
        this.name = string2;
        this.version = string3;
        this.author = string4;
        this.link = string5;
        this.image = string6;
        this.trailer = string7;
        this.recommendedPlayers = string8;
        this.type = class053982;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04982.class, "id;name;version;author;link;image;trailer;recommendedPlayers;type", "id", "name", "version", "author", "link", "image", "trailer", "recommendedPlayers", "type"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04982.class, "id;name;version;author;link;image;trailer;recommendedPlayers;type", "id", "name", "version", "author", "link", "image", "trailer", "recommendedPlayers", "type"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04982.class, "id;name;version;author;link;image;trailer;recommendedPlayers;type", "id", "name", "version", "author", "link", "image", "trailer", "recommendedPlayers", "type"}, this);
    }

    public String B() {
        return this.recommendedPlayers;
    }

    public class05398 Z() {
        return this.type;
    }

    public String i() {
        return this.link;
    }

    public String u() {
        return this.author;
    }

    public String y() {
        return this.name;
    }

    public String N() {
        return this.id;
    }

    public static @Nullable class04982 N(JsonObject jsonObject) {
        try {
            String string = class04719.N((String)"type", (JsonObject)jsonObject, null);
            return new class04982(class04719.N((String)"id", (JsonObject)jsonObject, (String)""), class04719.N((String)"name", (JsonObject)jsonObject, (String)""), class04719.N((String)"version", (JsonObject)jsonObject, (String)""), class04719.N((String)"author", (JsonObject)jsonObject, (String)""), class04719.N((String)"link", (JsonObject)jsonObject, (String)""), class04719.N((String)"image", (JsonObject)jsonObject, null), class04719.N((String)"trailer", (JsonObject)jsonObject, (String)""), class04719.N((String)"recommendedPlayers", (JsonObject)jsonObject, (String)""), string == null ? class05398.field_19447 : class05398.valueOf((String)string));
        }
        catch (Exception exception) {
            z.error("Could not parse WorldTemplate", (Throwable)exception);
            return null;
        }
    }

    public @Nullable String R() {
        return this.image;
    }
}

