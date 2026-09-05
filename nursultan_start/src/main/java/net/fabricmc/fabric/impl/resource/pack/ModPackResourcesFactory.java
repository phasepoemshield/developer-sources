/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01061
 *  minecraft.class01078
 *  minecraft.class01622
 *  minecraft.class02267
 *  minecraft.class04154
 *  net.fabricmc.fabric.api.resource.v1.pack.ModPackResources
 */
package net.fabricmc.fabric.impl.resource.pack;

import java.util.ArrayList;
import minecraft.class01061;
import minecraft.class01078;
import minecraft.class01622;
import minecraft.class02267;
import minecraft.class04154;
import net.fabricmc.fabric.api.resource.v1.pack.ModPackResources;

public record ModPackResourcesFactory(ModPackResources pack) implements class01061
{
    public class01622 method_52424(class02267 class022672) {
        return this.pack;
    }

    public class01622 method_52425(class02267 class022672, class01078 class010782) {
        if (class010782.u().isEmpty()) {
            return this.pack;
        }
        ArrayList<ModPackResources> arrayList = new ArrayList<ModPackResources>(class010782.u().size());
        for (String string : class010782.u()) {
            arrayList.add(this.pack.createOverlay(string));
        }
        return new class04154((class01622)this.pack, arrayList);
    }
}

