/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class00965
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class04206
 *  minecraft.class05363
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class07103
 *  minecraft.class07134
 *  minecraft.class08388
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry
 *  net.fabricmc.fabric.api.particle.v1.FabricParticleTypes
 *  org.joml.Quaternionf
 */
package com.viaversion.viafabricplus.features.footstep_particle;

import com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2$Factory;
import minecraft.class00751;
import minecraft.class00965;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04206;
import minecraft.class05363;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class07103;
import minecraft.class07134;
import minecraft.class08388;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import org.joml.Quaternionf;

public final class FootStepParticle1_12_2
extends class05848 {
    public static final class01894 ID = class01894.N((String)"viafabricplus", (String)"footstep");
    public static int RAW_ID;

    FootStepParticle1_12_2(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.field_17867 = 0.125f;
        this.method_3077(200);
    }

    public static void init() {
        class07134 class071342 = FabricParticleTypes.simple((boolean)true);
        class00751.N((class00751)class04206.z, (class01894)ID, (Object)class071342);
        ParticleFactoryRegistry.getInstance().register((class07103)class071342, FootStepParticle1_12_2$Factory::new);
        RAW_ID = class04206.z.N((Object)class071342);
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public void method_60373(class00965 class009652, class05363 class053632, Quaternionf quaternionf, float f) {
        float f2 = ((float)this.field_3866 + f) / (float)this.field_3847;
        this.field_62636 = 2.0f - f2 * f2 * 2.0f;
        this.field_62636 = this.field_62636 > 1.0f ? 0.2f : (this.field_62636 *= 0.2f);
        super.method_60373(class009652, class053632, new Quaternionf().rotateX(-1.5707964f), f);
    }
}

