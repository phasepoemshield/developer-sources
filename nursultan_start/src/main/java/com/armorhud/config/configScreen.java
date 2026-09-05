/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05002
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05914
 *  minecraft.class06366
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package com.armorhud.config;

import com.armorhud.config.config;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05002;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class05914;
import minecraft.class06366;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class configScreen
extends class05914 {
    public class05096 parent;
    public class06366<?> doubleHotbarToggle;
    public class06366<?> betterMountHudToggle;
    public class06366<?> armorHudToggle;
    public class06366<?> rightToLeftToggle;
    public class06366<?> disableArmorBar;
    public class06366<?> armorPosition;
    public class06366<?> trimEmptySlots;
    public class05362 doneButton;

    public configScreen(class05096 class050962) {
        super(class050962, null, (class00392)class00392.L((String)"config.title"));
        this.parent = class050962;
    }

    public void method_25426() {
        this.doubleHotbarToggle = class06366.N((boolean)config.DOUBLE_HOTBAR).N((class00392)class00392.L((String)"config.doublehotbar"), (class063662, bl) -> {
            config.DOUBLE_HOTBAR = !config.DOUBLE_HOTBAR;
        });
        this.betterMountHudToggle = class06366.N((boolean)config.BETTER_MOUNT_HUD).N((class00392)class00392.L((String)"config.bettermounthud"), (class063662, bl) -> {
            config.BETTER_MOUNT_HUD = !config.BETTER_MOUNT_HUD;
        });
        this.armorHudToggle = class06366.N((boolean)config.ARMOR_HUD).N((class00392)class00392.L((String)"config.armorvisible"), (class063662, bl) -> {
            config.ARMOR_HUD = !config.ARMOR_HUD;
        });
        this.rightToLeftToggle = class06366.N((boolean)config.RTL).N((class00392)class00392.L((String)"config.righttoleft"), (class063662, bl) -> {
            config.RTL = !config.RTL;
        });
        this.disableArmorBar = class06366.N((boolean)config.DISABLE_ARMOR_BAR).N((class00392)class00392.L((String)"config.disablearmorbar"), (class063662, bl) -> {
            config.DISABLE_ARMOR_BAR = !config.DISABLE_ARMOR_BAR;
        });
        this.armorPosition = class06366.N((class00392)class00392.L((String)"simple_armor_hud.render.above_food_bar"), (class00392)class00392.L((String)"simple_armor_hud.render.above_armor_bar"), (boolean)config.ABOVE_HEALTH_BAR).N((class00392)class00392.L((String)"config.hudposition"), (class063662, bl) -> {
            config.ABOVE_HEALTH_BAR = !config.ABOVE_HEALTH_BAR;
        });
        this.trimEmptySlots = class06366.N((boolean)config.TRIM_EMPTY_SLOTS).N((class00392)class00392.L((String)"config.trimemptyslots"), (class063662, bl) -> {
            config.TRIM_EMPTY_SLOTS = !config.TRIM_EMPTY_SLOTS;
        });
        class05002 class050022 = (class05002)this.method_37063((class04654)new class05002(this.field_22787, this.field_22789, (class05914)this));
        class050022.N(this.doubleHotbarToggle, this.betterMountHudToggle);
        class050022.N(this.armorHudToggle, this.rightToLeftToggle);
        class050022.N(this.disableArmorBar, this.armorPosition);
        class050022.N(this.trimEmptySlots, null);
        this.doneButton = class05362.method_46430((class00392)class00392.L((String)"config.done"), class053622 -> this.method_25419()).N(this.field_22789 / 2 - 100, this.field_22790 - 25, 200, 20).N();
        this.method_37063((class04654)this.doneButton);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 12, 0xFFFFFF);
    }

    public void method_25419() {
        assert (this.field_22787 != null);
        config.save();
        this.field_22787.N(this.parent);
    }

    public void method_60325() {
        super.method_25426();
    }
}

