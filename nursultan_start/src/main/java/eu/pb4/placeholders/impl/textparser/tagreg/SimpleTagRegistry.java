/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.impl.textparser.tagreg;

import eu.pb4.placeholders.api.parsers.tag.TagRegistry;
import eu.pb4.placeholders.api.parsers.tag.TextTag;
import eu.pb4.placeholders.impl.textparser.BuiltinTags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SimpleTagRegistry
implements TagRegistry {
    public static final TagRegistry DEFAULT = new SimpleTagRegistry(true);
    public static final TagRegistry SAFE = new SimpleTagRegistry(true);
    private final boolean global;
    private final List<TextTag> tags = new ArrayList<TextTag>();
    private final Map<String, TextTag> byName = new HashMap<String, TextTag>();
    private final Map<String, TextTag> byNameAlias = new HashMap<String, TextTag>();
    private final boolean allowOverrides;

    public SimpleTagRegistry(boolean bl) {
        this.global = bl;
        this.allowOverrides = !bl;
    }

    static {
        BuiltinTags.register();
    }

    @Override
    public void remove(TextTag textTag) {
        if (this.allowOverrides && this.tags.remove((Object)textTag)) {
            this.byNameAlias.values().removeIf(textTag2 -> textTag2 == textTag);
            this.byName.values().removeIf(textTag2 -> textTag2 == textTag);
        } else if (!this.allowOverrides) {
            throw new RuntimeException("Can't remove tag!");
        }
    }

    @Override
    public void register(TextTag textTag) {
        if (this.byName.containsKey(textTag.name())) {
            if (this.allowOverrides) {
                this.tags.removeIf(textTag2 -> textTag2.name().equals(textTag.name()));
            } else {
                throw new RuntimeException("Duplicate tag identifier!");
            }
        }
        this.byName.put(textTag.name(), textTag);
        this.tags.add(textTag);
        this.byNameAlias.put(textTag.name(), textTag);
        if (textTag.aliases() != null) {
            for (int i = 0; i < textTag.aliases().length; ++i) {
                String string = textTag.aliases()[i];
                TextTag textTag3 = this.byNameAlias.get(string);
                if (textTag3 != null && textTag3.name().equals(string)) continue;
                this.byNameAlias.put(string, textTag);
            }
        }
    }

    @Override
    public TagRegistry copy() {
        SimpleTagRegistry simpleTagRegistry = new SimpleTagRegistry(false);
        for (TextTag textTag : this.tags) {
            simpleTagRegistry.register(textTag);
        }
        return simpleTagRegistry;
    }

    @Override
    public TextTag getTag(String string) {
        return this.byNameAlias.get(string);
    }

    @Override
    public List<TextTag> getTags() {
        return Collections.unmodifiableList(this.tags);
    }

    @Override
    public boolean isGlobal() {
        return this.global;
    }
}

