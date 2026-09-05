/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.entity.r1_8_boat.IAbstractBoat
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00250
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class08382
 */
package com.viaversion.viafabricplus.features.entity.r1_8_boat;

import com.viaversion.viafabricplus.injection.access.entity.r1_8_boat.IAbstractBoat;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00250;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08382;

public final class PositionInterpolator1_8
extends class08382 {
    private final class00250 boatEntity;

    public void method_66267(class06889 class068892, float f, float f2) {
        IAbstractBoat iAbstractBoat = (IAbstractBoat)this.boatEntity;
        if (this.boatEntity.method_5782() && ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6)) {
            this.boatEntity.field_6014 = class068892.M;
            this.boatEntity.field_6036 = class068892.B;
            this.boatEntity.field_5969 = class068892.Z;
            iAbstractBoat.viaFabricPlus$setBoatInterpolationSteps(0);
            this.boatEntity.method_33574(class068892);
            this.boatEntity.method_5710(f, f2);
            this.boatEntity.method_18799(class06889.L);
            iAbstractBoat.viaFabricPlus$setBoatVelocity(class06889.L);
        } else {
            if (!this.boatEntity.method_5782()) {
                iAbstractBoat.viaFabricPlus$setBoatInterpolationSteps(8);
            } else {
                if (this.boatEntity.method_5649(class068892.M, class068892.B, class068892.Z) <= 1.0) {
                    return;
                }
                iAbstractBoat.viaFabricPlus$setBoatInterpolationSteps(3);
            }
            this.field_55666.y = class068892;
            this.field_55666.L = f;
            this.field_55666.u = f2;
            this.boatEntity.method_18799(iAbstractBoat.viaFabricPlus$getBoatVelocity());
        }
    }

    public PositionInterpolator1_8(class00250 class002502) {
        super((class07049)class002502);
        this.boatEntity = class002502;
    }

    public void method_66271() {
    }
}

