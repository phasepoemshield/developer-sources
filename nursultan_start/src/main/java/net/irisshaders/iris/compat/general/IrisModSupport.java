/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class08877
 */
package net.irisshaders.iris.compat.general;

import minecraft.class00500;
import minecraft.class08877;
import net.irisshaders.iris.compat.general.IrisModelPart;

public class IrisModSupport {
    public static final IrisModSupport INSTANCE = new IrisModSupport();

    public class00500 getModelPartState(class08877 class088772) {
        return ((IrisModelPart)class088772).getBlockAppearance();
    }
}

