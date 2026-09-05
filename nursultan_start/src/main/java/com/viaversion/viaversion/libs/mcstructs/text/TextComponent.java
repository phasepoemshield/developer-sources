/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent$ComponentConsumer
 *  com.viaversion.viaversion.libs.mcstructs.text.components.ObjectComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.ObjectComponent$AtlasSprite
 *  com.viaversion.viaversion.libs.mcstructs.text.components.ObjectComponent$ObjectInfo
 *  com.viaversion.viaversion.libs.mcstructs.text.stringformat.StringFormat
 *  com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.ColorHandling
 *  com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.SerializerUnknownHandling
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.viaversion.viaversion.libs.mcstructs.text;

import com.viaversion.viaversion.libs.mcstructs.converter.ConsumerTracking;
import com.viaversion.viaversion.libs.mcstructs.core.Copyable;
import com.viaversion.viaversion.libs.mcstructs.core.Identifier;
import com.viaversion.viaversion.libs.mcstructs.text.Style;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.TextFormatting;
import com.viaversion.viaversion.libs.mcstructs.text.components.KeybindComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.NbtComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.ObjectComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.ScoreComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.SelectorComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.BlockNbtSource;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.EntityNbtSource;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.NbtDataSource;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.StorageNbtSource;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.StringFormat;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.ColorHandling;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.SerializerUnknownHandling;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import lombok.Generated;

