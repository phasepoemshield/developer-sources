/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SafePublicationLazyImpl;
import kotlin.SynchronizedLazyImpl;
import kotlin.UnsafeLazyImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\b\u0004\u0010\b\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\b\u0004\u0010\u000b\u00a8\u0006\f"}, d2={"T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "lazy", "(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "", "lock", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "Lkotlin/LazyThreadSafetyMode;", "mode", "(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "kotlin-stdlib"}, xs="kotlin/LazyKt")
class LazyKt__LazyJVMKt {
    @NotNull
    public static final <T> Lazy<T> lazy(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, null, 2, null);
    }

    @NotNull
    public static final <T> Lazy<T> lazy(@NotNull LazyThreadSafetyMode mode, @NotNull Function0<? extends T> initializer) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter((Object)mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        switch (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
            case 1: {
                lazy = new SynchronizedLazyImpl(initializer, null, 2, null);
                break;
            }
            case 2: {
                lazy = new SafePublicationLazyImpl<T>(initializer);
                break;
            }
            case 3: {
                lazy = new UnsafeLazyImpl<T>(initializer);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return lazy;
    }

    @NotNull
    public static final <T> Lazy<T> lazy(@Nullable Object lock, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new SynchronizedLazyImpl<T>(initializer, lock);
    }

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[LazyThreadSafetyMode.values().length];
            try {
                nArray[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

