/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Consumer;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.jspecify.annotations.Nullable;

public class class06833 {
    private final String u;
    private final @Nullable Consumer<Matrix4fStack> i;
    public static final class06833 N = new class06833("no_layering", null);
    public static final class06833 y = new class06833("view_offset_z_layering", matrix4fStack -> RenderSystem.getProjectionType().N((Matrix4f)matrix4fStack, 1.0f));
    public static final class06833 L = new class06833("view_offset_z_layering_forward", matrix4fStack -> RenderSystem.getProjectionType().N((Matrix4f)matrix4fStack, -1.0f));

    public class06833(String string, @Nullable Consumer<Matrix4fStack> consumer) {
        this.u = string;
        this.i = consumer;
    }

    public String toString() {
        return "LayeringTransform[" + this.u + "]";
    }

    public @Nullable Consumer<Matrix4fStack> N() {
        return this.i;
    }
}

