/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01167
 *  minecraft.class02910
 *  minecraft.class03448
 *  minecraft.class06143
 *  minecraft.class07138
 *  org.joml.Vector3f
 */
package Nursultan;

import minecraft.class01167;
import minecraft.class02910;
import minecraft.class03448;
import minecraft.class06143;
import minecraft.class07138;
import org.joml.Vector3f;

public class class10100
extends class01167<class07138> {
    protected class10100(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class07138 class071382, class06143 class061432) {
        super(class034482, d, d2, d3, d4, d5, d6, (class02910)class071382, class061432);
        float f = this.field_3840.z() * 0.4f + 0.6f;
        Vector3f vector3f = class071382.N();
        this.field_62633 = this.N(vector3f.x(), f);
        this.field_62634 = this.N(vector3f.y(), f);
        this.field_62635 = this.N(vector3f.z(), f);
    }
}

