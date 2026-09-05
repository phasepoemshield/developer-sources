/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  minecraft.class01054
 *  minecraft.class01883
 */
package dev.isxander.yacl3.gui.utils;

import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.platform.YACLPlatform;
import minecraft.class01054;
import minecraft.class01883;

public class YACLRenderHelper {
    private static final class01883 SPRITES = new class01883(YACLPlatform.mcRl((String)"widget/button"), YACLPlatform.mcRl((String)"widget/button_disabled"), YACLPlatform.mcRl((String)"widget/button_highlighted"), YACLPlatform.mcRl((String)"widget/slider_highlighted"));

    public static void renderButtonTexture(class01054 class010542, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        GuiUtils.blitSprite(class010542, SPRITES.N(bl, bl2), n, n2, n3, n4);
    }
}

