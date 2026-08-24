/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c2\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\r\u00a8\u0006\u0010"}, d2={"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "<init>", "()V", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "continuation", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "buildCache", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleName", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/String;", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "Cache", "kotlin-stdlib"})
final class ModuleNameRetriever {
    @NotNull
    public static final ModuleNameRetriever INSTANCE = new ModuleNameRetriever();
    @Nullable
    private static Cache cache;
    @NotNull
    private static final Cache notOnJava9;

    @Nullable
    public final String getModuleName(@NotNull BaseContinuationImpl continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Cache cache = ModuleNameRetriever.cache;
        if (cache == null) {
            cache = this.buildCache(continuation);
        }
        Cache cache2 = cache;
        if (cache2 == notOnJava9) {
            return null;
        }
        Method method = cache2.getModuleMethod;
        Object object = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (object == null) {
            return null;
        }
        Object module = object;
        Method method2 = cache2.getDescriptorMethod;
        Object object2 = method2 != null ? method2.invoke(module, new Object[0]) : null;
        if (object2 == null) {
            return null;
        }
        Object descriptor2 = object2;
        Method method3 = cache2.nameMethod;
        Object object3 = method3 != null ? method3.invoke(descriptor2, new Object[0]) : null;
        return object3 instanceof String ? (String)object3 : null;
    }

    /*
     * WARNING - void declaration
     */
    private final Cache buildCache(BaseContinuationImpl continuation) {
        try {
            void var8_12;
            Cache cache;
            Method getModuleMethod = Class.class.getDeclaredMethod("getModule", new Class[0]);
            Class<?> methodClass = continuation.getClass().getClassLoader().loadClass("java.lang.Module");
            Method getDescriptorMethod = methodClass.getDeclaredMethod("getDescriptor", new Class[0]);
            Class<?> moduleDescriptorClass = continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor");
            Method nameMethod = moduleDescriptorClass.getDeclaredMethod("name", new Class[0]);
            Cache it = cache = new Cache(getModuleMethod, getDescriptorMethod, nameMethod);
            boolean bl = false;
            ModuleNameRetriever.cache = var8_12;
            return cache;
        }
        catch (Exception ignored) {
            void var4_7;
            Cache cache = notOnJava9;
            Cache it = cache;
            boolean bl = false;
            ModuleNameRetriever.cache = var4_7;
            return cache;
        }
    }

    private ModuleNameRetriever() {
    }

    static {
        notOnJava9 = new Cache(null, null, null);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\b\u00a8\u0006\t"}, d2={"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "Ljava/lang/reflect/Method;", "kotlin-stdlib"})
    private static final class Cache {
        @JvmField
        @Nullable
        public final Method getDescriptorMethod;
        @JvmField
        @Nullable
        public final Method getModuleMethod;
        @JvmField
        @Nullable
        public final Method nameMethod;

        public Cache(@Nullable Method getModuleMethod, @Nullable Method getDescriptorMethod, @Nullable Method nameMethod) {
            this.getModuleMethod = getModuleMethod;
            this.getDescriptorMethod = getDescriptorMethod;
            this.nameMethod = nameMethod;
        }
    }
}

