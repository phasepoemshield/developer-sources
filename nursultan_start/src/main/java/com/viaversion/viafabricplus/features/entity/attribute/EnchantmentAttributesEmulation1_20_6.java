/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01210
 *  minecraft.class03556
 *  minecraft.class05298
 *  minecraft.class05946
 *  minecraft.class07049
 *  minecraft.class07304
 *  minecraft.class07314
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07468
 *  minecraft.class07469
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 */
package com.viaversion.viafabricplus.features.entity.attribute;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class01210;
import minecraft.class03556;
import minecraft.class05298;
import minecraft.class05946;
import minecraft.class07049;
import minecraft.class07304;
import minecraft.class07314;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07468;
import minecraft.class07469;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public final class EnchantmentAttributesEmulation1_20_6 {
    public static void init() {
        ClientTickEvents.START_WORLD_TICK.register(class034482 -> {
            if (ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_5)) {
                return;
            }
            for (class07049 class070492 : class034482.M()) {
                if (!class070492.method_66247() || !(class070492 instanceof class07438)) continue;
                class07438 class074382 = (class07438)class070492;
                EnchantmentAttributesEmulation1_20_6.setAttribute(class074382, (class03556<class07468>)class05298.o, (double)EnchantmentAttributesEmulation1_20_6.getEquipmentLevel((class05946<class07304>)class07314.Z, class074382) / 3.0);
                EnchantmentAttributesEmulation1_20_6.setGenericMovementEfficiencyAttribute(class074382);
            }
            for (class07049 class070492 : class034482.method_18456()) {
                if (!class070492.method_66247()) continue;
                int n = EnchantmentAttributesEmulation1_20_6.getEquipmentLevel((class05946<class07304>)class07314.n, (class07438)class070492);
                EnchantmentAttributesEmulation1_20_6.setAttribute((class07438)class070492, (class03556<class07468>)class05298.t, n > 0 ? (double)(n * n) + 1.0 : 0.0);
                EnchantmentAttributesEmulation1_20_6.setAttribute((class07438)class070492, (class03556<class07468>)class05298.Y, 0.3 + (double)EnchantmentAttributesEmulation1_20_6.getEquipmentLevel((class05946<class07304>)class07314.W, (class07438)class070492) * 0.15);
                EnchantmentAttributesEmulation1_20_6.setAttribute((class07438)class070492, (class03556<class07468>)class05298.g, EnchantmentAttributesEmulation1_20_6.getEquipmentLevel((class05946<class07304>)class07314.M, (class07438)class070492) <= 0 ? 0.2 : 1.0);
                EnchantmentAttributesEmulation1_20_6.setAttribute((class07438)class070492, (class03556<class07468>)class05298.i, EnchantmentAttributesEmulation1_20_6.getEquipmentLevel((class05946<class07304>)class07314.T, (class07438)class070492));
            }
        });
    }

    public static void setGenericMovementEfficiencyAttribute(class07438 class074382) {
        boolean bl = class074382.method_73183().method_8320(class074382.method_23314()).N(class01210.yy);
        EnchantmentAttributesEmulation1_20_6.setAttribute(class074382, (class03556<class07468>)class05298.G, bl && EnchantmentAttributesEmulation1_20_6.getEquipmentLevel((class05946<class07304>)class07314.E, class074382) > 0 ? 1.0 : 0.0);
    }

    private static void setAttribute(class07438 class074382, class03556<class07468> class035562, double d) {
        class07469 class074692 = class074382.method_5996(class035562);
        class074692.R();
        class074692.N(d);
    }

    private static int getEquipmentLevel(class05946<class07304> class059462, class07438 class074382) {
        return class07323.N((class03556)class074382.method_73183().method_30349().i(class059462), (class07438)class074382);
    }
}

