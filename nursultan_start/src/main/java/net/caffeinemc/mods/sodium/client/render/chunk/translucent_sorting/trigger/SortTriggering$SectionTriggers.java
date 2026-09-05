/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering;

interface SortTriggering$SectionTriggers<T extends DynamicData> {
    public void integrateSection(SortTriggering var1, class01296 var2, T var3, CameraMovement var4);

    public void processTriggers(SortTriggering var1, CameraMovement var2);

    public void removeSection(long var1, TranslucentData var3);
}

