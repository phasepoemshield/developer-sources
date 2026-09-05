/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  java.util.SequencedMap
 *  minecraft.class02578
 *  minecraft.class02579
 *  minecraft.class02583
 *  minecraft.class02609
 *  minecraft.class02613
 *  minecraft.class03337
 *  minecraft.class07311
 *  minecraft.class07331
 *  net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters
 *  net.caffeinemc.mods.sodium.client.util.sorting.VertexSortingExtended
 *  net.caffeinemc.mods.sodium.mixin.features.render.immediate.buffer_builder.sorting.MeshDataAccessor
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class02578;
import minecraft.class02579;
import minecraft.class02583;
import minecraft.class02609;
import minecraft.class02613;
import minecraft.class03337;
import minecraft.class07311;
import minecraft.class07331;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSortingExtended;
import net.caffeinemc.mods.sodium.mixin.features.render.immediate.buffer_builder.sorting.MeshDataAccessor;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01422
implements class01407 {
    protected final class02579 L;
    protected final SequencedMap<class07311, class02579> u;
    protected final Map<class07311, class07331> i = new HashMap<class07311, class07331>();
    protected @Nullable class07311 R;
    private static final int N = 6;

    public void L() {
        if (this.R != null) {
            this.N(this.R);
            this.R = null;
        }
    }

    protected class01422(class02579 class025792, SequencedMap<class07311, class02579> sequencedMap) {
        this.L = class025792;
        this.u = sequencedMap;
    }

    public void u() {
        this.L();
        for (class07311 class073112 : this.u.keySet()) {
            this.N(class073112);
        }
    }

    private void y(class07311 class073112, class07331 class073312, CallbackInfo callbackInfo) {
        if (this.N()) {
            ImmediateState.renderWithExtendedVertexFormat = true;
        }
    }

    private static void y(long l, int[] nArray) {
        for (int n : nArray) {
            MemoryUtil.memPutShort((long)(l + 0L), (short)((short)(n * 4 + 0)));
            MemoryUtil.memPutShort((long)(l + 2L), (short)((short)(n * 4 + 1)));
            MemoryUtil.memPutShort((long)(l + 4L), (short)((short)(n * 4 + 2)));
            MemoryUtil.memPutShort((long)(l + 6L), (short)((short)(n * 4 + 2)));
            MemoryUtil.memPutShort((long)(l + 8L), (short)((short)(n * 4 + 3)));
            MemoryUtil.memPutShort((long)(l + 10L), (short)((short)(n * 4 + 0)));
            l += 12L;
        }
    }

    private static void N(long l, int[] nArray) {
        for (int n : nArray) {
            MemoryUtil.memPutInt((long)(l + 0L), (int)(n * 4 + 0));
            MemoryUtil.memPutInt((long)(l + 4L), (int)(n * 4 + 1));
            MemoryUtil.memPutInt((long)(l + 8L), (int)(n * 4 + 2));
            MemoryUtil.memPutInt((long)(l + 12L), (int)(n * 4 + 2));
            MemoryUtil.memPutInt((long)(l + 16L), (int)(n * 4 + 3));
            MemoryUtil.memPutInt((long)(l + 20L), (int)(n * 4 + 0));
            l += 24L;
        }
    }

    private static class02613 N(class02609 class026092, class02579 class025792, int[] nArray) {
        VertexFormat.class_5595 class_55952 = class026092.L().i();
        long l = class025792.y(nArray.length * 6 * class_55952.field_27375);
        if (class_55952 == VertexFormat.class_5595.field_27372) {
            class01422.y(l, nArray);
        } else if (class_55952 == VertexFormat.class_5595.field_27373) {
            class01422.N(l, nArray);
        } else {
            throw new UnsupportedOperationException();
        }
        return class025792.N();
    }

    private static void N(class02609 class026092, class02579 class025792, VertexSortingExtended vertexSortingExtended) {
        class02583 class025832 = class026092.L();
        if (class025832.u() != VertexFormat.class_5596.field_27382) {
            return;
        }
        int[] nArray = VertexSorters.sort((ByteBuffer)class026092.N(), (int)class025832.y(), (int)class025832.N().getVertexSize(), (VertexSortingExtended)vertexSortingExtended);
        class02613 class026132 = class01422.N(class026092, class025792, nArray);
        ((MeshDataAccessor)class026092).sodium$setIndexBuffer(class026132);
    }

    private boolean N() {
        return !ImmediateState.isRenderingLevel;
    }

    public void N(class07311 class073112) {
        class07331 class073312 = this.i.remove(class073112);
        if (class073312 != null) {
            this.N(class073112, class073312);
        }
    }

    private void N(class07311 class073112, class07331 class073312) {
        class02609 class026092 = class073312.N();
        if (class026092 != null) {
            if (class073112.method_60894()) {
                class02579 class025792 = (class02579)this.u.getOrDefault((Object)class073112, (Object)this.L);
                class03337 class033372 = RenderSystem.getProjectionType().N();
                class02579 class025793 = class025792;
                class02609 class026093 = class026092;
                this.N(class026093, class025793, class033372, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_9801, net.minecraft.class_9799, net.minecraft.class_8251]");
                    Object[] objectArray2 = objectArray;
                    return ((class02609)objectArray[0]).N((class02579)objectArray2[1], (class03337)objectArray2[2]);
                });
            }
            this.N(class073112, class073312, null);
            class073112.method_60895(class026092);
            this.y(class073112, class073312, null);
        }
        if (class073112.equals(this.R)) {
            this.R = null;
        }
    }

    private class07331 N(class02579 class025792, VertexFormat.class_5596 class_55962, VertexFormat vertexFormat, Operation operation) {
        ImmediateState.skipExtension.set(this.N());
        class07331 class073312 = (class07331)operation.call(new Object[]{class025792, class_55962, vertexFormat});
        ImmediateState.skipExtension.set(false);
        return class073312;
    }

    private void N(class07311 class073112, class07331 class073312, CallbackInfo callbackInfo) {
        if (this.N()) {
            ImmediateState.renderWithExtendedVertexFormat = false;
        }
    }

    private class02578 N(class02609 class026092, class02579 class025792, class03337 class033372, Operation operation) {
        if (!(class033372 instanceof VertexSortingExtended)) {
            return (class02578)operation.call(new Object[]{class026092, class025792, class033372});
        }
        VertexSortingExtended vertexSortingExtended = (VertexSortingExtended)class033372;
        class01422.N(class026092, class025792, vertexSortingExtended);
        return null;
    }

    @Override
    public class01391 method_73477(class07311 class073112) {
        class07331 class073312 = this.i.get(class073112);
        if (class073312 != null && !class073112.method_43332()) {
            this.N(class073112, class073312);
            class073312 = null;
        }
        if (class073312 != null) {
            return class073312;
        }
        class02579 class025792 = (class02579)this.u.get((Object)class073112);
        if (class025792 != null) {
            VertexFormat vertexFormat = class073112.method_23031();
            VertexFormat.class_5596 class_55962 = class073112.method_23033();
            class02579 class025793 = class025792;
            class073312 = this.N(class025793, class_55962, vertexFormat, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_9799, com.mojang.blaze3d.vertex.VertexFormat$class_5596, com.mojang.blaze3d.vertex.VertexFormat]");
                return new class07331((class02579)objectArray[0], (VertexFormat.class_5596)objectArray[1], (VertexFormat)objectArray[2]);
            });
        } else {
            if (this.R != null) {
                this.N(this.R);
            }
            VertexFormat vertexFormat = class073112.method_23031();
            VertexFormat.class_5596 class_55963 = class073112.method_23033();
            class02579 class025794 = this.L;
            class073312 = this.N(class025794, class_55963, vertexFormat, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_9799, com.mojang.blaze3d.vertex.VertexFormat$class_5596, com.mojang.blaze3d.vertex.VertexFormat]");
                return new class07331((class02579)objectArray[0], (VertexFormat.class_5596)objectArray[1], (VertexFormat)objectArray[2]);
            });
            this.R = class073112;
        }
        this.i.put(class073112, class073312);
        return class073312;
    }
}

