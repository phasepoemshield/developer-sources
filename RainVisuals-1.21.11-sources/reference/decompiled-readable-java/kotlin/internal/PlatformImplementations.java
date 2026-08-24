/*
 * Decompiled with CFR 0.152.
 */
package kotlin.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2={"Lkotlin/internal/PlatformImplementations;", "", "<init>", "()V", "", "cause", "exception", "", "addSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Lkotlin/random/Random;", "defaultPlatformRandom", "()Lkotlin/random/Random;", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/MatchGroup;", "getMatchResultNamedGroup", "(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/MatchGroup;", "", "getSuppressed", "(Ljava/lang/Throwable;)Ljava/util/List;", "ReflectThrowable", "kotlin-stdlib"})
public class PlatformImplementations {
    @NotNull
    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }

    @NotNull
    public List<Throwable> getSuppressed(@NotNull Throwable exception) {
        Object object;
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(exception, "exception");
                object = ReflectThrowable.getSuppressed;
                if (object == null) break block2;
                if ((object = ((Method)object).invoke((Object)exception, new Object[0])) == null) break block2;
                List<Throwable> list = object;
                List<Throwable> it = list;
                boolean bl = false;
                List<Throwable> list2 = ArraysKt.asList((Throwable[])it);
                object = list2;
                if (list2 != null) break block3;
            }
            object = CollectionsKt.emptyList();
        }
        return object;
    }

    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public void addSuppressed(@NotNull Throwable cause, @NotNull Throwable exception) {
        block0: {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(exception, "exception");
            Method method = ReflectThrowable.addSuppressed;
            if (method == null) break block0;
            Object[] objectArray = new Object[1];
            objectArray[0] = exception;
            method.invoke((Object)cause, objectArray);
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0006\u00a8\u0006\b"}, d2={"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"})
    private static final class ReflectThrowable {
        @JvmField
        @Nullable
        public static final Method getSuppressed;
        @JvmField
        @Nullable
        public static final Method addSuppressed;
        @NotNull
        public static final ReflectThrowable INSTANCE;

        private ReflectThrowable() {
        }

        /*
         * Unable to fully structure code
         */
        static {
            block5: {
                block4: {
                    ReflectThrowable.INSTANCE = new ReflectThrowable();
                    throwableClass = Throwable.class;
                    throwableMethods = throwableClass.getMethods();
                    Intrinsics.checkNotNull(throwableMethods);
                    var2_2 = throwableMethods;
                    var4_4 = var2_2.length;
                    for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
                        it = var5_5 = var2_2[var3_3];
                        $i$a$-find-PlatformImplementations$ReflectThrowable$1 = false;
                        if (!Intrinsics.areEqual(it.getName(), "addSuppressed")) ** GOTO lbl-1000
                        v0 = it.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(v0, "getParameterTypes(...)");
                        if (Intrinsics.areEqual(ArraysKt.singleOrNull((Object[])v0), throwableClass)) {
                            v1 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v1 = false;
                        }
                        if (!v1) continue;
                        v2 = var5_5;
                        break block4;
                    }
                    v2 = null;
                }
                ReflectThrowable.addSuppressed = v2;
                var2_2 = throwableMethods;
                var4_4 = var2_2.length;
                for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
                    it = var5_5 = var2_2[var3_3];
                    var7_7 = false;
                    if (!Intrinsics.areEqual(var6_6.getName(), "getSuppressed")) continue;
                    v3 = var5_5;
                    break block5;
                }
                v3 = null;
            }
            ReflectThrowable.getSuppressed = v3;
        }
    }
}

