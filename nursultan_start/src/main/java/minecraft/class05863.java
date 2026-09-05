/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05363
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class05363;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

public interface class05863 {
    public static final class05863 N = (quaternionf, class053632, f) -> quaternionf.set((Quaternionfc)class053632.M());
    public static final class05863 y = (quaternionf, class053632, f) -> quaternionf.set(0.0f, class053632.M().y, 0.0f, class053632.M().w);

    public void setRotation(Quaternionf var1, class05363 var2, float var3);
}

