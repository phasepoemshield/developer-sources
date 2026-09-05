/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.Group$Type;
import java.util.UUID;
import javax.annotation.Nullable;

public interface Group$Builder {
    public Group$Builder setType(Group.Type var1);

    public Group$Builder setId(@Nullable UUID var1);

    public Group$Builder setName(String var1);

    public Group build();

    public Group$Builder setPassword(@Nullable String var1);

    public Group$Builder setHidden(boolean var1);

    public Group$Builder setPersistent(boolean var1);
}

