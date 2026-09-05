/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.resolver;

import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

final class ResolverTuple {
    private final Tag tag;
    private final Pattern regexp;

    public ResolverTuple(Tag tag, Pattern pattern) {
        this.tag = tag;
        this.regexp = pattern;
    }

    public String toString() {
        return "Tuple tag=" + this.tag + " regexp=" + this.regexp;
    }

    public Tag getTag() {
        return this.tag;
    }

    public Pattern getRegexp() {
        return this.regexp;
    }
}

