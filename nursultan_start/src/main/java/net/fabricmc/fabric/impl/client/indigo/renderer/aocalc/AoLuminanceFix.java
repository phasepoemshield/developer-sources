/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07290
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.aocalc;

import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07290;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.Indigo;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface AoLuminanceFix {
    public static final AoLuminanceFix INSTANCE = Indigo.FIX_LUMINOUS_AO_SHADE ? AoLuminanceFix::fixed : AoLuminanceFix::vanilla;

    public static float fixed(class07290 class072902, class07209 class072092, class00500 class005002) {
        return class005002.m() == 0 ? class005002.L(class072902, class072092) : 1.0f;
    }

    public float apply(class07290 var1, class07209 var2, class00500 var3);

    public static float vanilla(class07290 class072902, class07209 class072092, class00500 class005002) {
        return class005002.L(class072902, class072092);
    }
}

