/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05232
 *  minecraft.class08844
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.system.MemoryUtil
 */
package minecraft;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import minecraft.class05232;
import minecraft.class08844;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;

public class class04663 {
    public static final int N = 65545;
    private final ByteBuffer y = BufferUtils.createByteBuffer((int)8192);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class08844 class088442, String string) {
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        int n = byArray.length + 1;
        if (n < this.y.capacity()) {
            class04663.N(class088442, this.y, byArray);
        } else {
            ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)n);
            try {
                class04663.N(class088442, byteBuffer, byArray);
            }
            finally {
                MemoryUtil.memFree((Buffer)byteBuffer);
            }
        }
    }

    private static void N(class08844 class088442, ByteBuffer byteBuffer, byte[] byArray) {
        byteBuffer.clear();
        byteBuffer.put(byArray);
        byteBuffer.put((byte)0);
        byteBuffer.flip();
        GLFW.glfwSetClipboardString((long)class088442.B(), (ByteBuffer)byteBuffer);
    }

    public String N(class08844 class088442, GLFWErrorCallbackI gLFWErrorCallbackI) {
        GLFWErrorCallback gLFWErrorCallback = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)gLFWErrorCallbackI);
        String string = GLFW.glfwGetClipboardString((long)class088442.B());
        string = string != null ? class05232.N((String)string) : "";
        GLFWErrorCallback gLFWErrorCallback2 = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)gLFWErrorCallback);
        if (gLFWErrorCallback2 != null) {
            gLFWErrorCallback2.free();
        }
        return string;
    }
}

