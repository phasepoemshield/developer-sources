/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class01962
 *  minecraft.class03767
 *  minecraft.class05086
 *  minecraft.class06839
 *  net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions
 *  net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.fabricmc.fabric.api.gamerule.v1;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.ToIntFunction;
import minecraft.class01962;
import minecraft.class03767;
import minecraft.class05086;
import minecraft.class06839;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import org.apache.commons.lang3.ArrayUtils;

public final class GameRuleBuilder$EnumRuleBuilder<E extends Enum<E>>
extends GameRuleBuilder<E> {
    private E[] supportedValues;

    GameRuleBuilder$EnumRuleBuilder(E e) {
        super(e);
        this.fabricType = FabricGameRuleType.ENUM;
        this.acceptor = GameRuleBuilder::visitEnum;
        this.argumentType = null;
        this.codec = GameRuleBuilder$EnumRuleBuilder.createEnumCodec(((Enum)e).getDeclaringClass());
        this.commandResultSupplier = enum_ -> enum_.ordinal();
        this.supportedValues = (Enum[])((Enum)e).getDeclaringClass().getEnumConstants();
    }

    @Override
    public class06839<E> build() {
        class06839 class068392 = super.build();
        ((RuleTypeExtensions)class068392).fabric_setSupportedEnumValues(this.supportedValues);
        return class068392;
    }

    @Override
    public GameRuleBuilder$EnumRuleBuilder<E> category(CustomGameRuleCategory customGameRuleCategory) {
        super.category(customGameRuleCategory);
        return this;
    }

    @Override
    public GameRuleBuilder$EnumRuleBuilder<E> category(class05086 class050862) {
        super.category(class050862);
        return this;
    }

    @Override
    public GameRuleBuilder$EnumRuleBuilder<E> argumentType(ArgumentType<E> argumentType) {
        super.argumentType(argumentType);
        return this;
    }

    @Override
    public GameRuleBuilder$EnumRuleBuilder<E> codec(Codec<E> codec) {
        super.codec(codec);
        return this;
    }

    @Override
    public GameRuleBuilder$EnumRuleBuilder<E> commandResultSupplier(ToIntFunction<E> toIntFunction) {
        super.commandResultSupplier(toIntFunction);
        return this;
    }

    @Override
    public GameRuleBuilder$EnumRuleBuilder<E> requiredFeatures(class03767 class037672) {
        super.requiredFeatures(class037672);
        return this;
    }

    @SafeVarargs
    public final GameRuleBuilder$EnumRuleBuilder<E> supportedValues(E ... EArray) {
        if (class01962.N((Object[])EArray)) {
            throw new IllegalArgumentException("No values are supported!");
        }
        if (!ArrayUtils.contains((Object[])EArray, (Object)this.defaultValue)) {
            throw new IllegalArgumentException("Supported enum value must include the default " + String.valueOf(this.defaultValue));
        }
        this.supportedValues = EArray;
        return this;
    }

    private static <E extends Enum<E>> Codec<E> createEnumCodec(Class<E> clazz) {
        return Codec.STRING.comapFlatMap(string -> {
            try {
                return DataResult.success(Enum.valueOf(clazz, string));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return DataResult.error(() -> string + " is not a valid value for enum + " + String.valueOf(clazz));
            }
        }, Enum::name);
    }
}

