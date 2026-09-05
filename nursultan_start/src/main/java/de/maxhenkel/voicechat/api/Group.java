/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Group$Type;
import java.util.UUID;

public interface Group {
    public boolean isHidden();

    public String getName();

    public UUID getId();

    public Group$Type getType();

    public boolean hasPassword();

    public boolean isPersistent();
}

