/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.social;

import com.google.gson.JsonObject;
import java.util.List;
import kotakbaz.rain.client.social.CloudConfigKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fH\u00c6\u0003\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003\u00a2\u0006\u0004\b\u001f\u0010 Jp\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0001\u00a2\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u00020\nH\u00d6\u0081\u0004\u00a2\u0006\u0004\b&\u0010\u001cJ\u0011\u0010'\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b'\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006\u00a2\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u0010 \u00a8\u00066"}, d2={"Loxxxde/\u0636\u063a;", "", "", "id", "ownerName", "name", "author", "contentHash", "Lcom/google/gson/JsonObject;", "payload", "", "revision", "", "revoked", "", "Loxxxde/\u0634\u0642;", "keys", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;IZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/google/gson/JsonObject;", "component7", "()I", "component8", "()Z", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;IZLjava/util/List;)Lkotakbaz/rain/client/social/CloudConfigRecord;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", "getOwnerName", "getName", "getAuthor", "getContentHash", "Lcom/google/gson/JsonObject;", "getPayload", "I", "getRevision", "Z", "getRevoked", "Ljava/util/List;", "getKeys", "rain-visuals"})
public final class CloudConfigRecord {
    @NotNull
    private final String name;
    @NotNull
    private final String ownerName;
    @NotNull
    private final String id;
    @NotNull
    private final String author;
    @NotNull
    private final String contentHash;
    @NotNull
    private final List<CloudConfigKey> keys;
    private final int revision;
    @NotNull
    private final JsonObject payload;
    private final boolean revoked;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudConfigRecord)) {
            return false;
        }
        CloudConfigRecord cloudConfigRecord = (CloudConfigRecord)other;
        if (!Intrinsics.areEqual(this.id, cloudConfigRecord.id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ownerName, cloudConfigRecord.ownerName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, cloudConfigRecord.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.author, cloudConfigRecord.author)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contentHash, cloudConfigRecord.contentHash)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.payload, cloudConfigRecord.payload)) {
            return false;
        }
        if (this.revision != cloudConfigRecord.revision) {
            return false;
        }
        if (this.revoked != cloudConfigRecord.revoked) {
            return false;
        }
        if (!Intrinsics.areEqual(this.keys, cloudConfigRecord.keys)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final List<CloudConfigKey> getKeys() {
        return this.keys;
    }

    @NotNull
    public final String component2() {
        return this.ownerName;
    }

    public final int getRevision() {
        return this.revision;
    }

    @NotNull
    public final String getContentHash() {
        return this.contentHash;
    }

    public final int component7() {
        return this.revision;
    }

    @NotNull
    public final String getOwnerName() {
        return this.ownerName;
    }

    @NotNull
    public final CloudConfigRecord copy(@NotNull String id, @NotNull String ownerName, @NotNull String name, @NotNull String author, @NotNull String contentHash, @NotNull JsonObject payload, int revision, boolean revoked, @NotNull List<CloudConfigKey> keys2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(keys2, "keys");
        return new CloudConfigRecord(id, ownerName, name, author, contentHash, payload, revision, revoked, keys2);
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final JsonObject getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getAuthor() {
        return this.author;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final List<CloudConfigKey> component9() {
        return this.keys;
    }

    @NotNull
    public final JsonObject component6() {
        return this.payload;
    }

    public static /* synthetic */ CloudConfigRecord copy$default(CloudConfigRecord cloudConfigRecord, String string, String string2, String string3, String string4, String string5, JsonObject jsonObject, int n, boolean bl, List list, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = cloudConfigRecord.id;
        }
        if ((n2 & 2) != 0) {
            string2 = cloudConfigRecord.ownerName;
        }
        if ((n2 & 4) != 0) {
            string3 = cloudConfigRecord.name;
        }
        if ((n2 & 8) != 0) {
            string4 = cloudConfigRecord.author;
        }
        if ((n2 & 0x10) != 0) {
            string5 = cloudConfigRecord.contentHash;
        }
        if ((n2 & 0x20) != 0) {
            jsonObject = cloudConfigRecord.payload;
        }
        if ((n2 & 0x40) != 0) {
            n = cloudConfigRecord.revision;
        }
        if ((n2 & 0x80) != 0) {
            bl = cloudConfigRecord.revoked;
        }
        if ((n2 & 0x100) != 0) {
            list = cloudConfigRecord.keys;
        }
        return cloudConfigRecord.copy(string, string2, string3, string4, string5, jsonObject, n, bl, list);
    }

    public final boolean getRevoked() {
        return this.revoked;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String component5() {
        return this.contentHash;
    }

    public CloudConfigRecord(@NotNull String id, @NotNull String ownerName, @NotNull String name, @NotNull String author, @NotNull String contentHash, @NotNull JsonObject payload, int revision, boolean revoked, @NotNull List<CloudConfigKey> keys2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(keys2, "keys");
        this.id = id;
        this.ownerName = ownerName;
        this.name = name;
        this.author = author;
        this.contentHash = contentHash;
        this.payload = payload;
        this.revision = revision;
        this.revoked = revoked;
        this.keys = keys2;
    }

    @NotNull
    public final String component4() {
        return this.author;
    }

    public int hashCode() {
        int result = this.id.hashCode();
        result = result * 31 + this.ownerName.hashCode();
        result = result * 31 + this.name.hashCode();
        result = result * 31 + this.author.hashCode();
        result = result * 31 + this.contentHash.hashCode();
        result = result * 31 + this.payload.hashCode();
        result = result * 31 + Integer.hashCode(this.revision);
        result = result * 31 + Boolean.hashCode(this.revoked);
        result = result * 31 + ((Object)this.keys).hashCode();
        return result;
    }

    public final boolean component8() {
        return this.revoked;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        return "CloudConfigRecord(id=" + this.id + ", ownerName=" + this.ownerName + ", name=" + this.name + ", author=" + this.author + ", contentHash=" + this.contentHash + ", payload=" + this.payload + ", revision=" + this.revision + ", revoked=" + this.revoked + ", keys=" + this.keys + ")";
    }
}

