/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.text.components;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import java.util.Objects;
import javax.annotation.Nullable;

public class SelectorComponent
extends TextComponent {
    private String selector;
    @Nullable
    private TextComponent separator;

    public String getSelector() {
        return this.selector;
    }

    public SelectorComponent(String selector) {
        this(selector, null);
    }

    public SelectorComponent(String selector, @Nullable TextComponent separator) {
        this.selector = selector;
        this.separator = separator;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SelectorComponent)) {
            return false;
        }
        SelectorComponent other = (SelectorComponent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        String this$selector = this.getSelector();
        String other$selector = other.getSelector();
        if (this$selector == null ? other$selector != null : !this$selector.equals(other$selector)) {
            return false;
        }
        TextComponent this$separator = this.getSeparator();
        TextComponent other$separator = other.getSeparator();
        return !(this$separator == null ? other$separator != null : !((Object)this$separator).equals(other$separator));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("siblings", this.getSiblings(), siblings -> !siblings.isEmpty()).add("style", (Object)this.getStyle(), style -> !style.isEmpty()).add("selector", (Object)this.selector).add("separator", (Object)this.separator, Objects::nonNull).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        String $selector = this.getSelector();
        result = result * 59 + ($selector == null ? 43 : $selector.hashCode());
        TextComponent $separator = this.getSeparator();
        result = result * 59 + ($separator == null ? 43 : ((Object)$separator).hashCode());
        return result;
    }

    @Nullable
    public TextComponent getSeparator() {
        return this.separator;
    }

    @Override
    public String asSingleString() {
        return this.selector;
    }

    @Override
    public TextComponent shallowCopy() {
        if (this.separator == null) {
            return new SelectorComponent(this.selector, null).setStyle(this.getStyle().copy());
        }
        return new SelectorComponent(this.selector, this.separator.copy()).setStyle(this.getStyle().copy());
    }

    public SelectorComponent setSeparator(@Nullable TextComponent separator) {
        this.separator = separator;
        return this;
    }

    public SelectorComponent setSelector(String selector) {
        this.selector = selector;
        return this;
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SelectorComponent;
    }
}

