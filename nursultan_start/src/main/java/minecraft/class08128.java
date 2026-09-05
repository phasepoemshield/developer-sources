/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01422
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class07937
 *  minecraft.class08453
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex
 *  net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryStack
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class00734;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01422;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class07937;
import minecraft.class08130;
import minecraft.class08453;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08128 {
    private static final class07311 N = class06851.P((class01894)class01894.y((String)"textures/misc/shadow.png"));
    private static final int y;
    private static final int L;

    private static void N(long l, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, int n, int n2) {
        float f6 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        float f7 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        float f8 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        EntityVertex.write((long)l, (float)f6, (float)f7, (float)f8, (int)n, (float)f4, (float)f5, (int)0xF000F0, (int)class01384.u, (int)n2);
    }

    private static void N(Matrix4f matrix4f, VertexBufferWriter vertexBufferWriter, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = 0.5f * (1.0f / f);
        float f9 = -f3 * f8 + 0.5f;
        float f10 = -f4 * f8 + 0.5f;
        float f11 = -f6 * f8 + 0.5f;
        float f12 = -f7 * f8 + 0.5f;
        int n = ColorABGR.withAlpha((int)L, (float)f2);
        int n2 = y;
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l;
            long l2 = l = memoryStack.nmalloc(144);
            class08128.N(l2, matrix4f, f3, f5, f6, f9, f11, n, n2);
            class08128.N(l2 += 36L, matrix4f, f3, f5, f7, f9, f12, n, n2);
            class08128.N(l2 += 36L, matrix4f, f4, f5, f7, f10, f12, n, n2);
            class08128.N(l2 += 36L, matrix4f, f4, f5, f6, f10, f11, n, n2);
            l2 += 36L;
            vertexBufferWriter.push(memoryStack, l, 4, EntityVertex.FORMAT);
        }
    }

    private static void N(class07937 class079372, class01422 class014222, CallbackInfo callbackInfo) {
        VertexBufferWriter vertexBufferWriter = VertexConsumerUtils.convertOrLog((class01391)class014222.method_73477(N));
        if (vertexBufferWriter == null) {
            return;
        }
        callbackInfo.cancel();
        for (class08130 class081302 : class079372.N()) {
            Matrix4f matrix4f = class081302.N();
            for (int i = 0; i < class081302.L().size(); ++i) {
                class08453 class084532 = class081302.L().get(i);
                float f = class084532.i();
                if (!(f >= 0.0f)) continue;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                class00734 class007342 = class084532.u().method_1107();
                float f2 = (float)((double)class084532.N() + class007342.N);
                float f3 = (float)((double)class084532.N() + class007342.u);
                float f4 = (float)((double)class084532.y() + class007342.y);
                float f5 = (float)((double)class084532.L() + class007342.L);
                float f6 = (float)((double)class084532.L() + class007342.R);
                class08128.N(matrix4f, vertexBufferWriter, class081302.y(), f, f2, f3, f4, f5, f6);
            }
        }
    }

    public void N(class07937 class079372, class01422 class014222) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class08128.N(class079372, class014222, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class01391 class013912 = class014222.method_73477(N);
        for (class08130 class081302 : class079372.N()) {
            for (class08453 class084532 : class081302.L()) {
                class00734 class007342 = class084532.u().method_1107();
                float f = class084532.N() + (float)class007342.N;
                float f2 = class084532.N() + (float)class007342.u;
                float f3 = class084532.y() + (float)class007342.y;
                float f4 = class084532.L() + (float)class007342.L;
                float f5 = class084532.L() + (float)class007342.R;
                float f6 = class081302.y();
                float f7 = -f / 2.0f / f6 + 0.5f;
                float f8 = -f2 / 2.0f / f6 + 0.5f;
                float f9 = -f4 / 2.0f / f6 + 0.5f;
                float f10 = -f5 / 2.0f / f6 + 0.5f;
                int n = class02566.y((float)class084532.i());
                class08128.N(class081302.N(), class013912, n, f, f3, f4, f7, f9);
                class08128.N(class081302.N(), class013912, n, f, f3, f5, f7, f10);
                class08128.N(class081302.N(), class013912, n, f2, f3, f5, f8, f10);
                class08128.N(class081302.N(), class013912, n, f2, f3, f4, f8, f9);
            }
        }
    }

    private static void N(Matrix4f matrix4f, class01391 class013912, int n, float f, float f2, float f3, float f4, float f5) {
        Vector3f vector3f = matrix4f.transformPosition(f, f2, f3, new Vector3f());
        class013912.N(vector3f.x(), vector3f.y(), vector3f.z(), n, f4, f5, class01384.u, 0xF000F0, 0.0f, 1.0f, 0.0f);
    }
}

