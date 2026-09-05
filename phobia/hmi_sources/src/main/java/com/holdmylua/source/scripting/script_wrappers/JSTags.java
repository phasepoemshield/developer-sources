/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration
 *  net.minecraft.class_1792
 *  net.minecraft.class_2960
 *  net.minecraft.class_5321
 *  net.minecraft.class_6862
 *  net.minecraft.class_7924
 */
package com.holdmylua.source.scripting.script_wrappers;

import com.holdmylua.source.annotation.Safe;
import net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration;
import net.minecraft.class_1792;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_6862;
import net.minecraft.class_7924;

public class JSTags {
    @Safe
    public class_6862<class_1792> getVanillaTag(String id) {
        return class_6862.method_40092((class_5321)class_7924.field_41197, (class_2960)class_2960.method_60656((String)id));
    }

    @Safe
    public class_6862<class_1792> getFabricTag(String id) {
        return TagRegistration.ITEM_TAG.registerC(id);
    }
}

