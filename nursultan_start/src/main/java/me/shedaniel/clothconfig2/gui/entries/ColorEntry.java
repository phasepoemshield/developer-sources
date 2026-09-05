/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.widget.ColorDisplayWidget
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06202
 *  org.apache.commons.lang3.StringUtils
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.ColorEntry$ColorError;
import me.shedaniel.clothconfig2.gui.entries.ColorEntry$ColorValue;
import me.shedaniel.clothconfig2.gui.entries.TextFieldListEntry;
import me.shedaniel.clothconfig2.gui.widget.ColorDisplayWidget;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06202;
import org.apache.commons.lang3.StringUtils;

public class ColorEntry
extends TextFieldListEntry<Integer> {
    private final ColorDisplayWidget colorDisplayWidget;
    private boolean alpha = true;

    @Deprecated
    public ColorEntry(class00392 class003922, int n, class00392 class003923, Supplier<Integer> supplier, Consumer<Integer> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, 0, class003923, supplier, supplier2, bl);
        ColorEntry$ColorValue colorEntry$ColorValue = this.getColorValue(String.valueOf(n));
        if (colorEntry$ColorValue.hasError()) {
            throw new IllegalArgumentException("Invalid Color: " + colorEntry$ColorValue.getError().name());
        }
        this.alpha = false;
        this.saveCallback = consumer;
        this.original = n;
        this.textFieldWidget.method_1852(this.getHexColorString(n));
        this.colorDisplayWidget = new ColorDisplayWidget(this.textFieldWidget, 0, 0, 20, this.getColorValueColor(this.textFieldWidget.method_1882()));
        this.resetButton.field_22767 = class053622 -> this.textFieldWidget.method_1852(this.getHexColorString((Integer)supplier.get()));
    }

    public Integer getValue() {
        return this.getColorValueColor(this.textFieldWidget.method_1882());
    }

    @Deprecated
    public void setValue(int n) {
        this.textFieldWidget.method_1852(this.getHexColorString(n));
    }

    @Override
    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        this.colorDisplayWidget.method_46419(n2);
        ColorEntry$ColorValue colorEntry$ColorValue = this.getColorValue(this.textFieldWidget.method_1882());
        if (!colorEntry$ColorValue.hasError()) {
            this.colorDisplayWidget.setColor(this.alpha ? colorEntry$ColorValue.getColor() : 0xFF000000 | colorEntry$ColorValue.getColor());
        }
        if (((class01590)class06202.Nq().i_3).N()) {
            this.colorDisplayWidget.method_46421(n3 + this.resetButton.method_25368() + this.textFieldWidget.method_25368());
        } else {
            this.colorDisplayWidget.method_46421(this.textFieldWidget.method_46426() - 23);
        }
        this.colorDisplayWidget.method_25394(class010542, n6, n7, f);
    }

    @Override
    protected boolean isChanged(Integer n, String string) {
        ColorEntry$ColorValue colorEntry$ColorValue = this.getColorValue(string);
        return colorEntry$ColorValue.hasError() || (Integer)this.original != colorEntry$ColorValue.color;
    }

    public void withAlpha() {
        if (!this.alpha) {
            this.alpha = true;
            this.textFieldWidget.method_1852(this.getHexColorString((Integer)this.original));
        }
    }

    public Optional<class00392> getError() {
        ColorEntry$ColorValue colorEntry$ColorValue = this.getColorValue(this.textFieldWidget.method_1882());
        if (colorEntry$ColorValue.hasError()) {
            return Optional.of(class00392.L((String)("text.cloth-config.error.color." + colorEntry$ColorValue.getError().name().toLowerCase(Locale.ROOT))));
        }
        return super.getError();
    }

    @Override
    public boolean isEdited() {
        ColorEntry$ColorValue colorEntry$ColorValue = this.getColorValue(this.textFieldWidget.method_1882());
        return colorEntry$ColorValue.hasError() || colorEntry$ColorValue.color != (Integer)this.original;
    }

    protected int getColorValueColor(String string) {
        return this.getColorValue(string).getColor();
    }

    protected ColorEntry$ColorValue getColorValue(String string) {
        try {
            int n;
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        block19: {
                                            if (string.startsWith("#")) {
                                                String string2 = this.stripHexStarter(string);
                                                if (string2.length() > 8) {
                                                    return ColorEntry$ColorError.INVALID_COLOR.toValue();
                                                }
                                                if (!this.alpha && string2.length() > 6) {
                                                    return ColorEntry$ColorError.NO_ALPHA_ALLOWED.toValue();
                                                }
                                                n = (int)Long.parseLong(string2, 16);
                                            } else {
                                                n = (int)Long.parseLong(string);
                                            }
                                            int n2 = n >> 24 & 0xFF;
                                            if (!this.alpha && n2 > 0) {
                                                return ColorEntry$ColorError.NO_ALPHA_ALLOWED.toValue();
                                            }
                                            if (n2 < 0) break block19;
                                            if (n2 <= 255) break block20;
                                        }
                                        return ColorEntry$ColorError.INVALID_ALPHA.toValue();
                                    }
                                    int n3 = n >> 16 & 0xFF;
                                    if (n3 < 0) break block21;
                                    if (n3 <= 255) break block22;
                                }
                                return ColorEntry$ColorError.INVALID_RED.toValue();
                            }
                            int n4 = n >> 8 & 0xFF;
                            if (n4 < 0) break block23;
                            if (n4 <= 255) break block24;
                        }
                        return ColorEntry$ColorError.INVALID_GREEN.toValue();
                    }
                    int n5 = n & 0xFF;
                    if (n5 < 0) break block25;
                    if (n5 <= 255) break block26;
                }
                return ColorEntry$ColorError.INVALID_BLUE.toValue();
            }
            return new ColorEntry$ColorValue(n);
        }
        catch (NumberFormatException numberFormatException) {
            return ColorEntry$ColorError.INVALID_COLOR.toValue();
        }
    }

    protected boolean isValidColorString(String string) {
        return !this.getColorValue(string).hasError();
    }

    @Override
    protected boolean isMatchDefault(String string) {
        if (!this.getDefaultValue().isPresent()) {
            return false;
        }
        ColorEntry$ColorValue colorEntry$ColorValue = this.getColorValue(string);
        return !colorEntry$ColorValue.hasError() && colorEntry$ColorValue.color == (Integer)this.getDefaultValue().get();
    }

    protected String getHexColorString(int n) {
        return "#" + StringUtils.leftPad((String)Integer.toHexString(n), (int)(this.alpha ? 8 : 6), (char)'0');
    }

    public void withoutAlpha() {
        if (this.alpha) {
            this.alpha = false;
            this.textFieldWidget.method_1852(this.getHexColorString((Integer)this.original));
        }
    }

    protected String stripHexStarter(String string) {
        if (string.startsWith("#")) {
            return string.substring(1);
        }
        return string;
    }
}

