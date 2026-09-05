/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01488
 *  minecraft.class01590
 *  minecraft.class05362
 *  minecraft.class06202
 *  minecraft.class08394
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.itemgroup;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01488;
import minecraft.class01590;
import minecraft.class05362;
import minecraft.class06202;
import minecraft.class08394;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents;
import net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents$Type;

@Environment(value=EnvType.CLIENT)
public class FabricCreativeGuiComponents$ItemGroupButtonWidget
extends class05362 {
    final class01488 screen;
    final FabricCreativeGuiComponents$Type type;

    public FabricCreativeGuiComponents$ItemGroupButtonWidget(int n, int n2, FabricCreativeGuiComponents$Type fabricCreativeGuiComponents$Type, class01488 class014882) {
        super(n, n2, 10, 12, fabricCreativeGuiComponents$Type.text, class053622 -> fabricCreativeGuiComponents$Type.clickConsumer.accept(class014882), class05362.field_40754);
        this.type = fabricCreativeGuiComponents$Type;
        this.screen = class014882;
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.field_22763 = this.type.isEnabled.test(this.screen);
        this.field_22764 = this.screen.hasAdditionalPages();
        if (!this.field_22764) {
            return;
        }
        int n3 = this.field_22763 && this.method_49606() ? 20 : 0;
        int n4 = this.field_22763 ? 0 : 12;
        class010542.N(class08394.Na, FabricCreativeGuiComponents.BUTTON_TEX, this.method_46426(), this.method_46427(), (float)(n3 + (this.type == FabricCreativeGuiComponents$Type.NEXT ? 10 : 0)), (float)n4, 10, 12, 256, 256);
        if (this.method_49606()) {
            class010542.N((class01590)class06202.Nq().i_3, (class00392)class00392.N((String)"fabric.gui.creativeTabPage", (Object[])new Object[]{this.screen.getCurrentPage() + 1, FabricCreativeGuiComponents.getPageCount()}), n, n2);
        }
    }
}

