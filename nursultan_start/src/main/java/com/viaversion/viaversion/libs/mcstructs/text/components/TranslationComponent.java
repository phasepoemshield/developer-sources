/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent$ComponentConsumer
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent$TranslatableContentConsumer
 *  com.viaversion.viaversion.libs.mcstructs.text.translation.Translator
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.text.components;

import com.viaversion.viaversion.libs.mcstructs.converter.ConsumerTracking;
import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.libs.mcstructs.text.translation.Translator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class TranslationComponent
extends TextComponent {
    private static final Pattern ARG_PATTERN = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
    private String key;
    private Object[] args;
    @Nullable
    private String fallback;
    private Translator translator = Translator.GLOBAL;

    public TranslationComponent setKey(String key) {
        this.key = key;
        return this;
    }

    public TranslationComponent(String key, List<?> args) {
        this.key = key;
        this.args = args.toArray();
    }

    public TranslationComponent(String key, Object ... args) {
        this.key = key;
        this.args = args;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TranslationComponent)) {
            return false;
        }
        TranslationComponent other = (TranslationComponent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        String this$key = this.getKey();
        String other$key = other.getKey();
        if (this$key == null ? other$key != null : !this$key.equals(other$key)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getArgs(), other.getArgs())) {
            return false;
        }
        String this$fallback = this.getFallback();
        String other$fallback = other.getFallback();
        if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback)) {
            return false;
        }
        Translator this$translator = this.translator;
        Translator other$translator = other.translator;
        return !(this$translator == null ? other$translator != null : !this$translator.equals(other$translator));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("siblings", this.getSiblings(), siblings -> !siblings.isEmpty()).add("style", (Object)this.getStyle(), style -> !style.isEmpty()).add("key", (Object)this.key).add("args", (Object)this.args, args -> ((Object[])args).length > 0, Arrays::toString).add("translator", (Object)this.translator, translator -> translator != Translator.GLOBAL).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        String $key = this.getKey();
        result = result * 59 + ($key == null ? 43 : $key.hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getArgs());
        String $fallback = this.getFallback();
        result = result * 59 + ($fallback == null ? 43 : $fallback.hashCode());
        Translator $translator = this.translator;
        result = result * 59 + ($translator == null ? 43 : $translator.hashCode());
        return result;
    }

    public String getKey() {
        return this.key;
    }

    public TextComponent resolveIntoComponents() {
        ArrayList<TextComponent> components = new ArrayList<TextComponent>();
        String translated = this.translator.translate(this.key);
        if (translated == null) {
            translated = this.fallback;
        }
        if (translated == null) {
            translated = this.key;
        }
        Matcher matcher = ARG_PATTERN.matcher(translated);
        int argIndex = 0;
        int start = 0;
        while (matcher.find(start)) {
            int matchStart = matcher.start();
            int matchEnd = matcher.end();
            if (matchStart > start) {
                components.add(new StringComponent(String.format(translated.substring(start, matchStart), new Object[0])));
            }
            start = matchEnd;
            String argType = matcher.group(2);
            String match = translated.substring(matchStart, matchEnd);
            if (argType.equals("%") && match.equals("%%")) {
                components.add(new StringComponent("%"));
                continue;
            }
            if (!argType.equals("s")) {
                throw new IllegalStateException("Unsupported format: '" + match + "'");
            }
            String rawIndex = matcher.group(1);
            int index = rawIndex == null ? argIndex++ : Integer.parseInt(rawIndex) - 1;
            if (index >= this.args.length) continue;
            Object arg = this.args[index];
            if (arg instanceof TextComponent) {
                components.add((TextComponent)arg);
                continue;
            }
            if (arg == null) {
                components.add(new StringComponent("null"));
                continue;
            }
            components.add(new StringComponent(arg.toString()));
        }
        if (start < translated.length()) {
            components.add(new StringComponent(String.format(translated.substring(start), new Object[0])));
        }
        StringComponent out = new StringComponent();
        out.setStyle(this.getStyle());
        components.forEach(out::append);
        return out;
    }

    public Object[] getArgs() {
        return this.args;
    }

    @Override
    public String asSingleString() {
        return this.resolveIntoComponents().asUnformattedString();
    }

    @Override
    public void asSingleString(ConsumerTracking converter, TextComponent.ComponentConsumer consumer) {
        if (consumer instanceof TranslatableContentConsumer) {
            if (converter != null) {
                converter.setCurrentConsumer((Consumer<String>)consumer);
            }
            this.resolveIntoComponents().visit(converter, consumer);
        } else {
            TranslatableContentConsumer translatableConsumer = new TranslatableContentConsumer(consumer, null);
            if (converter != null) {
                converter.setCurrentConsumer((Consumer<String>)translatableConsumer);
            }
            this.resolveIntoComponents().visit(converter, (TextComponent.ComponentConsumer)translatableConsumer);
        }
    }

    public TranslationComponent setTranslator(@Nullable Translator translator) {
        this.translator = translator == null ? Translator.GLOBAL : translator;
        return this;
    }

    @Override
    public TextComponent shallowCopy() {
        Object[] copyArgs = new Object[this.args.length];
        for (int i = 0; i < this.args.length; ++i) {
            Object arg = this.args[i];
            copyArgs[i] = arg instanceof TextComponent ? ((TextComponent)arg).copy() : arg;
        }
        TranslationComponent copy = new TranslationComponent(this.key, copyArgs);
        copy.translator = this.translator;
        return copy.setStyle(this.getStyle().copy());
    }

    public TranslationComponent setFallback(@Nullable String fallback) {
        this.fallback = fallback;
        return this;
    }

    @Nullable
    public String getFallback() {
        return this.fallback;
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof TranslationComponent;
    }

    public TranslationComponent setArgs(Object[] args) {
        this.args = args;
        return this;
    }

    @Override
    public String asLegacyFormatString() {
        return this.resolveIntoComponents().asLegacyFormatString();
    }
}

