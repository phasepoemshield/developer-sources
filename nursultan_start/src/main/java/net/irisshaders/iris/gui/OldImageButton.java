/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class08394
 */
package net.irisshaders.iris.gui;

import com.mojang.blaze3d.opengl.GlStateManager;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;

public class OldImageButton
extends class05362 {
    protected final class01894 Identifier;
    protected final int xTexStart;
    protected final int yTexStart;
    protected final int yDiffTex;
    protected final int textureWidth;
    protected final int textureHeight;

    public OldImageButton(int n, int n2, int n3, int n4, int n5, int n6, int n7, class01894 class018942, int n8, int n9, class05361 class053612, class00392 class003922) {
        super(n, n2, n3, n4, class003922, class053612, field_40754);
        this.textureWidth = n8;
        this.textureHeight = n9;
        this.xTexStart = n5;
        this.yTexStart = n6;
        this.yDiffTex = n7;
        this.Identifier = class018942;
    }

    public OldImageButton(int n, int n2, int n3, int n4, int n5, int n6, int n7, class01894 class018942, int n8, int n9, class05361 class053612) {
        this(n, n2, n3, n4, n5, n6, n7, class018942, n8, n9, class053612, class05220.N);
    }

    public OldImageButton(int n, int n2, int n3, int n4, int n5, int n6, int n7, class01894 class018942, class05361 class053612) {
        this(n, n2, n3, n4, n5, n6, n7, class018942, 256, 256, class053612);
    }

    public OldImageButton(int n, int n2, int n3, int n4, int n5, int n6, class01894 class018942, class05361 class053612) {
        this(n, n2, n3, n4, n5, n6, n4, class018942, 256, 256, class053612);
    }

    public void renderTexture(class01054 class010542, class01894 class018942, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = n4;
        if (!this.method_37303()) {
            n10 = n4 + n5 * 2;
        } else if (this.method_25367()) {
            n10 = n4 + n5;
        }
        GlStateManager._enableDepthTest();
        class010542.N(class08394.Na, class018942, n, n2, (float)n3, (float)n10, n6, n7, n8, n9);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.renderTexture(class010542, this.Identifier, this.method_46426(), this.method_46427(), this.xTexStart, this.yTexStart, this.yDiffTex, this.field_22758, this.field_22759, this.textureWidth, this.textureHeight);
    }
}

