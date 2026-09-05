/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class03264
 *  minecraft.class05427
 */
package minecraft;

import java.util.List;
import java.util.Set;
import minecraft.class00891;
import minecraft.class03264;
import minecraft.class05390;
import minecraft.class05406;
import minecraft.class05415;
import minecraft.class05427;

public class class05395 {
    private final class00891 N;

    public class05395(class00891 class008912) {
        this.N = class008912;
    }

    public class05427 N(class05415<class03264> class054152) {
        Set var2 = class05427.N(Set.of(), (class00891)this.N, class054152);
        List list = class054152.N().entrySet().stream().map(entry -> new class05406((class05390)((Object)((Object)entry.getKey())), (class03264)entry.getValue())).toList();
        return new class05427(this.N, list, var2);
    }
}

