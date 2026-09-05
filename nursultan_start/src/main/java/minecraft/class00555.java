/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  minecraft.class00069
 *  minecraft.class00084
 *  minecraft.class00312
 *  minecraft.class01894
 *  minecraft.class02452
 *  minecraft.class02725
 *  minecraft.class02734
 *  minecraft.class08066
 *  minecraft.class08178
 *  org.lwjgl.system.MemoryStack
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import minecraft.class00069;
import minecraft.class00084;
import minecraft.class00312;
import minecraft.class00527;
import minecraft.class00542;
import minecraft.class01894;
import minecraft.class02452;
import minecraft.class02725;
import minecraft.class02734;
import minecraft.class08066;
import minecraft.class08178;
import org.lwjgl.system.MemoryStack;

public class class00555
implements AutoCloseable {
    private static final int N = new Std140SizeCalculator().putVec2().get();
    private final String y;
    private final RenderPipeline L;
    private final class01894 u;
    private final Map<String, GpuBuffer> i = new HashMap<String, GpuBuffer>();
    private final class00084 R;
    private final List<class00542> M;

    public class00555(RenderPipeline renderPipeline, class01894 class018942, Map<String, List<class00069>> map, List<class00542> list) {
        this.L = renderPipeline;
        this.y = renderPipeline.getLocation().toString();
        this.u = class018942;
        this.M = list;
        for (Map.Entry<String, List<class00069>> entry : map.entrySet()) {
            class00069 class0006922;
            List<class00069> list2 = entry.getValue();
            if (list2.isEmpty()) continue;
            Std140SizeCalculator std140SizeCalculator = new Std140SizeCalculator();
            for (class00069 class0006922 : list2) {
                class0006922.N(std140SizeCalculator);
            }
            int n = std140SizeCalculator.get();
            class0006922 = MemoryStack.stackPush();
            try {
                Std140Builder std140Builder = Std140Builder.onStack((MemoryStack)class0006922, (int)n);
                Iterator<class00069> iterator = list2.iterator();
                while (iterator.hasNext()) {
                    iterator.next().N(std140Builder);
                }
                this.i.put(entry.getKey(), RenderSystem.getDevice().createBuffer(() -> this.y + " / " + (String)entry.getKey(), 128, std140Builder.get()));
            }
            finally {
                if (class0006922 == null) continue;
                class0006922.close();
            }
        }
        this.R = new class00084(() -> this.y + " SamplerInfo", 130, (list.size() + 1) * N);
    }

    @Override
    public void close() {
        Iterator<GpuBuffer> var1 = this.i.values().iterator();
        while (var1.hasNext()) {
            var1.next().close();
        }
        this.R.close();
    }

    public void N(class02734 class027342, Map<class01894, class02452<class08066>> map, GpuBufferSlice gpuBufferSlice) {
        class02725 class027252 = class027342.N(this.y);
        Iterator<class00542> var5 = this.M.iterator();
        while (var5.hasNext()) {
            var5.next().N(class027252, map);
        }
        class02452 class024523 = map.computeIfPresent(this.u, (class018942, class024522) -> class027252.y(class024522));
        if (class024523 == null) {
            throw new IllegalStateException("Missing handle for target " + String.valueOf(this.u));
        }
        class027252.N(() -> {
            class08066 class080662 = (class08066)class024523.get();
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix((GpuBufferSlice)gpuBufferSlice, (class00312)class00312.field_54954);
            CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
            class08178 class081782 = RenderSystem.getSamplerCache();
            List list = this.M.stream().map(class005422 -> new class00527(class005422.N(), class005422.y(map), class081782.N(class005422.y() ? FilterMode.LINEAR : FilterMode.NEAREST))).toList();
            try (GpuBuffer.MappedView mappedView = commandEncoder.mapBuffer(this.R.y(), false, true);){
                Std140Builder object = Std140Builder.intoBuffer((ByteBuffer)mappedView.data());
                object.putVec2((float)class080662.N, (float)class080662.y);
                for (class00527 class005272 : list) {
                    object.putVec2((float)class005272.y().getWidth(0), (float)class005272.y().getHeight(0));
                }
            }
            mappedView = commandEncoder.createRenderPass(() -> "Post pass " + this.y, class080662.u(), OptionalInt.empty(), class080662.u ? class080662.R() : null, OptionalDouble.empty());
            try {
                mappedView.setPipeline(this.L);
                RenderSystem.bindDefaultUniforms((RenderPass)mappedView);
                mappedView.setUniform("SamplerInfo", this.R.y());
                for (Map.Entry<String, GpuBuffer> entry : this.i.entrySet()) {
                    mappedView.setUniform(entry.getKey(), entry.getValue());
                }
                for (class00527 class005273 : list) {
                    mappedView.bindTexture(class005273.N() + "Sampler", class005273.y(), class005273.L());
                }
                mappedView.draw(0, 3);
            }
            finally {
                if (mappedView != null) {
                    mappedView.close();
                }
            }
            this.R.L();
            RenderSystem.restoreProjectionMatrix();
            for (class00542 class005423 : this.M) {
                class005423.N(map);
            }
        });
    }
}

