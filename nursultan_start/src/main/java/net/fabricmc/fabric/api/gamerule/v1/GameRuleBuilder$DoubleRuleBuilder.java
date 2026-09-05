/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.serialization.Codec
 *  minecraft.class03767
 *  minecraft.class05086
 *  net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType
 */
package net.fabricmc.fabric.api.gamerule.v1;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.serialization.Codec;
import java.util.function.ToIntFunction;
import minecraft.class03767;
import minecraft.class05086;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder$NumberRuleBuilder;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;

public final class GameRuleBuilder$DoubleRuleBuilder
extends GameRuleBuilder$NumberRuleBuilder<Double> {
    GameRuleBuilder$DoubleRuleBuilder(double d2) {
        super(d2);
        this.fabricType = FabricGameRuleType.DOUBLE;
        this.acceptor = GameRuleBuilder::visitDouble;
        this.argumentType = DoubleArgumentType.doubleArg();
        this.codec = Codec.DOUBLE;
        this.commandResultSupplier = d -> Double.compare(d, 0.0);
    }

    public GameRuleBuilder$DoubleRuleBuilder range(Double d, Double d2) {
        if ((Double)this.defaultValue < d || (Double)this.defaultValue > d2) {
            throw new IllegalArgumentException("Default value is out-of-bounds: " + String.valueOf(this.defaultValue));
        }
        return ((GameRuleBuilder$DoubleRuleBuilder)this.argumentType((ArgumentType)DoubleArgumentType.doubleArg((double)d, (double)d2))).codec(Codec.doubleRange((double)d, (double)d2));
    }

    public GameRuleBuilder$DoubleRuleBuilder category(CustomGameRuleCategory customGameRuleCategory) {
        super.category(customGameRuleCategory);
        return this;
    }

    public GameRuleBuilder$DoubleRuleBuilder category(class05086 class050862) {
        super.category(class050862);
        return this;
    }

    public GameRuleBuilder$DoubleRuleBuilder argumentType(ArgumentType<Double> argumentType) {
        super.argumentType(argumentType);
        return this;
    }

    public GameRuleBuilder$DoubleRuleBuilder minValue(Double d) {
        return this.range(d, (Double)Double.MAX_VALUE);
    }

    public GameRuleBuilder$DoubleRuleBuilder codec(Codec<Double> codec) {
        super.codec(codec);
        return this;
    }

    public GameRuleBuilder$DoubleRuleBuilder commandResultSupplier(ToIntFunction<Double> toIntFunction) {
        super.commandResultSupplier(toIntFunction);
        return this;
    }

    public GameRuleBuilder$DoubleRuleBuilder requiredFeatures(class03767 class037672) {
        super.requiredFeatures(class037672);
        return this;
    }
}

