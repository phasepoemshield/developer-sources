/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.ChangePageClickEvent$IntHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.ChangePageClickEvent$PageHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.ChangePageClickEvent$StringHolder
 */
package com.viaversion.viaversion.libs.mcstructs.text.events.click.types;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEventAction;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.types.ChangePageClickEvent;

public class ChangePageClickEvent
extends ClickEvent {
    private PageHolder page;

    public ChangePageClickEvent(String page) {
        super(ClickEventAction.CHANGE_PAGE);
        try {
            this.page = new IntHolder(Integer.parseInt(page));
        }
        catch (Throwable t) {
            this.page = new StringHolder(page);
        }
    }

    public ChangePageClickEvent(int page) {
        super(ClickEventAction.CHANGE_PAGE);
        this.page = new IntHolder(page);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ChangePageClickEvent)) {
            return false;
        }
        ChangePageClickEvent other = (ChangePageClickEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        PageHolder this$page = this.page;
        PageHolder other$page = other.page;
        return !(this$page == null ? other$page != null : !this$page.equals(other$page));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("page", (Object)this.page).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        PageHolder $page = this.page;
        result = result * 59 + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    public int asInt() throws NumberFormatException {
        if (this.page instanceof StringHolder) {
            return Integer.parseInt(((StringHolder)this.page).getPage());
        }
        return ((IntHolder)this.page).getPage();
    }

    public String asString() {
        if (this.page instanceof StringHolder) {
            return ((StringHolder)this.page).getPage();
        }
        return String.valueOf(((IntHolder)this.page).getPage());
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChangePageClickEvent;
    }

    public ChangePageClickEvent setPage(String page) {
        this.page = new StringHolder(page);
        return this;
    }

    public ChangePageClickEvent setPage(int page) {
        this.page = new IntHolder(page);
        return this;
    }

    public PageHolder getHolder() {
        return this.page;
    }
}

