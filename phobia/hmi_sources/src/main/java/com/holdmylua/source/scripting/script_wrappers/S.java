/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 */
package com.holdmylua.source.scripting.script_wrappers;

import com.holdmylua.source.annotation.Safe;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3414;

public class S {
    @Safe
    public void playSound(String id, double volume) {
        class_310.method_1551().field_1724.method_5783(class_3414.method_47908((class_2960)class_2960.method_60656((String)id)), (float)volume, 1.0f);
    }
}

