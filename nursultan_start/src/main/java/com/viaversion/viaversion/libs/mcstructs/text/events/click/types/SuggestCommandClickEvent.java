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

public class SuggestCommandClickEvent
extends ClickEvent {
    private String command;

    public SuggestCommandClickEvent(String command) {
        super(ClickEventAction.SUGGEST_COMMAND);
        this.command = command;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SuggestCommandClickEvent)) {
            return false;
        }
        SuggestCommandClickEvent other = (SuggestCommandClickEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$command = this.getCommand();
        String other$command = other.getCommand();
        return !(this$command == null ? other$command != null : !this$command.equals(other$command));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("command", (Object)this.command).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $command = this.getCommand();
        result = result * 59 + ($command == null ? 43 : $command.hashCode());
        return result;
    }

    public String getCommand() {
        return this.command;
    }

    protected boolean canEqual(Object other) {
        return other instanceof SuggestCommandClickEvent;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}

