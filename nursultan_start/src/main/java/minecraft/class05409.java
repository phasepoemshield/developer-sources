/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  minecraft.class01997
 *  minecraft.class03529
 *  minecraft.class04206
 *  minecraft.class04476
 *  minecraft.class06581
 *  minecraft.class06918
 *  minecraft.class07135
 *  minecraft.class08825
 *  minecraft.class08833
 *  minecraft.class08839
 *  minecraft.class08895
 *  minecraft.class08906
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 *  net.fabricmc.fabric.impl.datagen.client.FabricItemAssetDefinitions
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import minecraft.class01894;
import minecraft.class01997;
import minecraft.class03529;
import minecraft.class04206;
import minecraft.class04476;
import minecraft.class05387;
import minecraft.class06581;
import minecraft.class06918;
import minecraft.class07135;
import minecraft.class08825;
import minecraft.class08833;
import minecraft.class08839;
import minecraft.class08895;
import minecraft.class08906;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.impl.datagen.client.FabricItemAssetDefinitions;

@Environment(value=EnvType.CLIENT)
public class class05409
implements class08833,
FabricItemAssetDefinitions {
    private final Map<class06581, class08839> N = new HashMap<class06581, class08839>();
    private final Map<class06581, class06581> y = new HashMap<class06581, class06581>();
    private FabricDataOutput L;
    private Set u;

    private boolean N(Map map, Object object, Operation operation) {
        class06918 class069182 = (class06918)object;
        if (this.L != null) {
            if (!this.u.contains(class069182.L())) {
                return true;
            }
            if (!class04206.B.y((Object)class069182).y().equals(this.L.getModId())) {
                return true;
            }
        }
        return (Boolean)operation.call(new Object[]{map, object});
    }

    private Predicate N(Predicate predicate) {
        if (this.L != null) {
            return predicate.and(class035292 -> this.L.isStrictValidationEnabled()).and(class035292 -> class035292.B().N().y().equals(this.L.getModId()));
        }
        return predicate;
    }

    private void N(class06581 class065812, class08839 class088392) {
        if (this.N.put(class065812, class088392) != null) {
            throw new IllegalStateException("Duplicate item model definition for " + String.valueOf(class065812));
        }
    }

    public void N(class06581 class065812, class08895 class088952, class08906 class089062) {
        this.N(class065812, new class08839(class088952, class089062));
    }

    public CompletableFuture<?> N(class04476 class044762, class01997 class019972) {
        return class07135.N((class04476)class044762, (Codec)class08839.N, class065812 -> class019972.N(class065812.i().B().N()), this.N);
    }

    public void N(class06581 class065812, class06581 class065813) {
        this.y.put(class065813, class065812);
    }

    public void N() {
        class04206.B.forEach(class065812 -> {
            class06918 class069182;
            class06918 class069183;
            Map<class06581, class08839> var4;
            if (this.y.containsKey(class065812)) {
                return;
            }
            if (class065812 instanceof class06918 && !this.N(var4 = this.N, class069183 = (class069182 = (class06918)class065812), objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.Map, java.lang.Object]");
                return ((Map)objectArray[0]).containsKey(objectArray[1]);
            })) {
                class01894 class018942 = class05387.N(class069182.L());
                this.N((class06581)class069182, class08825.N((class01894)class018942));
            }
        });
        this.y.forEach((class065812, class065813) -> {
            class08839 class088392 = this.N.get(class065813);
            if (class088392 == null) {
                throw new IllegalStateException("Missing donor: " + String.valueOf(class065813) + " -> " + String.valueOf(class065812));
            }
            this.N((class06581)class065812, class088392);
        });
        Predicate<class03529> predicate = class035292 -> !this.N.containsKey(class035292.N());
        List list = class04206.B.z().filter(this.N(predicate)).map(class035292 -> class035292.B().N()).toList();
        if (!list.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + String.valueOf(list));
        }
    }

    public void fabric_setProcessedBlocks(Set set) {
        this.u = set;
    }

    public void setFabricDataOutput(FabricDataOutput fabricDataOutput) {
        this.L = fabricDataOutput;
    }
}

