/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class02024
 *  minecraft.class04476
 *  minecraft.class05401
 *  minecraft.class05404
 *  minecraft.class05409
 *  minecraft.class05421
 *  minecraft.class05422
 *  minecraft.class07135
 *  minecraft.class08833
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 *  net.fabricmc.fabric.impl.datagen.client.FabricItemAssetDefinitions
 *  net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package Nursultan;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class04476;
import minecraft.class05401;
import minecraft.class05404;
import minecraft.class05409;
import minecraft.class05421;
import minecraft.class05422;
import minecraft.class07135;
import minecraft.class08833;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.impl.datagen.client.FabricItemAssetDefinitions;
import net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class10512
implements class07135 {
    private final class01997 field_39375;
    private final class01997 field_55247;
    private final class01997 field_39376;
    private FabricDataOutput fabricDataOutput;

    public class10512(class01996 class019962) {
        this.field_39375 = class019962.method_45973(class02024.field_39368, "blockstates");
        this.field_55247 = class019962.method_45973(class02024.field_39368, "items");
        this.field_39376 = class019962.method_45973(class02024.field_39368, "models");
        this.m_handler$zdn000$fabric_data_generation_api_v1$init_53(class019962, null);
    }

    public String method_10321() {
        return "Model Definitions";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        class05409 class054092 = new class05409();
        class05421 class054212 = new class05421();
        class05401 class054012 = new class05401();
        class05404 class054042 = new class05404((Consumer)class054212, (class08833)class054092, (BiConsumer)class054012);
        this.m_handler$zdn000$fabric_data_generation_api_v1$setFabricDataOutput_55(class044762, null, class054212, class054092);
        class05404 class054043 = class054042;
        this.m_wrapOperation$zdn000$fabric_data_generation_api_v1$registerBlockStateModels_54(class054043, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_4910]");
            ((class05404)objectArray[0]).L();
            return null;
        });
        class054043 = new class05422((class08833)class054092, (BiConsumer)class054012);
        this.m_wrapOperation$zdn000$fabric_data_generation_api_v1$registerItemModels_52((class05422)class054043, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_4915]");
            ((class05422)objectArray[0]).N();
            return null;
        });
        class054212.N();
        class054092.N();
        return CompletableFuture.allOf(class054212.N(class044762, this.field_39375), class054012.N(class044762, this.field_39376), class054092.N(class044762, this.field_55247));
    }

    private void m_wrapOperation$zdn000$fabric_data_generation_api_v1$registerItemModels_52(class05422 class054222, Operation operation) {
        class10512 class105122 = this;
        if (class105122 instanceof FabricModelProvider) {
            ((FabricModelProvider)class105122).generateItemModels(class054222);
        } else {
            operation.call(new Object[]{class054222});
        }
    }

    public void m_handler$zdn000$fabric_data_generation_api_v1$init_53(class01996 class019962, CallbackInfo callbackInfo) {
        if (class019962 instanceof FabricDataOutput) {
            FabricDataOutput fabricDataOutput;
            this.fabricDataOutput = fabricDataOutput = (FabricDataOutput)class019962;
        }
    }

    private void m_wrapOperation$zdn000$fabric_data_generation_api_v1$registerBlockStateModels_54(class05404 class054042, Operation operation) {
        class10512 class105122 = this;
        if (class105122 instanceof FabricModelProvider) {
            ((FabricModelProvider)class105122).generateBlockStateModels(class054042);
        } else {
            operation.call(new Object[]{class054042});
        }
    }

    private void m_handler$zdn000$fabric_data_generation_api_v1$setFabricDataOutput_55(class04476 class044762, CallbackInfoReturnable callbackInfoReturnable, class05421 class054212, class05409 class054092) {
        ((FabricModelProviderDefinitions)class054212).setFabricDataOutput(this.fabricDataOutput);
        ((FabricModelProviderDefinitions)class054092).setFabricDataOutput(this.fabricDataOutput);
        ((FabricItemAssetDefinitions)class054092).fabric_setProcessedBlocks(class054212.N.keySet());
    }
}

