/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.social;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0005H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001c\u0010\u0013J\u0011\u0010\u001d\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0016\u00a8\u0006("}, d2={"Loxxxde/\u0634\u0642;", "", "", "id", "key", "", "maxActivations", "usedActivations", "remainingActivations", "", "revoked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()I", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Z)Lkotakbaz/rain/client/social/CloudConfigKey;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", "getKey", "Ljava/lang/Integer;", "getMaxActivations", "I", "getUsedActivations", "getRemainingActivations", "Z", "getRevoked", "rain-visuals"})
public final class CloudConfigKey {
    @Nullable
    private final Integer maxActivations;
    private final int usedActivations;
    @NotNull
    private final String key;
    @NotNull
    private final String id;
    private final boolean revoked;
    @Nullable
    private final Integer remainingActivations;

    public final int getUsedActivations() {
        return this.usedActivations;
    }

    @NotNull
    public String toString() {
        return "CloudConfigKey(id=" + this.id + ", key=" + this.key + ", maxActivations=" + this.maxActivations + ", usedActivations=" + this.usedActivations + ", remainingActivations=" + this.remainingActivations + ", revoked=" + this.revoked + ")";
    }

    @NotNull
    public final CloudConfigKey copy(@NotNull String id, @NotNull String key, @Nullable Integer maxActivations, int usedActivations, @Nullable Integer remainingActivations, boolean revoked) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        return new CloudConfigKey(id, key, maxActivations, usedActivations, remainingActivations, revoked);
    }

    public CloudConfigKey(@NotNull String id, @NotNull String key, @Nullable Integer maxActivations, int usedActivations, @Nullable Integer remainingActivations, boolean revoked) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        this.id = id;
        this.key = key;
        this.maxActivations = maxActivations;
        this.usedActivations = usedActivations;
        this.remainingActivations = remainingActivations;
        this.revoked = revoked;
    }

    @Nullable
    public final Integer getMaxActivations() {
        return this.maxActivations;
    }

    public final int component4() {
        return this.usedActivations;
    }

    @NotNull
    public final String component2() {
        return this.key;
    }

    public final boolean getRevoked() {
        return this.revoked;
    }

    public final boolean component6() {
        return this.revoked;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudConfigKey)) {
            return false;
        }
        CloudConfigKey cloudConfigKey = (CloudConfigKey)other;
        if (!Intrinsics.areEqual(this.id, cloudConfigKey.id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.key, cloudConfigKey.key)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.maxActivations, cloudConfigKey.maxActivations)) {
            return false;
        }
        if (this.usedActivations != cloudConfigKey.usedActivations) {
            return false;
        }
        if (!Intrinsics.areEqual(this.remainingActivations, cloudConfigKey.remainingActivations)) {
            return false;
        }
        if (this.revoked != cloudConfigKey.revoked) {
            return false;
        }
        return true;
    }

    @Nullable
    public final Integer getRemainingActivations() {
        return this.remainingActivations;
    }

    public int hashCode() {
        int result = this.id.hashCode();
        result = result * 31 + this.key.hashCode();
        result = result * 31 + (this.maxActivations == null ? 0 : ((Object)this.maxActivations).hashCode());
        result = result * 31 + Integer.hashCode(this.usedActivations);
        result = result * 31 + (this.remainingActivations == null ? 0 : ((Object)this.remainingActivations).hashCode());
        int n = result * 31 + Boolean.hashCode(this.revoked);
        return n;
    }

    @Nullable
    public final Integer component5() {
        return this.remainingActivations;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public static /* synthetic */ CloudConfigKey copy$default(CloudConfigKey cloudConfigKey, String string, String string2, Integer n, int n2, Integer n3, boolean bl, int n4, Object object) {
        if ((n4 & 1) != 0) {
            string = cloudConfigKey.id;
        }
        if ((n4 & 2) != 0) {
            string2 = cloudConfigKey.key;
        }
        if ((n4 & 4) != 0) {
            n = cloudConfigKey.maxActivations;
        }
        if ((n4 & 8) != 0) {
            n2 = cloudConfigKey.usedActivations;
        }
        if ((n4 & 0x10) != 0) {
            n3 = cloudConfigKey.remainingActivations;
        }
        if ((n4 & 0x20) != 0) {
            bl = cloudConfigKey.revoked;
        }
        return cloudConfigKey.copy(string, string2, n, n2, n3, bl);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final Integer component3() {
        return this.maxActivations;
    }
}

