/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 *  org.joml.Quaternionfc
 */
package com.holdmylua.source.model;

import com.holdmylua.source.model.interfaces.Poses;
import com.holdmylua.source.model.parents.AbstractPose;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import org.joml.Quaternionfc;

public class RotationZ
extends AbstractPose
implements Poses {
    private float x;
    private float y;
    private float z;
    private float amount;

    public RotationZ(float amount, float x, float y, float z) {
        this.amount = amount;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void applyPose(class_4587 matrices) {
        matrices.method_49278((Quaternionfc)class_7833.field_40718.rotationDegrees(this.amount), this.x, this.y, this.z);
    }
}

