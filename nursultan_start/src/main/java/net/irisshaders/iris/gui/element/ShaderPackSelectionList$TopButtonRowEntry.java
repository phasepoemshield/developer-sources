/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class04654
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
import minecraft.class04654;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$BaseEntry;

public class ShaderPackSelectionList$TopButtonRowEntry
extends ShaderPackSelectionList$BaseEntry {
    private static final class00392 NONE_PRESENT_LABEL = class00392.L((String)"options.iris.shaders.nonePresent").N(class06541.field_1080);
    private static final class00392 SHADERS_DISABLED_LABEL = class00392.L((String)"options.iris.shaders.disabled");
    private static final class00392 SHADERS_ENABLED_LABEL = class00392.L((String)"options.iris.shaders.enabled");
    private final ShaderPackSelectionList list;
    public boolean allowEnableShadersButton = true;
    public boolean shadersEnabled;

    public void setShadersEnabled(boolean bl) {
        this.shadersEnabled = bl;
        this.list.screen.refreshScreenSwitchButton();
    }

    public ShaderPackSelectionList$TopButtonRowEntry(ShaderPackSelectionList shaderPackSelectionList, boolean bl) {
        this.list = shaderPackSelectionList;
        this.shadersEnabled = bl;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.u() && this.allowEnableShadersButton) {
            this.setShadersEnabled(!this.shadersEnabled);
            GuiUtil.playButtonClickSound();
            return true;
        }
        return false;
    }

    public class02106 method_48205(class02089 class020892) {
        return !this.method_25370() ? class02106.N((class04654)this) : null;
    }

    public boolean method_25370() {
        return this.list.method_25336() == this;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.allowEnableShadersButton) {
            this.setShadersEnabled(!this.shadersEnabled);
            GuiUtil.playButtonClickSound();
            return true;
        }
        return false;
    }

    private class00392 getEnableDisableLabel() {
        return this.allowEnableShadersButton ? (this.shadersEnabled ? SHADERS_ENABLED_LABEL : SHADERS_DISABLED_LABEL) : NONE_PRESENT_LABEL;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        int n5 = this.method_73387();
        int n6 = this.method_73384();
        GuiUtil.bindIrisWidgetsTexture();
        GuiUtil.drawButton(class010542, n3 - 2, n4 - 2, n5, n6 + 2, bl, !this.allowEnableShadersButton);
        class010542.N((class01590)class06202.Nq().i_3, this.getEnableDisableLabel(), n3 + n5 / 2 - 2, n4 + (n6 - 11) / 2, -1);
    }
}

