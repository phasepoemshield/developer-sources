/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers.tag;

import eu.pb4.placeholders.api.parsers.tag.TagRegistry;
import eu.pb4.placeholders.api.parsers.tag.TextTag;

public final class TagRegistry$Builder {
    private final TagRegistry registry;

    TagRegistry$Builder(TagRegistry tagRegistry) {
        this.registry = tagRegistry;
    }

    public TagRegistry$Builder remove(String string) {
        this.registry.remove(this.registry.getTag(string));
        return this;
    }

    public TagRegistry$Builder remove(TextTag textTag) {
        this.registry.remove(textTag);
        return this;
    }

    public TagRegistry$Builder add(TextTag textTag) {
        this.registry.register(textTag);
        return this;
    }

    public TagRegistry$Builder copy(TagRegistry tagRegistry) {
        tagRegistry.getTags().forEach(this.registry::register);
        return this;
    }

    public TagRegistry build() {
        return this.registry;
    }
}

