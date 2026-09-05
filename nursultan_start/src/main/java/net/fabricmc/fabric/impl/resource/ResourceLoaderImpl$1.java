/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01061
 *  minecraft.class01078
 *  minecraft.class01622
 *  minecraft.class02267
 *  minecraft.class04154
 *  net.fabricmc.fabric.impl.resource.pack.ModNioPackResources
 */
package net.fabricmc.fabric.impl.resource;

import java.util.ArrayList;
import minecraft.class01061;
import minecraft.class01078;
import minecraft.class01622;
import minecraft.class02267;
import minecraft.class04154;
import net.fabricmc.fabric.impl.resource.pack.ModNioPackResources;

class ResourceLoaderImpl$1
implements class01061 {
    final /* synthetic */ ModNioPackResources val$pack;

    ResourceLoaderImpl$1(ModNioPackResources modNioPackResources) {
        this.val$pack = modNioPackResources;
    }

    public class01622 method_52424(class02267 class022672) {
        return this.val$pack;
    }

    public class01622 method_52425(class02267 class022672, class01078 class010782) {
        if (class010782.u().isEmpty()) {
            return this.val$pack;
        }
        ArrayList<ModNioPackResources> arrayList = new ArrayList<ModNioPackResources>(class010782.u().size());
        for (String string : class010782.u()) {
            arrayList.add(this.val$pack.createOverlay(string));
        }
        return new class04154((class01622)this.val$pack, arrayList);
    }
}

