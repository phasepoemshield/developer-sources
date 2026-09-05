/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06918
 *  minecraft.class08036
 *  org.joml.Vector3f
 */
package net.irisshaders.iris.api.v0.item;

import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06918;
import minecraft.class08036;
import org.joml.Vector3f;

public interface IrisItemLightProvider {
    public static final Vector3f DEFAULT_LIGHT_COLOR = new Vector3f(1.0f, 1.0f, 1.0f);

    default public Vector3f getLightColor(class08036 class080362, class06584 class065842) {
        return DEFAULT_LIGHT_COLOR;
    }

    default public int getLightEmission(class08036 class080362, class06584 class065842) {
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06918) {
            class06918 class069182 = (class06918)class065812;
            return class069182.L().W().m();
        }
        return 0;
    }
}

