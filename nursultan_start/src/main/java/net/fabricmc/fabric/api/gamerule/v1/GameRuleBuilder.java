/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03767
 *  minecraft.class04206
 *  minecraft.class05086
 *  minecraft.class05706
 *  minecraft.class06839
 *  minecraft.class07320
 *  minecraft.class07411
 *  net.fabricmc.fabric.impl.gamerule.RuleCategoryExtensions
 *  net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions
 *  net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.gamerule.v1;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import java.util.Objects;
import java.util.function.ToIntFunction;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class05086;
import minecraft.class05706;
import minecraft.class06839;
import minecraft.class07320;
import minecraft.class07411;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.api.gamerule.v1.FabricGameRuleVisitor;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder$BooleanRuleBuilder;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder$DoubleRuleBuilder;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder$EnumRuleBuilder;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder$IntegerRuleBuilder;
import net.fabricmc.fabric.impl.gamerule.RuleCategoryExtensions;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import org.jspecify.annotations.Nullable;

public class GameRuleBuilder<T> {
    protected final T defaultValue;
    protected class05086 category = class05086.M;
    protected @Nullable CustomGameRuleCategory fabricCategory = null;
    protected class07411 type = class07411.field_62399;
    protected @Nullable FabricGameRuleType fabricType;
    protected @Nullable ArgumentType<T> argumentType;
    protected class07320<T> acceptor;
    protected Codec<T> codec;
    protected ToIntFunction<T> commandResultSupplier;
    protected class03767 requiredFeatures = class03767.N();

    protected GameRuleBuilder(T t) {
        this.defaultValue = t;
    }

    public class06839<T> build() {
        Objects.requireNonNull(this.category, "GameRule category cannot be null! Consider using GameRuleCategory.MISC instead.");
        Objects.requireNonNull(this.type, "GameRule type cannot be null! Consider using GameRuleType.INT instead.");
        if (this.fabricType != FabricGameRuleType.ENUM) {
            Objects.requireNonNull(this.argumentType, "GameRule argumentType cannot be null for non-enum rules!");
        }
        Objects.requireNonNull(this.acceptor, "GameRule acceptor cannot be null!");
        Objects.requireNonNull(this.codec, "GameRule codec cannot be null!");
        Objects.requireNonNull(this.commandResultSupplier, "GameRule commandResultSupplier cannot be null!");
        Objects.requireNonNull(this.defaultValue, "GameRule defaultValue cannot be null!");
        Objects.requireNonNull(this.requiredFeatures, "GameRule requiredFeatures cannot be null! Consider using FeatureSet.empty() instead.");
        this.codec.encodeStart((DynamicOps)JavaOps.INSTANCE, this.defaultValue).getOrThrow(string -> new IllegalStateException("Failed to serialize default value: " + string));
        class06839 class068392 = new class06839(this.category, this.type, this.argumentType, this.acceptor, this.codec, this.commandResultSupplier, this.defaultValue, this.requiredFeatures);
        if (this.fabricCategory != null) {
            ((RuleCategoryExtensions)class068392).fabric_setCustomCategory(this.fabricCategory);
        }
        if (this.fabricType != null) {
            ((RuleTypeExtensions)class068392).fabric_setType(this.fabricType);
        }
        return class068392;
    }

    public GameRuleBuilder<T> category(CustomGameRuleCategory customGameRuleCategory) {
        this.category(class05086.M);
        this.fabricCategory = customGameRuleCategory;
        return this;
    }

    public GameRuleBuilder<T> category(class05086 class050862) {
        this.category = class050862;
        return this;
    }

    public GameRuleBuilder<T> argumentType(ArgumentType<T> argumentType) {
        this.argumentType = argumentType;
        return this;
    }

    private static <E extends Enum<E>> void visitEnum(class05706 class057062, class06839<E> class068392) {
        if (class057062 instanceof FabricGameRuleVisitor) {
            ((FabricGameRuleVisitor)class057062).visitEnum(class068392);
        }
    }

    public class06839<T> buildAndRegister(class01894 class018942) {
        class06839<T> class068392 = this.build();
        return (class06839)class00751.N((class00751)class04206.Nm, (class01894)class018942, class068392);
    }

    private static void visitDouble(class05706 class057062, class06839<Double> class068392) {
        if (class057062 instanceof FabricGameRuleVisitor) {
            ((FabricGameRuleVisitor)class057062).visitDouble(class068392);
        }
    }

    public GameRuleBuilder<T> codec(Codec<T> codec) {
        this.codec = codec;
        return this;
    }

    public GameRuleBuilder<T> commandResultSupplier(ToIntFunction<T> toIntFunction) {
        this.commandResultSupplier = toIntFunction;
        return this;
    }

    public static GameRuleBuilder$DoubleRuleBuilder forDouble(double d) {
        return new GameRuleBuilder$DoubleRuleBuilder(d);
    }

    public static GameRuleBuilder$IntegerRuleBuilder forInteger(int n) {
        return new GameRuleBuilder$IntegerRuleBuilder(n);
    }

    public static GameRuleBuilder$BooleanRuleBuilder forBoolean(boolean bl) {
        return new GameRuleBuilder$BooleanRuleBuilder(bl);
    }

    public static <E extends Enum<E>> GameRuleBuilder$EnumRuleBuilder<E> forEnum(E e) {
        return new GameRuleBuilder$EnumRuleBuilder<E>(e);
    }

    public GameRuleBuilder<T> requiredFeatures(class03767 class037672) {
        this.requiredFeatures = class037672;
        return this;
    }
}

