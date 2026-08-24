/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.config;

import kotakbaz.rain.config.CloudConfigOrigin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u00020\u0014H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\n\u00a8\u0006\u001f"}, d2={"Loxxxde/\u0635\u064c;", "", "", "name", "author", "Loxxxde/\u062f\u0629;", "cloudOrigin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotakbaz/rain/config/CloudConfigOrigin;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotakbaz/rain/config/CloudConfigOrigin;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotakbaz/rain/config/CloudConfigOrigin;)Lkotakbaz/rain/config/ConfigInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getAuthor", "Loxxxde/\u062f\u0629;", "getCloudOrigin", "getDisplayName", "displayName", "rain-visuals"})
public final class ConfigInfo {
    @Nullable
    private final CloudConfigOrigin cloudOrigin;
    @NotNull
    private final String name;
    @NotNull
    private final String author;

    @Nullable
    public final CloudConfigOrigin component3() {
        return this.cloudOrigin;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final ConfigInfo copy(@NotNull String name, @NotNull String author, @Nullable CloudConfigOrigin cloudOrigin) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        return new ConfigInfo(name, author, cloudOrigin);
    }

    @Nullable
    public final CloudConfigOrigin getCloudOrigin() {
        return this.cloudOrigin;
    }

    @NotNull
    public final String component2() {
        return this.author;
    }

    public /* synthetic */ ConfigInfo(String string, String string2, CloudConfigOrigin cloudConfigOrigin, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 4) != 0) {
            cloudConfigOrigin = null;
        }
        this(string, string2, cloudConfigOrigin);
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void var1_1;
        int result = this.name.hashCode();
        result = result * 31 + this.author.hashCode();
        result = result * 31 + (this.cloudOrigin == null ? 0 : this.cloudOrigin.hashCode());
        return (int)var1_1;
    }

    public ConfigInfo(@NotNull String name, @NotNull String author, @Nullable CloudConfigOrigin cloudOrigin) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        this.name = name;
        this.author = author;
        this.cloudOrigin = cloudOrigin;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigInfo)) {
            return false;
        }
        ConfigInfo configInfo = (ConfigInfo)other;
        if (!Intrinsics.areEqual(this.name, configInfo.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.author, configInfo.author)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cloudOrigin, configInfo.cloudOrigin)) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @NotNull
    public final String getDisplayName() {
        String string;
        CloudConfigOrigin cloudConfigOrigin = this.cloudOrigin;
        if (cloudConfigOrigin != null) {
            String string2 = cloudConfigOrigin.getCloudName();
            if (string2 != null) {
                String string3;
                String p0 = string3 = string2;
                boolean bl = false;
                String string4 = !StringsKt.isBlank(p0) ? string3 : null;
                if (string4 != null) {
                    string = string4;
                    return string;
                }
            }
        }
        string = this.name;
        return string;
    }

    @NotNull
    public final String getAuthor() {
        return this.author;
    }

    public static /* synthetic */ ConfigInfo copy$default(ConfigInfo configInfo, String string, String string2, CloudConfigOrigin cloudConfigOrigin, int n, Object object) {
        if ((n & 1) != 0) {
            string = configInfo.name;
        }
        if ((n & 2) != 0) {
            string2 = configInfo.author;
        }
        if ((n & 4) != 0) {
            cloudConfigOrigin = configInfo.cloudOrigin;
        }
        return configInfo.copy(string, string2, cloudConfigOrigin);
    }

    @NotNull
    public String toString() {
        return "ConfigInfo(name=" + this.name + ", author=" + this.author + ", cloudOrigin=" + this.cloudOrigin + ")";
    }
}

