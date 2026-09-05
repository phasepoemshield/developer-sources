/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.APIUtil
 *  org.lwjgl.system.JNI
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.SharedLibrary
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api;

import java.util.Objects;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.SharedLibrary;

public class Shell32 {
    private static final SharedLibrary LIBRARY = APIUtil.apiCreateLibrary((String)"shell32");
    private static final long PFN_ShellExecuteW = APIUtil.apiGetFunctionAddressOptional((SharedLibrary)LIBRARY, (String)"ShellExecuteW");

    private static long checkPfn(long l) {
        if (l == 0L) {
            throw new NullPointerException("Function pointer not available");
        }
        return l;
    }

    public static long nShellExecuteW(long l, long l2, long l3, long l4, long l5, int n) {
        return JNI.invokePPPPPP((long)l, (long)l2, (long)l3, (long)l4, (long)l5, (int)n, (long)Shell32.checkPfn(PFN_ShellExecuteW));
    }

    public static void browseUrl(@Nullable NativeWindowHandle nativeWindowHandle, String string) {
        Objects.requireNonNull(string, "URL parameter must be non-null");
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            memoryStack.nUTF16((CharSequence)"open", true);
            long l = memoryStack.getPointerAddress();
            memoryStack.nUTF16((CharSequence)string, true);
            long l2 = memoryStack.getPointerAddress();
            Shell32.nShellExecuteW(nativeWindowHandle != null ? nativeWindowHandle.getWin32Handle() : 0L, l, l2, 0L, 0L, 1);
        }
    }
}

