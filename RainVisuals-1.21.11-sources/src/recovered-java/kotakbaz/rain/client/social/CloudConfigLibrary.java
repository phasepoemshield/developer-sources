/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.social;

import java.util.List;
import kotakbaz.rain.client.social.CloudConfigRecord;
import kotakbaz.rain.client.social.RedeemedCloudConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\fJ:\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u00020\u0015H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u00020\u0018H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\f\u00a8\u0006 "}, d2={"Loxxxde/\u062a\u0647;", "", "", "Loxxxde/\u0636\u063a;", "owned", "", "receivedSupported", "Loxxxde/\u0636\u064c;", "received", "<init>", "(Ljava/util/List;ZLjava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "copy", "(Ljava/util/List;ZLjava/util/List;)Lkotakbaz/rain/client/social/CloudConfigLibrary;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOwned", "Z", "getReceivedSupported", "getReceived", "rain-visuals"})
public final class CloudConfigLibrary {
    @NotNull
    private final List<CloudConfigRecord> owned;
    @NotNull
    private final List<RedeemedCloudConfig> received;
    private final boolean receivedSupported;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudConfigLibrary)) {
            return false;
        }
        CloudConfigLibrary cloudConfigLibrary = (CloudConfigLibrary)other;
        if (!Intrinsics.areEqual(this.owned, cloudConfigLibrary.owned)) {
            return false;
        }
        if (this.receivedSupported != cloudConfigLibrary.receivedSupported) {
            return false;
        }
        if (!Intrinsics.areEqual(this.received, cloudConfigLibrary.received)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final List<CloudConfigRecord> component1() {
        return this.owned;
    }

    @NotNull
    public final List<CloudConfigRecord> getOwned() {
        return this.owned;
    }

    @NotNull
    public final CloudConfigLibrary copy(@NotNull List<CloudConfigRecord> owned, boolean receivedSupported, @NotNull List<RedeemedCloudConfig> received) {
        Intrinsics.checkNotNullParameter(owned, "owned");
        Intrinsics.checkNotNullParameter(received, "received");
        return new CloudConfigLibrary(owned, receivedSupported, received);
    }

    public static /* synthetic */ CloudConfigLibrary copy$default(CloudConfigLibrary cloudConfigLibrary, List list, boolean bl, List list2, int n, Object object) {
        if ((n & 1) != 0) {
            list = cloudConfigLibrary.owned;
        }
        if ((n & 2) != 0) {
            bl = cloudConfigLibrary.receivedSupported;
        }
        if ((n & 4) != 0) {
            list2 = cloudConfigLibrary.received;
        }
        return cloudConfigLibrary.copy(list, bl, list2);
    }

    @NotNull
    public final List<RedeemedCloudConfig> component3() {
        return this.received;
    }

    public int hashCode() {
        int result = ((Object)this.owned).hashCode();
        result = result * 31 + Boolean.hashCode(this.receivedSupported);
        result = result * 31 + ((Object)this.received).hashCode();
        return result;
    }

    public final boolean getReceivedSupported() {
        return this.receivedSupported;
    }

    public final boolean component2() {
        return this.receivedSupported;
    }

    @NotNull
    public final List<RedeemedCloudConfig> getReceived() {
        return this.received;
    }

    public CloudConfigLibrary(@NotNull List<CloudConfigRecord> owned, boolean receivedSupported, @NotNull List<RedeemedCloudConfig> received) {
        Intrinsics.checkNotNullParameter(owned, "owned");
        Intrinsics.checkNotNullParameter(received, "received");
        this.owned = owned;
        this.receivedSupported = receivedSupported;
        this.received = received;
    }

    @NotNull
    public String toString() {
        return "CloudConfigLibrary(owned=" + this.owned + ", receivedSupported=" + this.receivedSupported + ", received=" + this.received + ")";
    }
}

