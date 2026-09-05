/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02028
 *  minecraft.class06338
 *  minecraft.class08350
 *  minecraft.class08880
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.CompositeBlockStateModel$Unbaked
 */
package net.fabricmc.fabric.impl.client.model.loading;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import minecraft.class02028;
import minecraft.class06338;
import minecraft.class08350;
import minecraft.class08880;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.CompositeBlockStateModel;
import net.fabricmc.fabric.impl.client.model.loading.CompositeBlockStateModelImpl;

@Environment(value=EnvType.CLIENT)
public record CompositeBlockStateModelImpl$Unbaked(List<class08880> models) implements CompositeBlockStateModel.Unbaked
{
    public static final MapCodec<CompositeBlockStateModelImpl$Unbaked> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.y((Codec)class08880.L.listOf()).fieldOf("models").forGetter(CompositeBlockStateModelImpl$Unbaked::models)).apply((Applicative)instance, CompositeBlockStateModelImpl$Unbaked::new));

    public static CompositeBlockStateModelImpl$Unbaked of(List<class08880> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Models list must not be empty");
        }
        for (class08880 class088802 : list) {
            Objects.requireNonNull(class088802, "Model cannot be null");
        }
        return new CompositeBlockStateModelImpl$Unbaked(List.copyOf(list));
    }

    public void method_62326(class08350 class083502) {
        this.models.forEach(class088802 -> class088802.method_62326(class083502));
    }

    public MapCodec<CompositeBlockStateModelImpl$Unbaked> codec() {
        return CODEC;
    }

    public class08887 method_68521(class02028 class020282) {
        class08887[] class08887Array = new class08887[this.models.size()];
        for (int i = 0; i < this.models.size(); ++i) {
            class08887Array[i] = this.models.get(i).method_68521(class020282);
        }
        return new CompositeBlockStateModelImpl(class08887Array);
    }
}

