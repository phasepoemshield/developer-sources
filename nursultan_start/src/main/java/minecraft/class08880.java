/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00177
 *  minecraft.class02028
 *  minecraft.class03674
 *  minecraft.class04523
 *  minecraft.class04540
 *  minecraft.class06338
 *  minecraft.class08389
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.CustomUnbakedBlockStateModelRegistry
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import minecraft.class00177;
import minecraft.class02028;
import minecraft.class03674;
import minecraft.class04523;
import minecraft.class04540;
import minecraft.class06338;
import minecraft.class08389;
import minecraft.class08864;
import minecraft.class08883;
import minecraft.class08887;
import minecraft.class08889;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.CustomUnbakedBlockStateModelRegistry;

@Environment(value=EnvType.CLIENT)
public interface class08880
extends class08389 {
    public static final Codec<class04523<class03674>> N = RecordCodecBuilder.create(instance -> instance.group((App)class03674.N.forGetter(class04523::N), (App)class06338.b.optionalFieldOf("weight", (Object)1).forGetter(class04523::y)).apply(instance, class04523::new));
    public static final Codec<class00177> y = class06338.y((Codec)N.listOf()).flatComapMap(list -> new class00177(class04540.N((List)Lists.transform((List)list, class045232 -> class045232.N(class08883::new)))), class001772 -> {
        List list = class001772.y().u();
        ArrayList<class04523> arrayList = new ArrayList<class04523>(list.size());
        for (class04523 class045232 : list) {
            Object object = class045232.N();
            if (object instanceof class08883) {
                class08883 class088832 = (class08883)object;
                arrayList.add(new class04523((Object)class088832.y(), class045232.y()));
                continue;
            }
            return DataResult.error(() -> "Only single variants are supported");
        }
        return DataResult.success(arrayList);
    });
    public static final Codec<class08880> L = Codec.either(y, class08883.u).flatComapMap(either -> (class08880)either.map(class001772 -> class001772, class088832 -> class088832), class088802 -> {
        class08880 class088803 = class088802;
        Objects.requireNonNull(class088803);
        class08880 class088804 = class088803;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class08883.class, class00177.class}, (Object)class088804, (int)n)) {
            case 0 -> DataResult.success((Object)Either.right((Object)((class08883)class088804)));
            case 1 -> DataResult.success((Object)Either.left((Object)((class00177)class088804)));
            default -> DataResult.error(() -> "Only a single variant or a list of variants are supported");
        };
    });

    private static Codec y(Codec codec, Function function, Function function2) {
        return CustomUnbakedBlockStateModelRegistry.MODEL_CODEC;
    }

    private static Codec N(Codec codec, Function function, Function function2) {
        return CustomUnbakedBlockStateModelRegistry.WEIGHTED_MODEL_CODEC;
    }

    default public class08889 N() {
        return new class08864(this);
    }

    public class08887 method_68521(class02028 var1);
}

