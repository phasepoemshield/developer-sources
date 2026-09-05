/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09882
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalIntRef
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  it.unimi.dsi.fastutil.objects.Object2IntSortedMap
 *  java.util.SequencedSet
 *  minecraft.class00869
 *  minecraft.class01226
 *  minecraft.class01929
 *  minecraft.class03530
 *  minecraft.class03767
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 *  net.caffeinemc.mods.lithium.common.initialization.BlockInfoInitializer
 *  net.fabricmc.fabric.api.registry.FuelRegistryEvents
 *  net.fabricmc.fabric.api.registry.FuelRegistryEvents$BuildCallback
 *  net.fabricmc.fabric.api.registry.FuelRegistryEvents$Context
 *  net.fabricmc.fabric.api.registry.FuelRegistryEvents$ExclusionsCallback
 *  net.fabricmc.fabric.impl.content.registry.FuelRegistryEventsContextImpl
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09882;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;
import minecraft.class00869;
import minecraft.class01226;
import minecraft.class01929;
import minecraft.class03530;
import minecraft.class03767;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;
import net.caffeinemc.mods.lithium.common.initialization.BlockInfoInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.impl.content.registry.FuelRegistryEventsContextImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02755 {
    private final Object2IntSortedMap<class06581> N;

    public class02755(Object2IntSortedMap<class06581> object2IntSortedMap) {
        this.N = object2IntSortedMap;
    }

    public int y(class06584 class065842) {
        if (class065842.R()) {
            return 0;
        }
        return this.N.getInt((Object)class065842.B());
    }

    private static class09882 N(class09882 class098822, class03530 class035302, Operation operation, class01929 class019292, class03767 class037672, int n) {
        FuelRegistryEventsContextImpl fuelRegistryEventsContextImpl = new FuelRegistryEventsContextImpl(class019292, class037672, n);
        ((FuelRegistryEvents.BuildCallback)FuelRegistryEvents.BUILD.invoker()).build(class098822, (FuelRegistryEvents.Context)fuelRegistryEventsContextImpl);
        operation.call(new Object[]{class098822, class035302});
        ((FuelRegistryEvents.ExclusionsCallback)FuelRegistryEvents.EXCLUSIONS.invoker()).buildExclusions(class098822, (FuelRegistryEvents.Context)fuelRegistryEventsContextImpl);
        return class098822;
    }

    private static void N(class01929 class019292, class03767 class037672, int n, CallbackInfoReturnable callbackInfoReturnable) {
        BlockInfoInitializer.initializeBlockInfo();
    }

    private static class09882 N(class09882 class098822, class03530 class035302, Operation operation, LocalRef localRef, LocalRef localRef2, LocalIntRef localIntRef) {
        return class02755.N(class098822, class035302, operation, (class01929)localRef.get(), (class03767)localRef2.get(), localIntRef.get());
    }

    public boolean N(class06584 class065842) {
        return this.N.containsKey((Object)class065842.B());
    }

    public SequencedSet<class06581> N() {
        return Collections.unmodifiableSequencedSet((SequencedSet)this.N.keySet());
    }

    public static class02755 N(class01929 class019292, class03767 class037672) {
        return class02755.N(class019292, class037672, 200);
    }

    public static class02755 N(class01929 class019292, class03767 class037672, int n) {
        class09882 class098822 = new class09882(class019292, class037672).N((class07310)class06570.jW, n * 100).N((class07310)class00869.zv, n * 8 * 10).N((class07310)class06570.nU, n * 12).N((class07310)class06570.sh, n * 8).N((class07310)class06570.sr, n * 8).N(class01226.g, n * 3 / 2).N(class01226.T, n * 3 / 2).N(class01226.y, n * 3 / 2).N((class07310)class00869.d, n * 3 / 2).N(class01226.Z, n * 3 / 2).N((class07310)class00869.ZH, n * 3 / 2).N(class01226.z, n * 3 / 4).N((class07310)class00869.Ut, n * 3 / 4).N(class01226.c, n * 3 / 2).N(class01226.W, n * 3 / 2).N(class01226.m, n * 3 / 2).N(class01226.U, n * 3 / 2).N(class01226.E, n * 3 / 2).N((class07310)class00869.yR, n * 3 / 2).N((class07310)class00869.Lt, n * 3 / 2).N((class07310)class00869.LG, n * 3 / 2).N((class07310)class00869.PD, n * 3 / 2).N((class07310)class00869.iG, n * 3 / 2).N((class07310)class00869.LA, n * 3 / 2).N((class07310)class00869.BH, n * 3 / 2).N((class07310)class00869.LD, n * 3 / 2).N((class07310)class00869.Bp, n * 3 / 2).N(class01226.Nj, n * 3 / 2).N((class07310)class06570.sx, n * 3 / 2).N((class07310)class06570.jr, n * 3 / 2).N((class07310)class00869.uW, n * 3 / 2).N(class01226.Ns, n).N(class01226.NT, n * 4).N((class07310)class06570.TP, n).N((class07310)class06570.Tm, n).N((class07310)class06570.lq, n).N((class07310)class06570.Tb, n).N((class07310)class06570.TT, n).N((class07310)class06570.Ts, n).N(class01226.B, n).N(class01226.yW, n * 6).N(class01226.N, n / 2).N(class01226.u, n / 2).N((class07310)class06570.Tx, n / 2).N(class01226.s, n / 2).N((class07310)class06570.sC, n / 2).N(class01226.M, 1 + n / 3).N((class07310)class00869.mN, 1 + n * 20).N((class07310)class06570.dw, n * 3 / 2).N((class07310)class00869.mx, n / 4).N((class07310)class00869.yQ, n / 2).N((class07310)class00869.yg, n / 2).N((class07310)class00869.yI, n / 2).N((class07310)class00869.Pa, n / 4).N((class07310)class00869.Pp, n * 3 / 2).N((class07310)class00869.PF, n * 3 / 2).N((class07310)class00869.PC, n * 3 / 2).N((class07310)class00869.PS, n * 3 / 2).N((class07310)class00869.Ph, n * 3 / 2).N((class07310)class00869.TL, n * 3 / 2).N((class07310)class00869.vS, n / 2).N((class07310)class00869.vx, n / 2).N((class07310)class00869.NM, n * 3 / 2).N((class07310)class00869.nN, n / 2);
        Operation operation = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_9895$class_9896, net.minecraft.class_6862]");
            return ((class09882)objectArray[0]).N((class03530)objectArray[1]);
        };
        LocalRefImpl localRefImpl = new LocalRefImpl();
        LocalRefImpl localRefImpl2 = new LocalRefImpl();
        LocalIntRefImpl localIntRefImpl = new LocalIntRefImpl();
        localRefImpl.init((Object)class019292);
        localRefImpl2.init((Object)class037672);
        localIntRefImpl.init(n);
        n = localIntRefImpl.dispose();
        class037672 = (class03767)localRefImpl2.dispose();
        class019292 = (class01929)localRefImpl.dispose();
        class02755 class027552 = class02755.N(class098822, class01226.yE, operation, (LocalRef)localRefImpl, (LocalRef)localRefImpl2, (LocalIntRef)localIntRefImpl).N();
        class02755.N(class019292, class037672, n, null);
        return class027552;
    }
}

