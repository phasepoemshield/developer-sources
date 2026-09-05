/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.FlatButtonWidgetExtended
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class05936
 *  minecraft.class06601
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.synthetic.args.Args$1
 *  org.spongepowered.asm.synthetic.args.Args$2
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import java.util.Objects;
import me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.FlatButtonWidgetExtended;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class05936;
import minecraft.class06601;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.gui.ButtonTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.synthetic.args.Args;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FlatButtonWidget
extends AbstractWidget
implements class01294,
AbstractWidgetExtended,
FlatButtonWidgetExtended {
    public static final ButtonTheme DEFAULT_THEME = new ButtonTheme(-1, -1, -5592406, -536870912, -1879048192, 0x40000000);
    private final Runnable action;
    private final boolean drawBackground;
    private final boolean drawFrame;
    private boolean leftAlign;
    private final ButtonTheme theme;
    private final class00392 label;
    private boolean selected;
    private boolean enabled = true;
    private boolean visible = true;
    private boolean isTab = false;

    public FlatButtonWidget(Dim2i dim2i, class00392 class003922, Runnable runnable, boolean bl, boolean bl2, boolean bl3) {
        this(dim2i, class003922, runnable, bl, bl2, bl3, DEFAULT_THEME);
    }

    public FlatButtonWidget(Dim2i dim2i, class00392 class003922, Runnable runnable, boolean bl, boolean bl2) {
        this(dim2i, class003922, runnable, bl, bl2, DEFAULT_THEME);
    }

    public FlatButtonWidget(Dim2i dim2i, class00392 class003922, Runnable runnable, boolean bl, boolean bl2, ButtonTheme buttonTheme) {
        this(dim2i, class003922, runnable, bl, !bl, bl2, buttonTheme);
    }

    public FlatButtonWidget(Dim2i dim2i, class00392 class003922, Runnable runnable, boolean bl, boolean bl2, boolean bl3, ButtonTheme buttonTheme) {
        super(dim2i);
        this.label = class003922;
        this.action = runnable;
        this.drawBackground = bl;
        this.drawFrame = bl2;
        this.leftAlign = bl3;
        this.theme = buttonTheme;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean bl) {
        this.enabled = bl;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.method_25370()) {
            return false;
        }
        if (class066012.L()) {
            this.doAction();
            return true;
        }
        return false;
    }

    @Override
    public @Nullable class02106 method_48205(class02089 class020892) {
        if (!this.enabled || !this.visible) {
            return null;
        }
        return super.method_48205(class020892);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (!this.visible) {
            return;
        }
        this.hovered = this.method_25405(n, n2);
        int n3 = this.enabled ? (this.hovered ? this.theme.bgHighlight : this.theme.bgDefault) : this.theme.bgInactive;
        int n4 = this.getTextColor();
        if (this.drawBackground) {
            this.drawRect(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), n3);
        }
        if (this.label != null) {
            class00392 class003922 = this.getRenderedLabel();
            int n5 = this.font.N((class05936)class003922);
            int n6 = this.leftAlign ? this.getX() + 8 : this.getCenterX() - n5 / 2;
            int n7 = this.getCenterY();
            Objects.requireNonNull(this.font);
            Args.1 v2 = Args.1.of((class01054)class010542, (class00392)class003922, (int)n6, (int)(n7 - 9 / 2), (int)n4);
            this.args$cji000$reeses-sodium-options$redirectDrawString((Args)v2);
            this.drawString(v2.$0(), v2.$1(), v2.$2(), v2.$3(), v2.$4());
        }
        if (this.enabled && this.selected) {
            Args.2 v3 = Args.2.of((class01054)class010542, (int)this.getX(), (int)(this.getLimitY() - 1), (int)this.getLimitX(), (int)this.getLimitY(), (int)-7019309);
            this.args$cji000$reeses-sodium-options$redirectDrawRect((Args)v3);
            this.drawRect(v3.$0(), v3.$1(), v3.$2(), v3.$3(), v3.$4(), v3.$5());
        }
        if (this.drawFrame || this.enabled && this.method_25370()) {
            this.drawBorder(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), -2147418130);
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!this.enabled || !this.visible) {
            return false;
        }
        if (class066132.v() == 0 && this.method_25405(class066132.n(), class066132.t())) {
            this.doAction();
            return true;
        }
        return false;
    }

    public void setVisible(boolean bl) {
        this.visible = bl;
    }

    protected int getTextColor() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cji000$reeses-sodium-options$modifyGetTextColor(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.enabled ? this.theme.themeLighter : this.theme.themeDarker;
    }

    protected class00392 getRenderedLabel() {
        return this.label;
    }

    protected void doAction() {
        this.action.run();
        this.playClickSound();
    }

    public void args$cji000$reeses-sodium-options$redirectDrawString(Args args) {
        if (this.leftAlign) {
            args.set(2, (Object)(this.getDim().x() + 10));
        }
    }

    private void handler$cji000$reeses-sodium-options$modifyGetTextColor(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.isTab()) {
            int n = this.enabled ? (this.selected ? this.theme.themeLighter : (this.hovered ? this.theme.theme : this.theme.themeDarker)) : this.theme.themeDarker;
            callbackInfoReturnable.setReturnValue((Object)n);
        }
    }

    public void args$cji000$reeses-sodium-options$redirectDrawRect(Args args) {
        if (this.leftAlign) {
            args.set(2, (Object)this.getDim().y());
            args.set(3, (Object)((Integer)args.get(1) + 2));
            args.set(5, (Object)this.theme.theme);
        }
    }

    public boolean isTab() {
        return this.isTab;
    }

    public void setTab(boolean bl) {
        this.isTab = bl;
    }

    public boolean isLeftAlign() {
        return this.leftAlign;
    }

    public void setLeftAlign(boolean bl) {
        this.leftAlign = bl;
    }

    public void setSelected(boolean bl) {
        this.selected = bl;
    }
}

