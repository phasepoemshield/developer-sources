/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 */
package com.viaversion.viaversion.libs.mcstructs.text.events.click.types;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEventAction;

public class CopyToClipboardClickEvent
extends ClickEvent {
    private String value;

    public CopyToClipboardClickEvent(String value) {
        super(ClickEventAction.COPY_TO_CLIPBOARD);
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CopyToClipboardClickEvent)) {
            return false;
        }
        CopyToClipboardClickEvent other = (CopyToClipboardClickEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$value = this.getValue();
        String other$value = other.getValue();
        return !(this$value == null ? other$value != null : !this$value.equals(other$value));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("value", (Object)this.value).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $value = this.getValue();
        result = result * 59 + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CopyToClipboardClickEvent;
    }
}

