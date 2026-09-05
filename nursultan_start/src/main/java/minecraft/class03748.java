/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10973
 *  Nursultan.class11938
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00388
 *  minecraft.class00392
 *  minecraft.class00411
 *  minecraft.class00413
 *  minecraft.class00414
 *  minecraft.class00418
 *  minecraft.class00421
 *  minecraft.class00923
 *  minecraft.class01719
 *  minecraft.class01721
 *  minecraft.class01751
 *  minecraft.class01754
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class04439
 *  minecraft.class05216
 *  minecraft.class06333
 *  minecraft.class06338
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10973;
import Nursultan.class11938;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00388;
import minecraft.class00392;
import minecraft.class00411;
import minecraft.class00413;
import minecraft.class00414;
import minecraft.class00418;
import minecraft.class00421;
import minecraft.class00923;
import minecraft.class01719;
import minecraft.class01721;
import minecraft.class01751;
import minecraft.class01754;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class04439;
import minecraft.class05216;
import minecraft.class06333;
import minecraft.class06338;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03748 {
    public static final Codec<class00392> N = Codec.recursive((String)"Component", class03748::N);
    public static final class02362<class04247, class00392> y = class02389.u(N);
    public static final class02362<class04247, Optional<class00392>> L = y.N_33(class02389::N);
    public static final class02362<class04247, class00392> u = class02389.L(N);
    public static final class02362<class04247, Optional<class00392>> i = u.N_33(class02389::N);
    public static final class02362<ByteBuf, class00392> R = class02389.N(N);

    private static class00392 L(class00392 class003922) {
        class10973 class109732 = new class10973(class003922);
        class11938.L().L((Object)class109732);
        return class109732.N();
    }

    private static class05216 N(List<class00392> list) {
        class05216 class052162 = list.get(0).L();
        for (int i = 1; i < list.size(); ++i) {
            class052162.y(list.get(i));
        }
        return class052162;
    }

    private static void N(Codec codec, CallbackInfoReturnable callbackInfoReturnable) {
        Codec codec2 = ((Codec)callbackInfoReturnable.getReturnValue()).flatXmap(class003922 -> DataResult.success((Object)class03748.L(class003922)), DataResult::success);
        callbackInfoReturnable.setReturnValue((Object)codec2);
    }

    public static Codec<class00392> N(int n) {
        return new class01721(n);
    }

    public static Codec<class00392> N(Codec<class00392> codec) {
        class06333 class063332 = new class06333();
        class03748.N((class06333<String, MapCodec<? extends class04439>>)class063332);
        Codec codec2 = RecordCodecBuilder.create(arg_0 -> class03748.N(class03748.N(class063332, class04439::N, "type"), codec, arg_0));
        Codec codec3 = Codec.either((Codec)Codec.either((Codec)Codec.STRING, (Codec)class06338.y((Codec)codec.listOf())), (Codec)codec2).xmap(either2 -> (class00392)either2.map(either -> (class00392)either.map(class00392::y, class03748::N), class003922 -> class003922), class003922 -> {
            String string = class003922.N();
            return string != null ? Either.left((Object)Either.left((Object)string)) : Either.right((Object)class003922);
        });
        Codec codec4 = codec3;
        codec4 = new CallbackInfoReturnable("", true, (Object)codec4);
        class03748.N(codec, (CallbackInfoReturnable)codec4);
        if (codec4.isCancelled()) {
            return (Codec)codec4.getReturnValue();
        }
        return codec3;
    }

    private static void N(class06333<String, MapCodec<? extends class04439>> class063332) {
        class063332.N((Object)"text", (Object)class01751.y);
        class063332.N((Object)"translatable", (Object)class00388.y);
        class063332.N((Object)"keybind", (Object)class00413.N);
        class063332.N((Object)"score", (Object)class00421.y);
        class063332.N((Object)"selector", (Object)class00414.N);
        class063332.N((Object)"nbt", (Object)class00418.N);
        class063332.N((Object)"object", (Object)class00923.N);
    }

    public static <T> MapCodec<T> N(class06333<String, MapCodec<? extends T>> class063332, Function<T, MapCodec<? extends T>> function, String string) {
        class01754 class017542 = new class01754((Collection)class063332.N(), function);
        MapCodec mapCodec2 = class063332.N((Codec)Codec.STRING).dispatchMap(string, function, mapCodec -> mapCodec);
        return class06338.N((MapCodec)new class01719(string, mapCodec2, (MapCodec)class017542), (MapCodec)mapCodec2);
    }

    private static /* synthetic */ App N(MapCodec mapCodec, Codec codec, RecordCodecBuilder.Instance instance) {
        return instance.group((App)mapCodec.forGetter(class00392::method_10851), (App)class06338.y((Codec)codec.listOf()).optionalFieldOf("extra", List.of()).forGetter(class00392::method_10855), (App)class00411.N.forGetter(class00392::method_10866)).apply((Applicative)instance, class05216::new);
    }
}

