/*
 * Decompiled with CFR 0.152.
 */
package kotlin.internal.jdk8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2={"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "<init>", "()V", "Lkotlin/random/Random;", "defaultPlatformRandom", "()Lkotlin/random/Random;", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/MatchGroup;", "getMatchResultNamedGroup", "(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/MatchGroup;", "", "version", "", "sdkIsNullOrAtLeast", "(I)Z", "ReflectSdkVersion", "kotlin-stdlib-jdk8"})
public class JDK8PlatformImplementations
extends JDK7PlatformImplementations {
    @Override
    @NotNull
    public Random defaultPlatformRandom() {
        return this.sdkIsNullOrAtLeast(34) ? (Random)new PlatformThreadLocalRandom() : super.defaultPlatformRandom();
    }

    @Override
    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String name) {
        MatchGroup matchGroup;
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher)matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        Matcher matcher2 = matcher;
        IntRange range = new IntRange(matcher2.start(name), matcher2.end(name) - 1);
        if (range.getStart() >= 0) {
            String string = matcher2.group(name);
            Intrinsics.checkNotNullExpressionValue(string, "group(...)");
            matchGroup = new MatchGroup(string, range);
        } else {
            matchGroup = null;
        }
        return matchGroup;
    }

    private final boolean sdkIsNullOrAtLeast(int version) {
        return ReflectSdkVersion.sdkVersion == null || ReflectSdkVersion.sdkVersion >= version;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "<init>", "()V", "", "sdkVersion", "Ljava/lang/Integer;", "kotlin-stdlib-jdk8"})
    private static final class ReflectSdkVersion {
        @Nullable
        @JvmField
        public static final Integer sdkVersion;
        @NotNull
        public static final ReflectSdkVersion INSTANCE;

        private ReflectSdkVersion() {
        }

        static {
            Object object;
            Object object2;
            INSTANCE = new ReflectSdkVersion();
            try {
                object2 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                object2 = object2 instanceof Integer ? (Integer)object2 : null;
            }
            catch (Throwable e) {
                object2 = null;
            }
            Object object3 = object2;
            if (object3 != null) {
                object2 = object3;
                int it = ((Number)object2).intValue();
                boolean bl = false;
                object = it > 0 ? object2 : null;
            } else {
                object = null;
            }
            sdkVersion = object;
        }
    }
}