public abstract class TextComponent
implements Copyable<TextComponent> {
    private static final StringFormat LEGACY_FORMAT = StringFormat.vanilla((char)'\u00a7', (boolean)false);
    private List<TextComponent> siblings;
    private Style style;
    private int level = 1;
    private static final int MAX_LEN = 65535;

    private void setLevel(int level) {
        this.level = Math.max(this.level, level);
        if (this.level > 512) {
            throw new IllegalArgumentException("Too deep");
        }
    }

    public TextComponent append(String ... strings) {
        for (String s : strings) {
            this.getSiblings().add(new StringComponent(s));
        }
        return this;
    }

    public TextComponent append(TextComponent component) {
        this.getSiblings().add(component);
        component.setLevel(this.level + 1);
        return this;
    }

    public TextComponent append(TextComponent ... components) {
        Collections.addAll(this.getSiblings(), components);
        for (TextComponent component : components) {
            component.setLevel(this.level + 1);
        }
        return this;
    }

    public TextComponent append(Iterable<TextComponent> components) {
        components.forEach(this.getSiblings()::add);
        for (TextComponent component : components) {
            component.setLevel(this.level + 1);
        }
        return this;
    }

    public List<TextComponent> getSiblings() {
        if (this.siblings == null) {
            this.siblings = new ArrayList<TextComponent>();
        }
        return this.siblings;
    }

    public TextComponent forEach(Consumer<TextComponent> consumer) {
        consumer.accept(this);
        if (this.siblings != null) {
            for (TextComponent sibling : this.siblings) {
                sibling.forEach(consumer);
            }
        }
        return this;
    }

    @Nonnull
    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
        }
        return this.style;
    }

    public TextComponent setStyle(@Nonnull Style style) {
        this.style = style;
        return this;
    }

    public TextComponent styled(Consumer<Style> styleConsumer) {
        styleConsumer.accept(this.getStyle());
        return this;
    }

    public TextComponent formatted(TextFormatting formatting) {
        this.getStyle().setFormatting(formatting);
        return this;
    }

    public TextComponent setParentStyle(@Nonnull Style style) {
        this.getStyle().setParent(style);
        return this;
    }

    public TextComponent setSiblingParentStyle() {
        if (this.siblings == null) {
            return this;
        }
        for (TextComponent sibling : this.siblings) {
            sibling.getStyle().setParent(this.getStyle());
            sibling.setSiblingParentStyle();
        }
        return this;
    }

    public TextComponent mergeSiblingParentStyle() {
        if (this.siblings == null) {
            return this;
        }
        for (TextComponent sibling : this.siblings) {
            sibling.getStyle().setParent(this.getStyle());
            sibling.getStyle().mergeParent();
            sibling.mergeSiblingParentStyle();
        }
        return this;
    }

    public <C extends TextComponent> C copyMetaTo(C component) {
        component.setStyle(this.getStyle().copy());
        if (this.siblings != null) {
            for (TextComponent sibling : this.siblings) {
                component.append(sibling.copy());
            }
        }
        return component;
    }

    public String asUnformattedString() {
        return this.asUnformattedString(null);
    }

    public String asUnformattedString(ConsumerTracking converter) {
        StringBuilder out = new StringBuilder();
        ComponentConsumer consumer = s -> {
            if (s.length() + out.length() > 65535) {
                throw new IllegalArgumentException("Too long");
            }
            out.append((String)s);
        };
        if (converter != null && converter.currentConsumer() != null) {
            consumer = ((ComponentConsumer)converter.currentConsumer()).withConsumer(consumer);
            converter.setCurrentConsumer((Consumer<String>)consumer);
        }
        this.visit(converter, consumer);
        return out.toString();
    }

    public void visit(ConsumerTracking converter, ComponentConsumer consumer) {
        this.asSingleString(converter, consumer);
        if (this.siblings != null) {
            for (TextComponent sibling : this.siblings) {
                sibling.visit(converter, consumer);
            }
        }
    }

    public String asLegacyFormatString() {
        return LEGACY_FORMAT.toString(this, ColorHandling.RESET, SerializerUnknownHandling.IGNORE);
    }

    public abstract String asSingleString();

    public void asSingleString(ConsumerTracking converter, ComponentConsumer consumer) {
        consumer.accept((Object)this.asSingleString());
    }

    @Override
    public TextComponent copy() {
        TextComponent component = this.shallowCopy();
        if (this.siblings != null) {
            for (TextComponent sibling : this.siblings) {
                component.append(sibling.copy());
            }
        }
        return component;
    }

    public abstract TextComponent shallowCopy();

    public abstract String toString();

    public static StringComponent empty() {
        return new StringComponent();
    }

    public static StringComponent of(String text) {
        return new StringComponent(text);
    }

    public static TextComponent of(String ... text) {
        if (text.length == 0) {
            return new StringComponent();
        }
        if (text.length == 1) {
            return new StringComponent(text[0]);
        }
        StringComponent component = new StringComponent();
        component.append(text);
        return component;
    }

    public static TextComponent of(TextComponent ... components) {
        if (components.length == 0) {
            return new StringComponent();
        }
        if (components.length == 1) {
            return components[0];
        }
        StringComponent component = new StringComponent();
        component.append(components);
        return component;
    }

    public static TextComponent of(Iterable<TextComponent> components) {
        StringComponent component = new StringComponent();
        components.forEach(component::append);
        return component;
    }

    public static TranslationComponent translation(String key, List<Object> args) {
        return new TranslationComponent(key, args);
    }

    public static TranslationComponent translation(String key, Object ... args) {
        return new TranslationComponent(key, args);
    }

    public static ScoreComponent score(String name, String objective) {
        return new ScoreComponent(name, objective);
    }

    public static ScoreComponent score(String name, String objective, @Nullable String value) {
        return new ScoreComponent(name, objective, value);
    }

    public static SelectorComponent selector(String selector) {
        return new SelectorComponent(selector);
    }

    public static SelectorComponent selector(String selector, @Nullable TextComponent separator) {
        return new SelectorComponent(selector, separator);
    }

    public static KeybindComponent keybind(String keybind) {
        return new KeybindComponent(keybind);
    }

    public static NbtComponent blockNbt(String rawComponent, boolean resolve, String pos) {
        return new NbtComponent(rawComponent, resolve, new BlockNbtSource(pos));
    }

    public static NbtComponent blockNbt(String rawComponent, boolean resolve, @Nullable TextComponent separator, String pos) {
        return new NbtComponent(rawComponent, resolve, separator, (NbtDataSource)new BlockNbtSource(pos));
    }

    public static NbtComponent entityNbt(String component, boolean resolve, String selector) {
        return new NbtComponent(component, resolve, new EntityNbtSource(selector));
    }

    public static NbtComponent entityNbt(String component, boolean resolve, @Nullable TextComponent separator, String selector) {
        return new NbtComponent(component, resolve, separator, (NbtDataSource)new EntityNbtSource(selector));
    }

    public static NbtComponent storageNbt(String component, boolean resolve, Identifier id) {
        return new NbtComponent(component, resolve, new StorageNbtSource(id));
    }

    public static NbtComponent storageNbt(String component, boolean resolve, @Nullable TextComponent separator, Identifier id) {
        return new NbtComponent(component, resolve, separator, (NbtDataSource)new StorageNbtSource(id));
    }

    public static ObjectComponent atlasSprite(Identifier sprite) {
        return new ObjectComponent((ObjectComponent.ObjectInfo)new ObjectComponent.AtlasSprite(sprite));
    }

    public static ObjectComponent atlasSprite(Identifier sprite, @Nullable TextComponent fallback) {
        return new ObjectComponent((ObjectComponent.ObjectInfo)new ObjectComponent.AtlasSprite(sprite), fallback);
    }

    public static ObjectComponent atlasSprite(Identifier atlas, Identifier sprite) {
        return new ObjectComponent((ObjectComponent.ObjectInfo)new ObjectComponent.AtlasSprite(atlas, sprite));
    }

    public static ObjectComponent atlasSprite(Identifier atlas, Identifier sprite, @Nullable TextComponent fallback) {
        return new ObjectComponent((ObjectComponent.ObjectInfo)new ObjectComponent.AtlasSprite(atlas, sprite), fallback);
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TextComponent)) {
            return false;
        }
        TextComponent other = (TextComponent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<TextComponent> this$siblings = this.getSiblings();
        List<TextComponent> other$siblings = other.getSiblings();
        if (this$siblings == null ? other$siblings != null : !((Object)this$siblings).equals(other$siblings)) {
            return false;
        }
        Style this$style = this.getStyle();
        Style other$style = other.getStyle();
        return !(this$style == null ? other$style != null : !((Object)this$style).equals(other$style));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TextComponent;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<TextComponent> $siblings = this.getSiblings();
        result = result * 59 + ($siblings == null ? 43 : ((Object)$siblings).hashCode());
        Style $style = this.getStyle();
        result = result * 59 + ($style == null ? 43 : ((Object)$style).hashCode());
        return result;
    }
}

