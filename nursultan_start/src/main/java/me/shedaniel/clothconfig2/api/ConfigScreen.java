/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class05096
 */
package me.shedaniel.clothconfig2.api;

import java.util.Iterator;
import java.util.function.Consumer;
import me.shedaniel.clothconfig2.api.Tooltip;
import minecraft.class01894;
import minecraft.class05096;

public interface ConfigScreen {
    public void setSavingRunnable(Runnable var1);

    public void saveAll(boolean var1);

    public boolean isEdited();

    public void addTooltip(Tooltip var1);

    public boolean matchesSearch(Iterator<String> var1);

    public boolean isRequiresRestart();

    public void setAfterInitConsumer(Consumer<class05096> var1);

    public class01894 getBackgroundLocation();
}

