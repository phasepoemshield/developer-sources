/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder.custom;

import de.maxhenkel.voicechat.configbuilder.custom.AbstractValueMap$Builder;
import de.maxhenkel.voicechat.configbuilder.custom.StringMap;

public class StringMap$Builder
extends AbstractValueMap$Builder<String, String, StringMap> {
    @Override
    public StringMap build() {
        return new StringMap(this.map);
    }
}

