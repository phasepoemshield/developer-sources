/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03249
 *  minecraft.class03287
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08392
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuLinkElement
 */
package net.irisshaders.iris.gui.element.widget;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03249;
import minecraft.class03287;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08392;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.widget.CommentedElementWidget;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuLinkElement;

public class LinkElementWidget
extends CommentedElementWidget<OptionMenuLinkElement> {
    private static final class00392 ARROW = class00392.y((String)">");
    private final String targetScreenId;
    private final class05216 label;
    private NavigationController navigation;
    private class05216 trimmedLabel = null;
    private boolean isLabelTrimmed = false;

    public LinkElementWidget(OptionMenuLinkElement optionMenuLinkElement) {
        super(optionMenuLinkElement);
        this.targetScreenId = optionMenuLinkElement.targetScreenId;
        this.label = GuiUtil.translateOrDefault(class00392.y((String)optionMenuLinkElement.targetScreenId), "screen." + optionMenuLinkElement.targetScreenId, new Object[0]);
    }

    @Override
    public void init(ShaderPackScreen shaderPackScreen, NavigationController navigationController) {
        this.navigation = navigationController;
    }

    @Override
    public boolean method_25404(class06601 class066012) {
        if (class066012.u()) {
            this.navigation.open(this.targetScreenId);
            GuiUtil.playButtonClickSound();
            return true;
        }
        return super.method_25404(class066012);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() == 0) {
            this.navigation.open(this.targetScreenId);
            GuiUtil.playButtonClickSound();
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    @Override
    public void render(class01054 class010542, int n, int n2, float f, boolean bl) {
        GuiUtil.bindIrisWidgetsTexture();
        GuiUtil.drawButton(class010542, this.bounds.R().N(), this.bounds.R().y(), this.bounds.M(), this.bounds.B(), bl || this.method_25370(), false);
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        int n3 = this.bounds.M() - 9;
        if (class015902.N((class05936)this.label) > n3) {
            this.isLabelTrimmed = true;
        }
        if (this.trimmedLabel == null) {
            this.trimmedLabel = GuiUtil.shortenText(class015902, this.label, n3);
        }
        int n4 = class015902.N((class05936)this.trimmedLabel);
        class010542.y(class015902, (class00392)this.trimmedLabel, this.bounds.y(class03287.field_41822) - (int)((double)n4 * 0.5) - (int)(0.5 * (double)Math.max(n4 - (this.bounds.M() - 18), 0)), this.bounds.R().y() + 7, -1);
        class010542.y(class015902, ARROW, this.bounds.y(class03249.field_41829) - 9, this.bounds.R().y() + 7, 0xFFFFFFF);
        if (bl && this.isLabelTrimmed) {
            ShaderPackScreen.TOP_LAYER_RENDER_QUEUE.add(() -> GuiUtil.drawTextPanel(class015902, class010542, (class00392)this.label, n + 2, n2 - 16));
        }
    }

    @Override
    public Optional<class00392> getCommentBody() {
        String string = "screen." + this.targetScreenId + ".comment";
        return Optional.ofNullable(class08392.N((String)string) ? class00392.L((String)string) : null);
    }

    @Override
    public Optional<class00392> getCommentTitle() {
        return Optional.of(this.label);
    }
}

