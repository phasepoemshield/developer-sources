/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00158
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class03729
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06514
 *  minecraft.class06521
 */
package net.fabricmc.fabric.impl.recipe.sync;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00158;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class03729;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06514;
import minecraft.class06521;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl;

public record RecipeSyncPayloadS2C$Entry(class06514<?> serializer, List<class03729<?>> recipes) {
    public static final class02362<class04247, RecipeSyncPayloadS2C$Entry> CODEC = class02362.N_34(RecipeSyncPayloadS2C$Entry::write, RecipeSyncPayloadS2C$Entry::read);

    private void write(class04247 class042472) {
        class042472.N(class04206.j.y(this.serializer));
        class042472.L(this.recipes.size());
        class02362 class023622 = this.serializer.y();
        for (class03729<?> class037292 : this.recipes) {
            class042472.y(class037292.N());
            class023622.encode((Object)class042472, (Object)class037292.y());
        }
    }

    private static RecipeSyncPayloadS2C$Entry read(class04247 class042472) {
        class01894 class018942 = class042472.T();
        class06514 class065142 = (class06514)class04206.j.N(class018942);
        if (class065142 == null || !RecipeSyncImpl.isSynced(class065142)) {
            throw new class00158("Tried syncing unsupported packet serializer '" + String.valueOf(class018942) + "'!");
        }
        int n = class042472.E();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < n; ++i) {
            class05946 class059462 = class042472.N(class04227.yV);
            class06521 class065212 = (class06521)class065142.y().decode((Object)class042472);
            arrayList.add(new class03729(class059462, class065212));
        }
        return new RecipeSyncPayloadS2C$Entry(class065142, arrayList);
    }
}

