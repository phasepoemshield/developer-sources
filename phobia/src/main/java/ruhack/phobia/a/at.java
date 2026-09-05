/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  net.minecraft.class_10442
 *  net.minecraft.class_10444
 *  net.minecraft.class_11566
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1937
 *  net.minecraft.class_2487
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_811
 *  net.minecraft.class_9279
 *  net.minecraft.class_9280
 *  net.minecraft.class_9296
 *  net.minecraft.class_9334
 *  org.spongepowered.asm.mixin.Mixin
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import java.util.List;
import java.util.Optional;
import net.minecraft.class_10442;
import net.minecraft.class_10444;
import net.minecraft.class_11566;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2487;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_811;
import net.minecraft.class_9279;
import net.minecraft.class_9280;
import net.minecraft.class_9296;
import net.minecraft.class_9334;
import org.spongepowered.asm.mixin.Mixin;
import ruhack.phobia.jh;
import ruhack.phobia.nk;

@Mixin(value={class_10442.class})
public abstract class at {
    private static final class_2960 ITEM_REPLACER_MODEL = class_2960.method_60655((String)"phobia", (String)"item_replacer");
    private static final class_2960 LEGACY_PLAYER_HEAD_MODEL = class_2960.method_60655((String)"phobia", (String)"legacy_player_head");

    @WrapMethod(method={"method_65596"})
    private void phobia$replaceHeldSword(class_10444 renderState, class_1799 stack, class_811 displayContext, class_1937 world, class_11566 heldItemContext, int seed, Operation<Void> original) {
        jh module = jh.getInstance();
        boolean allowedOwner = module != null && (!module.selfOnly.isValue() || heldItemContext == class_310.method_1551().field_1724);
        original.call(new Object[]{renderState, at.replacement(stack, module, allowedOwner), displayContext, world, heldItemContext, seed});
    }

    @WrapMethod(method={"method_65597"})
    private void phobia$replaceLivingSword(class_10444 renderState, class_1799 stack, class_811 displayContext, class_1309 entity, Operation<Void> original) {
        jh module = jh.getInstance();
        boolean allowedOwner = module != null && (!module.selfOnly.isValue() || entity == class_310.method_1551().field_1724);
        original.call(new Object[]{renderState, at.replacement(stack, module, allowedOwner), displayContext, entity});
    }

    @WrapMethod(method={"method_65595"})
    private void phobia$replaceNonLivingSword(class_10444 renderState, class_1799 stack, class_811 displayContext, class_1297 entity, Operation<Void> original) {
        jh module = jh.getInstance();
        boolean allowedOwner = module != null && !module.selfOnly.isValue();
        original.call(new Object[]{renderState, at.replacement(stack, module, allowedOwner), displayContext, entity});
    }

    private static class_1799 replacement(class_1799 original, jh module, boolean allowedOwner) {
        class_1799 stack = at.withLegacyPlayerHeadProfile(original);
        stack = at.withLegacyPlayerHeadModelData(stack);
        if (!(module != null && module.isState() && allowedOwner && module.shouldReplace(original))) {
            return stack;
        }
        class_1799 copy = stack.method_7972();
        copy.method_57379(class_9334.field_54199, (Object)ITEM_REPLACER_MODEL);
        copy.method_57379(class_9334.field_49637, (Object)new class_9280(List.of(), List.of(), List.of(module.selectedWeapon(original)), List.of()));
        return copy;
    }

    private static class_1799 withLegacyPlayerHeadProfile(class_1799 original) {
        class_9296 profile = nk.get(original);
        if (profile == null) {
            return original;
        }
        class_1799 copy = original.method_7972();
        copy.method_57379(class_9334.field_49617, (Object)profile);
        if (!at.hasCustomModelData(original)) {
            copy.method_57379(class_9334.field_54199, (Object)LEGACY_PLAYER_HEAD_MODEL);
        }
        return copy;
    }

    private static boolean hasCustomModelData(class_1799 stack) {
        class_9280 component = (class_9280)stack.method_58694(class_9334.field_49637);
        if (!(component == null || component.comp_3354().isEmpty() && component.comp_3355().isEmpty() && component.comp_3356().isEmpty() && component.comp_3357().isEmpty())) {
            return true;
        }
        class_9279 customData = (class_9279)stack.method_58694(class_9334.field_49628);
        return customData != null && at.legacyNumber(customData.method_57461()) != null;
    }

    private static class_1799 withLegacyPlayerHeadModelData(class_1799 original) {
        class_9279 customData;
        if (!original.method_31574(class_1802.field_8575)) {
            return original;
        }
        class_9280 current = (class_9280)original.method_58694(class_9334.field_49637);
        if (current != null && !current.comp_3354().isEmpty()) {
            return original;
        }
        Float value = at.numericString(current);
        if (value == null && (customData = (class_9279)original.method_58694(class_9334.field_49628)) != null) {
            class_2487 nbt = customData.method_57461();
            value = at.legacyNumber(nbt);
        }
        if (value == null || !Float.isFinite(value.floatValue()) || value.floatValue() <= 0.0f) {
            return original;
        }
        class_1799 copy = original.method_7972();
        copy.method_57379(class_9334.field_49637, (Object)new class_9280(List.of(value), current == null ? List.of() : current.comp_3355(), current == null ? List.of() : current.comp_3356(), current == null ? List.of() : current.comp_3357()));
        return copy;
    }

    private static Float numericString(class_9280 component) {
        if (component == null) {
            return null;
        }
        for (String value : component.comp_3356()) {
            try {
                return Float.valueOf(Float.parseFloat(value));
            }
            catch (NumberFormatException numberFormatException) {
            }
        }
        return null;
    }

    private static Float legacyNumber(class_2487 nbt) {
        for (String key : List.of("CustomModelData", "custom_model_data", "minecraft:custom_model_data")) {
            Optional number = nbt.method_10550(key);
            if (number.isPresent()) {
                return Float.valueOf(((Integer)number.get()).floatValue());
            }
            Optional text = nbt.method_10558(key);
            if (!text.isPresent()) continue;
            try {
                return Float.valueOf(Float.parseFloat((String)text.get()));
            }
            catch (NumberFormatException numberFormatException) {
            }
        }
        return null;
    }
}

