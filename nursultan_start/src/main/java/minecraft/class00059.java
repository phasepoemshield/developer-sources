/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class02233
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class06889
 *  org.lwjgl.system.MemoryStack
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import minecraft.class02233;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class06889;
import org.lwjgl.system.MemoryStack;

public class class00059
implements AutoCloseable {
    public static final int N = new Std140SizeCalculator().putIVec3().putVec3().putVec2().putFloat().putFloat().putInt().putInt().get();
    private final GpuBuffer y = RenderSystem.getDevice().createBuffer(() -> "Global Settings UBO", 136, (long)N);

    @Override
    public void close() {
        this.y.close();
    }

    public void N(int n, int n2, double d, long l, class02233 class022332, int n3, class05363 class053632, boolean bl) {
        class06889 class068892 = class053632.y();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            int n4 = class04995.N((double)class068892.M);
            int n5 = class04995.N((double)class068892.B);
            int n6 = class04995.N((double)class068892.Z);
            ByteBuffer byteBuffer = Std140Builder.onStack((MemoryStack)memoryStack, (int)N).putIVec3(n4, n5, n6).putVec3((float)((double)n4 - class068892.M), (float)((double)n5 - class068892.B), (float)((double)n6 - class068892.Z)).putVec2((float)n, (float)n2).putFloat((float)d).putFloat(((float)(l % 24000L) + class022332.N(false)) / 24000.0f).putInt(n3).putInt(bl ? 1 : 0).get();
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.y.slice(), byteBuffer);
        }
        RenderSystem.setGlobalSettingsUniform((GpuBuffer)this.y);
    }
}

