/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GLX
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.Pointer
 */
package minecraft;

import com.mojang.blaze3d.platform.GLX;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.Pointer;

public class class06417 {
    private static final @Nullable MethodHandle N = (MethodHandle)GLX.make(() -> {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            Class<?> var1 = Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
            Method method = var1.getDeclaredMethod("untrack", Long.TYPE);
            method.setAccessible(true);
            Field field = Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
            field.setAccessible(true);
            Object object = field.get(null);
            if (var1.isInstance(object)) {
                return lookup.unreflect(method);
            }
            return null;
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    });

    public static void N(long l) {
        if (N == null) {
            return;
        }
        try {
            N.invoke(l);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static void N(Pointer pointer) {
        class06417.N(pointer.address());
    }
}

