/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers.tag;

import eu.pb4.placeholders.api.parsers.tag.TagRegistry$Builder;
import eu.pb4.placeholders.api.parsers.tag.TextTag;
import eu.pb4.placeholders.impl.textparser.tagreg.SimpleTagRegistry;
import eu.pb4.placeholders.impl.textparser.tagreg.WrappingTagRegistry;
import java.util.List;

public interface TagRegistry {
    public static final TagRegistry DEFAULT = SimpleTagRegistry.DEFAULT;
    public static final TagRegistry SAFE = SimpleTagRegistry.SAFE;

    public static TagRegistry create() {
        return new SimpleTagRegistry(false);
    }

    public void remove(TextTag var1);

    public static TagRegistry$Builder builder() {
        return new TagRegistry$Builder(TagRegistry.create());
    }

    public void register(TextTag var1);

    public TagRegistry copy();

    public TextTag getTag(String var1);

    public static TagRegistry createSafe() {
        return WrappingTagRegistry.of(SAFE);
    }

    public List<TextTag> getTags();

    public static TagRegistry$Builder builderWithSafe() {
        return new TagRegistry$Builder(TagRegistry.createSafe());
    }

    public static TagRegistry$Builder builderWithDefault() {
        return new TagRegistry$Builder(TagRegistry.createDefault());
    }

    public static TagRegistry$Builder builderCopySafe() {
        return new TagRegistry$Builder(TagRegistry.copySafe());
    }

    public static TagRegistry$Builder builderCopyDefault() {
        return new TagRegistry$Builder(TagRegistry.copyDefault());
    }

    public static TagRegistry copyDefault() {
        return DEFAULT.copy();
    }

    public static void registerDefault(TextTag textTag) {
        SimpleTagRegistry.DEFAULT.register(textTag);
        if (textTag.userSafe()) {
            SimpleTagRegistry.SAFE.register(textTag);
        }
    }

    public boolean isGlobal();

    public static TagRegistry copySafe() {
        return SAFE.copy();
    }

    public static TagRegistry createDefault() {
        return WrappingTagRegistry.of(DEFAULT);
    }
}

