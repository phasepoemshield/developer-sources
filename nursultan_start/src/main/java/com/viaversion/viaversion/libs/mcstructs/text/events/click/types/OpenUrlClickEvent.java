/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.OpenUrlClickEvent$StringHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.OpenUrlClickEvent$UriHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.OpenUrlClickEvent$UrlHolder
 */
package com.viaversion.viaversion.libs.mcstructs.text.events.click.types;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEventAction;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.types.OpenUrlClickEvent;
import java.net.URI;

public class OpenUrlClickEvent
extends ClickEvent {
    private UrlHolder url;

    public OpenUrlClickEvent(String url) {
        super(ClickEventAction.OPEN_URL);
        try {
            this.url = new UriHolder(new URI(url));
        }
        catch (Throwable t) {
            this.url = new StringHolder(url);
        }
    }

    public OpenUrlClickEvent(URI url) {
        super(ClickEventAction.OPEN_URL);
        this.url = new UriHolder(url);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpenUrlClickEvent)) {
            return false;
        }
        OpenUrlClickEvent other = (OpenUrlClickEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        UrlHolder this$url = this.url;
        UrlHolder other$url = other.url;
        return !(this$url == null ? other$url != null : !this$url.equals(other$url));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("url", (Object)this.url).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        UrlHolder $url = this.url;
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        return result;
    }

    public String asString() {
        if (this.url instanceof StringHolder) {
            return ((StringHolder)this.url).getUrl();
        }
        return ((UriHolder)this.url).getUri().toString();
    }

    protected boolean canEqual(Object other) {
        return other instanceof OpenUrlClickEvent;
    }

    public OpenUrlClickEvent setHolder(UrlHolder holder) {
        this.url = holder;
        return this;
    }

    public URI asUri() throws IllegalArgumentException {
        if (this.url instanceof StringHolder) {
            return URI.create(((StringHolder)this.url).getUrl());
        }
        return ((UriHolder)this.url).getUri();
    }

    public OpenUrlClickEvent setUrl(URI url) {
        this.url = new UriHolder(url);
        return this;
    }

    public OpenUrlClickEvent setUrl(String url) {
        this.url = new StringHolder(url);
        return this;
    }

    public UrlHolder getHolder() {
        return this.url;
    }
}

