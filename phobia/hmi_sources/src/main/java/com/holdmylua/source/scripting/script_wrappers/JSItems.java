/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
 */
package com.holdmylua.source.scripting.script_wrappers;

import com.holdmylua.source.annotation.Safe;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public class JSItems {
    @Safe
    public class_1792 get(String name) {
        class_2960 id = class_2960.method_60654((String)name);
        return (class_1792)class_7923.field_41178.method_63535(id);
    }

    @Safe
    public String checkItemName(class_1799 item) {
        return item.method_65130().toString();
    }
}

