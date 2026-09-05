/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05936
 */
package me.shedaniel.clothconfig2.api;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05936;

public interface ConfigCategory {
    public ConfigCategory addEntry(AbstractConfigListEntry var1);

    @Deprecated
    public List<Object> getEntries();

    public class01894 getBackground();

    public void setBackground(class01894 var1);

    public void removeCategory();

    public Supplier<Optional<class05936[]>> getDescription();

    default public void setDescription(class05936[] class05936Array) {
        this.setDescription(() -> Optional.ofNullable(class05936Array));
    }

    public void setDescription(Supplier<Optional<class05936[]>> var1);

    public class00392 getCategoryKey();

    public ConfigCategory setCategoryBackground(class01894 var1);
}

