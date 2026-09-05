/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04206
 *  minecraft.class07940
 *  minecraft.class07945
 */
package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import minecraft.class04206;
import minecraft.class07414;
import minecraft.class07420;
import minecraft.class07422;
import minecraft.class07425;
import minecraft.class07940;
import minecraft.class07945;

public class class07410 {
    public static class07420 N(List<class07425<?>> list) {
        ArrayList arrayList = new ArrayList(class04206.NQ.L() + class04206.NO.L());
        class04206.NQ.z().forEach(class035292 -> {
            if (((class07945)class035292.N()).y().y()) {
                arrayList.add(((class07945)class035292.N()).N().N(class035292.B().N()));
            }
        });
        class04206.NO.z().forEach(class035292 -> {
            if (((class07940)class035292.N()).y().N()) {
                arrayList.add(((class07940)class035292.N()).N().N(class035292.B().N()));
            }
        });
        HashMap hashMap = new HashMap();
        for (class07425<?> class074252 : list) {
            hashMap.put(class074252.L(), class074252.i().y());
        }
        Object object = new class07414("Minecraft Server JSON-RPC", "2.0.0");
        return new class07420("1.3.2", (class07414)((Object)object), arrayList, new class07422(hashMap));
    }
}

