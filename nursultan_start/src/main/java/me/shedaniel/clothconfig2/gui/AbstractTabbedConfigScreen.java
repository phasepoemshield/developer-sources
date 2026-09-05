/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  me.shedaniel.clothconfig2.api.TabbedConfigScreen
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05096
 */
package me.shedaniel.clothconfig2.gui;

import com.google.common.collect.Maps;
import java.util.Map;
import me.shedaniel.clothconfig2.api.TabbedConfigScreen;
import me.shedaniel.clothconfig2.gui.AbstractConfigScreen;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05096;

public abstract class AbstractTabbedConfigScreen
extends AbstractConfigScreen
implements TabbedConfigScreen {
    private final Map<String, Boolean> categoryTransparentBackground = Maps.newHashMap();
    private final Map<String, class01894> categoryBackgroundLocation = Maps.newHashMap();

    protected AbstractTabbedConfigScreen(class05096 class050962, class00392 class003922, class01894 class018942) {
        super(class050962, class003922, class018942);
    }

    public void registerCategoryTransparency(String string, boolean bl) {
        this.categoryTransparentBackground.put(string, bl);
    }

    public final void registerCategoryBackground(String string, class01894 class018942) {
        this.categoryBackgroundLocation.put(string, class018942);
    }

    @Override
    public class01894 getBackgroundLocation() {
        class00392 class003922 = this.getSelectedCategory();
        if (this.categoryBackgroundLocation.containsKey(class003922.getString())) {
            return this.categoryBackgroundLocation.get(class003922.getString());
        }
        return super.getBackgroundLocation();
    }

    @Override
    public boolean isTransparentBackground() {
        class00392 class003922 = this.getSelectedCategory();
        if (this.categoryTransparentBackground.containsKey(class003922.getString())) {
            return this.categoryTransparentBackground.get(class003922.getString());
        }
        return super.isTransparentBackground();
    }
}

