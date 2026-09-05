/*
 * Decompiled with CFR 0.152.
 */
package ntf.native;

import java.lang.invoke.MethodHandle;

public final class Loader {
    public static /* bridge */ /* synthetic */ Object invoke(MethodHandle methodHandle, int n) {
        return methodHandle.invoke(n);
    }

    public static /* bridge */ /* synthetic */ Object invoke(MethodHandle methodHandle, Object object) {
        return methodHandle.invoke(object);
    }

    public static /* bridge */ /* synthetic */ Object invoke(MethodHandle methodHandle, Object object, int n) {
        return methodHandle.invoke(object, n);
    }

    public static /* bridge */ /* synthetic */ Object invoke(MethodHandle methodHandle) {
        return methodHandle.invoke();
    }
}

