/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Group$Type$1;
import de.maxhenkel.voicechat.api.Group$Type$2;
import de.maxhenkel.voicechat.api.Group$Type$3;

public interface Group$Type {
    public static final Group$Type NORMAL = new Group$Type$1();
    public static final Group$Type OPEN = new Group$Type$2();
    public static final Group$Type ISOLATED = new Group$Type$3();
}

