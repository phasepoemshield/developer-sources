/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01289
 *  minecraft.class02150
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.common.ai.WeightedListIterable
 *  net.caffeinemc.mods.lithium.common.ai.brain.RunningPolicyNoStream
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01289;
import minecraft.class02150;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05748;
import minecraft.class05753;
import minecraft.class05769;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.common.ai.WeightedListIterable;
import net.caffeinemc.mods.lithium.common.ai.brain.RunningPolicyNoStream;

public class class05736<E extends class07438>
implements class04142<E> {
    private final Map<class05378<?>, class05367> N;
    private final Set<class05378<?>> y;
    private final class05753 L;
    private final class05769 u;
    private final class02150<class04142<? super E>> i = new class02150();
    private class05748 R = class05748.field_18337;

    private static /* synthetic */ boolean L(class04142 class041422) {
        return class041422.method_18921() == class05748.field_18338;
    }

    public class05736(Map<class05378<?>, class05367> map, Set<class05378<?>> set, class05753 class057532, class05769 class057692, List<Pair<? extends class04142<? super E>, Integer>> list) {
        this.N = map;
        this.y = set;
        this.L = class057532;
        this.u = class057692;
        list.forEach(pair -> this.i.N((Object)((class04142)pair.getFirst()), ((Integer)pair.getSecond()).intValue()));
    }

    public String toString() {
        Set set = this.i.y().filter(class041422 -> class041422.method_18921() == class05748.field_18338).collect(Collectors.toSet());
        return "(" + this.getClass().getSimpleName() + "): " + String.valueOf(set);
    }

    private static /* synthetic */ boolean u(class04142 class041422) {
        return class041422.method_18921() == class05748.field_18338;
    }

    private static /* synthetic */ void y(class04782 class047822, class07438 class074382, long l, class04142 class041422) {
        class041422.method_18923(class047822, class074382, l);
    }

    private static /* synthetic */ boolean y(class04142 class041422) {
        return class041422.method_18921() == class05748.field_18338;
    }

    private boolean N(E e) {
        for (Map.Entry<class05378<?>, class05367> entry : this.N.entrySet()) {
            class05378<?> var4 = entry.getKey();
            class05367 class053672 = entry.getValue();
            if (e.method_18868().N_22(var4, class053672)) continue;
            return false;
        }
        return true;
    }

    public final void N(class05769 class057692, Stream stream, class04782 class047822, class07438 class074382, long l, Operation operation) {
        class05769 class057693 = class057692;
        if (class057693 instanceof RunningPolicyNoStream) {
            ((RunningPolicyNoStream)class057693).lithium$apply(this.i, class047822, class074382, l);
        } else {
            operation.call(new Object[]{class057692, stream, class047822, class074382, l});
        }
    }

    private static /* synthetic */ void N(class04782 class047822, class07438 class074382, long l, class04142 class041422) {
        class041422.method_18925(class047822, class074382, l);
    }

    public String method_46910() {
        return this.getClass().getSimpleName();
    }

    public final void method_18925(class04782 class047822, class07438 class074382, long l) {
        this.R = class05748.field_18337;
        for (class04142 class041422 : WeightedListIterable.cast(this.i)) {
            if (class041422.method_18921() != class05748.field_18338) continue;
            class041422.method_18925(class047822, class074382, l);
        }
        class01289 var5 = class074382.method_18868();
        for (class05378<?> var7 : this.y) {
            var5.y(var7);
        }
    }

    public final void method_18923(class04782 class047822, class07438 class074382, long l) {
        boolean bl = false;
        for (class04142 class041422 : WeightedListIterable.cast(this.i)) {
            if (class041422.method_18921() != class05748.field_18338) continue;
            class041422.method_18923(class047822, class074382, l);
            bl |= class041422.method_18921() == class05748.field_18338;
        }
        if (!bl) {
            this.method_18925(class047822, class074382, l);
        }
    }

    public class05748 method_18921() {
        return this.R;
    }

    public final boolean method_18922(class04782 class047822, E e, long l) {
        if (this.N(e)) {
            this.R = class05748.field_18338;
            this.L.N(this.i);
            long l2 = l;
            E e2 = e;
            class04782 class047823 = class047822;
            Stream stream = this.i.y();
            class05769 class057692 = this.u;
            this.N(class057692, stream, class047823, (class07438)e2, l2, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)5, (String)"[net.minecraft.class_4103$class_4216, java.util.stream.Stream, net.minecraft.class_3218, net.minecraft.class_1309, long]");
                ((class05769)((Object)((Object)objectArray[0]))).N((Stream)objectArray[1], (class04782)objectArray[2], (class07438)objectArray[3], (Long)objectArray[4]);
                return null;
            });
            return true;
        }
        return false;
    }
}

