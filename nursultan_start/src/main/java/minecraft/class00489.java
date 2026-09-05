/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  io.netty.channel.ChannelHandlerContext
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00657
 *  minecraft.class00667
 *  minecraft.class01637
 *  minecraft.class01638
 *  minecraft.class01644
 *  minecraft.class01659
 *  minecraft.class01662
 *  minecraft.class01668
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class07536
 *  net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec
 *  net.fabricmc.fabric.impl.networking.GenericPayloadAccessor
 *  net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl
 *  net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter
 *  net.fabricmc.fabric.impl.networking.splitter.SplittablePacket
 */
package minecraft;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import io.netty.channel.ChannelHandlerContext;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class00657;
import minecraft.class00667;
import minecraft.class01637;
import minecraft.class01638;
import minecraft.class01644;
import minecraft.class01659;
import minecraft.class01662;
import minecraft.class01668;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class07536;
import net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec;
import net.fabricmc.fabric.impl.networking.GenericPayloadAccessor;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter;
import net.fabricmc.fabric.impl.networking.splitter.SplittablePacket;

public final class class00489
extends Record
implements class00381<class01662>,
GenericPayloadAccessor,
SplittablePacket {
    private final class01659 payload;
    public static final int N = 0x100000;
    public static final class02362<class04247, class00489> y;
    public static final class02362<class00667, class00489> L;

    public class00489(class01659 class016592) {
        this.payload = class016592;
    }

    static {
        List<class01668> list = (List<class01668>)class07536.N((Object)Lists.newArrayList((Object[])new class01668[]{new class01668(class01644.y, class01644.N)}), (T arrayList) -> {});
        class01637 class016372 = class018942 -> class01638.N((class01894)class018942, (int)0x100000);
        y = class00489.N(class016372, list, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_8710$class_9153, java.util.List]");
            return class01659.N((class01637)((class01637)objectArray[0]), (List)((List)objectArray[1]));
        }).N_10(class00489::new, class00489::N);
        list = List.of(new class01668(class01644.y, class01644.N));
        class016372 = class018942 -> class01638.N((class01894)class018942, (int)0x100000);
        L = class00489.y(class016372, list, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_8710$class_9153, java.util.List]");
            return class01659.N((class01637)((class01637)objectArray[0]), (List)((List)objectArray[1]));
        }).N_10(class00489::new, class00489::N);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00489.class, "payload", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00489.class, "payload", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00489.class, "payload", "payload"}, this);
    }

    private static class02362 y(class01637 class016372, List list, Operation operation) {
        class02362 class023622 = (class02362)operation.call(new Object[]{class016372, list});
        ((FabricCustomPayloadPacketCodec)class023622).fabric_setPacketCodecProvider((class006672, class018942) -> PayloadTypeRegistryImpl.CONFIGURATION_S2C.get(class018942));
        return class023622;
    }

    private static class02362 N(class01637 class016372, List list, Operation operation) {
        class02362 class023622 = (class02362)operation.call(new Object[]{class016372, list});
        ((FabricCustomPayloadPacketCodec)class023622).fabric_setPacketCodecProvider((class042472, class018942) -> PayloadTypeRegistryImpl.PLAY_S2C.get(class018942));
        return class023622;
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public class01659 N() {
        return this.payload;
    }

    public class02897<class00489> method_65080() {
        return class02885.y;
    }

    public void fabric_split(PayloadTypeRegistryImpl payloadTypeRegistryImpl, ChannelHandlerContext channelHandlerContext, class00657 class006572, class00381 class003812, Consumer consumer) throws Exception {
        int n = payloadTypeRegistryImpl.getMaxPacketSize(this.payload.method_56479().N());
        if (n == -1) {
            consumer.accept((class00381)this);
            return;
        }
        FabricPacketSplitter.genericPacketSplitter((class01894)this.payload.method_56479().N(), (ChannelHandlerContext)channelHandlerContext, (class00657)class006572, (class00381)class003812, class00489::new, (Consumer)consumer, (int)0x100000, (int)n);
    }

    public class01659 fabric_payload() {
        return this.payload;
    }
}

