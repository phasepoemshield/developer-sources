/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11911
 *  com.google.gson.reflect.TypeToken
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class01894
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL12
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import Nursultan.class11724;
import Nursultan.class11729;
import Nursultan.class11731;
import Nursultan.class11747;
import Nursultan.class11755;
import Nursultan.class11773;
import Nursultan.class11911;
import com.google.gson.reflect.TypeToken;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import minecraft.class01894;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL12;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class11752 {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    /*
     * Loose catch block
     */
    private static class11724 M(String string) {
        class11724 class117242;
        MemoryStack memoryStack;
        ByteBuffer byteBuffer;
        Object object;
        block20: {
            block19: {
                byte[] byArray;
                try {
                    object = class11911.L((String)string).method_14482();
                    try {
                        byArray = IOUtils.toByteArray((InputStream)object);
                    }
                    finally {
                        if (object != null) {
                            ((InputStream)object).close();
                        }
                    }
                }
                catch (Exception exception) {
                    throw new IllegalStateException("Failed to read icon atlas image: " + string, exception);
                }
                object = MemoryUtil.memAlloc((int)byArray.length);
                byteBuffer = null;
                memoryStack = MemoryStack.stackPush();
                ((ByteBuffer)object).put(byArray).flip();
                IntBuffer intBuffer = memoryStack.mallocInt(1);
                IntBuffer intBuffer2 = memoryStack.mallocInt(1);
                IntBuffer intBuffer3 = memoryStack.mallocInt(1);
                byteBuffer = STBImage.stbi_load_from_memory((ByteBuffer)object, (IntBuffer)intBuffer, (IntBuffer)intBuffer2, (IntBuffer)intBuffer3, (int)4);
                if (byteBuffer == null) {
                    throw new IllegalStateException("Failed to decode icon atlas image '" + string + "': " + STBImage.stbi_failure_reason());
                }
                int n = intBuffer.get(0);
                int n2 = intBuffer2.get(0);
                byte[] byArray2 = new byte[n * n2 * 4];
                byteBuffer.get(byArray2);
                class117242 = new class11724(n, n2, byArray2);
                if (memoryStack == null) break block19;
                memoryStack.close();
            }
            if (byteBuffer == null) break block20;
            STBImage.stbi_image_free((ByteBuffer)byteBuffer);
        }
        MemoryUtil.memFree((Buffer)object);
        return class117242;
        {
            catch (Throwable throwable) {
                try {
                    if (memoryStack != null) {
                        try {
                            memoryStack.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    if (byteBuffer != null) {
                        STBImage.stbi_image_free(byteBuffer);
                    }
                    MemoryUtil.memFree((Buffer)object);
                    throw throwable3;
                }
            }
        }
    }

    private class11752() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11752.L();
        N_0 = LogManager.getLogger(String.class);
    }

    private static Map<String, Integer> i(String string) {
        Map map = (Map)class11911.N((class01894)class11911.N((String)string), (TypeToken)new class11747());
        if (map == null || map.isEmpty()) {
            throw new IllegalStateException("Icon atlas names map invalid or empty: " + string);
        }
        return map;
    }

    private static class11729 y(String string) {
        class11729 class117292 = (class11729)class11911.N((class01894)class11911.N((String)string), class11729.class);
        if (class117292 == null || class117292.y == null || class117292.N == null) {
            throw new IllegalStateException("Icon atlas layout invalid or empty: " + string);
        }
        return class117292;
    }

    private static Map<String, class11773> N(class11729 class117292, Map<String, Integer> map) {
        HashMap<Integer, class11773> hashMap = new HashMap<Integer, class11773>(class117292.N.size());
        float f = class117292.y.L;
        float f2 = class117292.y.y;
        for (class11755 object : class117292.N) {
            if (object.L == null) continue;
            float entry = object.L.L / f;
            float class117732 = object.L.y / f;
            float f3 = object.L.u / f2;
            float f4 = object.L.N / f2;
            float f5 = object.N == null ? 1.0f : object.N.u - object.N.y;
            float f6 = object.N == null ? 1.0f : Math.abs(object.N.L - object.N.N);
            hashMap.put(object.y, new class11773(entry, f3, class117732, f4, f5, f6));
        }
        HashMap<String, class11773> hashMap2 = new HashMap<String, class11773>(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            class11773 class117732 = (class11773)((Object)hashMap.get(entry.getValue()));
            if (class117732 == null) {
                ((Logger)N_0).warn("Icon '{}' (codepoint {}) is missing from atlas layout \u2014 skipping", (Object)entry.getKey(), (Object)entry.getValue());
                continue;
            }
            hashMap2.put(entry.getKey(), class117732);
        }
        return hashMap2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static int N(class11724 class117242) {
        int n = GL12.glGenTextures();
        if (n == 0) {
            throw new IllegalStateException("Failed to allocate GL texture for icon atlas");
        }
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)class117242.y().length);
        try {
            byteBuffer.put(class117242.y()).flip();
            int n2 = GL12.glGetInteger((int)32873);
            GlStateManager._bindTexture((int)n);
            GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
            GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
            GlStateManager._texParameter((int)3553, (int)10242, (int)33071);
            GlStateManager._texParameter((int)3553, (int)10243, (int)33071);
            GlStateManager._pixelStore((int)3314, (int)0);
            GlStateManager._pixelStore((int)3316, (int)0);
            GlStateManager._pixelStore((int)3315, (int)0);
            GlStateManager._pixelStore((int)3317, (int)1);
            GL12.glTexImage2D((int)3553, (int)0, (int)32856, (int)class117242.N(), (int)class117242.L(), (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
            GlStateManager._bindTexture((int)n2);
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
        }
        return n;
    }

    public static class11731 N(String string) {
        class11729 class117292 = class11752.y(string + ".json");
        Map<String, Integer> var2 = class11752.i(string + ".names.json");
        Map<String, class11773> var3 = class11752.N(class117292, var2);
        class11724 class117242 = class11752.M(string + ".png");
        int n = class11752.N(class117242);
        return new class11731(n, class117242.N(), class117242.L(), class117292.y.N, var3);
    }
}

