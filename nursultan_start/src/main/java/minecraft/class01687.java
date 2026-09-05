/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01423
 *  minecraft.class01706
 *  minecraft.class07211
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.client.render.immediate.model.EntityRenderer
 *  net.caffeinemc.mods.sodium.client.render.immediate.model.ModelCuboid
 *  net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Set;
import minecraft.class01391;
import minecraft.class01423;
import minecraft.class01699;
import minecraft.class01706;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.client.render.immediate.model.EntityRenderer;
import net.caffeinemc.mods.sodium.client.render.immediate.model.ModelCuboid;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01687 {
    public final class01706[] N;
    public float y;
    public final float L;
    public final float u;
    public final float i;
    public final float R;
    public final float M;
    private ModelCuboid B;

    public class01687(int n, int n2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bl, float f10, float f11, Set<class07211> set) {
        float f12 = f;
        this.N(this, f12, n, n2, f, f2, f3, f4, f5, f6, f7, f8, f9, bl, f10, f11, set);
        this.L = f2;
        this.u = f3;
        this.i = f + f4;
        this.R = f2 + f5;
        this.M = f3 + f6;
        this.N = new class01706[set.size()];
        float f13 = f + f4;
        float f14 = f2 + f5;
        float f15 = f3 + f6;
        f -= f7;
        f2 -= f8;
        f3 -= f9;
        f13 += f7;
        f14 += f8;
        f15 += f9;
        if (bl) {
            float f16 = f13;
            f13 = f;
            f = f16;
        }
        class01699 class016992 = new class01699(f, f2, f3, 0.0f, 0.0f);
        class01699 class016993 = new class01699(f13, f2, f3, 0.0f, 8.0f);
        class01699 class016994 = new class01699(f13, f14, f3, 8.0f, 8.0f);
        class01699 class016995 = new class01699(f, f14, f3, 8.0f, 0.0f);
        class01699 class016996 = new class01699(f, f2, f15, 0.0f, 0.0f);
        class01699 class016997 = new class01699(f13, f2, f15, 0.0f, 8.0f);
        class01699 class016998 = new class01699(f13, f14, f15, 8.0f, 8.0f);
        class01699 class016999 = new class01699(f, f14, f15, 8.0f, 0.0f);
        float f17 = n;
        float f18 = (float)n + f6;
        float f19 = (float)n + f6 + f4;
        float f20 = (float)n + f6 + f4 + f4;
        float f21 = (float)n + f6 + f4 + f6;
        float f22 = (float)n + f6 + f4 + f6 + f4;
        float f23 = n2;
        float f24 = (float)n2 + f6;
        float f25 = (float)n2 + f6 + f5;
        int n3 = 0;
        if (set.contains(class07211.field_11033)) {
            this.N[n3++] = new class01706(new class01699[]{class016997, class016996, class016992, class016993}, f18, f23, f19, f24, f10, f11, bl, class07211.field_11033);
        }
        if (set.contains(class07211.field_11036)) {
            this.N[n3++] = new class01706(new class01699[]{class016994, class016995, class016999, class016998}, f19, f24, f20, f23, f10, f11, bl, class07211.field_11036);
        }
        if (set.contains(class07211.field_11039)) {
            this.N[n3++] = new class01706(new class01699[]{class016992, class016996, class016999, class016995}, f17, f24, f18, f25, f10, f11, bl, class07211.field_11039);
        }
        if (set.contains(class07211.field_11043)) {
            this.N[n3++] = new class01706(new class01699[]{class016993, class016992, class016995, class016994}, f18, f24, f19, f25, f10, f11, bl, class07211.field_11043);
        }
        if (set.contains(class07211.field_11034)) {
            this.N[n3++] = new class01706(new class01699[]{class016997, class016993, class016994, class016998}, f19, f24, f21, f25, f10, f11, bl, class07211.field_11034);
        }
        if (set.contains(class07211.field_11035)) {
            this.N[n3] = new class01706(new class01699[]{class016996, class016997, class016998, class016999}, f21, f24, f22, f25, f10, f11, bl, class07211.field_11035);
        }
    }

    private void N(class01423 class014232, class01391 class013912, int n, int n2, int n3, CallbackInfo callbackInfo) {
        VertexBufferWriter vertexBufferWriter = VertexConsumerUtils.convertOrLog((class01391)class013912);
        if (vertexBufferWriter == null) {
            return;
        }
        callbackInfo.cancel();
        EntityRenderer.renderCuboid((class01423)class014232, (VertexBufferWriter)vertexBufferWriter, (ModelCuboid)this.B, (int)n, (int)n2, (int)ColorARGB.toABGR((int)n3));
    }

    private void N(class01687 class016872, float f, int n, int n2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean bl, float f11, float f12, Set set) {
        this.B = new ModelCuboid(n, n2, f2, f3, f4, f5, f6, f7, f8, f9, f10, bl, f11, f12, set);
        this.y = f;
    }

    public void N(class01423 class014232, class01391 class013912, int n, int n2, int n3) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class014232, class013912, n, n2, n3, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        Matrix4f matrix4f = class014232.N();
        Vector3f vector3f = new Vector3f();
        for (class01706 class017062 : this.N) {
            Vector3f vector3f2 = class014232.N(class017062.y(), vector3f);
            float f = vector3f2.x();
            float f2 = vector3f2.y();
            float f3 = vector3f2.z();
            for (class01699 class016992 : class017062.N()) {
                float f4 = class016992.N();
                float f5 = class016992.y();
                float f6 = class016992.L();
                Vector3f vector3f3 = matrix4f.transformPosition(f4, f5, f6, vector3f);
                class013912.N(vector3f3.x(), vector3f3.y(), vector3f3.z(), n3, class016992.M(), class016992.B(), n2, n, f, f2, f3);
            }
        }
    }
}

