/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.APIUtil
 *  org.lwjgl.system.FunctionProvider
 *  org.lwjgl.system.JNI
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.SharedLibrary
 */
package net.caffeinemc.mods.sodium.client.platform.unix;

import java.nio.ByteBuffer;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.SharedLibrary;

public class Libc {
    private static final SharedLibrary LIBRARY = APIUtil.apiCreateLibrary((String)"libc.so.6");
    private static final long PFN_setenv = APIUtil.apiGetFunctionAddress((FunctionProvider)LIBRARY, (String)"setenv");

    public static void setEnvironmentVariable(String string, @Nullable String string2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = memoryStack.UTF8((CharSequence)string);
            ByteBuffer byteBuffer2 = string2 != null ? memoryStack.UTF8((CharSequence)string2) : null;
            JNI.callPPI((long)MemoryUtil.memAddress((ByteBuffer)byteBuffer), (long)MemoryUtil.memAddressSafe((ByteBuffer)byteBuffer2), (int)1, (long)PFN_setenv);
        }
    }
}

