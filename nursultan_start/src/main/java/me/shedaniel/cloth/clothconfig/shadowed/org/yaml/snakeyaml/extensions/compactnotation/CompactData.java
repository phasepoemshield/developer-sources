/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompactData {
    private String prefix;
    private List<String> arguments = new ArrayList<String>();
    private Map<String, String> properties = new HashMap<String, String>();

    public CompactData(String string) {
        this.prefix = string;
    }

    public String toString() {
        return "CompactData: " + this.prefix + " " + this.properties;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public List<String> getArguments() {
        return this.arguments;
    }

    public String getPrefix() {
        return this.prefix;
    }
}

