/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 *  com.viaversion.viaversion.libs.mcstructs.text.translation.Translator
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.text.components;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.translation.Translator;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class KeybindComponent
extends TextComponent {
    private String keybind;
    private Translator translator;

    public KeybindComponent(String keybind) {
        this(keybind, (Translator)Translator.GLOBAL);
    }

    public KeybindComponent(String keybind, @Nonnull Translator translator) {
        this.keybind = keybind;
        this.translator = translator;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof KeybindComponent)) {
            return false;
        }
        KeybindComponent other = (KeybindComponent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        String this$keybind = this.getKeybind();
        String other$keybind = other.getKeybind();
        if (this$keybind == null ? other$keybind != null : !this$keybind.equals(other$keybind)) {
            return false;
        }
        Translator this$translator = this.translator;
        Translator other$translator = other.translator;
        return !(this$translator == null ? other$translator != null : !this$translator.equals(other$translator));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("siblings", this.getSiblings(), siblings -> !siblings.isEmpty()).add("style", (Object)this.getStyle(), style -> !style.isEmpty()).add("keybind", (Object)this.keybind).add("translator", (Object)this.translator, translator -> translator != Translator.GLOBAL).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        String $keybind = this.getKeybind();
        result = result * 59 + ($keybind == null ? 43 : $keybind.hashCode());
        Translator $translator = this.translator;
        result = result * 59 + ($translator == null ? 43 : $translator.hashCode());
        return result;
    }

    public KeybindComponent setKeybind(String keybind) {
        this.keybind = keybind;
        return this;
    }

    @Override
    public String asSingleString() {
        return this.translator.translateOrKey(this.keybind);
    }

    public KeybindComponent setTranslator(@Nullable Translator translator) {
        this.translator = translator == null ? Translator.GLOBAL : translator;
        return this;
    }

    @Override
    public TextComponent shallowCopy() {
        KeybindComponent copy = new KeybindComponent(this.keybind);
        copy.translator = this.translator;
        return copy.setStyle(this.getStyle().copy());
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof KeybindComponent;
    }

    public String getKeybind() {
        return this.keybind;
    }
}

