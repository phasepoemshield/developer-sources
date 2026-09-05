/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10213
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00751
 *  minecraft.class02055
 *  minecraft.class05946
 *  minecraft.class06338
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10213;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class02055;
import minecraft.class03519;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class06338;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03521<E>
implements Codec<class03543<E>> {
    private final class05946<? extends class00751<E>> N;
    private final Codec<class03556<E>> y;
    private final Codec<List<class03556<E>>> L;
    private final Codec<Either<class03530<E>, List<class03556<E>>>> u;

    private class03521(class05946<? extends class00751<E>> class059462, Codec<class03556<E>> codec, boolean bl) {
        this.N = class059462;
        this.y = codec;
        this.L = class03521.N(codec, bl);
        this.u = Codec.either(class03530.y(class059462), this.L);
    }

    public <T> DataResult<Pair<class03543<E>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        Optional optional;
        if (dynamicOps instanceof class03519 && (optional = ((class03519)dynamicOps).y(this.N)).isPresent()) {
            class02055 class020552 = optional.get();
            return this.u.decode(dynamicOps, t).flatMap(pair -> ((DataResult)((Either)pair.getFirst()).map(class035302 -> class03521.N(class020552, class035302), list -> DataResult.success(class03543.N(list)))).map(class035432 -> Pair.of((Object)class035432, (Object)pair.getSecond())));
        }
        return this.N(dynamicOps, t);
    }

    private <T> DataResult<T> y(class03543<E> class035432, DynamicOps<T> dynamicOps, T t) {
        return this.L.encode((Object)class035432.N().toList(), dynamicOps, t);
    }

    private static void N(class02055 class020552, class03530 class035302, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) && ((DataResult)callbackInfoReturnable.getReturnValue()).isError()) {
            callbackInfoReturnable.setReturnValue((Object)DataResult.success(class03543.R()));
        }
    }

    public <T> DataResult<T> encode(class03543<E> class035432, DynamicOps<T> dynamicOps, T t) {
        Optional optional;
        if (dynamicOps instanceof class03519 && (optional = ((class03519)dynamicOps).N(this.N)).isPresent()) {
            if (!class035432.N(optional.get())) {
                return DataResult.error(() -> "HolderSet " + String.valueOf(class035432) + " is not valid in current registry set");
            }
            return this.u.encode((Object)class035432.u().mapRight(List::copyOf), dynamicOps, t);
        }
        return this.y(class035432, dynamicOps, t);
    }

    private static <E> DataResult<class03543<E>> N(class02055<E> class020552, class03530<E> class035302) {
        DataResult dataResult = class020552.N(class035302).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Missing tag: '" + String.valueOf(class035302.y()) + "' in '" + String.valueOf(class035302.N().N()) + "'"));
        DataResult dataResult2 = dataResult;
        dataResult2 = new CallbackInfoReturnable("", true, (Object)dataResult2);
        class03521.N(class020552, class035302, (CallbackInfoReturnable)dataResult2);
        if (dataResult2.isCancelled()) {
            return (DataResult)dataResult2.getReturnValue();
        }
        return dataResult;
    }

    public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> class059462, Codec<class03556<E>> codec, boolean bl) {
        return new class03521<E>(class059462, codec, bl);
    }

    private static <E> Codec<List<class03556<E>>> N(Codec<class03556<E>> codec, boolean bl) {
        Codec codec2 = codec.listOf().validate(class06338.y(class03556::R));
        if (bl) {
            return codec2;
        }
        return class06338.L(codec, (Codec)codec2);
    }

    private <T> DataResult<Pair<class03543<E>, T>> N(DynamicOps<T> dynamicOps, T t) {
        return this.y.listOf().decode(dynamicOps, t).flatMap(pair -> {
            ArrayList<class10213> arrayList = new ArrayList<class10213>();
            for (class03556 class035562 : (List)pair.getFirst()) {
                if (class035562 instanceof class10213) {
                    class10213 class102132 = (class10213)class035562;
                    arrayList.add(class102132);
                    continue;
                }
                return DataResult.error(() -> "Can't decode element " + String.valueOf(class035562) + " without registry");
            }
            return DataResult.success((Object)new Pair(class03543.N(arrayList), pair.getSecond()));
        });
    }
}

