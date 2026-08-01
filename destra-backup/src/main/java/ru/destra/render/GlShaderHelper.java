package ru.destra.render;

import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;

public final class GlShaderHelper {
    private GlShaderHelper() {}

    public static void shaderSource(int shader, String source) {
        if (source == null) source = "";
        byte[] bytes = source.getBytes(StandardCharsets.UTF_8);
        try (MemoryStack stack = MemoryStack.stackPush()) {
            ByteBuffer buffer = stack.malloc(bytes.length + 1);
            buffer.put(bytes);
            buffer.put((byte) 0);
            buffer.flip();
            long strPtr = MemoryUtil.memAddress(buffer);

            PointerBuffer strings = stack.mallocPointer(1);
            strings.put(0, strPtr);

            IntBuffer lengths = stack.mallocInt(1);
            lengths.put(0, bytes.length);

            GL20.nglShaderSource(shader, 1, MemoryUtil.memAddress(strings), MemoryUtil.memAddress(lengths));
        }
    }
}
