/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class04227
 *  minecraft.class05946
 *  net.fabricmc.fabric.mixin.loot.FileToIdConverterAccessor
 *  net.fabricmc.fabric.mixin.resource.conditions.FileToIdConverterAccessor
 */
package minecraft;

import java.util.List;
import java.util.Map;
import minecraft.class00751;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class04227;
import minecraft.class05946;
import net.fabricmc.fabric.mixin.resource.conditions.FileToIdConverterAccessor;

public class class03069
implements net.fabricmc.fabric.mixin.loot.FileToIdConverterAccessor,
FileToIdConverterAccessor {
    private final String N;
    private final String y;

    public class03069(String string, String string2) {
        this.N = string;
        this.y = string2;
    }

    public class01894 y(class01894 class018942) {
        String string = class018942.N();
        return class018942.i(string.substring(this.N.length() + 1, string.length() - this.y.length()));
    }

    public Map<class01894, List<class01079>> y(class01089 class010892) {
        return class010892.L(this.N, class018942 -> class018942.N().endsWith(this.y));
    }

    public Map<class01894, class01079> N(class01089 class010892) {
        return class010892.y(this.N, class018942 -> class018942.N().endsWith(this.y));
    }

    public static class03069 N(String string) {
        return new class03069(string, ".json");
    }

    public static class03069 N(class05946<? extends class00751<?>> class059462) {
        return class03069.N(class04227.L(class059462));
    }

    public class01894 N(class01894 class018942) {
        return class018942.i(this.N + "/" + class018942.N() + this.y);
    }

    public /* synthetic */ String getDirectoryName() {
        return this.N;
    }
}

