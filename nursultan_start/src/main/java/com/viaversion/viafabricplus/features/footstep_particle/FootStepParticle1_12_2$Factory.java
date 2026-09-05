/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class03448
 *  minecraft.class04406
 *  minecraft.class04417
 *  minecraft.class06069
 *  minecraft.class06143
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class08388
 */
package com.viaversion.viafabricplus.features.footstep_particle;

import com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class08388;

public class FootStepParticle1_12_2$Factory
implements class04417<class07134> {
    private final class06143 spriteProvider;

    public FootStepParticle1_12_2$Factory(class06143 class061432) {
        this.spriteProvider = class061432;
    }

    public /* synthetic */ class04406 method_3090(class07126 class071262, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        return this.createParticle((class07134)class071262, class034482, d, d2, d3, d4, d5, d6, class060692);
    }

    public class04406 createParticle(class07134 class071342, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        if (ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_12_2)) {
            throw new UnsupportedOperationException("FootStepParticle is not supported on versions newer than 1.12.2");
        }
        class08388 class083882 = this.spriteProvider.method_18139(class060692);
        return new FootStepParticle1_12_2(class034482, d, d2, d3, class083882);
    }
}

