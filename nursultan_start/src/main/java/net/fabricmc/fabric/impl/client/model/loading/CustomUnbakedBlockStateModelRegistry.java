/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00177
 *  minecraft.class01894
 *  minecraft.class03674
 *  minecraft.class04523
 *  minecraft.class04540
 *  minecraft.class06333
 *  minecraft.class06338
 *  minecraft.class08880
 *  minecraft.class08883
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.CustomUnbakedBlockStateModel
 */
package net.fabricmc.fabric.impl.client.model.loading;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import minecraft.class00177;
import minecraft.class01894;
import minecraft.class03674;
import minecraft.class04523;
import minecraft.class04540;
import minecraft.class06333;
import minecraft.class06338;
import minecraft.class08880;
import minecraft.class08883;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.CustomUnbakedBlockStateModel;
import net.fabricmc.fabric.impl.client.model.loading.CustomUnbakedBlockStateModelRegistry$KeyExistsCodec;

@Environment(value=EnvType.CLIENT)
public class CustomUnbakedBlockStateModelRegistry {
    private static final String TYPE_KEY = "fabric:type";
    private static final class06333<class01894, MapCodec<? extends CustomUnbakedBlockStateModel>> ID_MAPPER = new class06333();
    private static final MapCodec<CustomUnbakedBlockStateModel> CUSTOM_MODEL_MAP_CODEC = ID_MAPPER.N(class01894.N).dispatchMap("fabric:type", CustomUnbakedBlockStateModel::codec, mapCodec -> mapCodec);
    private static final MapCodec<class08883> SIMPLE_MODEL_MAP_CODEC = class03674.N.xmap(class08883::new, class08883::y);
    private static final MapCodec<Either<CustomUnbakedBlockStateModel, class08883>> VARIANT_MAP_CODEC = new CustomUnbakedBlockStateModelRegistry$KeyExistsCodec<CustomUnbakedBlockStateModel, class08883>("fabric:type", CUSTOM_MODEL_MAP_CODEC, SIMPLE_MODEL_MAP_CODEC);
    private static final Codec<Either<CustomUnbakedBlockStateModel, class08883>> VARIANT_CODEC = VARIANT_MAP_CODEC.codec();
    private static final Codec<class04523<Either<CustomUnbakedBlockStateModel, class08883>>> WEIGHTED_VARIANT_CODEC = RecordCodecBuilder.create(instance -> instance.group((App)VARIANT_MAP_CODEC.forGetter(class04523::N), (App)class06338.b.optionalFieldOf("weight", (Object)1).forGetter(class04523::y)).apply((Applicative)instance, class04523::new));
    public static final Codec<class00177> WEIGHTED_MODEL_CODEC = class06338.y((Codec)WEIGHTED_VARIANT_CODEC.listOf()).flatComapMap(list -> new class00177(class04540.N((List)Lists.transform((List)list, class045232 -> class045232.N(either -> (class08880)either.map(Function.identity(), Function.identity()))))), class001772 -> {
        List list = class001772.y().u();
        ArrayList<class04523> arrayList = new ArrayList<class04523>(list.size());
        block4: for (class04523 class045232 : list) {
            class08880 class088802;
            Objects.requireNonNull((class08880)class045232.N());
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{CustomUnbakedBlockStateModel.class, class08883.class}, (Object)class088802, (int)n)) {
                case 0: {
                    CustomUnbakedBlockStateModel customUnbakedBlockStateModel = (CustomUnbakedBlockStateModel)class088802;
                    arrayList.add(new class04523((Object)Either.left((Object)customUnbakedBlockStateModel), class045232.y()));
                    continue block4;
                }
                case 1: {
                    class08883 class088832 = (class08883)class088802;
                    arrayList.add(new class04523((Object)Either.right((Object)class088832), class045232.y()));
                    continue block4;
                }
            }
            return DataResult.error(() -> "Only custom models or single variants are supported");
        }
        return DataResult.success(arrayList);
    });
    public static final Codec<class08880> MODEL_CODEC = Codec.either(WEIGHTED_MODEL_CODEC, VARIANT_CODEC).flatComapMap(either2 -> (class08880)either2.map(Function.identity(), either -> (class08880)either.map(Function.identity(), Function.identity())), class088802 -> {
        Objects.requireNonNull(class088802);
        class08880 class088803 = class088802;
        Objects.requireNonNull(class088803);
        class08880 class088804 = class088803;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{CustomUnbakedBlockStateModel.class, class08883.class, class00177.class}, (Object)class088804, (int)n)) {
            case 0 -> {
                CustomUnbakedBlockStateModel var3_3 = (CustomUnbakedBlockStateModel)class088804;
                yield DataResult.success((Object)Either.right((Object)Either.left((Object)var3_3)));
            }
            case 1 -> {
                class08883 var4_4 = (class08883)class088804;
                yield DataResult.success((Object)Either.right((Object)Either.right((Object)var4_4)));
            }
            case 2 -> {
                class00177 var5_5 = (class00177)class088804;
                yield DataResult.success((Object)Either.left((Object)var5_5));
            }
            default -> DataResult.error(() -> "Only a custom model or a single variant or a list of variants are supported");
        };
    });

    public static void register(class01894 class018942, MapCodec<? extends CustomUnbakedBlockStateModel> mapCodec) {
        ID_MAPPER.N((Object)class018942, mapCodec);
    }
}

