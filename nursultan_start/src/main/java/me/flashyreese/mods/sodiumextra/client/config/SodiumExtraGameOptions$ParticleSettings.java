/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  it.unimi.dsi.fastutil.objects.Object2BooleanArrayMap
 *  minecraft.class01894
 */
package me.flashyreese.mods.sodiumextra.client.config;

import com.google.gson.annotations.SerializedName;
import it.unimi.dsi.fastutil.objects.Object2BooleanArrayMap;
import java.util.Map;
import minecraft.class01894;

public class SodiumExtraGameOptions$ParticleSettings {
    public boolean particles = true;
    public boolean rainSplash = true;
    public boolean blockBreak = true;
    public boolean blockBreaking = true;
    @SerializedName(value="other")
    public Map<class01894, Boolean> otherMap = new Object2BooleanArrayMap();
}

