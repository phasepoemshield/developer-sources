/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.Tag
 */
package com.viaversion.viaversion.libs.snakeyaml.resolver;

import com.viaversion.viaversion.libs.snakeyaml.nodes.Tag;
import java.util.regex.Pattern;

final class ResolverTuple {
    private final Tag tag;
    private final Pattern regexp;
    private final int limit;

    public ResolverTuple(Tag tag, Pattern regexp, int limit) {
        this.tag = tag;
        this.regexp = regexp;
        this.limit = limit;
    }

    public String toString() {
        return "Tuple tag=" + this.tag + " regexp=" + this.regexp + " limit=" + this.limit;
    }

    public Tag getTag() {
        return this.tag;
    }

    public int getLimit() {
        return this.limit;
    }

    public Pattern getRegexp() {
        return this.regexp;
    }
}

