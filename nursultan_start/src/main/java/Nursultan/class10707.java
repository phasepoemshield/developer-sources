/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class05197
 *  minecraft.class05232
 *  minecraft.class05936
 *  minecraft.class07018
 */
package Nursultan;

import java.util.Map;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05197;
import minecraft.class05232;
import minecraft.class05936;
import minecraft.class07018;

public class class10707
extends class07018 {
    final /* synthetic */ Map N;

    public class10707(Map map) {
        this.N = map;
    }

    public class01028 N(class05936 class059362) {
        return class051972 -> class059362.N((class004052, string) -> class05232.L((String)string, (class00405)class004052, (class05197)class051972) ? Optional.empty() : class05936.L, class00405.N).isPresent();
    }

    public boolean N() {
        return false;
    }

    public boolean N(String string) {
        return this.N.containsKey(string);
    }

    public String N(String string, String string2) {
        return this.N.getOrDefault(string, string2);
    }
}

