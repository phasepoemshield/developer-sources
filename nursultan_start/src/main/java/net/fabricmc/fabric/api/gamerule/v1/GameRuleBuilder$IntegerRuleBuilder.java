/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.serialization.Codec
 *  minecraft.class03767
 *  minecraft.class05086
 *  minecraft.class05706
 *  minecraft.class07411
 */
package net.fabricmc.fabric.api.gamerule.v1;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.serialization.Codec;
import java.util.function.ToIntFunction;
import minecraft.class03767;
import minecraft.class05086;
import minecraft.class05706;
import minecraft.class07411;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder$NumberRuleBuilder;

public final class GameRuleBuilder$IntegerRuleBuilder
extends GameRuleBuilder$NumberRuleBuilder<Integer> {
    GameRuleBuilder$IntegerRuleBuilder(int n2) {
        super(n2);
        this.type = class07411.field_62399;
        this.acceptor = class05706::L;
        this.argumentType = IntegerArgumentType.integer();
        this.codec = Codec.INT;
        this.commandResultSupplier = n -> n;
    }

    public GameRuleBuilder$IntegerRuleBuilder range(Integer n, Integer n2) {
        if ((Integer)this.defaultValue < n || (Integer)this.defaultValue > n2) {
            throw new IllegalArgumentException("Default value is out-of-bounds: " + String.valueOf(this.defaultValue));
        }
        return ((GameRuleBuilder$IntegerRuleBuilder)this.argumentType((ArgumentType)IntegerArgumentType.integer((int)n, (int)n2))).codec(Codec.intRange((int)n, (int)n2));
    }

    public GameRuleBuilder$IntegerRuleBuilder category(CustomGameRuleCategory customGameRuleCategory) {
        super.category(customGameRuleCategory);
        return this;
    }

    public GameRuleBuilder$IntegerRuleBuilder category(class05086 class050862) {
        super.category(class050862);
        return this;
    }

    public GameRuleBuilder$IntegerRuleBuilder argumentType(ArgumentType<Integer> argumentType) {
        super.argumentType(argumentType);
        return this;
    }

    public GameRuleBuilder$IntegerRuleBuilder minValue(Integer n) {
        return this.range(n, Integer.MAX_VALUE);
    }

    public GameRuleBuilder$IntegerRuleBuilder codec(Codec<Integer> codec) {
        super.codec(codec);
        return this;
    }

    public GameRuleBuilder$IntegerRuleBuilder commandResultSupplier(ToIntFunction<Integer> toIntFunction) {
        super.commandResultSupplier(toIntFunction);
        return this;
    }

    public GameRuleBuilder$IntegerRuleBuilder requiredFeatures(class03767 class037672) {
        super.requiredFeatures(class037672);
        return this;
    }
}

