/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$Version
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import java.util.Map;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;

class VersionTagsTuple {
    private DumperOptions.Version version;
    private Map<String, String> tags;

    public VersionTagsTuple(DumperOptions.Version version, Map<String, String> map) {
        this.version = version;
        this.tags = map;
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

