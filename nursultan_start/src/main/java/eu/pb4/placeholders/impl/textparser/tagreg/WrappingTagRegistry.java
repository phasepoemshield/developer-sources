/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.impl.textparser.tagreg;

import eu.pb4.placeholders.api.parsers.tag.TagRegistry;
import eu.pb4.placeholders.api.parsers.tag.TextTag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public record WrappingTagRegistry(TagRegistry source, TagRegistry mutable, Set<TextTag> removed) implements TagRegistry
{
    @Override
    public void remove(TextTag textTag) {
        this.mutable.remove(textTag);
        this.removed.add(textTag);
    }

    public static WrappingTagRegistry of(TagRegistry tagRegistry) {
        return new WrappingTagRegistry(tagRegistry, TagRegistry.create(), new HashSet<TextTag>());
    }

    @Override
    public void register(TextTag textTag) {
        this.mutable.register(textTag);
    }

    @Override
    public TagRegistry copy() {
        return new WrappingTagRegistry(this.source, this.mutable.copy(), new HashSet<TextTag>(this.removed));
    }

    @Override
    public TextTag getTag(String string) {
        TextTag textTag = this.mutable.getTag(string);
        if (textTag != null) {
            return textTag;
        }
        TextTag textTag2 = this.source.getTag(string);
        if (textTag2 != null && !this.removed.contains((Object)textTag2)) {
            return textTag2;
        }
        return null;
    }

    @Override
    public List<TextTag> getTags() {
        ArrayList<TextTag> arrayList = new ArrayList<TextTag>(this.source.getTags());
        arrayList.removeAll(this.removed);
        arrayList.addAll(this.mutable.getTags());
        return arrayList;
    }

    @Override
    public boolean isGlobal() {
        return false;
    }
}

