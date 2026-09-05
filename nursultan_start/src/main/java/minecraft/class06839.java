/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class01894
 *  minecraft.class02995
 *  minecraft.class03767
 *  minecraft.class04206
 *  minecraft.class05086
 *  minecraft.class05706
 *  minecraft.class07320
 *  minecraft.class07411
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory
 *  net.fabricmc.fabric.impl.gamerule.RuleCategoryExtensions
 *  net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions
 *  net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import minecraft.class01894;
import minecraft.class02995;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class05086;
import minecraft.class05706;
import minecraft.class07320;
import minecraft.class07411;
import minecraft.class07536;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.impl.gamerule.RuleCategoryExtensions;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import org.jspecify.annotations.Nullable;

public final class class06839<T>
implements class02995,
RuleCategoryExtensions,
RuleTypeExtensions {
    private final class05086 N;
    private final class07411 y;
    private final ArgumentType<T> L;
    private final class07320<T> u;
    private final Codec<T> i;
    private final ToIntFunction<T> R;
    private final T M;
    private final class03767 B;
    private @Nullable CustomGameRuleCategory Z;
    private @Nullable FabricGameRuleType z;
    private final List U = new ArrayList();

    private DataResult L(String string) {
        try {
            StringReader stringReader = new StringReader(string);
            Object object = this.L.parse(stringReader);
            if (stringReader.canRead()) {
                return DataResult.error(() -> "Failed to deserialize; trailing characters", (Object)object);
            }
            return DataResult.success((Object)object);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return DataResult.error(() -> "Failed to deserialize");
        }
    }

    public String L() {
        return class07536.N((String)"gamerule", (class01894)this.y());
    }

    public ArgumentType<T> M() {
        return this.L;
    }

    public class06839(class05086 class050862, class07411 class074112, ArgumentType<T> argumentType, class07320<T> class073202, Codec<T> codec, ToIntFunction<T> toIntFunction, T t, class03767 class037672) {
        this.N = class050862;
        this.y = class074112;
        this.L = argumentType;
        this.u = class073202;
        this.i = codec;
        this.R = toIntFunction;
        this.M = t;
        this.B = class037672;
    }

    public String toString() {
        return this.N();
    }

    public Codec<T> B() {
        return this.i;
    }

    public T Z() {
        return this.M;
    }

    public class05086 i() {
        return this.N;
    }

    public Class<T> u() {
        return this.M.getClass();
    }

    public class01894 y() {
        return Objects.requireNonNull(class04206.Nm.y((Object)this));
    }

    public int y(T t) {
        return this.R.applyAsInt(t);
    }

    private DataResult N(String string, Operation operation) {
        if (this.fabric_getType() != FabricGameRuleType.ENUM) {
            return (DataResult)operation.call(new Object[]{string});
        }
        try {
            Class clazz = this.u();
            T t = Enum.valueOf(clazz, string);
            if (!this.U.contains(t)) {
                return DataResult.error(() -> "Failed to parse rule of value " + string + " for rule of type " + String.valueOf(clazz) + " because the value is unsupported.");
            }
            return DataResult.success(t);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return DataResult.error(() -> "Failed to parse rule of value " + string + " for rule of type " + String.valueOf(this.u()));
        }
    }

    public void N(class05706 class057062) {
        this.u.call(class057062, this);
    }

    public DataResult<T> N(String string) {
        return this.N(string, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.lang.String]");
            return this.L((String)objectArray[0]);
        });
    }

    public String N(T t) {
        return t.toString();
    }

    public String N() {
        return this.y().R();
    }

    public class07411 R() {
        return this.y;
    }

    public class03767 method_45322() {
        return this.B;
    }

    public @Nullable FabricGameRuleType fabric_getType() {
        return this.z;
    }

    public void fabric_setType(FabricGameRuleType fabricGameRuleType) {
        this.z = fabricGameRuleType;
    }

    public Enum fabric_enumCycle(Enum enum_) {
        if (this.fabric_getType() != FabricGameRuleType.ENUM) {
            return super.fabric_enumCycle(enum_);
        }
        int n = this.U.indexOf(enum_);
        if (n < 0) {
            throw new IllegalArgumentException(String.format("Invalid value: %s", enum_));
        }
        return (Enum)this.U.get((n + 1) % this.U.size());
    }

    public Iterable fabric_getSupportedEnumValues() {
        if (this.fabric_getType() != FabricGameRuleType.ENUM) {
            return super.fabric_getSupportedEnumValues();
        }
        return this.U;
    }

    public void fabric_setSupportedEnumValues(Enum[] enumArray) {
        if (this.fabric_getType() != FabricGameRuleType.ENUM) {
            super.fabric_setSupportedEnumValues(enumArray);
            return;
        }
        this.U.clear();
        Collections.addAll(this.U, enumArray);
    }

    public CustomGameRuleCategory fabric_getCustomCategory() {
        return this.Z;
    }

    public void fabric_setCustomCategory(CustomGameRuleCategory customGameRuleCategory) {
        this.Z = customGameRuleCategory;
    }
}

