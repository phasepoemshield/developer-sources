/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.serialization.Codec
 *  minecraft.class03767
 *  minecraft.class05086
 *  minecraft.class05706
 *  minecraft.class07411
 */
package net.fabricmc.fabric.api.gamerule.v1;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.serialization.Codec;
import java.util.function.ToIntFunction;
import minecraft.class03767;
import minecraft.class05086;
import minecraft.class05706;
import minecraft.class07411;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;

public final class GameRuleBuilder$BooleanRuleBuilder
extends GameRuleBuilder<Boolean> {
    GameRuleBuilder$BooleanRuleBuilder(boolean bl2) {
        super(bl2);
        this.type = class07411.field_62400;
        this.acceptor = class05706::y;
        this.argumentType = BoolArgumentType.bool();
        this.codec = Codec.BOOL;
        this.commandResultSupplier = bl -> bl != false ? 1 : 0;
    }

    public GameRuleBuilder$BooleanRuleBuilder category(class05086 class050862) {
        super.category(class050862);
        return this;
    }

    public GameRuleBuilder$BooleanRuleBuilder category(CustomGameRuleCategory customGameRuleCategory) {
        super.category(customGameRuleCategory);
        return this;
    }

    public GameRuleBuilder$BooleanRuleBuilder argumentType(ArgumentType<Boolean> argumentType) {
        super.argumentType(argumentType);
        return this;
    }

    public GameRuleBuilder$BooleanRuleBuilder codec(Codec<Boolean> codec) {
        super.codec(codec);
        return this;
    }

    public GameRuleBuilder$BooleanRuleBuilder commandResultSupplier(ToIntFunction<Boolean> toIntFunction) {
        super.commandResultSupplier(toIntFunction);
        return this;
    }

    public GameRuleBuilder$BooleanRuleBuilder requiredFeatures(class03767 class037672) {
        super.requiredFeatures(class037672);
        return this;
    }
}

