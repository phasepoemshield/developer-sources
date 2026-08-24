/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.config;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u001d\u0010\u0018Jl\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u00020\nH\u00d6\u0081\u0004\u00a2\u0006\u0004\b#\u0010\u001aJ\u0011\u0010$\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b$\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b/\u0010\u0012R\u0017\u0010\r\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b1\u0010\u0018\u00a8\u00062"}, d2={"Loxxxde/\u062f\u0629;", "", "", "configId", "ownerName", "contentHash", "", "importedAt", "", "owned", "", "revision", "cloudName", "shared", "accountSynced", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZILjava/lang/String;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "()Z", "component6", "()I", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZILjava/lang/String;ZZ)Lkotakbaz/rain/config/CloudConfigOrigin;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getConfigId", "getOwnerName", "getContentHash", "J", "getImportedAt", "Z", "getOwned", "I", "getRevision", "getCloudName", "getShared", "getAccountSynced", "rain-visuals"})
public final class CloudConfigOrigin {
    private final int revision;
    private final long importedAt;
    @NotNull
    private final String contentHash;
    private final boolean owned;
    @NotNull
    private final String ownerName;
    @Nullable
    private final String cloudName;
    private final boolean shared;
    private final boolean accountSynced;
    @NotNull
    private final String configId;

    public final boolean component5() {
        return this.owned;
    }

    public final boolean component9() {
        return this.accountSynced;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void var1_1;
        int result = this.configId.hashCode();
        result = result * 31 + this.ownerName.hashCode();
        result = result * 31 + this.contentHash.hashCode();
        result = result * 31 + Long.hashCode(this.importedAt);
        result = result * 31 + Boolean.hashCode(this.owned);
        result = result * 31 + Integer.hashCode(this.revision);
        result = result * 31 + (this.cloudName == null ? 0 : this.cloudName.hashCode());
        result = result * 31 + Boolean.hashCode(this.shared);
        result = result * 31 + Boolean.hashCode(this.accountSynced);
        return (int)var1_1;
    }

    public static /* synthetic */ CloudConfigOrigin copy$default(CloudConfigOrigin cloudConfigOrigin, String string, String string2, String string3, long l, boolean bl, int n, String string4, boolean bl2, boolean bl3, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = cloudConfigOrigin.configId;
        }
        if ((n2 & 2) != 0) {
            string2 = cloudConfigOrigin.ownerName;
        }
        if ((n2 & 4) != 0) {
            string3 = cloudConfigOrigin.contentHash;
        }
        if ((n2 & 8) != 0) {
            l = cloudConfigOrigin.importedAt;
        }
        if ((n2 & 0x10) != 0) {
            bl = cloudConfigOrigin.owned;
        }
        if ((n2 & 0x20) != 0) {
            n = cloudConfigOrigin.revision;
        }
        if ((n2 & 0x40) != 0) {
            string4 = cloudConfigOrigin.cloudName;
        }
        if ((n2 & 0x80) != 0) {
            bl2 = cloudConfigOrigin.shared;
        }
        if ((n2 & 0x100) != 0) {
            bl3 = cloudConfigOrigin.accountSynced;
        }
        return cloudConfigOrigin.copy(string, string2, string3, l, bl, n, string4, bl2, bl3);
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudConfigOrigin)) {
            return false;
        }
        CloudConfigOrigin cloudConfigOrigin = (CloudConfigOrigin)other;
        if (!Intrinsics.areEqual(this.configId, cloudConfigOrigin.configId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ownerName, cloudConfigOrigin.ownerName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contentHash, cloudConfigOrigin.contentHash)) {
            return false;
        }
        if (this.importedAt != cloudConfigOrigin.importedAt) {
            return false;
        }
        if (this.owned != cloudConfigOrigin.owned) {
            return false;
        }
        if (this.revision != cloudConfigOrigin.revision) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cloudName, cloudConfigOrigin.cloudName)) {
            return false;
        }
        if (this.shared != cloudConfigOrigin.shared) {
            return false;
        }
        if (this.accountSynced != cloudConfigOrigin.accountSynced) {
            return false;
        }
        return true;
    }

    @Nullable
    public final String component7() {
        return this.cloudName;
    }

    public final long getImportedAt() {
        return this.importedAt;
    }

    public final boolean getShared() {
        return this.shared;
    }

    @NotNull
    public final String getOwnerName() {
        return this.ownerName;
    }

    @NotNull
    public final String component3() {
        return this.contentHash;
    }

    @NotNull
    public String toString() {
        return "CloudConfigOrigin(configId=" + this.configId + ", ownerName=" + this.ownerName + ", contentHash=" + this.contentHash + ", importedAt=" + this.importedAt + ", owned=" + this.owned + ", revision=" + this.revision + ", cloudName=" + this.cloudName + ", shared=" + this.shared + ", accountSynced=" + this.accountSynced + ")";
    }

    public final long component4() {
        return this.importedAt;
    }

    public CloudConfigOrigin(@NotNull String configId, @NotNull String ownerName, @NotNull String contentHash, long importedAt, boolean owned, int revision, @Nullable String cloudName, boolean shared, boolean accountSynced) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        this.configId = configId;
        this.ownerName = ownerName;
        this.contentHash = contentHash;
        this.importedAt = importedAt;
        this.owned = owned;
        this.revision = revision;
        this.cloudName = cloudName;
        this.shared = shared;
        this.accountSynced = accountSynced;
    }

    public /* synthetic */ CloudConfigOrigin(String string, String string2, String string3, long l, boolean bl, int n, String string4, boolean bl2, boolean bl3, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x10) != 0) {
            bl = false;
        }
        if ((n2 & 0x20) != 0) {
            n = 0;
        }
        if ((n2 & 0x40) != 0) {
            string4 = null;
        }
        if ((n2 & 0x80) != 0) {
            bl2 = false;
        }
        if ((n2 & 0x100) != 0) {
            bl3 = false;
        }
        this(string, string2, string3, l, bl, n, string4, bl2, bl3);
    }

    @NotNull
    public final String component1() {
        return this.configId;
    }

    @NotNull
    public final String getContentHash() {
        return this.contentHash;
    }

    @NotNull
    public final CloudConfigOrigin copy(@NotNull String configId, @NotNull String ownerName, @NotNull String contentHash, long importedAt, boolean owned, int revision, @Nullable String cloudName, boolean shared, boolean accountSynced) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        return new CloudConfigOrigin(configId, ownerName, contentHash, importedAt, owned, revision, cloudName, shared, accountSynced);
    }

    @NotNull
    public final String component2() {
        return this.ownerName;
    }

    public final boolean getAccountSynced() {
        return this.accountSynced;
    }

    public final int component6() {
        return this.revision;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final boolean component8() {
        return this.shared;
    }

    public final boolean getOwned() {
        return this.owned;
    }

    @Nullable
    public final String getCloudName() {
        return this.cloudName;
    }
}

