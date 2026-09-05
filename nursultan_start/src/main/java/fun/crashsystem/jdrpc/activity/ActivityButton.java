/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 *  fun.crashsystem.jdrpc.util.UrlValidator
 */
package fun.crashsystem.jdrpc.activity;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.util.UrlValidator;

public record ActivityButton(String label, String url) {
    public ActivityButton {
        if (label == null || label.isEmpty() || label.length() > 32) {
            throw new IllegalArgumentException("Button label must be 1-32 characters, got: " + String.valueOf(label == null ? "null" : Integer.valueOf(label.length())));
        }
        if (url == null || url.length() > 256) {
            throw new IllegalArgumentException("Button URL must be at most 256 characters");
        }
        UrlValidator.requireAbsoluteHttpsUrl((String)url, (String)"Button URL", (int)256);
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        json.addProperty("label", this.label);
        json.addProperty("url", this.url);
        return json;
    }
}

