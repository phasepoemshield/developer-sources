/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.parsers.NodeParser
 *  eu.pb4.placeholders.api.parsers.TagLikeParser
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Format
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Provider
 *  eu.pb4.placeholders.api.parsers.TagLikeWrapper
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser;
import eu.pb4.placeholders.api.parsers.TagLikeWrapper;
import eu.pb4.placeholders.api.parsers.tag.TagRegistry;
import eu.pb4.placeholders.api.parsers.tag.TextTag;
import eu.pb4.placeholders.impl.textparser.SingleTagLikeParser;
import eu.pb4.placeholders.impl.textparser.providers.LegacyProvider;
import eu.pb4.placeholders.impl.textparser.providers.LenientProvider;
import eu.pb4.placeholders.impl.textparser.providers.ModernProvider;
import java.util.function.Function;

public final class TagParser
implements NodeParser,
TagLikeWrapper {
    private final TagRegistry registry;
    private final TagLikeParser parser;
    public static final TagParser DEFAULT = new TagParser(TagLikeParser.TAGS, TagRegistry.DEFAULT, ModernProvider::new);
    public static final TagParser DEFAULT_SAFE = new TagParser(TagLikeParser.TAGS, TagRegistry.SAFE, ModernProvider::new);
    public static final TagParser QUICK_TEXT = new TagParser(TagLikeParser.TAGS, TagRegistry.DEFAULT, ModernProvider::new);
    public static final TagParser QUICK_TEXT_SAFE = new TagParser(TagLikeParser.TAGS, TagRegistry.SAFE, ModernProvider::new);
    public static final TagParser QUICK_TEXT_WITH_STF = new TagParser(TagLikeParser.TAGS_LENIENT, TagRegistry.DEFAULT, LenientProvider::new);
    public static final TagParser QUICK_TEXT_WITH_STF_SAFE = new TagParser(TagLikeParser.TAGS_LENIENT, TagRegistry.SAFE, LenientProvider::new);
    public static final TagParser SIMPLIFIED_TEXT_FORMAT = new TagParser(TagLikeParser.TAGS_LEGACY, TagRegistry.DEFAULT, LegacyProvider::new);
    public static final TagParser SIMPLIFIED_TEXT_FORMAT_SAFE = new TagParser(TagLikeParser.TAGS_LEGACY, TagRegistry.SAFE, LegacyProvider::new);
    private final TagLikeParser.Format format;
    private final Function<TagRegistry, TagLikeParser.Provider> providerCreator;

    private TagParser(TagLikeParser.Format format, TagRegistry tagRegistry, Function<TagRegistry, TagLikeParser.Provider> function) {
        this.registry = tagRegistry;
        this.parser = new SingleTagLikeParser(format, function.apply(tagRegistry));
        this.providerCreator = function;
        this.format = format;
    }

    public void register(TextTag textTag) {
        this.registry.register(textTag);
    }

    public TagParser copy() {
        return new TagParser(this.format, this.registry.copy(), this.providerCreator);
    }

    public static TagParser createQuickText() {
        return new TagParser(TagLikeParser.TAGS, TagRegistry.create(), ModernProvider::new);
    }

    public static TagParser createQuickText(TagRegistry tagRegistry) {
        return new TagParser(TagLikeParser.TAGS, tagRegistry, ModernProvider::new);
    }

    public TagLikeParser asTagLikeParser() {
        return this.parser;
    }

    public TextNode[] parseNodes(TextNode textNode) {
        return this.parser.parseNodes(textNode);
    }

    public Function<TagRegistry, TagLikeParser.Provider> providerCreator() {
        return this.providerCreator;
    }

    public TagRegistry tagRegistry() {
        return this.registry;
    }

    public static TagParser createSimplifiedTextFormat() {
        return new TagParser(TagLikeParser.TAGS_LEGACY, TagRegistry.create(), LegacyProvider::new);
    }

    public static TagParser createSimplifiedTextFormat(TagRegistry tagRegistry) {
        return new TagParser(TagLikeParser.TAGS_LEGACY, tagRegistry, LegacyProvider::new);
    }

    public static TagParser createQuickTextWithSTF(TagRegistry tagRegistry) {
        return new TagParser(TagLikeParser.TAGS_LENIENT, tagRegistry, LenientProvider::new);
    }

    public static TagParser createQuickTextWithSTF() {
        return new TagParser(TagLikeParser.TAGS_LENIENT, TagRegistry.create(), LenientProvider::new);
    }
}

