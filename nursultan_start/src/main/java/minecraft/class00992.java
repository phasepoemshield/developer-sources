/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  minecraft.class00438
 *  minecraft.class00977
 *  minecraft.class03063
 *  minecraft.class03386
 *  minecraft.class05436
 *  minecraft.class06202
 *  minecraft.class07937
 *  minecraft.class08066
 *  minecraft.class08627
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.fantastic.ParticleRenderingPhase
 *  net.irisshaders.iris.fantastic.PhasedParticleEngine
 *  net.irisshaders.iris.pipeline.WorldRenderingPhase
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Queue;
import minecraft.class00438;
import minecraft.class00977;
import minecraft.class03063;
import minecraft.class03386;
import minecraft.class05436;
import minecraft.class06202;
import minecraft.class07937;
import minecraft.class08066;
import minecraft.class08627;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.fantastic.ParticleRenderingPhase;
import net.irisshaders.iris.fantastic.PhasedParticleEngine;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00992
implements AutoCloseable,
PhasedParticleEngine {
    private final Queue<class00438> N;
    private final List<class00438> y;
    private WorldRenderingPhase L = WorldRenderingPhase.NONE;
    private ParticleRenderingPhase u = ParticleRenderingPhase.EVERYTHING;

    public class00992() {
        this.N = new ArrayDeque<class00438>();
        this.y = new ArrayList<class00438>();
    }

    @Override
    public void close() {
        this.N.forEach(class00438::close);
    }

    private void y(class07937 class079372, CallbackInfo callbackInfo) {
        Iris.getPipelineManager().getPipeline().ifPresent(worldRenderingPipeline -> worldRenderingPipeline.setPhase(this.L));
    }

    private void N(RenderPass renderPass, CallbackInfo callbackInfo) {
        GpuBufferSlice gpuBufferSlice;
        GpuBuffer gpuBuffer = RenderSystem.getGlobalSettingsUniform();
        if (gpuBuffer != null) {
            renderPass.setUniform("Globals", gpuBuffer);
        }
        if ((gpuBufferSlice = RenderSystem.getShaderLights()) != null) {
            renderPass.setUniform("Lighting", gpuBufferSlice);
        }
    }

    public void N(class07937 class079372) {
        this.N(class079372, null);
        if (class079372.U().isEmpty()) {
            this.y(class079372, null);
            return;
        }
        GpuDevice gpuDevice = RenderSystem.getDevice();
        class06202 class062022 = class06202.Nq();
        class08627 class086272 = class062022.NO();
        class08066 class080662 = class062022.e();
        class03063 class030632 = (class03063)class062022.B_2;
        class08066 class080663 = this.N(class030632, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_761]");
            return ((class03063)objectArray[0]).T();
        });
        for (class05436 class054362 : class079372.U()) {
            class00438 class004382 = this.N.poll();
            if (class004382 == null) {
                class004382 = new class00438();
            }
            this.y.add(class004382);
            class00438 class004383 = class004382;
            class030632 = class054362;
            class00977 class009772 = this.N((class05436)class030632, class004383, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_11659$class_11947, net.minecraft.class_11977$class_12051]");
                return ((class05436)objectArray[0]).N((class00438)objectArray[1]);
            });
            if (class009772 == null) continue;
            try (RenderPass renderPass = gpuDevice.createCommandEncoder().createRenderPass(() -> "Particles - Main", class080662.u(), OptionalInt.empty(), class080662.R(), OptionalDouble.empty());){
                this.N(renderPass);
                class054362.N(class009772, class004382, renderPass, class086272, false);
                if (class080663 == null) {
                    class054362.N(class009772, class004382, renderPass, class086272, true);
                }
            }
            if (class080663 == null) continue;
            renderPass = gpuDevice.createCommandEncoder().createRenderPass(() -> "Particles - Transparent", class080663.u(), OptionalInt.empty(), class080663.R(), OptionalDouble.empty());
            try {
                this.N(renderPass);
                class054362.N(class009772, class004382, renderPass, class086272, true);
            }
            finally {
                if (renderPass == null) continue;
                renderPass.close();
            }
        }
        this.y(class079372, null);
    }

    public void N() {
        Iterator<class00438> var1 = this.y.iterator();
        while (var1.hasNext()) {
            var1.next().y();
        }
        this.N.addAll(this.y);
        this.y.clear();
    }

    private void N(RenderPass renderPass) {
        this.N(renderPass, null);
        renderPass.setUniform("Projection", RenderSystem.getProjectionMatrixBuffer());
        renderPass.setUniform("Fog", RenderSystem.getShaderFog());
        renderPass.bindTexture("Sampler2", ((class03386)class06202.Nq().i_5).T().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR));
    }

    private void N(class07937 class079372, CallbackInfo callbackInfo) {
        Iris.getPipelineManager().getPipeline().ifPresent(worldRenderingPipeline -> {
            this.L = worldRenderingPipeline.getPhase();
            worldRenderingPipeline.setPhase(WorldRenderingPhase.PARTICLES);
        });
    }

    private class08066 N(class03063 class030632, Operation operation) {
        return this.u == ParticleRenderingPhase.OPAQUE ? null : (class08066)operation.call(new Object[]{class030632});
    }

    private class00977 N(class05436 class054362, class00438 class004382, Operation operation) {
        class06202 class062022 = class06202.Nq();
        class08627 class086272 = class062022.NO();
        class08066 class080662 = class062022.e();
        class08066 class080663 = this.u == ParticleRenderingPhase.OPAQUE ? null : ((class03063)class062022.B_2).T();
        GpuDevice gpuDevice = RenderSystem.getDevice();
        class00977 class009772 = (class00977)operation.call(new Object[]{class054362, class004382});
        if (class009772 != null) {
            try (RenderPass renderPass = gpuDevice.createCommandEncoder().createRenderPass(() -> "Particles - Main", class080662.u(), OptionalInt.empty(), class080662.R(), OptionalDouble.empty());){
                this.N(renderPass);
                if (this.u == ParticleRenderingPhase.EVERYTHING || this.u == ParticleRenderingPhase.OPAQUE) {
                    class054362.N(class009772, class004382, renderPass, class086272, false);
                }
                if (class080663 == null && (this.u == ParticleRenderingPhase.EVERYTHING || this.u == ParticleRenderingPhase.TRANSLUCENT)) {
                    class054362.N(class009772, class004382, renderPass, class086272, true);
                }
            }
            if (class080663 != null && (this.u == ParticleRenderingPhase.EVERYTHING || this.u == ParticleRenderingPhase.TRANSLUCENT)) {
                renderPass = gpuDevice.createCommandEncoder().createRenderPass(() -> "Particles - Transparent", class080663.u(), OptionalInt.empty(), class080663.R(), OptionalDouble.empty());
                try {
                    this.N(renderPass);
                    class054362.N(class009772, class004382, renderPass, class086272, true);
                }
                finally {
                    if (renderPass != null) {
                        renderPass.close();
                    }
                }
            }
        }
        return null;
    }

    public void setParticleRenderingPhase(ParticleRenderingPhase particleRenderingPhase) {
        this.u = particleRenderingPhase;
    }
}

