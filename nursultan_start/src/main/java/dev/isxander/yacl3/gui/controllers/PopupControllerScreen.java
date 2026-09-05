/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class05096
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ControllerPopupWidget;
import minecraft.class01054;
import minecraft.class05096;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;

public class PopupControllerScreen
extends class05096 {
    private final YACLScreen backgroundYaclScreen;
    private final ControllerPopupWidget<?> controllerPopup;

    public PopupControllerScreen(YACLScreen yACLScreen, ControllerPopupWidget<?> controllerPopupWidget) {
        super(controllerPopupWidget.popupTitle());
        this.backgroundYaclScreen = yACLScreen;
        this.controllerPopup = controllerPopupWidget;
    }

    public void method_25426() {
        this.method_37063(this.controllerPopup);
    }

    public boolean method_25404(class06601 class066012) {
        return this.controllerPopup.method_25404(class066012);
    }

    public void method_48640() {
        super.method_48640();
        this.method_25419();
    }

    public void method_25393() {
        super.method_25393();
        this.backgroundYaclScreen.method_25393();
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        this.backgroundYaclScreen.method_25420(class010542, n, n2, f);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.controllerPopup.renderBackground(class010542, n, n2, f);
        this.backgroundYaclScreen.method_25394(class010542, -1, -1, f);
        super.method_25394(class010542, n, n2, f);
    }

    public void method_25419() {
        YACLScreen yACLScreen = this.backgroundYaclScreen;
        this.field_22787.v_3 = yACLScreen;
        this.controllerPopup.close();
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.controllerPopup.method_25401(d, d2, d3, d4)) {
            return true;
        }
        this.backgroundYaclScreen.method_25401(d, d2, d3, d4);
        return super.method_25401(d, d2, d3, d4);
    }

    public boolean method_25400(class06626 class066262) {
        return this.controllerPopup.method_25400(class066262);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!super.method_25402(class066132, bl)) {
            this.method_25419();
            return false;
        }
        return true;
    }

    public void method_16014(double d, double d2) {
        this.controllerPopup.method_16014(d, d2);
    }
}

