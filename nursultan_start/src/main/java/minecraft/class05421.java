/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  minecraft.class00891
 *  minecraft.class01997
 *  minecraft.class03529
 *  minecraft.class04127
 *  minecraft.class04206
 *  minecraft.class04476
 *  minecraft.class07135
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 *  net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00891;
import minecraft.class01997;
import minecraft.class03529;
import minecraft.class04127;
import minecraft.class04206;
import minecraft.class04476;
import minecraft.class05399;
import minecraft.class07135;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions;

@Environment(value=EnvType.CLIENT)
public class class05421
implements Consumer<class05399>,
FabricModelProviderDefinitions {
    public final Map<class00891, class05399> N = new HashMap<class00891, class05399>();
    private FabricDataOutput y;

    @Override
    public void accept(class05399 class053992) {
        class00891 class008912 = class053992.N();
        if (this.N.put(class008912, class053992) != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + String.valueOf(class008912));
        }
    }

    private Predicate N(Predicate predicate) {
        if (this.y != null) {
            return predicate.and(class035292 -> this.y.isStrictValidationEnabled()).and(class035292 -> class035292.B().N().y().equals(this.y.getModId()));
        }
        return predicate;
    }

    public CompletableFuture<?> N(class04476 class044762, class01997 class019972) {
        Map map = Maps.transformValues(this.N, class05399::y);
        Function<class00891, Path> function = class008912 -> class019972.N(class008912.s().B().N());
        return class07135.N((class04476)class044762, (Codec)class04127.y, function, (Map)map);
    }

    public void N() {
        Predicate<class03529> predicate = class035292 -> true;
        List list = class04206.i.z().filter(this.N(predicate)).filter(class035292 -> !this.N.containsKey(class035292.N())).map(class035292 -> class035292.B().N()).toList();
        if (!list.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + String.valueOf(list));
        }
    }

    public void setFabricDataOutput(FabricDataOutput fabricDataOutput) {
        this.y = fabricDataOutput;
    }
}

