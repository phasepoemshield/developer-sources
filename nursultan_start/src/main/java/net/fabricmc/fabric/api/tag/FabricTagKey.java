/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03530
 */
package net.fabricmc.fabric.api.tag;

import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03530;

public interface FabricTagKey {
    default public class00392 getName() {
        return class00392.N((String)this.getTranslationKey(), (String)("#" + ((class03530)this).y().toString()));
    }

    default public String getTranslationKey() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tag.");
        class03530 class035302 = (class03530)this;
        class01894 class018942 = class035302.N().N();
        class01894 class018943 = class035302.y();
        if (!class018942.y().equals("minecraft")) {
            stringBuilder.append(class018942.y()).append(".");
        }
        stringBuilder.append(class018942.N().replace("/", ".")).append(".").append(class018943.y()).append(".").append(class018943.N().replace("/", ".").replace(":", "."));
        return stringBuilder.toString();
    }
}

