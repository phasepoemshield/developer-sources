/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04719
 */
package minecraft;

import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03596;
import minecraft.class04719;

final class class03588
extends Record {
    final String url;
    final class03596 urlText;
    private static final String L = "url";
    private static final String u = "urlText";

    private class03588(String string, class03596 class035962) {
        this.url = string;
        this.urlText = class035962;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03588.class, "url;urlText", "url", "urlText"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03588.class, "url;urlText", "url", "urlText"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03588.class, "url;urlText", "url", "urlText"}, this);
    }

    public class03596 y() {
        return this.urlText;
    }

    public String N() {
        return this.url;
    }

    public static class03588 N(JsonObject jsonObject) {
        String string = class04719.N((String)L, (JsonObject)jsonObject);
        class03596 class035962 = (class03596)class04719.N((String)u, (JsonObject)jsonObject, class03596::N);
        return new class03588(string, class035962);
    }
}

