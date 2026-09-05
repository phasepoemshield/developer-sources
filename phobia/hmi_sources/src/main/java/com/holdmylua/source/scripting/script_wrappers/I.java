/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags
 *  net.minecraft.class_12123
 *  net.minecraft.class_12123$class_12124
 *  net.minecraft.class_1309
 *  net.minecraft.class_1764
 *  net.minecraft.class_1787
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1828
 *  net.minecraft.class_1839
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3489
 *  net.minecraft.class_3749
 *  net.minecraft.class_5134
 *  net.minecraft.class_6862
 *  net.minecraft.class_6903
 *  net.minecraft.class_7225$class_7874
 *  net.minecraft.class_746
 *  net.minecraft.class_9279
 *  net.minecraft.class_9280
 *  net.minecraft.class_9285
 *  net.minecraft.class_9285$class_9287
 *  net.minecraft.class_9304
 *  net.minecraft.class_9323
 *  net.minecraft.class_9334
 *  net.minecraft.class_9463
 */
package com.holdmylua.source.scripting.script_wrappers;

import com.google.gson.JsonElement;
import com.holdmylua.source.access.ItemStackAccessor;
import com.holdmylua.source.annotation.Safe;
import com.holdmylua.source.data_structures.SpearData;
import com.holdmylua.source.global.GlobalsStorage;
import com.holdmylua.source.scripting.script_wrappers.ComponentWrapper;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.class_12123;
import net.minecraft.class_1309;
import net.minecraft.class_1764;
import net.minecraft.class_1787;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1828;
import net.minecraft.class_1839;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_3749;
import net.minecraft.class_5134;
import net.minecraft.class_6862;
import net.minecraft.class_6903;
import net.minecraft.class_7225;
import net.minecraft.class_746;
import net.minecraft.class_9279;
import net.minecraft.class_9280;
import net.minecraft.class_9285;
import net.minecraft.class_9304;
import net.minecraft.class_9323;
import net.minecraft.class_9334;
import net.minecraft.class_9463;

public class I {
    @Safe
    public float getAttackDamage(class_1799 stack) {
        class_9285 modifiers = (class_9285)stack.method_57353().method_58694(class_9334.field_49636);
        if (modifiers == null) {
            return 0.0f;
        }
        float totalDamage = 0.0f;
        for (class_9285.class_9287 entry : modifiers.comp_2393()) {
            if (entry.comp_2395().comp_349() != class_5134.field_23721.comp_349()) continue;
            totalDamage += (float)entry.comp_2396().comp_2449();
        }
        return totalDamage;
    }

    @Safe
    public boolean isOf(class_1799 itemStack, class_1792 item) {
        return itemStack.method_31574(item);
    }

    @Safe
    public boolean isIn(class_1799 itemStack, class_6862<class_1792> tag) {
        return itemStack.method_31573(tag);
    }

    @Safe
    public boolean isEmpty(class_1799 itemStack) {
        return itemStack.method_7960();
    }

    @Safe
    public String getUseAction(class_1799 item) {
        return item.method_7976().method_15434();
    }

    @Safe
    public String getName(class_1799 item) {
        return item.method_7909().toString();
    }

    @Safe
    public String getActualName(class_1799 item) {
        if (item.method_65130() != null) {
            return item.method_65130().getString();
        }
        return item.method_7964().getString();
    }

    @Safe
    public boolean isChargedCrossbow(class_1799 item) {
        return class_1764.method_7781((class_1799)item);
    }

    @Safe
    public class_1799 getDefaultStack(class_1792 item) {
        return item.method_7854();
    }

    @Safe
    public boolean isBlock(class_1799 item) {
        return class_2248.method_9503((class_1792)item.method_7909()) != class_2246.field_10124;
    }

    @Safe
    public boolean shouldTranslateItem(class_1799 item) {
        int t = ((ItemStackAccessor)item).hMI5_0$getTransform();
        return (t != 0 || t == -1) && (!(item.method_7909() instanceof class_1787) && !item.method_31573(ConventionalItemTags.RODS) && !item.method_31573(ConventionalItemTags.TOOLS) && !item.method_31573(class_3489.field_42611) && !item.method_31573(ConventionalItemTags.MACE_TOOLS) && item.method_7976() != class_1839.field_8949 && !(this.getAttackDamage(item) > 0.0f) || item.method_7976() == class_1839.field_8950 || item.method_7976() == class_1839.field_8946 || item.method_7976() == class_1839.field_27079);
    }

