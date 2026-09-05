/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 */
package com.holdmylua.source.scripting.script_wrappers;

import com.holdmylua.source.annotation.Safe;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;

public class M {
    public double PI = 3.1415927410125732;

    @Safe
    public void scale(class_4587 matrices, double x, double y, double z) {
        matrices.method_22905((float)x, (float)y, (float)z);
    }

    @Safe
    public void push(class_4587 matrices) {
        matrices.method_22903();
    }

    @Safe
    public void pop(class_4587 matrices) {
        matrices.method_22909();
    }

    @Safe
    public void moveX(class_4587 matrices, double amount) {
        matrices.method_22904(amount, 0.0, 0.0);
    }

    @Safe
    public void moveY(class_4587 matrices, double amount) {
        matrices.method_22904(0.0, amount, 0.0);
    }

    @Safe
    public void moveZ(class_4587 matrices, double amount) {
        matrices.method_22904(0.0, 0.0, amount);
    }

    @Safe
    public void translate(class_4587 matrices, double x, double y, double z) {
        matrices.method_22904(x, y, z);
    }

    @Safe
    public void rotateX(class_4587 matrices, double amount) {
        matrices.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)amount));
    }

    @Safe
    public void rotateY(class_4587 matrices, double amount) {
        matrices.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)amount));
    }

    @Safe
    public void rotateZ(class_4587 matrices, double amount) {
        matrices.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)amount));
    }

    @Safe
    public void rotateX(class_4587 matrices, double amount, double x, double y, double z) {
        matrices.method_49278((Quaternionfc)class_7833.field_40714.rotationDegrees((float)amount), (float)x, (float)y, (float)z);
    }

    @Safe
    public void rotateY(class_4587 matrices, double amount, double x, double y, double z) {
        matrices.method_49278((Quaternionfc)class_7833.field_40716.rotationDegrees((float)amount), (float)x, (float)y, (float)z);
    }

    @Safe
    public void rotateZ(class_4587 matrices, double amount, double x, double y, double z) {
        matrices.method_49278((Quaternionfc)class_7833.field_40718.rotationDegrees((float)amount), (float)x, (float)y, (float)z);
    }

    @Safe
    public double sin(double a) {
        return Math.sin(a);
    }

    @Safe
    public double cos(double a) {
        return Math.cos(a);
    }

    @Safe
    public double clamp(double a, double min, double max) {
        return Math.clamp((double)a, (double)min, (double)max);
    }

    @Safe
    public double floor(double a) {
        return Math.floor(a);
    }

    @Safe
    public double abs(double a) {
        return Math.abs(a);
    }

    @Safe
    public double lerp(double a, double start, double end) {
        return class_3532.method_16436((double)a, (double)start, (double)end);
    }

    @Safe
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    @Safe
    public double ceil(double a) {
        return Math.ceil(a);
    }

    @Safe
    public double round(double a) {
        return Math.round(a);
    }

    @Safe
    public void shear(class_4587 matrices, double shearX, double shearY, double shearZ) {
        Matrix4f shearMatrix = new Matrix4f(1.0f, (float)shearX, (float)shearX, 0.0f, (float)shearY, 1.0f, (float)shearY, 0.0f, (float)shearZ, (float)shearZ, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        matrices.method_23760().method_23761().mul((Matrix4fc)shearMatrix);
    }
}

