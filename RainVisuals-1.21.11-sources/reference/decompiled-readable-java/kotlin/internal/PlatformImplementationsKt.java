/*
 * Decompiled with CFR 0.152.
 */
package kotlin.internal;

import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementations;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0083\b\u00a2\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"", "major", "minor", "patch", "", "apiVersionIsAtLeast", "(III)Z", "", "T", "instance", "castToBaseType", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/internal/PlatformImplementations;", "IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "kotlin-stdlib"})
public final class PlatformImplementationsKt {
    @JvmField
    @NotNull
    public static final PlatformImplementations IMPLEMENTATIONS;

    static {
        PlatformImplementations platformImplementations;
        JDK8PlatformImplementations jDK8PlatformImplementations = new JDK8PlatformImplementations();
        try {
            platformImplementations = jDK8PlatformImplementations;
        }
        catch (ClassCastException classCastException) {
            ClassLoader classLoader = jDK8PlatformImplementations.getClass().getClassLoader();
            ClassLoader classLoader2 = PlatformImplementations.class.getClassLoader();
            if (!Intrinsics.areEqual(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, classCastException);
            }
            throw classCastException;
        }
        IMPLEMENTATIONS = platformImplementations;
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    private static final /* synthetic */ <T> T castToBaseType(Object instance) {
        try {
            Intrinsics.reifiedOperationMarker(1, "T");
            return (T)instance;
        }
        catch (ClassCastException e) {
            void var1_1;
            ClassLoader instanceCL = instance.getClass().getClassLoader();
            Intrinsics.reifiedOperationMarker(4, "T");
            ClassLoader baseTypeCL = Object.class.getClassLoader();
            if (!Intrinsics.areEqual(instanceCL, baseTypeCL)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + instanceCL + ", base type classloader: " + baseTypeCL, e);
            }
            throw var1_1;
        }
    }

    @SinceKotlin(version="1.2")
    @PublishedApi
    public static final boolean apiVersionIsAtLeast(int major, int minor, int patch) {
        return KotlinVersion.CURRENT.isAtLeast(major, minor, patch);
    }
}

