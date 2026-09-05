/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.parsers.TagParser
 *  eu.pb4.placeholders.api.parsers.tag.TagRegistry
 *  eu.pb4.placeholders.impl.textparser.MultiTagLikeParser
 *  eu.pb4.placeholders.impl.textparser.SingleTagLikeParser
 *  minecraft.class00392
 *  minecraft.class06541
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.Placeholders;
import eu.pb4.placeholders.api.Placeholders$PlaceholderGetter;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.LegacyFormattingParser;
import eu.pb4.placeholders.api.parsers.MarkdownLiteParserV1;
import eu.pb4.placeholders.api.parsers.MarkdownLiteParserV1$MarkdownFormat;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.StaticPreParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Format;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider;
import eu.pb4.placeholders.api.parsers.TagLikeWrapper;
import eu.pb4.placeholders.api.parsers.TagParser;
import eu.pb4.placeholders.api.parsers.tag.TagRegistry;
import eu.pb4.placeholders.impl.textparser.MultiTagLikeParser;
import eu.pb4.placeholders.impl.textparser.SingleTagLikeParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class06541;

public class ParserBuilder {
    private final Map<TagLikeParser.Format, TagLikeParser$Provider> tagLike = new LinkedHashMap<TagLikeParser.Format, TagLikeParser$Provider>();
    private final List<NodeParser> parserList = new ArrayList<NodeParser>();
    private final List<class06541> legacyFormatting = new ArrayList<class06541>();
    private boolean hasLegacy = false;
    private boolean legacyRGB = false;
    private boolean simplifiedTextFormat;
    private boolean quickText;
    private boolean safeOnly;
    private TagRegistry customTagRegistry;
    private boolean staticPreParsing;

    public ParserBuilder add(NodeParser nodeParser) {
        if (nodeParser instanceof TagLikeWrapper) {
            TagLikeWrapper tagLikeWrapper = (TagLikeWrapper)((Object)nodeParser);
            TagLikeParser tagLikeParser = tagLikeWrapper.asTagLikeParser();
            if (tagLikeParser instanceof SingleTagLikeParser) {
                SingleTagLikeParser singleTagLikeParser = (SingleTagLikeParser)tagLikeParser;
                return this.customTags(singleTagLikeParser.format(), singleTagLikeParser.provider());
            }
            if (tagLikeParser instanceof MultiTagLikeParser) {
                MultiTagLikeParser multiTagLikeParser = (MultiTagLikeParser)tagLikeParser;
                this.tagLike.putAll(Map.ofEntries(multiTagLikeParser.pairs()));
                return this;
            }
        } else if (nodeParser instanceof LegacyFormattingParser) {
            LegacyFormattingParser legacyFormattingParser = (LegacyFormattingParser)nodeParser;
            this.hasLegacy = true;
            this.legacyFormatting.addAll(legacyFormattingParser.formatting());
            this.legacyRGB |= legacyFormattingParser.allowRGB();
        }
        return this.forceAdd(nodeParser);
    }

    public static ParserBuilder of() {
        return new ParserBuilder();
    }

    public NodeParser build() {
        TagRegistry tagRegistry;
        ArrayList<NodeParser> arrayList = new ArrayList<NodeParser>(this.parserList.size() + 1);
        if (!this.tagLike.isEmpty()) {
            arrayList.add(TagLikeParser.of(this.tagLike));
        }
        TagRegistry tagRegistry2 = this.customTagRegistry != null ? this.customTagRegistry : (tagRegistry = this.safeOnly ? TagRegistry.SAFE : TagRegistry.DEFAULT);
        if (this.quickText && this.simplifiedTextFormat) {
            arrayList.add((NodeParser)TagParser.createQuickTextWithSTF((TagRegistry)tagRegistry));
        } else if (this.quickText) {
            arrayList.add((NodeParser)TagParser.createQuickText((TagRegistry)tagRegistry));
        } else if (this.simplifiedTextFormat) {
            arrayList.add((NodeParser)TagParser.createSimplifiedTextFormat((TagRegistry)tagRegistry));
        }
        arrayList.addAll(this.parserList);
        if (this.hasLegacy) {
            arrayList.add(new LegacyFormattingParser(this.legacyRGB, this.legacyFormatting.toArray(new class06541[0])));
        }
        if (this.staticPreParsing) {
            arrayList.add(StaticPreParser.INSTANCE);
        }
        return NodeParser.merge(arrayList);
    }

    public ParserBuilder legacy(boolean bl, Collection<class06541> collection) {
        this.hasLegacy = true;
        this.legacyRGB = bl;
        this.legacyFormatting.addAll(collection);
        return this;
    }

