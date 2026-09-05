/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07185
 *  minecraft.class07211
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.helper;

import minecraft.class07185;
import minecraft.class07211;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
class GeometryHelper$1 {
    static final /* synthetic */ int[] $SwitchMap$net$minecraft$core$Direction;
    static final /* synthetic */ int[] $SwitchMap$net$minecraft$core$Direction$Axis;

    static {
        $SwitchMap$net$minecraft$core$Direction$Axis = new int[class07185.values().length];
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction$Axis[class07185.field_11048.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction$Axis[class07185.field_11052.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction$Axis[class07185.field_11051.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$net$minecraft$core$Direction = new int[class07211.values().length];
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction[class07211.field_11034.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction[class07211.field_11039.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction[class07211.field_11036.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction[class07211.field_11033.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction[class07211.field_11035.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GeometryHelper$1.$SwitchMap$net$minecraft$core$Direction[class07211.field_11043.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

