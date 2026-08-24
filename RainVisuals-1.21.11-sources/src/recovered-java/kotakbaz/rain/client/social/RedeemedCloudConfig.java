/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.social;

import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u00020\u001dH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b \u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017\u00a8\u0006+"}, d2={"Loxxxde/\u0636\u064c;", "", "", "configId", "name", "author", "ownerName", "contentHash", "Lcom/google/gson/JsonObject;", "payload", "", "alreadyActivated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/google/gson/JsonObject;", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;Z)Lkotakbaz/rain/client/social/RedeemedCloudConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfigId", "getName", "getAuthor", "getOwnerName", "getContentHash", "Lcom/google/gson/JsonObject;", "getPayload", "Z", "getAlreadyActivated", "rain-visuals"})
public final class RedeemedCloudConfig {
    @NotNull
    private final String author;
    @NotNull
    private final String configId;
    private final boolean alreadyActivated;
    @NotNull
    private final String ownerName;
    @NotNull
    private final String contentHash;
    @NotNull
    private final String name;
    @NotNull
    private final JsonObject payload;

    @NotNull
    public final String getAuthor() {
        return this.author;
    }

    @NotNull
    public String toString() {
        return "RedeemedCloudConfig(configId=" + this.configId + ", name=" + this.name + ", author=" + this.author + ", ownerName=" + this.ownerName + ", contentHash=" + this.contentHash + ", payload=" + this.payload + ", alreadyActivated=" + this.alreadyActivated + ")";
    }

    @NotNull
    public final String component5() {
        return this.contentHash;
    }

    @NotNull
    public final String component1() {
        return this.configId;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String getOwnerName() {
        return this.ownerName;
    }

    public final boolean getAlreadyActivated() {
        return this.alreadyActivated;
    }

    public RedeemedCloudConfig(@NotNull String configId, @NotNull String name, @NotNull String author, @NotNull String ownerName, @NotNull String contentHash, @NotNull JsonObject payload, boolean alreadyActivated) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.configId = configId;
        this.name = name;
        this.author = author;
        this.ownerName = ownerName;
        this.contentHash = contentHash;
        this.payload = payload;
        this.alreadyActivated = alreadyActivated;
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    @NotNull
    public final String component3() {
        return this.author;
    }

    public int hashCode() {
        int result = this.configId.hashCode();
        result = result * 31 + this.name.hashCode();
        result = result * 31 + this.author.hashCode();
        result = result * 31 + this.ownerName.hashCode();
        result = result * 31 + this.contentHash.hashCode();
        result = result * 31 + this.payload.hashCode();
        result = result * 31 + Boolean.hashCode(this.alreadyActivated);
        return result;
    }

    @NotNull
    public final String component4() {
        return this.ownerName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean component7() {
        return this.alreadyActivated;
    }

    @NotNull
    public final JsonObject component6() {
        return this.payload;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedeemedCloudConfig)) {
            return false;
        }
        RedeemedCloudConfig redeemedCloudConfig = (RedeemedCloudConfig)other;
        if (!Intrinsics.areEqual(this.configId, redeemedCloudConfig.configId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, redeemedCloudConfig.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.author, redeemedCloudConfig.author)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ownerName, redeemedCloudConfig.ownerName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contentHash, redeemedCloudConfig.contentHash)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.payload, redeemedCloudConfig.payload)) {
            return false;
        }
        if (this.alreadyActivated != redeemedCloudConfig.alreadyActivated) {
            return false;
        }
        return true;
    }

    @NotNull
    public final String getContentHash() {
        return this.contentHash;
    }

    @NotNull
    public final JsonObject getPayload() {
        return this.payload;
    }

    @NotNull
    public final RedeemedCloudConfig copy(@NotNull String configId, @NotNull String name, @NotNull String author, @NotNull String ownerName, @NotNull String contentHash, @NotNull JsonObject payload, boolean alreadyActivated) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new RedeemedCloudConfig(configId, name, author, ownerName, contentHash, payload, alreadyActivated);
    }

    public static /* synthetic */ RedeemedCloudConfig copy$default(RedeemedCloudConfig redeemedCloudConfig, String string, String string2, String string3, String string4, String string5, JsonObject jsonObject, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            string = redeemedCloudConfig.configId;
        }
        if ((n & 2) != 0) {
            string2 = redeemedCloudConfig.name;
        }
        if ((n & 4) != 0) {
            string3 = redeemedCloudConfig.author;
        }
        if ((n & 8) != 0) {
            string4 = redeemedCloudConfig.ownerName;
        }
        if ((n & 0x10) != 0) {
            string5 = redeemedCloudConfig.contentHash;
        }
        if ((n & 0x20) != 0) {
            jsonObject = redeemedCloudConfig.payload;
        }
        if ((n & 0x40) != 0) {
            bl = redeemedCloudConfig.alreadyActivated;
        }
        return redeemedCloudConfig.copy(string, string2, string3, string4, string5, jsonObject, bl);
    }
}

