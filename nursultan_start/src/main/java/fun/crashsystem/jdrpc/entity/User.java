/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.ObjectUtils
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.StringUtils
 *  fun.crashsystem.jdrpc.util.JsonUtils
 */
package fun.crashsystem.jdrpc.entity;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.ObjectUtils;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.StringUtils;
import fun.crashsystem.jdrpc.util.JsonUtils;
import java.util.Objects;
import java.util.Optional;

public record User(String id, String username, String discriminator, String globalName, String avatar, boolean bot) {
    public User(String id, String username, String discriminator, String globalName, String avatar, boolean bot) {
        this.id = id;
        this.username = username;
        this.discriminator = (String)StringUtils.defaultIfBlank((CharSequence)discriminator, (CharSequence)"0");
        this.globalName = globalName;
        this.avatar = avatar;
        this.bot = bot;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User u = (User)((Object)o);
        return Objects.equals(this.id, u.id);
    }

    public String toString() {
        return "User:" + this.tag() + "(" + this.id + ")";
    }

    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    public String getName() {
        return this.username;
    }

    public String displayName() {
        return (String)ObjectUtils.defaultIfNull((Object)StringUtils.trimToNull((String)this.globalName), (Object)this.username);
    }

    public String tag() {
        return "0".equals(this.discriminator) ? this.username : this.username + "#" + this.discriminator;
    }

    public static User fromJson(JsonObject json) {
        return new User(JsonUtils.getString((JsonObject)json, (String)"id", (String)"0"), JsonUtils.getString((JsonObject)json, (String)"username", (String)"Unknown"), JsonUtils.getString((JsonObject)json, (String)"discriminator", (String)"0"), JsonUtils.optString((JsonObject)json, (String)"global_name").orElse(null), JsonUtils.optString((JsonObject)json, (String)"avatar").orElse(null), JsonUtils.getBoolean((JsonObject)json, (String)"bot", (boolean)false));
    }

    public Optional<String> avatarUrl() {
        return this.optionalAvatar().map(this::lambda$avatarUrl$0);
    }

    public String asMention() {
        return "<@" + this.id + ">";
    }

    public long idLong() {
        try {
            return Long.parseLong(this.id);
        }
        catch (NumberFormatException e) {
            throw new IllegalStateException("User ID is not a numeric Discord snowflake: " + this.id, e);
        }
    }

    public Optional<String> optionalGlobalName() {
        return Optional.ofNullable(this.globalName);
    }

    public String defaultAvatarUrl() {
        int index;
        try {
            index = "0".equals(this.discriminator) ? (int)((this.idLong() >> 22) % 6L) : Integer.parseInt(this.discriminator) % 5;
        }
        catch (RuntimeException e) {
            index = 0;
        }
        return "https://cdn.discordapp.com/embed/avatars/" + index + ".png";
    }

    private String lambda$avatarUrl$0(String a) {
        String ext = a.startsWith("a_") ? "gif" : "png";
        return "https://cdn.discordapp.com/avatars/" + this.id + "/" + a + "." + ext;
    }

    public Optional<String> optionalAvatar() {
        return Optional.ofNullable(this.avatar);
    }

    public String effectiveAvatarUrl() {
        return this.avatarUrl().orElseGet(this::defaultAvatarUrl);
    }
}

