/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderPass$class_10884
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class02579
 *  minecraft.class02609
 *  minecraft.class03063
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class06969
 *  minecraft.class06982
 *  minecraft.class07331
 *  minecraft.class07536
 *  minecraft.class07835
 *  minecraft.class08057
 *  minecraft.class08066
 *  minecraft.class08394
 *  minecraft.class08918
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class02579;
import minecraft.class02609;
import minecraft.class03063;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06969;
import minecraft.class06982;
import minecraft.class07331;
import minecraft.class07536;
import minecraft.class07835;
import minecraft.class08057;
import minecraft.class08066;
import minecraft.class08394;
import minecraft.class08918;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class02410 {
    public static final class01894 N = class01894.y((String)"textures/misc/forcefield.png");
    private boolean y = true;
    private double L;
    private double u;
    private double i;
    private double R;
    private double M;
    private double B;
    private final GpuBuffer Z = RenderSystem.getDevice().createBuffer(() -> "World border vertex buffer", 40, 16L * (long)class07835.Z.getVertexSize());
    private final RenderSystem.class_5590 z = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);

    public void N(class06969 class069692, class06889 class068892, double d, double d2) {
        GpuTextureView gpuTextureView;
        GpuTextureView gpuTextureView2;
        if (class069692.R <= 0.0) {
            return;
        }
        double d3 = class068892.M;
        double d4 = class068892.Z;
        float f = (float)d2;
        float f2 = (float)class02566.L((int)class069692.i) / 255.0f;
        float f3 = (float)class02566.u((int)class069692.i) / 255.0f;
        float f4 = (float)class02566.i((int)class069692.i) / 255.0f;
        float f5 = (float)(class07536.L() % 3000L) / 3000.0f;
        float f6 = (float)(-class04995.R((double)(class068892.B * 0.5)));
        float f7 = f6 + f;
        if (this.N(class069692)) {
            this.N(class069692, d, d4, d3, f, f7, f6);
        }
        class08918 class089182 = class06202.Nq().NO().y(N);
        RenderPipeline renderPipeline = class08394.NQ;
        class08066 class080662 = class06202.Nq().e();
        class08066 class080663 = ((class03063)class06202.Nq().B_2).b();
        if (class080663 != null) {
            gpuTextureView2 = class080663.u();
            gpuTextureView = class080663.R();
        } else {
            gpuTextureView2 = class080662.u();
            gpuTextureView = class080662.R();
        }
        GpuBuffer gpuBuffer = this.z.method_68274(6);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(f2, f3, f4, (float)class069692.R), (Vector3fc)new Vector3f((float)(this.L - d3), (float)(-class068892.B), (float)(this.u - d4)), (Matrix4fc)new Matrix4f().translation(f5, f5, 0.0f));
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "World border", gpuTextureView2, OptionalInt.empty(), gpuTextureView, OptionalDouble.empty());){
            renderPass.setPipeline(renderPipeline);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.setIndexBuffer(gpuBuffer, this.z.method_31924());
            renderPass.bindTexture("Sampler0", class089182.method_71659(), class089182.method_75484());
            renderPass.setVertexBuffer(0, this.Z);
            ArrayList<RenderPass.class_10884> arrayList = new ArrayList<RenderPass.class_10884>();
            for (class06982 class069822 : class069692.N(d3, d4)) {
                if (!(class069822.y() < d)) continue;
                int n = class069822.N().u();
                arrayList.add(new RenderPass.class_10884(0, this.Z, gpuBuffer, this.z.method_31924(), 6 * n, 6));
            }
            renderPass.drawMultipleIndexed(arrayList, null, null, Collections.emptyList(), (Object)this);
        }
    }

    private void N(class06969 class069692, double d, double d2, double d3, float f, float f2, float f3) {
        try (class02579 class025792 = class02579.N((int)(class07835.Z.getVertexSize() * 4 * 4));){
            double d4 = class069692.N;
            double d5 = class069692.y;
            double d6 = class069692.L;
            double d7 = class069692.u;
            double d8 = Math.max((double)class04995.N((double)(d2 - d)), d6);
            double d9 = Math.min((double)class04995.L((double)(d2 + d)), d7);
            float f4 = (float)(class04995.N((double)d8) & 1) * 0.5f;
            float f5 = (float)(d9 - d8) / 2.0f;
            double d10 = Math.max((double)class04995.N((double)(d3 - d)), d4);
            double d11 = Math.min((double)class04995.L((double)(d3 + d)), d5);
            float f6 = (float)(class04995.N((double)d10) & 1) * 0.5f;
            float f7 = (float)(d11 - d10) / 2.0f;
            class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27382, class07835.Z);
            class073312.method_22912(0.0f, -f, (float)(d7 - d8)).method_22913(f6, f2);
            class073312.method_22912((float)(d11 - d10), -f, (float)(d7 - d8)).method_22913(f7 + f6, f2);
            class073312.method_22912((float)(d11 - d10), f, (float)(d7 - d8)).method_22913(f7 + f6, f3);
            class073312.method_22912(0.0f, f, (float)(d7 - d8)).method_22913(f6, f3);
            class073312.method_22912(0.0f, -f, 0.0f).method_22913(f4, f2);
            class073312.method_22912(0.0f, -f, (float)(d9 - d8)).method_22913(f5 + f4, f2);
            class073312.method_22912(0.0f, f, (float)(d9 - d8)).method_22913(f5 + f4, f3);
            class073312.method_22912(0.0f, f, 0.0f).method_22913(f4, f3);
            class073312.method_22912((float)(d11 - d10), -f, 0.0f).method_22913(f6, f2);
            class073312.method_22912(0.0f, -f, 0.0f).method_22913(f7 + f6, f2);
            class073312.method_22912(0.0f, f, 0.0f).method_22913(f7 + f6, f3);
            class073312.method_22912((float)(d11 - d10), f, 0.0f).method_22913(f6, f3);
            class073312.method_22912((float)(d5 - d10), -f, (float)(d9 - d8)).method_22913(f4, f2);
            class073312.method_22912((float)(d5 - d10), -f, 0.0f).method_22913(f5 + f4, f2);
            class073312.method_22912((float)(d5 - d10), f, 0.0f).method_22913(f5 + f4, f3);
            class073312.method_22912((float)(d5 - d10), f, (float)(d9 - d8)).method_22913(f4, f3);
            try (class02609 class026092 = class073312.y();){
                RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.Z.slice(), class026092.N());
            }
            this.i = d4;
            this.R = d5;
            this.M = d6;
            this.B = d7;
            this.L = d10;
            this.u = d8;
            this.y = false;
        }
    }

    public void N() {
        this.y = true;
    }

    private boolean N(class06969 class069692) {
        return this.y || class069692.N != this.i || class069692.L != this.M || class069692.y != this.R || class069692.u != this.B;
    }

    public void N(class08057 class080572, float f, class06889 class068892, double d, class06969 class069692) {
        class069692.N = class080572.N(f);
        class069692.y = class080572.L(f);
        class069692.L = class080572.y(f);
        class069692.u = class080572.u(f);
        if (class068892.M < class069692.y - d && class068892.M > class069692.N + d && class068892.Z < class069692.u - d && class068892.Z > class069692.L + d || class068892.M < class069692.N - d || class068892.M > class069692.y + d || class068892.Z < class069692.L - d || class068892.Z > class069692.u + d) {
            class069692.R = 0.0;
            return;
        }
        class069692.R = 1.0 - class080572.y(class068892.M, class068892.Z) / d;
        class069692.R = Math.pow(class069692.R, 4.0);
        class069692.R = class04995.N((double)class069692.R, (double)0.0, (double)1.0);
        class069692.i = class080572.y().N();
    }
}

