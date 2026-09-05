/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1839
 *  net.minecraft.class_310
 *  net.minecraft.class_742
 */
package com.holdmylua.source.global.item_model;

import com.holdmylua.source.LuaTestHMI;
import com.holdmylua.source.global.item_model.ItemModelContext;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1839;
import net.minecraft.class_310;
import net.minecraft.class_742;

public class ItemModelStorage {
    private static final List<ItemModelContext> data = new ArrayList<ItemModelContext>();

    public static void addData(ItemModelContext info, class_1799 item) {
        if (!item.method_7960() && item.method_7976() != class_1839.field_8949 && item.method_7976() != class_1839.field_63380) {
            data.add(info);
        }
    }

    public static ItemModelContext get() {
        if (!data.isEmpty()) {
            ItemModelContext record = (ItemModelContext)data.getFirst();
            data.remove(record);
            return record;
        }
        return new ItemModelContext(false, 0.0f, (class_742)class_310.method_1551().field_1724, class_1268.field_5808, false, LuaTestHMI.deltaTime, 0.0f, 0.0f, 0.0f, false, false, false, false, false, false, class_1802.field_8162.method_7854());
    }

    public static void clear() {
        data.clear();
    }
}

