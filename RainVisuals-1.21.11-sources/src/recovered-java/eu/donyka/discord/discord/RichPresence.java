/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord.discord;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import eu.donyka.discord.discord.RichPresenceBuilder;

public class RichPresence {
    public String spectateSecret;
    public int partyMax;
    public String smallImageKey;
    public String state;
    public String details;
    public int partySize;
    public String button_url_2;
    public String smallImageText;
    public String largeImageKey;
    public String button_label_2;
    public int instance;
    public long startTimestamp;
    public String partyId;
    public String button_label_1;
    public String button_url_1;
    public String partyPrivacy;
    public long endTimestamp;
    public String largeImageText;
    public String matchSecret;
    public String joinSecret;

    public static RichPresenceBuilder builder() {
        return RichPresenceBuilder.builder();
    }

    private boolean isNotNullOrEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    /*
     * WARNING - void declaration
     */
    public JsonObject toJson(long pid, long nonce) {
        void var5_3;
        void var6_4;
        JsonObject activity;
        JsonObject args2;
        JsonObject data;
        block25: {
            block24: {
                data = new JsonObject();
                data.addProperty("nonce", nonce);
                data.addProperty("cmd", "SET_ACTIVITY");
                args2 = new JsonObject();
                args2.addProperty("pid", pid);
                activity = new JsonObject();
                if (this.isNotNullOrEmpty(this.state)) {
                    activity.addProperty("state", this.state);
                }
                if (this.isNotNullOrEmpty(this.details)) {
                    activity.addProperty("details", this.details);
                }
                if (this.startTimestamp != 0L) break block24;
                if (this.endTimestamp == 0L) break block25;
            }
            JsonObject timestamps = new JsonObject();
            if (this.startTimestamp != 0L) {
                timestamps.addProperty("start", this.startTimestamp);
            }
            if (this.endTimestamp != 0L) {
                timestamps.addProperty("end", this.endTimestamp);
            }
            activity.add("timestamps", timestamps);
        }
        if (this.isNotNullOrEmpty(this.largeImageKey) || this.isNotNullOrEmpty(this.largeImageText) || this.isNotNullOrEmpty(this.smallImageKey) || this.isNotNullOrEmpty(this.smallImageText)) {
            JsonObject assets = new JsonObject();
            if (this.isNotNullOrEmpty(this.largeImageKey)) {
                assets.addProperty("large_image", this.largeImageKey);
            }
            if (this.isNotNullOrEmpty(this.largeImageText)) {
                assets.addProperty("large_text", this.largeImageText);
            }
            if (this.isNotNullOrEmpty(this.smallImageKey)) {
                assets.addProperty("small_image", this.smallImageKey);
            }
            if (this.isNotNullOrEmpty(this.smallImageText)) {
                assets.addProperty("small_text", this.smallImageText);
            }
            activity.add("assets", assets);
        }
        if (this.isNotNullOrEmpty(this.partyId) || this.partySize > 0 || this.partyMax > 0) {
            JsonObject party = new JsonObject();
            if (this.isNotNullOrEmpty(this.partyId)) {
                party.addProperty("id", this.partyId);
            }
            if (this.partySize != 0) {
                JsonArray size = new JsonArray();
                size.add(this.partySize);
                if (this.partyMax > 0) {
                    size.add(this.partyMax);
                }
                party.add("size", size);
            }
            if (this.isNotNullOrEmpty(this.partyPrivacy)) {
                party.addProperty("privacy", this.partyPrivacy);
            }
            activity.add("party", party);
        }
        if (this.isNotNullOrEmpty(this.matchSecret) || this.isNotNullOrEmpty(this.spectateSecret) || this.isNotNullOrEmpty(this.joinSecret)) {
            JsonObject secrets = new JsonObject();
            if (this.isNotNullOrEmpty(this.matchSecret)) {
                secrets.addProperty("match", this.matchSecret);
            }
            if (this.isNotNullOrEmpty(this.joinSecret)) {
                secrets.addProperty("join", this.joinSecret);
            }
            if (this.isNotNullOrEmpty(this.spectateSecret)) {
                secrets.addProperty("spectate", this.spectateSecret);
            }
            activity.add("secrets", secrets);
        }
        JsonArray buttons = new JsonArray();
        if (this.isNotNullOrEmpty(this.button_label_1) && this.isNotNullOrEmpty(this.button_url_1)) {
            JsonObject btn1 = new JsonObject();
            btn1.addProperty("label", this.button_label_1.substring(0, Math.min(this.button_label_1.length(), 32)));
            btn1.addProperty("url", this.button_url_1);
            buttons.add(btn1);
        }
        if (this.isNotNullOrEmpty(this.button_label_2) && this.isNotNullOrEmpty(this.button_url_2)) {
            void var9_7;
            JsonObject btn2 = new JsonObject();
            btn2.addProperty("label", this.button_label_2.substring(0, Math.min(this.button_label_2.length(), 32)));
            btn2.addProperty("url", this.button_url_2);
            buttons.add((JsonElement)var9_7);
        }
        if (buttons.size() > 0) {
            activity.add("buttons", buttons);
        }
        activity.addProperty("type", 0);
        activity.addProperty("instance", this.instance != 0);
        args2.add("activity", activity);
        data.add("args", (JsonElement)var6_4);
        return var5_3;
    }
}

