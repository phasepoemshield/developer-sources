/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 */
package fun.crashsystem.jdrpc.activity;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import java.util.Optional;

public record ActivitySecrets(String join, String spectate, String match) {
    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        Optional.ofNullable(this.join).ifPresent(arg_0 -> ActivitySecrets.lambda$toJson$0(json, arg_0));
        Optional.ofNullable(this.spectate).ifPresent(arg_0 -> ActivitySecrets.lambda$toJson$1(json, arg_0));
        Optional.ofNullable(this.match).ifPresent(arg_0 -> ActivitySecrets.lambda$toJson$2(json, arg_0));
        return json;
    }

    private static void lambda$toJson$0(JsonObject json, String v) {
        json.addProperty("join", v);
    }

    private static void lambda$toJson$1(JsonObject json, String v) {
        json.addProperty("spectate", v);
    }

    private static void lambda$toJson$2(JsonObject json, String v) {
        json.addProperty("match", v);
    }
}

