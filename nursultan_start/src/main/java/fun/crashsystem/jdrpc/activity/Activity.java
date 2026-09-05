/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonArray
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 *  fun.crashsystem.jdrpc.util.UrlValidator
 */
package fun.crashsystem.jdrpc.activity;

import fun.crashsystem.jdrpc.activity.ActivityAssets;
import fun.crashsystem.jdrpc.activity.ActivityButton;
import fun.crashsystem.jdrpc.activity.ActivityParty;
import fun.crashsystem.jdrpc.activity.ActivitySecrets;
import fun.crashsystem.jdrpc.activity.ActivityTimestamps;
import fun.crashsystem.jdrpc.activity.ActivityType;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonArray;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.util.UrlValidator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public record Activity(ActivityType type, String state, String details, String url, ActivityTimestamps timestamps, ActivityAssets assets, ActivityParty party, ActivitySecrets secrets, List<ActivityButton> buttons, Boolean instance) {
    public Activity(ActivityType type, String state, String details, String url, ActivityTimestamps timestamps, ActivityAssets assets, ActivityParty party, ActivitySecrets secrets, List<ActivityButton> buttons, Boolean instance) {
        this.type = type != null ? type : ActivityType.PLAYING;
        this.state = state;
        this.details = details;
        this.url = url;
        this.timestamps = timestamps;
        this.assets = assets;
        this.party = party;
        this.secrets = secrets;
        this.buttons = buttons != null ? List.copyOf(buttons) : null;
        this.instance = instance;
        if (this.state != null && (this.state.length() < 2 || this.state.length() > 128)) {
            throw new IllegalArgumentException("Activity state must be 2-128 characters, got " + this.state.length());
        }
        if (this.details != null && (this.details.length() < 2 || this.details.length() > 128)) {
            throw new IllegalArgumentException("Activity details must be 2-128 characters, got " + this.details.length());
        }
        if (this.buttons != null && this.buttons.size() > 2) {
            throw new IllegalArgumentException("Activity supports a maximum of 2 buttons, got " + this.buttons.size());
        }
        if (this.type == ActivityType.STREAMING && this.url == null) {
            throw new IllegalArgumentException("Streaming activity type requires a URL");
        }
        if (this.type == ActivityType.STREAMING) {
            UrlValidator.requireAbsoluteHttpsUrl((String)this.url, (String)"Streaming URL", (int)-1);
        }
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        json.addProperty("type", (Number)this.type.value());
        this.optionalState().ifPresent(arg_0 -> Activity.lambda$toJson$0(json, arg_0));
        this.optionalDetails().ifPresent(arg_0 -> Activity.lambda$toJson$1(json, arg_0));
        this.optionalUrl().ifPresent(arg_0 -> Activity.lambda$toJson$2(json, arg_0));
        this.optionalTimestamps().ifPresent(arg_0 -> Activity.lambda$toJson$3(json, arg_0));
        this.optionalAssets().ifPresent(arg_0 -> Activity.lambda$toJson$4(json, arg_0));
        this.optionalParty().ifPresent(arg_0 -> Activity.lambda$toJson$5(json, arg_0));
        this.optionalSecrets().ifPresent(arg_0 -> Activity.lambda$toJson$6(json, arg_0));
        this.optionalButtons().filter(Activity::lambda$toJson$7).ifPresent(arg_0 -> Activity.lambda$toJson$9(json, arg_0));
        this.optionalInstance().ifPresent(arg_0 -> Activity.lambda$toJson$10(json, arg_0));
        return json;
    }

    public Optional<ActivitySecrets> optionalSecrets() {
        return Optional.ofNullable(this.secrets);
    }

    public static void lambda$toJson$0(JsonObject json, String s) {
        json.addProperty("state", s);
    }

    public static void lambda$toJson$1(JsonObject json, String d) {
        json.addProperty("details", d);
    }

    public static void lambda$toJson$3(JsonObject json, ActivityTimestamps t) {
        json.add("timestamps", (JsonElement)t.toJson());
    }

    public Optional<String> optionalUrl() {
        return Optional.ofNullable(this.url);
    }

    public Optional<List<ActivityButton>> optionalButtons() {
        return Optional.ofNullable(this.buttons);
    }

    public Optional<Boolean> optionalInstance() {
        return Optional.ofNullable(this.instance);
    }

    public Optional<ActivityTimestamps> optionalTimestamps() {
        return Optional.ofNullable(this.timestamps);
    }

    public static void lambda$toJson$6(JsonObject json, ActivitySecrets s) {
        json.add("secrets", (JsonElement)s.toJson());
    }

    public Optional<ActivityParty> optionalParty() {
        return Optional.ofNullable(this.party);
    }

    public Optional<String> optionalState() {
        return Optional.ofNullable(this.state);
    }

    public static void lambda$toJson$10(JsonObject json, Boolean i) {
        json.addProperty("instance", i);
    }

    public static void lambda$toJson$2(JsonObject json, String u) {
        json.addProperty("url", u);
    }

    public Optional<String> optionalDetails() {
        return Optional.ofNullable(this.details);
    }

    public Optional<ActivityAssets> optionalAssets() {
        return Optional.ofNullable(this.assets);
    }

    public static void lambda$toJson$9(JsonObject json, List b) {
        JsonArray arr = new JsonArray();
        b.forEach(arg_0 -> Activity.lambda$toJson$8(arr, arg_0));
        json.add("buttons", (JsonElement)arr);
    }

    public static void lambda$toJson$8(JsonArray arr, ActivityButton btn) {
        arr.add((JsonElement)btn.toJson());
    }

    public static boolean lambda$toJson$7(List b) {
        return !b.isEmpty();
    }

    public static void lambda$toJson$4(JsonObject json, ActivityAssets a) {
        json.add("assets", (JsonElement)a.toJson());
    }

    public static void lambda$toJson$5(JsonObject json, ActivityParty p) {
        json.add("party", (JsonElement)p.toJson());
    }

    public final class Builder {
        private ActivityType type = ActivityType.PLAYING;
        private String state;
        private String details;
        private String url;
        private ActivityTimestamps timestamps;
        private ActivityAssets assets;
        private ActivityParty party;
        private ActivitySecrets secrets;
        private final List<ActivityButton> buttons = new ArrayList<ActivityButton>();
        private Boolean instance;

        public Builder setType(ActivityType type) {
            this.type = type;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Activity build() {
            return new Activity(this.type, this.state, this.details, this.url, this.timestamps, this.assets, this.party, this.secrets, this.buttons.isEmpty() ? null : this.buttons, this.instance);
        }

        public Builder addButton(String label, String url) {
            this.buttons.add(new ActivityButton(label, url));
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setParty(String id, int currentSize, int maxSize) {
            this.party = ActivityParty.of(id, currentSize, maxSize);
            return this;
        }

        public Builder setParty(String id, int currentSize, int maxSize, int privacy) {
            this.party = ActivityParty.of(id, currentSize, maxSize, privacy);
            return this;
        }

        public Builder setAssets(ActivityAssets assets) {
            this.assets = assets;
            return this;
        }

        public Builder setSecrets(ActivitySecrets secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }

        public Builder setStartTimestamp(long epochSeconds) {
            this.timestamps = new ActivityTimestamps(epochSeconds, this.timestamps != null ? this.timestamps.end() : null);
            return this;
        }

        public Builder setEndTimestamp(long epochSeconds) {
            this.timestamps = new ActivityTimestamps(this.timestamps != null ? this.timestamps.start() : null, epochSeconds);
            return this;
        }

        public Builder setSmallImage(String key, String text) {
            this.assets = new ActivityAssets(this.assets != null ? this.assets.largeImage() : null, this.assets != null ? this.assets.largeText() : null, key, text);
            return this;
        }

        public Builder setLargeImage(String key, String text) {
            this.assets = new ActivityAssets(key, text, this.assets != null ? this.assets.smallImage() : null, this.assets != null ? this.assets.smallText() : null);
            return this;
        }

        public Builder setLargeImage(String key) {
            this.assets = new ActivityAssets(key, this.assets != null ? this.assets.largeText() : null, this.assets != null ? this.assets.smallImage() : null, this.assets != null ? this.assets.smallText() : null);
            return this;
        }

        public Builder setInstance(boolean instance) {
            this.instance = instance;
            return this;
        }

        public Builder setTimestamps(ActivityTimestamps timestamps) {
            this.timestamps = timestamps;
            return this;
        }
    }

    final class Lambda0
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda0(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$1(this.arg$1, (String)object);
        }
    }

    final class Lambda1
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda1(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$2(this.arg$1, (String)object);
        }
    }

    final class Lambda10
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda10(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$10(this.arg$1, (Boolean)object);
        }
    }

    final class Lambda2
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda2(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$3(this.arg$1, (ActivityTimestamps)((Object)object));
        }
    }

    final class Lambda3
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda3(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$0(this.arg$1, (String)object);
        }
    }

    final class Lambda4
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda4(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$4(this.arg$1, (ActivityAssets)((Object)object));
        }
    }

    final class Lambda5
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda5(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$5(this.arg$1, (ActivityParty)((Object)object));
        }
    }

    final class Lambda6
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda6(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$6(this.arg$1, (ActivitySecrets)((Object)object));
        }
    }

    final class Lambda7
    implements Predicate {
        private Lambda7() {
        }

        public boolean test(Object object) {
            return Activity.lambda$toJson$7((List)object);
        }
    }

    final class Lambda8
    implements Consumer {
        private final JsonObject arg$1;

        private Lambda8(JsonObject jsonObject) {
            this.arg$1 = jsonObject;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$9(this.arg$1, (List)object);
        }
    }

    final class Lambda9
    implements Consumer {
        private final JsonArray arg$1;

        private Lambda9(JsonArray jsonArray) {
            this.arg$1 = jsonArray;
        }

        public void accept(Object object) {
            Activity.lambda$toJson$8(this.arg$1, (ActivityButton)((Object)object));
        }
    }
}

