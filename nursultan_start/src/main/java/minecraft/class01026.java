/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 */
package minecraft;

import minecraft.class07049;

@FunctionalInterface
public interface class01026 {
    public void onTransition(class07049 var1);

    default public class01026 N(class01026 class010262) {
        return class070492 -> {
            this.onTransition(class070492);
            class010262.onTransition(class070492);
        };
    }
}

