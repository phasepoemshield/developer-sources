package fun.nexisdlc.modules.api.settings.impl;

import fun.nexisdlc.modules.api.settings.api.Setting;

import java.awt.*;
import java.util.function.Supplier;

public class ColorSetting extends Setting<Integer> {
    private float hue, saturation, value;
    private float alpha;

    public ColorSetting(String name, Integer defaultVal) {
        super(name, defaultVal);
        updateHSB();
    }

    public void updateHSB() {
        int argb = get() != null ? get() : 0xFF000000;
        Color color = new Color(argb, true);
        float[] hsb = Color.RGBtoHSB(
                (color.getRGB() >> 16) & 0xFF,
                (color.getRGB() >> 8) & 0xFF,
                color.getRGB() & 0xFF,
                null
        );
        this.hue = hsb[0];
        this.saturation = hsb[1];
        this.value = hsb[2];
        this.alpha = (float) (color.getAlpha()) / 255.0f;
    }

    public void updateColor() {
        int rgb = Color.HSBtoRGB(hue, saturation, value);
        int argb = (Math.round(alpha * 255) << 24) | (rgb & 0x00FFFFFF);
        set(argb);
    }

    public float getHue() { return hue; }
    public void setHue(float hue) { this.hue = hue; updateColor(); }
    public float getSaturation() { return saturation; }
    public void setSaturation(float saturation) { this.saturation = saturation; updateColor(); }
    public float getValue() { return value; }
    public void setValue(float value) { this.value = value; updateColor(); }
    public float getAlpha() { return alpha; }
    public void setAlpha(float alpha) { this.alpha = alpha; updateColor(); }

    public Color getColor() {
        return new Color(get(), true);
    }

    @Override
    public ColorSetting setVisible(Supplier<Boolean> bool) {
        return (ColorSetting) super.setVisible(bool);
    }
}