    public ParserBuilder legacy(boolean bl, class06541 ... class06541Array) {
        this.hasLegacy = true;
        this.legacyRGB = bl;
        this.legacyFormatting.addAll(List.of(class06541Array));
        return this;
    }

    public ParserBuilder staticPreParsing() {
        this.staticPreParsing = true;
        return this;
    }

    public ParserBuilder customTagRegistry(TagRegistry tagRegistry) {
        this.customTagRegistry = tagRegistry;
        return this;
    }

    public ParserBuilder legacyVanillaColor() {
        return this.add(LegacyFormattingParser.BASE_COLORS);
    }

    public ParserBuilder globalPlaceholders() {
        return this.add(Placeholders.DEFAULT_PLACEHOLDER_PARSER);
    }

    public ParserBuilder globalPlaceholders(TagLikeParser.Format format, ParserContext$Key<PlaceholderContext> parserContext$Key) {
        return this.customTags(format, TagLikeParser$Provider.placeholder(parserContext$Key, Placeholders.DEFAULT_PLACEHOLDER_GETTER));
    }

    public ParserBuilder globalPlaceholders(TagLikeParser.Format format) {
        return this.customTags(format, TagLikeParser$Provider.placeholder(PlaceholderContext.KEY, Placeholders.DEFAULT_PLACEHOLDER_GETTER));
    }

    public ParserBuilder placeholders(TagLikeParser.Format format, ParserContext$Key<Function<String, class00392>> parserContext$Key) {
        return this.customTags(format, TagLikeParser$Provider.placeholder(parserContext$Key));
    }

    public ParserBuilder placeholders(TagLikeParser.Format format, Function<String, TextNode> function) {
        return this.customTags(format, TagLikeParser$Provider.placeholder(function));
    }

    public ParserBuilder placeholders(TagLikeParser.Format format, ParserContext$Key<PlaceholderContext> parserContext$Key, Placeholders$PlaceholderGetter placeholders$PlaceholderGetter) {
        return this.customTags(format, TagLikeParser$Provider.placeholder(parserContext$Key, placeholders$PlaceholderGetter));
    }

    public ParserBuilder placeholders(TagLikeParser.Format format, Set<String> set, ParserContext$Key<Function<String, class00392>> parserContext$Key) {
        return this.customTags(format, TagLikeParser$Provider.placeholder(set, parserContext$Key));
    }

    public ParserBuilder requireSafe() {
        this.safeOnly = true;
        return this;
    }

    public ParserBuilder legacyColor() {
        return this.add(LegacyFormattingParser.COLORS);
    }

    public ParserBuilder quickText() {
        this.quickText = true;
        return this;
    }

    public ParserBuilder customTags(TagLikeParser.Format format, TagLikeParser$Provider tagLikeParser$Provider) {
        this.tagLike.put(format, tagLikeParser$Provider);
        return this;
    }

    public ParserBuilder legacyAll() {
        return this.add(LegacyFormattingParser.ALL);
    }

    public ParserBuilder forceAdd(NodeParser nodeParser) {
        this.parserList.add(nodeParser);
        return this;
    }

    public ParserBuilder markdown(MarkdownLiteParserV1$MarkdownFormat ... markdownLiteParserV1$MarkdownFormatArray) {
        return this.add(new MarkdownLiteParserV1(markdownLiteParserV1$MarkdownFormatArray));
    }

    public ParserBuilder markdown() {
        return this.add(MarkdownLiteParserV1.ALL);
    }

    public ParserBuilder markdown(Collection<MarkdownLiteParserV1$MarkdownFormat> collection) {
        return this.add(new MarkdownLiteParserV1(collection.toArray(new MarkdownLiteParserV1$MarkdownFormat[0])));
    }

    public ParserBuilder markdown(Function<TextNode[], TextNode> function, Function<TextNode[], TextNode> function2, BiFunction<TextNode[], TextNode, TextNode> biFunction, MarkdownLiteParserV1$MarkdownFormat ... markdownLiteParserV1$MarkdownFormatArray) {
        return this.add(new MarkdownLiteParserV1(function, function2, biFunction, markdownLiteParserV1$MarkdownFormatArray));
    }

    public ParserBuilder markdown(Function<TextNode[], TextNode> function, Function<TextNode[], TextNode> function2, BiFunction<TextNode[], TextNode, TextNode> biFunction, Collection<MarkdownLiteParserV1$MarkdownFormat> collection) {
        return this.add(new MarkdownLiteParserV1(function, function2, biFunction, collection.toArray(new MarkdownLiteParserV1$MarkdownFormat[0])));
    }

    public ParserBuilder simplifiedTextFormat() {
        this.simplifiedTextFormat = true;
        return this;
    }
}

