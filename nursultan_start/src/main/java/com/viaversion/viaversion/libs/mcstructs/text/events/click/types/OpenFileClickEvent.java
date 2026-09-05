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

public class OpenFileClickEvent
extends ClickEvent {
    private String path;

    public OpenFileClickEvent(String path) {
        super(ClickEventAction.OPEN_FILE);
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpenFileClickEvent)) {
            return false;
        }
        OpenFileClickEvent other = (OpenFileClickEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        return !(this$path == null ? other$path != null : !this$path.equals(other$path));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("path", (Object)this.path).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        return result;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    protected boolean canEqual(Object other) {
        return other instanceof OpenFileClickEvent;
    }
}

