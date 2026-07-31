package fun.wonderful.client.modules.settings.implement;

import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.color.fontscolor.ColorRGBA;
import fun.wonderful.client.modules.settings.Setting;
import java.awt.Color;

public class ColorSetting
extends Setting {
    private int value;

    public ColorSetting(String name, int value) {
        super(name);
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ColorRGBA toColorRGBA() {
        return new ColorRGBA(this.value);
    }

    public Color toColor() {
        return new Color(this.value);
    }

    public float red() {
        return ColorUtils.redf(this.value);
    }

    public float green() {
        return ColorUtils.greenf(this.value);
    }

    public float blue() {
        return ColorUtils.bluef(this.value);
    }

    public float alpha() {
        return ColorUtils.alphaf(this.value);
    }
}