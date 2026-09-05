/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1799
 *  net.minecraft.class_742
 */
package com.holdmylua.source.scripting.script_wrappers;

import com.holdmylua.source.access.LivingEntityAccessor;
import com.holdmylua.source.annotation.Safe;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_742;

public class P {
    @Safe
    public double getHealth(class_742 player) {
        return player.method_6032();
    }

    @Safe
    public boolean isSneaking(class_742 player) {
        return player.method_5715();
    }

    @Safe
    public boolean isOnGround(class_742 player) {
        return player.method_24828();
    }

    @Safe
    public boolean isSwimming(class_742 player) {
        return player.method_5681();
    }

    @Safe
    public boolean isClimbing(class_742 player) {
        return player.method_6101();
    }

    @Safe
    public boolean isCrawling(class_742 player) {
        return player.method_20448();
    }

    @Safe
    public boolean isSubmergedInWater(class_742 player) {
        return player.method_5869();
    }

    @Safe
    public boolean isTouchingWater(class_742 player) {
        return player.method_5799();
    }

    @Safe
    public boolean isUsingSpyglass(class_742 player) {
        return player.method_31550();
    }

    @Safe
    public boolean isUsingRiptide(class_742 player) {
        return player.method_6123();
    }

    @Safe
    public double getX(class_742 player) {
        return player.method_23317();
    }

    @Safe
    public double getY(class_742 player) {
        return player.method_23318();
    }

    @Safe
    public double getZ(class_742 player) {
        return player.method_23321();
    }

    @Safe
    public double getXSpeed(class_742 player) {
        return player.method_18798().method_10216();
    }

    @Safe
    public double getYSpeed(class_742 player) {
        return player.method_18798().method_10214();
    }

    @Safe
    public double getZSpeed(class_742 player) {
        return player.method_18798().method_10215();
    }

    @Safe
    public double getSpeed(class_742 player) {
        return player.method_18798().method_1033();
    }

    @Safe
    public boolean isUsingItem(class_742 player) {
        return player.method_6115();
    }

    @Safe
    public double getYaw(class_742 player) {
        return player.method_5791();
    }

    @Safe
    public double getPitch(class_742 player) {
        return player.method_36455();
    }

    @Safe
    public class_1799 getMainItem(class_742 player) {
        return player.method_6047();
    }

    @Safe
    public class_1799 getOffhandItem(class_742 player) {
        return player.method_6079();
    }

    @Safe
    public class_1268 getActiveHand(class_742 player) {
        return player.method_6058();
    }

    @Safe
    public int getAge(class_742 player) {
        return player.field_6012;
    }

    @Safe
    public boolean isItemCoolingDown(class_1799 item, class_742 player) {
        return player.method_7357().method_7904(item);
    }

    @Safe
    public double getSwingCount(class_742 player) {
        if (player instanceof LivingEntityAccessor) {
            LivingEntityAccessor access = (LivingEntityAccessor)player;
            return access.hMI5_0$getSwingCount();
        }
        return 0.0;
    }

    @Safe
    public String getStandingBlock(class_742 player) {
        return player.method_73183().method_8320(player.method_24515().method_10074()).method_41520().method_55840();
    }

    @Safe
    public String getBlockBelow(class_742 player, int steps) {
        return player.method_73183().method_8320(player.method_24515().method_10074().method_10087(steps)).method_41520().method_55840();
    }

    @Safe
    public String getBlockAbove(class_742 player, int steps) {
        return player.method_73183().method_8320(player.method_24515().method_10084().method_10084().method_10086(steps)).method_41520().method_55840();
    }

    @Safe
    public boolean hasVehicle(class_742 player, int steps) {
        return player.method_5765();
    }
}

