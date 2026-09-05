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

public class TwitchUserInfoClickEvent
extends ClickEvent {
    private String user;

    public TwitchUserInfoClickEvent(String user) {
        super(ClickEventAction.TWITCH_USER_INFO);
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TwitchUserInfoClickEvent)) {
            return false;
        }
        TwitchUserInfoClickEvent other = (TwitchUserInfoClickEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$user = this.getUser();
        String other$user = other.getUser();
        return !(this$user == null ? other$user != null : !this$user.equals(other$user));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("user", (Object)this.user).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $user = this.getUser();
        result = result * 59 + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    public String getUser() {
        return this.user;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TwitchUserInfoClickEvent;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

