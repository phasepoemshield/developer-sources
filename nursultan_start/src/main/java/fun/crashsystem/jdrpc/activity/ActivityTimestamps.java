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

public record ActivityTimestamps(Long start, Long end) {
    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        Optional.ofNullable(this.start).ifPresent(arg_0 -> ActivityTimestamps.lambda$toJson$0(json, arg_0));
        Optional.ofNullable(this.end).ifPresent(arg_0 -> ActivityTimestamps.lambda$toJson$1(json, arg_0));
        return json;
    }

    public static ActivityTimestamps startingAt(long epochSeconds) {
        return new ActivityTimestamps(epochSeconds, null);
    }

    public static ActivityTimestamps endingAt(long epochSeconds) {
        return new ActivityTimestamps(null, epochSeconds);
    }

    public static void lambda$toJson$0(JsonObject json, Long s) {
        json.addProperty("start", (Number)s);
    }

    public static void lambda$toJson$1(JsonObject json, Long e) {
        json.addProperty("end", (Number)e);
    }

    final class Lambda0
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda0(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            ActivityTimestamps.lambda$toJson$0(this.arg$1, (Long)object);
        }
    }

    final class Lambda1
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda1(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            ActivityTimestamps.lambda$toJson$1(this.arg$1, (Long)object);
        }
    }
}

