/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions$Version
 */
package com.viaversion.viaversion.libs.snakeyaml.parser;

import com.viaversion.viaversion.libs.snakeyaml.DumperOptions;
import java.util.Map;

class VersionTagsTuple {
    private final DumperOptions.Version version;
    private final Map<String, String> tags;

    public VersionTagsTuple(DumperOptions.Version version, Map<String, String> tags) {
        this.version = version;
        this.tags = tags;
    }

    public String toString() {
        return String.format("VersionTagsTuple<%s, %s>", this.version, this.tags);
    }

    public DumperOptions.Version getVersion() {
        return this.version;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }
}

