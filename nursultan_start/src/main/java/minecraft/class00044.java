/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00002
 *  minecraft.class00018
 *  minecraft.class01894
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.sound.v1.FabricSoundInstance
 *  net.fabricmc.fabric.mixin.client.sound.SoundInstanceMixin
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00002;
import minecraft.class00018;
import minecraft.class00137;
import minecraft.class01894;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.sound.v1.FabricSoundInstance;
import net.fabricmc.fabric.mixin.client.sound.SoundInstanceMixin;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface class00044
extends FabricSoundInstance,
SoundInstanceMixin {
    public class01894 L();

    public int M();

    public float B();

    public float Z();

    public class04911 i();

    default public boolean s() {
        return true;
    }

    public boolean m();

    public static class06069 v() {
        return class06069.u();
    }

    public double U();

    public double z();

    public @Nullable class00002 u();

    public double E();

    public @Nullable class00137 N(class09033 var1);

    public class00018 W();

    public boolean R();

    default public boolean w_() {
        return false;
    }
}

