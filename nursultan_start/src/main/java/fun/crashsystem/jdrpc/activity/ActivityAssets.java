/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 */
package fun.crashsystem.jdrpc.activity;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import java.util.Optional;
import java.util.function.Consumer;

public record ActivityAssets(String largeImage, String largeText, String smallImage, String smallText) {
    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        Optional.ofNullable(this.largeImage).ifPresent(arg_0 -> ActivityAssets.lambda$toJson$0(json, arg_0));
        Optional.ofNullable(this.largeText).ifPresent(arg_0 -> ActivityAssets.lambda$toJson$1(json, arg_0));
        Optional.ofNullable(this.smallImage).ifPresent(arg_0 -> ActivityAssets.lambda$toJson$2(json, arg_0));
        Optional.ofNullable(this.smallText).ifPresent(arg_0 -> ActivityAssets.lambda$toJson$3(json, arg_0));
        return json;
    }

    public static void lambda$toJson$0(JsonObject json, String v) {
        json.addProperty("large_image", v);
    }

    public static void lambda$toJson$1(JsonObject json, String v) {
        json.addProperty("large_text", v);
    }

    public static void lambda$toJson$3(JsonObject json, String v) {
        json.addProperty("small_text", v);
    }

    public static void lambda$toJson$2(JsonObject json, String v) {
        json.addProperty("small_image", v);
    }

    final class Lambda0
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda0(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            ActivityAssets.lambda$toJson$0(this.arg$1, (String)object);
        }
    }

    final class Lambda1
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda1(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            ActivityAssets.lambda$toJson$1(this.arg$1, (String)object);
        }
    }

    final class Lambda2
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda2(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            ActivityAssets.lambda$toJson$2(this.arg$1, (String)object);
        }
    }

    final class Lambda3
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda3(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            ActivityAssets.lambda$toJson$3(this.arg$1, (String)object);
        }
    }
}