    @Safe
    public boolean isCustomTranslate(class_1799 item) {
        return GlobalsStorage.translateItem.getOrDefault(this.getName(item), false);
    }

    @Safe
    public void setTranslate(class_1799 item, boolean translate) {
        ((ItemStackAccessor)item).hMI5_0$setTransform(translate);
    }

    @Safe
    public void setRenderAsBlock(class_1799 item, boolean render) {
        if (class_2248.method_9503((class_1792)item.method_7909()) != class_2246.field_10124) {
            ((ItemStackAccessor)item).hMI5_0$setRenderAsBlock(render);
        }
    }

    @Safe
    public boolean shouldRenderAsBlock(class_1799 item) {
        if (class_2248.method_9503((class_1792)item.method_7909()) != class_2246.field_10124) {
            int t = ((ItemStackAccessor)item).hMI5_0$getRenderAsBlock();
            return t == 1 || t == -1;
        }
        return false;
    }

    @Safe
    public boolean isLantern(class_1799 item) {
        return class_2248.method_9503((class_1792)item.method_7909()) instanceof class_3749;
    }

    @Safe
    public boolean isThrowable(class_1799 item) {
        return item.method_7909() instanceof class_1828 || item.method_7909() instanceof class_9463;
    }

    @Safe
    public void setSwingSpeed(class_1799 item, double value) {
        ((ItemStackAccessor)item).hMI5_0$setSwingSpeed((int)value);
    }

    @Safe
    public boolean isEnchanted(class_1799 item) {
        return item.method_7958();
    }

    @Safe
    public static ComponentWrapper getComponents(class_1799 stack) {
        class_6903 ops = class_6903.method_46632((DynamicOps)JsonOps.INSTANCE, (class_7225.class_7874)class_310.method_1551().field_1687.method_30349());
        class_9323 components = stack.method_57353();
        JsonElement json = (JsonElement)class_9323.field_50234.encodeStart((DynamicOps)ops, (Object)components).getOrThrow();
        return new ComponentWrapper(json.getAsJsonObject());
    }

    @Safe
    public void copyAppearanceComponents(class_1799 source) {
        class_1799 target = source.method_7909().method_7854();
        if (source.method_57826(class_9334.field_49633)) {
            target.method_57379(class_9334.field_49633, (Object)((class_9304)source.method_58694(class_9334.field_49633)));
        }
        if (source.method_57826(class_9334.field_54199)) {
            target.method_57379(class_9334.field_54199, (Object)((class_2960)source.method_58694(class_9334.field_54199)));
        }
        if (source.method_57826(class_9334.field_49637)) {
            target.method_57379(class_9334.field_49637, (Object)((class_9280)source.method_58694(class_9334.field_49637)));
        }
        if (source.method_57826(class_9334.field_49628)) {
            target.method_57379(class_9334.field_49628, (Object)((class_9279)source.method_58694(class_9334.field_49628)));
        }
        source = target;
    }

    @Safe
    public void setMainStack(class_1792 item) {
        GlobalsStorage.mainHandItem = item.method_7854();
    }

    @Safe
    public void setOffStack(class_1792 item) {
        GlobalsStorage.offHandItem = item.method_7854();
    }

    @Safe
    public SpearData getSpearData(class_1799 item) {
        class_746 player = class_310.method_1551().field_1724;
        class_12123 kineticWeaponComponent = (class_12123)item.method_58694(class_9334.field_63632);
        int spearUseDuration = item.method_7935((class_1309)player) - (player.method_6014() + 1);
        int i = kineticWeaponComponent.comp_4957();
        boolean canDismount = spearUseDuration < kineticWeaponComponent.comp_4958().map(class_12123.class_12124::comp_4965).orElse(0) + i;
        boolean canKnockBack = spearUseDuration < kineticWeaponComponent.comp_4959().map(class_12123.class_12124::comp_4965).orElse(0) + i;
        boolean canDamage = spearUseDuration < kineticWeaponComponent.comp_4960().map(class_12123.class_12124::comp_4965).orElse(0) + i;
        boolean hitImpact = player.method_75879(0.0f) == 1.0f;
        return new SpearData(canDamage, canKnockBack, canDismount, hitImpact);
    }
}

