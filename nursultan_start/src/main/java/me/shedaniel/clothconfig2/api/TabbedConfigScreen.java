/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 */
package me.shedaniel.clothconfig2.api;

import me.shedaniel.clothconfig2.api.ConfigScreen;
import minecraft.class00392;
import minecraft.class01894;

public interface TabbedConfigScreen
extends ConfigScreen {
    public void registerCategoryTransparency(String var1, boolean var2);

    public class00392 getSelectedCategory();

    public void registerCategoryBackground(String var1, class01894 var2);
}

