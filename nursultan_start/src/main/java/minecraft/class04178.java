/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Comparators
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class00381
 *  minecraft.class00481
 *  minecraft.class00514
 *  minecraft.class00570
 *  minecraft.class01615
 *  minecraft.class01632
 *  minecraft.class01658
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06265
 *  minecraft.class07321
 *  minecraft.class07529
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentChange
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Comparators;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import minecraft.class00381;
import minecraft.class00481;
import minecraft.class00514;
import minecraft.class00570;
import minecraft.class01615;
import minecraft.class01632;
import minecraft.class01658;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06265;
import minecraft.class07321;
import minecraft.class07529;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import org.slf4j.Logger;

public class class04178 {
    private static final Logger L = LogUtils.getLogger();
    public static final float N = 0.01f;
    public static final float y = 64.0f;
    private static final float u = 9.0f;
    private static final int i = 10;
    private final LongSet R = new LongOpenHashSet();
    private final boolean M;
    private float B = 9.0f;
    private float Z;
    private int z;
    private int U = 1;

    public class04178(boolean bl) {
        this.M = bl;
    }

    public void N(float f) {
        --this.z;
        float f2 = this.B = Double.isNaN(f) ? 0.01f : class04995.N((float)f, (float)0.01f, (float)64.0f);
        if (this.z == 0) {
            this.Z = 1.0f;
        }
        this.U = 10;
    }

    public boolean N(long l) {
        return this.R.contains(l);
    }

    private static /* synthetic */ int N(class07321 class073212, class00570 class005702) {
        return class073212.y(class005702.R());
    }

    private void N(class01615 class016152, class04782 class047822, class00570 class005702, Operation operation, class04770 class047702) {
        operation.call(new Object[]{class016152, class047822, class005702});
        ArrayList arrayList = new ArrayList();
        ((AttachmentTargetImpl)class005702).fabric_computeInitialSyncChanges(class047702, arrayList::add);
        if (!arrayList.isEmpty()) {
            AttachmentChange.partitionAndSendPackets(arrayList, (class04770)class047702);
        }
    }

    public void N(class00570 class005702) {
        this.R.add(class005702.R().y());
    }

    public void N(class04770 class047702, class07321 class073212) {
        if (!this.R.remove(class073212.y()) && class047702.method_5805()) {
            class047702.field_13987.method_14364((class00381)new class00481(class073212));
        }
    }

    public void N(class04770 class047702) {
        if (this.z >= this.U) {
            return;
        }
        float f = Math.max(1.0f, this.B);
        this.Z = Math.min(this.Z + this.B, f);
        if (this.Z < 1.0f) {
            return;
        }
        if (this.R.isEmpty()) {
            return;
        }
        class04782 class047822 = class047702.method_51469();
        class06265 class062652 = class047822.method_14178().L;
        List<class00570> var5 = this.N(class062652, class047702.method_31476());
        if (var5.isEmpty()) {
            return;
        }
        class01615 class016152 = class047702.field_13987;
        ++this.z;
        class016152.method_14364((class00381)class01632.N);
        Iterator<class00570> var7 = var5.iterator();
        while (var7.hasNext()) {
            class00570 class005702;
            class00570 class005703 = class005702 = var7.next();
            class04782 class047823 = class047822;
            class01615 class016153 = class016152;
            this.N(class016153, class047823, class005703, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_3244, net.minecraft.class_3218, net.minecraft.class_2818]");
                Object[] objectArray2 = objectArray;
                class04178.N((class01615)objectArray[0], (class04782)objectArray2[1], (class00570)objectArray2[2]);
                return null;
            }, class047702);
        }
        class016152.method_14364((class00381)new class01658(var5.size()));
        this.Z -= (float)var5.size();
    }

    private static void N(class01615 class016152, class04782 class047822, class00570 class005702) {
        class016152.method_14364((class00381)new class00514(class005702, class047822.method_22336(), null, null));
        class07321 class073212 = class005702.R();
        if (class07529.H) {
            L.debug("SEN {}", (Object)class073212);
        }
        class047822.method_74535().N(class016152.field_14140, class005702.R());
    }

    /*
     * Unable to fully structure code
     */
    private List<class00570> N(class06265 var1_1, class07321 var2_2) {
        var4_3 = class04995.y((float)this.Z);
        if (this.M) ** GOTO lbl7
        if (this.R.size() <= var4_3) {
lbl7:
            // 2 sources

            var3_4 = this.R.longStream().mapToObj((LongFunction<class00570>)LambdaMetafactory.metafactory(null, null, null, (J)Ljava/lang/Object;, R(long ), (J)Lminecraft/class00570;)((class06265)var1_1)).filter((Predicate<class00570>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, nonNull(java.lang.Object ), (Lminecraft/class00570;)Z)()).sorted(Comparator.comparingInt((ToIntFunction<class00570>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, N(minecraft.class07321 minecraft.class00570 ), (Lminecraft/class00570;)I)((class07321)var2_2))).toList();
        } else {
            var3_4 = ((List)this.R.stream().collect(Comparators.least((int)var4_3, Comparator.comparingInt((ToIntFunction<Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, L(long ), (Ljava/lang/Long;)I)((class07321)var2_2))))).stream().mapToLong((ToLongFunction<Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)J, longValue(), (Ljava/lang/Long;)J)()).mapToObj((LongFunction<class00570>)LambdaMetafactory.metafactory(null, null, null, (J)Ljava/lang/Object;, R(long ), (J)Lminecraft/class00570;)((class06265)var1_1)).filter((Predicate<class00570>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, nonNull(java.lang.Object ), (Lminecraft/class00570;)Z)()).toList();
        }
        for (class00570 var6_6 : var3_4) {
            this.R.remove(var6_6.R().y());
        }
        return var3_4;
    }
}

