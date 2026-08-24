/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.KotlinVersionCurrentValue;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0096\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001a\u00a8\u0006 "}, d2={"Lkotlin/KotlinVersion;", "", "", "major", "minor", "<init>", "(II)V", "patch", "(III)V", "other", "compareTo", "(Lkotlin/KotlinVersion;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "isAtLeast", "(II)Z", "(III)Z", "", "toString", "()Ljava/lang/String;", "versionOf", "(III)I", "I", "getMajor", "getMinor", "getPatch", "version", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public final class KotlinVersion
implements Comparable<KotlinVersion> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int patch;
    private final int major;
    @JvmField
    @NotNull
    public static final KotlinVersion CURRENT = KotlinVersionCurrentValue.get();
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int minor;
    private final int version;

    @Override
    public int compareTo(@NotNull KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isAtLeast(int major, int minor, int patch) {
        if (this.major > major) return true;
        if (this.major != major) return false;
        if (this.minor > minor) return true;
        if (this.minor != minor) return false;
        if (this.patch < patch) return false;
        return true;
    }

    public final int getMinor() {
        return this.minor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        KotlinVersion kotlinVersion = other instanceof KotlinVersion ? (KotlinVersion)other : null;
        if (kotlinVersion == null) {
            return false;
        }
        KotlinVersion otherVersion = kotlinVersion;
        return this.version == otherVersion.version;
    }

    public KotlinVersion(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.version = this.versionOf(this.major, this.minor, this.patch);
    }

    @NotNull
    public String toString() {
        return "" + this.major + '.' + this.minor + '.' + this.patch;
    }

    public KotlinVersion(int major, int minor) {
        this(major, minor, 0);
    }

    public final int getMajor() {
        return this.major;
    }

    /*
     * Unable to fully structure code
     */
    private final int versionOf(int major, int minor, int patch) {
        if (!new IntRange(0, 255).contains(major)) ** GOTO lbl-1000
        if (!new IntRange(0, 255).contains(minor)) ** GOTO lbl-1000
        if (new IntRange(0, 255).contains(patch)) {
            v0 = true;
        } else lbl-1000:
        // 3 sources

        {
            v0 = false;
        }
        var4_4 = v0;
        if (!var4_4) {
            $i$a$-require-KotlinVersion$versionOf$1 = false;
            var5_6 = "Version components are out of range: " + major + '.' + minor + '.' + patch;
            throw new IllegalArgumentException(var5_6.toString());
        }
        return (major << 16) + (var2_2 << 8) + var3_3;
    }

    public int hashCode() {
        return this.version;
    }

    public final int getPatch() {
        return this.patch;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isAtLeast(int major, int minor) {
        if (this.major > major) return true;
        if (this.major != major) return false;
        if (this.minor < minor) return false;
        return true;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lkotlin/KotlinVersion$Companion;", "", "<init>", "()V", "Lkotlin/KotlinVersion;", "CURRENT", "Lkotlin/KotlinVersion;", "", "MAX_COMPONENT_VALUE", "I", "kotlin-stdlib"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}

