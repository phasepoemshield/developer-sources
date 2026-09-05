/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class05946
 */
package minecraft;

import java.nio.file.Path;
import minecraft.class01894;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class05946;

public class class01997 {
    public final Path N;
    public final String y;

    protected class01997(class01996 class019962, class02024 class020242, String string) {
        this.N = class019962.method_45972(class020242);
        this.y = string;
    }

    public Path N(class05946<?> class059462) {
        return this.N.resolve(class059462.N().y()).resolve(this.y).resolve(class059462.N().N() + ".json");
    }

    public Path N(class01894 class018942) {
        return this.N.resolve(class018942.y()).resolve(this.y).resolve(class018942.N() + ".json");
    }

    public Path N(class01894 class018942, String string) {
        return this.N.resolve(class018942.y()).resolve(this.y).resolve(class018942.N() + "." + string);
    }
}

