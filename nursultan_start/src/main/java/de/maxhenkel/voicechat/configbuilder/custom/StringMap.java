/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder.custom;

import de.maxhenkel.voicechat.configbuilder.custom.AbstractValueMap;
import de.maxhenkel.voicechat.configbuilder.custom.StringMap$Builder;
import java.util.Collections;
import java.util.Map;

public class StringMap
extends AbstractValueMap<String, String> {
    protected StringMap(Map<String, String> map) {
        super(map);
    }

    public static StringMap of() {
        return new StringMap(Collections.emptyMap());
    }

    public static StringMap of(Map<String, String> map) {
        return new StringMap(map);
    }

    public static StringMap$Builder builder() {
        return new StringMap$Builder();
    }
}

