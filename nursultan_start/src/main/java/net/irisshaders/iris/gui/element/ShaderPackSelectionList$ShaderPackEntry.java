/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03255
 *  minecraft.class04654
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06613
 */
package net.irisshaders.iris.gui.element;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03255;
import minecraft.class04654;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$BaseEntry;

public class ShaderPackSelectionList$ShaderPackEntry
extends ShaderPackSelectionList$BaseEntry {
    final String packName;
    private final ShaderPackSelectionList list;
    private final int index;
    private class03255 bounds = class03255.N();
    private boolean focused;
    final /* synthetic */ ShaderPackSelectionList this$0;

    public boolean isSelected() {
        return this.list.method_25334() == this;
    }

    public ShaderPackSelectionList$ShaderPackEntry(ShaderPackSelectionList shaderPackSelectionList, int n, ShaderPackSelectionList shaderPackSelectionList2, String string) {
        this.this$0 = shaderPackSelectionList;
        this.packName = string;
        this.list = shaderPackSelectionList2;
        this.index = n;
    }

    public boolean method_25404(class06601 class066012) {
        if (!class066012.u()) {
            return false;
        }
        return this.doThing();
    }

    public class02106 method_48205(class02089 class020892) {
        return !this.method_25370() ? class02106.N((class04654)this) : null;
    }

    public class03255 method_48202() {
        return this.bounds;
    }

    public boolean method_25370() {
        return this.list.method_25336() == this;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() != 0) {
            return false;
        }
        return this.doThing();
    }

    public String getPackName() {
        return this.packName;
    }

    private boolean doThing() {
        boolean bl = false;
        if (!this.list.getTopButtonRow().shadersEnabled) {
            this.list.getTopButtonRow().setShadersEnabled(true);
            bl = true;
        }
        if (!this.isSelected()) {
            this.list.select(this.index);
            bl = true;
        }
        this.this$0.screen.method_25395((class04654)this.this$0.screen.getBottomRowOption());
        return bl;
    }

    public boolean isApplied() {
        return this.list.getApplied() == this;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        int n5 = this.method_73387();
        int n6 = this.method_73384();
        this.bounds = new class03255(n3, n4, n5, n6);
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        int n7 = -1;
        Object object = this.packName;
        if (bl) {
            GuiUtil.bindIrisWidgetsTexture();
            GuiUtil.drawButton(class010542, n3 - 2, n4 - 2, n5 + 4, n6 + 4, bl, false);
        }
        boolean bl2 = this.list.getTopButtonRow().shadersEnabled;
        if (class015902.N((class05936)class00392.y((String)object).N(class06541.field_1067)) > this.list.method_25322() - 3) {
            object = class015902.N((String)object, this.list.method_25322() - 8) + "...";
        }
        class05216 class052162 = class00392.y((String)object);
        if (this.method_25405(n, n2)) {
            class052162 = class052162.N(class06541.field_1067);
        }
        if (bl2 && this.isApplied()) {
            n7 = -3485;
        }
        if (!bl2 && !this.method_25405(n, n2)) {
            n7 = -6118750;
        }
        class010542.N(class015902, (class00392)class052162, n3 + n5 / 2 - 2, n4 + (n6 - 11) / 2, n7);
    }
}

