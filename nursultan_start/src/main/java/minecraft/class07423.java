/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04206
 *  minecraft.class05033
 *  minecraft.class06839
 *  net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions
 *  net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType
 *  net.fabricmc.fabric.impl.gamerule.rpc.FabricTypedRule
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.Function;
import minecraft.class04206;
import minecraft.class05033;
import minecraft.class06839;
import minecraft.class07400;
import minecraft.class07411;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricTypedRule;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class07423
implements FabricTypedRule {
    private class06839<T> gameRule;
    private T value;
    public static final Codec<class07423<?>> N = class04206.Nm.T().dispatch("key", class07423::N, class07423::L);
    public static final Codec<class07423<?>> y = class04206.Nm.T().dispatch("key", class07423::N, class07423::N);
    private @Nullable FabricGameRuleType i = null;

    private static MapCodec L(class06839 class068392) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05033.N(FabricGameRuleType::values).fieldOf("type").forGetter(class074232 -> ((RuleTypeExtensions)class074232.N()).fabric_getType()), (App)class068392.B().fieldOf("value").forGetter(class07423::y)).apply((Applicative)instance, (fabricGameRuleType, object) -> class07423.N(class068392, fabricGameRuleType, object)));
    }

    public class07423(class06839<T> class068392, T t) {
        this.gameRule = class068392;
        this.value = t;
        this.N(class068392, t, null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class07423 && Objects.equals(this.gameRule, ((class07423)object).gameRule) && Objects.equals(this.value, ((class07423)object).value);
    }

    public final String toString() {
        return "class07423[gameRule=" + Objects.toString(this.gameRule) + ", value=" + Objects.toString(this.value) + "]";
    }

    public final int hashCode() {
        return (0 * 31 + Objects.hashCode(this.gameRule)) * 31 + Objects.hashCode(this.value);
    }

    private static <T> MapCodec<? extends class07423<T>> y(class06839<T> class068392) {
        return class07423.N(RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05033.N(class07411::values).fieldOf("type").forGetter(class074232 -> class074232.gameRule.R()), (App)class068392.B().fieldOf("value").forGetter(class07423::y)).apply((Applicative)instance, (class074112, object) -> class07423.N(class068392, class074112, object))), class068392);
    }

    public T y() {
        return this.value;
    }

    private void N(class06839 class068392, Object object, CallbackInfo callbackInfo) {
        FabricGameRuleType fabricGameRuleType = ((RuleTypeExtensions)class068392).fabric_getType();
        if (fabricGameRuleType == null) {
            return;
        }
        this.setFabricType(fabricGameRuleType);
    }

    private static MapCodec N(MapCodec mapCodec, class06839 class068392) {
        return Codec.mapEither((MapCodec)class07423.L(class068392), (MapCodec)mapCodec).xmap(either -> (class07423)either.map(Function.identity(), Function.identity()), class074232 -> ((FabricTypedRule)class074232).getFabricType() == null ? Either.right((Object)class074232) : Either.left((Object)class074232));
    }

    private static class07423 N(class06839 class068392, FabricGameRuleType fabricGameRuleType, Object object) {
        FabricGameRuleType fabricGameRuleType2 = ((RuleTypeExtensions)class068392).fabric_getType();
        if (fabricGameRuleType2 != fabricGameRuleType) {
            throw new class07400("Stated type \"" + String.valueOf(fabricGameRuleType) + "\" mismatches with actual type \"" + String.valueOf(fabricGameRuleType2) + "\" of gamerule \"" + class068392.N() + "\"");
        }
        return new class07423(class068392, object);
    }

    private static <T> MapCodec<? extends class07423<T>> N(class06839<T> class068392) {
        return class068392.B().fieldOf("value").xmap(object -> new class07423(class068392, object), class07423::y);
    }

    public class06839<T> N() {
        return this.gameRule;
    }

    private static <T> class07423<T> N(class06839<T> class068392, class07411 class074112, T t) {
        if (class068392.R() != class074112) {
            throw new class07400("Stated type \"" + String.valueOf((Object)class074112) + "\" mismatches with actual type \"" + String.valueOf((Object)class068392.R()) + "\" of gamerule \"" + class068392.N() + "\"");
        }
        return new class07423(class068392, t);
    }

    public void setFabricType(FabricGameRuleType fabricGameRuleType) {
        this.i = Objects.requireNonNull(fabricGameRuleType);
    }

    public @Nullable FabricGameRuleType getFabricType() {
        return this.i;
    }
}

