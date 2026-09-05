/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.opengl.GL20C
 *  org.lwjgl.system.APIUtil
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

class ShaderWorkarounds {
    ShaderWorkarounds() {
    }

    static void safeShaderSource(int n, CharSequence charSequence) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = MemoryUtil.memUTF8((CharSequence)charSequence, (boolean)true);
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            pointerBuffer.put(byteBuffer);
            GL20C.nglShaderSource((int)n, (int)1, (long)pointerBuffer.address0(), (long)0L);
            APIUtil.apiArrayFree((long)pointerBuffer.address0(), (int)1);
        }
    }
}

