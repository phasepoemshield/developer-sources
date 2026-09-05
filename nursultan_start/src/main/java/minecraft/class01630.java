/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class06386;

public class class01630
implements class06386 {
    public static final Codec<class01630> N = class02142.N((int)0, (int)256).fieldOf("count").xmap(class01630::new, class01630::N).codec();
    private final class02142 y;

    public class01630(int n) {
        this.y = class02151.N((int)n);
    }

    public class01630(class02142 class021422) {
        this.y = class021422;
    }

    public class02142 N() {
        return this.y;
    }
}

