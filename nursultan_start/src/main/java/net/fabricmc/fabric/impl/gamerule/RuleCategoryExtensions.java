/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.gamerule;

import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import org.jspecify.annotations.Nullable;

public interface RuleCategoryExtensions {
    public @Nullable CustomGameRuleCategory fabric_getCustomCategory();

    public void fabric_setCustomCategory(CustomGameRuleCategory var1);
}

