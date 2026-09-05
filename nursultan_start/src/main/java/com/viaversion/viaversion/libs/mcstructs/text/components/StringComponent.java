/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 */
package com.viaversion.viaversion.libs.mcstructs.text.components;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;

public class StringComponent
extends TextComponent {
    private String text;

    public StringComponent setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public StringComponent() {
        this("");
    }

    public StringComponent(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof StringComponent)) {
            return false;
        }
        StringComponent other = (StringComponent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        String this$text = this.getText();
        String other$text = other.getText();
        return !(this$text == null ? other$text != null : !this$text.equals(other$text));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("siblings", this.getSiblings(), siblings -> !siblings.isEmpty()).add("style", (Object)this.getStyle(), style -> !style.isEmpty()).add("text", (Object)this.text).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        String $text = this.getText();
        result = result * 59 + ($text == null ? 43 : $text.hashCode());
        return result;
    }

    @Override
    public String asSingleString() {
        return this.text;
    }

    @Override
    public TextComponent shallowCopy() {
        return new StringComponent(this.text).setStyle(this.getStyle().copy());
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof StringComponent;
    }
}

