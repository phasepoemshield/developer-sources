package fun.wonderful.client.modules.settings.implement;

import fun.wonderful.client.modules.settings.Setting;
import java.util.function.Supplier;
import lombok.Generated;

public class TextSetting
extends Setting {
    private String text;
    private final int maxLength;

    public TextSetting(String name, String text) {
        this(name, text, 32);
    }

    public TextSetting(String name, String text, int maxLength) {
        super(name);
        this.maxLength = Math.max(1, maxLength);
        this.setText(text);
    }

    public void setText(String text) {
        if (text == null) {
            this.text = "";
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (int i2 = 0; i2 < text.length() && builder.length() < this.maxLength; ++i2) {
            char chr = text.charAt(i2);
            if (Character.isISOControl(chr)) continue;
            builder.append(chr);
        }
        this.text = builder.toString();
    }

    public String get() {
        return this.text;
    }

    public TextSetting visible(Supplier<Boolean> state) {
        this.visible = state;
        return this;
    }

    @Generated
    public String getText() {
        return this.text;
    }

    @Generated
    public int getMaxLength() {
        return this.maxLength;
    }
}