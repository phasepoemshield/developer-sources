/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class05341
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class06202
 *  minecraft.class06478
 */
package net.irisshaders.iris.gui.element.screen;

import com.mojang.blaze3d.opengl.GlStateManager;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class05341;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class06202;
import minecraft.class06478;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.element.screen.IrisButton$Builder;

public class IrisButton
extends class05362 {
    private final FloatSupplier alphaSupplier;

    static /* synthetic */ class05341 access$000() {
        return field_40754;
    }

    public IrisButton(int n, int n2, int n3, int n4, class00392 class003922, class05361 class053612, class05341 class053412, FloatSupplier floatSupplier) {
        super(n, n2, n3, n4, class003922, class053612, class053412);
        this.alphaSupplier = floatSupplier;
    }

    public float method_75798() {
        return this.alphaSupplier.getAsFloat();
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        class06202 class062022 = class06202.Nq();
        GlStateManager._enableBlend();
        GlStateManager._enableDepthTest();
        GuiUtil.bindIrisWidgetsTexture();
        GuiUtil.drawButton(class010542, this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), this.method_25367(), !this.method_37303());
        int n3 = this.field_22763 ? 0xFFFFFF : 0xA0A0A0;
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
    }

    public static IrisButton$Builder iris$builder(class00392 class003922, class05361 class053612, FloatSupplier floatSupplier) {
        return new IrisButton$Builder(class003922, class053612, floatSupplier);
    }
}

