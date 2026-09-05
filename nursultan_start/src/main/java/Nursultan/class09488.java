/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00667
 *  minecraft.class01637
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01668
 *  minecraft.class01894
 *  minecraft.class02362
 *  net.fabricmc.fabric.impl.networking.CustomPayloadTypeProvider
 *  net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec
 */
package Nursultan;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.Map;
import minecraft.class00667;
import minecraft.class01637;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01668;
import minecraft.class01894;
import minecraft.class02362;
import net.fabricmc.fabric.impl.networking.CustomPayloadTypeProvider;
import net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec;

public class class09488<B>
implements class02362<B, class01659>,
FabricCustomPayloadPacketCodec {
    final /* synthetic */ Map N;
    final /* synthetic */ class01637 y;
    private CustomPayloadTypeProvider L;

    public class09488(Map map, class01637 class016372) {
        this.N = map;
        this.y = class016372;
    }

    public void encode(B b, class01659 class016592) {
        this.N(b, class016592.method_56479(), class016592);
    }

    private class02362 N(class02362 class023622, class01894 class018942, Operation operation, class00667 class006672) {
        class01668 class016682;
        if (this.L != null && (class016682 = this.L.get(class006672, class018942)) != null) {
            return class016682.y();
        }
        return (class02362)operation.call(new Object[]{class023622, class018942});
    }

    public class01659 decode(B b) {
        class01894 class018942;
        class01894 class018943 = class018942 = b.T();
        class09488 class094882 = this;
        return (class01659)this.N(class094882, class018943, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_8710$1, net.minecraft.class_2960]");
            return ((class09488)objectArray[0]).N((class01894)objectArray[1]);
        }, (class00667)b).decode(b);
    }

    private <T extends class01659> void N(B b, class01666<T> class016662, class01659 class016592) {
        b.N(class016662.N());
        class01894 class018942 = class016662.N();
        class09488 class094882 = this;
        this.N(class094882, class018942, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_8710$1, net.minecraft.class_2960]");
            return ((class09488)objectArray[0]).N((class01894)objectArray[1]);
        }, (class00667)b).encode(b, (Object)class016592);
    }

    private class02362<? super B, ? extends class01659> N(class01894 class018942) {
        class02362 class023622 = (class02362)this.N.get(class018942);
        if (class023622 != null) {
            return class023622;
        }
        return this.y.create(class018942);
    }

    public void fabric_setPacketCodecProvider(CustomPayloadTypeProvider customPayloadTypeProvider) {
        if (this.L != null) {
            throw new IllegalStateException("Payload codec provider is already set!");
        }
        this.L = customPayloadTypeProvider;
    }
}

