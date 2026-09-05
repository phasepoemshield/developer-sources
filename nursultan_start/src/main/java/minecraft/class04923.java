/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class05199
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07018
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class01590;
import minecraft.class05199;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07018;

public class class04923 {
    private static final class01028 N = class01028.N((int)32, (class00405)class00405.N);

    private static String N(String string) {
        return (Boolean)((class05630)class06202.Nq().i_7).D().method_41753() != false ? string : class06541.N((String)string);
    }

    public static List<class01028> N(class05936 class059363, int n, class01590 class015902) {
        class05199 class051992 = new class05199();
        class059363.N((class004052, string) -> {
            class051992.N(class05936.N((String)class04923.N(string), (class00405)class004052));
            return Optional.empty();
        }, class00405.N);
        ArrayList arrayList = Lists.newArrayList();
        class015902.y().N(class051992.y(), n, class00405.N, (class059362, bl) -> {
            class01028 class010282 = class07018.y().N(class059362);
            arrayList.add(bl != false ? class01028.N((class01028)N, (class01028)class010282) : class010282);
        });
        if (arrayList.isEmpty()) {
            return Lists.newArrayList((Object[])new class01028[]{class01028.N});
        }
        return arrayList;
    }
}

