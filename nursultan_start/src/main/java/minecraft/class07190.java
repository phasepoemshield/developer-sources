/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01118
 *  minecraft.class01171
 *  minecraft.class01187
 *  minecraft.class04782
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01118;
import minecraft.class01171;
import minecraft.class01187;
import minecraft.class04782;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public interface class07190 {
    public @Nullable class00394 N(class07209 var1, class00500 var2);

    default public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return null;
    }

    default public <T extends class00394> @Nullable class01187 N(class04782 class047822, T t) {
        if (t instanceof class01171) {
            return ((class01171)t).B();
        }
        return null;
    }
}

