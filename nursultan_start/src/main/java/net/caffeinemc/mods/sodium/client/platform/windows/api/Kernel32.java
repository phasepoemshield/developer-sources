/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.APIUtil
 *  org.lwjgl.system.CustomBuffer
 *  org.lwjgl.system.FunctionProvider
 *  org.lwjgl.system.JNI
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.SharedLibrary
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.SharedLibrary;

public class Kernel32 {
    private static final SharedLibrary LIBRARY = APIUtil.apiCreateLibrary((String)"kernel32");
    private static final int MAX_PATH = Short.MAX_VALUE;
    private static final int GET_MODULE_HANDLE_EX_FLAG_UNCHANGED_REFCOUNT = 1;
    private static final int GET_MODULE_HANDLE_EX_FLAG_FROM_ADDRESS = 4;
    private static final long PFN_GetCommandLineW = APIUtil.apiGetFunctionAddress((FunctionProvider)LIBRARY, (String)"GetCommandLineW");
    private static final long PFN_GetCommandLineA = APIUtil.apiGetFunctionAddress((FunctionProvider)LIBRARY, (String)"GetCommandLineA");
    private static final long PFN_SetEnvironmentVariableW = APIUtil.apiGetFunctionAddress((FunctionProvider)LIBRARY, (String)"SetEnvironmentVariableW");
    private static final long PFN_GetModuleHandleExW = APIUtil.apiGetFunctionAddress((FunctionProvider)LIBRARY, (String)"GetModuleHandleExW");
    private static final long PFN_GetLastError = APIUtil.apiGetFunctionAddress((FunctionProvider)LIBRARY, (String)"GetLastError");
    private static final long PFN_GetModuleFileNameW = APIUtil.apiGetFunctionAddress((FunctionProvider)LIBRARY, (String)"GetModuleFileNameW");

    public static int getLastError() {
        return JNI.callI((long)PFN_GetLastError);
    }

    public static void setEnvironmentVariable(String string, @Nullable String string2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = memoryStack.malloc(16, MemoryUtil.memLengthUTF16((CharSequence)string, (boolean)true));
            MemoryUtil.memUTF16((CharSequence)string, (boolean)true, (ByteBuffer)byteBuffer);
            ByteBuffer byteBuffer2 = null;
            if (string2 != null) {
                byteBuffer2 = memoryStack.malloc(16, MemoryUtil.memLengthUTF16((CharSequence)string2, (boolean)true));
                MemoryUtil.memUTF16((CharSequence)string2, (boolean)true, (ByteBuffer)byteBuffer2);
            }
            JNI.callPPI((long)MemoryUtil.memAddress0((Buffer)byteBuffer), (long)MemoryUtil.memAddressSafe(byteBuffer2), (long)PFN_SetEnvironmentVariableW);
        }
    }

    public static long getCommandLine() {
        return JNI.callP((long)PFN_GetCommandLineW);
    }

    public static long getCommandLineA() {
        return JNI.callP((long)PFN_GetCommandLineA);
    }

    public static long getModuleHandleByNames(String[] stringArray) {
        for (String string : stringArray) {
            long l = Kernel32.getModuleHandleByName(string);
            if (l == 0L) continue;
            return l;
        }
        throw new RuntimeException("Could not obtain handle of module");
    }

    public static long getModuleHandleByName(String string) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = memoryStack.malloc(16, MemoryUtil.memLengthUTF16((CharSequence)string, (boolean)true));
            MemoryUtil.memUTF16((CharSequence)string, (boolean)true, (ByteBuffer)byteBuffer);
            PointerBuffer pointerBuffer = memoryStack.callocPointer(1);
            int n = JNI.callPPI((int)1, (long)MemoryUtil.memAddress((ByteBuffer)byteBuffer), (long)MemoryUtil.memAddress((CustomBuffer)pointerBuffer), (long)PFN_GetModuleHandleExW);
            if (n == 0) {
                int n2 = Kernel32.getLastError();
                switch (n2) {
                    case 126: {
                        long l = 0L;
                        return l;
                    }
                }
                throw new RuntimeException("GetModuleHandleEx failed, error=" + n2);
            }
            long l = pointerBuffer.get(0);
            return l;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String getModuleFileName(long l) {
        ByteBuffer byteBuffer = MemoryUtil.memAlignedAlloc((int)16, (int)Short.MAX_VALUE);
        try {
            int n = JNI.callPPI((long)l, (long)MemoryUtil.memAddress((ByteBuffer)byteBuffer), (int)byteBuffer.capacity(), (long)PFN_GetModuleFileNameW);
            if (n == 0) {
                throw new RuntimeException("GetModuleFileNameW failed, error=" + Kernel32.getLastError());
            }
            String string = MemoryUtil.memUTF16((ByteBuffer)byteBuffer, (int)n);
            return string;
        }
        finally {
            MemoryUtil.memAlignedFree((ByteBuffer)byteBuffer);
        }
    }
}

