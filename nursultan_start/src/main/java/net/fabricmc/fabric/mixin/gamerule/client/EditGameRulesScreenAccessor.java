/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05211
 *  minecraft.class07305
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.gamerule.client;

import minecraft.class05211;
import minecraft.class07305;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface EditGameRulesScreenAccessor {
    public class07305 getGameRules();

    public void callMarkValid(class05211 var1);

    public void callMarkInvalid(class05211 var1);
}

