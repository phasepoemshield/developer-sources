/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  org.joml.Vector3d
 */
package net.irisshaders.iris.helpers;

import minecraft.class06889;
import org.joml.Vector3d;

public class JomlConversions {
    public static Vector3d fromVec3(class06889 class068892) {
        return new Vector3d(class068892.N(), class068892.y(), class068892.L());
    }
}

