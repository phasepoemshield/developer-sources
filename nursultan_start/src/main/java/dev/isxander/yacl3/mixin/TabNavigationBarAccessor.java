/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class01885
 *  minecraft.class03241
 *  minecraft.class03271
 *  minecraft.class03567
 */
package dev.isxander.yacl3.mixin;

import com.google.common.collect.ImmutableList;
import minecraft.class01885;
import minecraft.class03241;
import minecraft.class03271;
import minecraft.class03567;

public interface TabNavigationBarAccessor {
    public ImmutableList<class03567> yacl$getTabButtons();

    public int yacl$getWidth();

    public class01885 yacl$getLayout();

    public ImmutableList<class03241> yacl$getTabs();

    public class03271 yacl$getTabManager();
}

