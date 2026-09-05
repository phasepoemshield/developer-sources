/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 */
package com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEventAction;

public class TextHoverEvent
extends HoverEvent {
    private TextComponent text;

    public TextHoverEvent setText(TextComponent text) {
        this.text = text;
        return this;
    }

    public TextComponent getText() {
        return this.text;
    }

    public TextHoverEvent(TextComponent text) {
        super(HoverEventAction.SHOW_TEXT);
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TextHoverEvent)) {
            return false;
        }
        TextHoverEvent other = (TextHoverEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        TextComponent this$text = this.getText();
        TextComponent other$text = other.getText();
        return !(this$text == null ? other$text != null : !((Object)this$text).equals(other$text));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("text", (Object)this.text).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        TextComponent $text = this.getText();
        result = result * 59 + ($text == null ? 43 : ((Object)$text).hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TextHoverEvent;
    }
}

