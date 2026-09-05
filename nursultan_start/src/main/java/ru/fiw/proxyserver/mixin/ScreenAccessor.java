/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01294
 *  minecraft.class03434
 *  minecraft.class04654
 */
package ru.fiw.proxyserver.mixin;

import java.util.List;
import minecraft.class01294;
import minecraft.class03434;
import minecraft.class04654;

public interface ScreenAccessor {
    public List<class04654> getChildren();

    public List<class03434> getSelectables();

    public List<class01294> getDrawables();
}

