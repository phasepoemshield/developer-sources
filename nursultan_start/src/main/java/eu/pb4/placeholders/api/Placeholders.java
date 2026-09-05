/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  eu.pb4.placeholders.impl.placeholder.builtin.PlayerPlaceholders
 *  eu.pb4.placeholders.impl.placeholder.builtin.ServerPlaceholders
 *  eu.pb4.placeholders.impl.placeholder.builtin.WorldPlaceholders
 *  minecraft.class00392
 *  minecraft.class01894
 */
package eu.pb4.placeholders.api;

import com.google.common.collect.ImmutableMap;
import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.PlaceholderHandler;
import eu.pb4.placeholders.api.PlaceholderResult;
import eu.pb4.placeholders.api.Placeholders$1;
import eu.pb4.placeholders.api.Placeholders$2;
import eu.pb4.placeholders.api.Placeholders$PlaceholderGetter;
import eu.pb4.placeholders.api.Placeholders$PlaceholderListChangedCallback;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.PatternPlaceholderParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser;
import eu.pb4.placeholders.impl.placeholder.builtin.PlayerPlaceholders;
import eu.pb4.placeholders.impl.placeholder.builtin.ServerPlaceholders;
import eu.pb4.placeholders.impl.placeholder.builtin.WorldPlaceholders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class01894;

public final class Placeholders {
    @Deprecated(forRemoval=true)
    public static final Pattern PLACEHOLDER_PATTERN = PatternPlaceholderParser.PLACEHOLDER_PATTERN;
    @Deprecated(forRemoval=true)
    public static final Pattern ALT_PLACEHOLDER_PATTERN = PatternPlaceholderParser.ALT_PLACEHOLDER_PATTERN;
    @Deprecated(forRemoval=true)
    public static final Pattern PLACEHOLDER_PATTERN_CUSTOM = PatternPlaceholderParser.PLACEHOLDER_PATTERN_CUSTOM;
    @Deprecated(forRemoval=true)
    public static final Pattern ALT_PLACEHOLDER_PATTERN_CUSTOM = PatternPlaceholderParser.ALT_PLACEHOLDER_PATTERN_CUSTOM;
    @Deprecated(forRemoval=true)
    public static final Pattern PREDEFINED_PLACEHOLDER_PATTERN = PatternPlaceholderParser.PREDEFINED_PLACEHOLDER_PATTERN;
    static final HashMap<class01894, PlaceholderHandler> PLACEHOLDERS = new HashMap();
    private static final List<Placeholders$PlaceholderListChangedCallback> CHANGED_CALLBACKS = new ArrayList<Placeholders$PlaceholderListChangedCallback>();
    public static final Placeholders$PlaceholderGetter DEFAULT_PLACEHOLDER_GETTER = new Placeholders$1();
    public static final NodeParser DEFAULT_PLACEHOLDER_PARSER = TagLikeParser.placeholder(TagLikeParser.PLACEHOLDER, PlaceholderContext.KEY, DEFAULT_PLACEHOLDER_GETTER);

    public static class00392 parseText(TextNode textNode, PlaceholderContext placeholderContext) {
        return Placeholders.parseNodes(textNode).toText(ParserContext.of(PlaceholderContext.KEY, placeholderContext));
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(TextNode textNode, PlaceholderContext placeholderContext, Pattern pattern, Placeholders$PlaceholderGetter placeholders$PlaceholderGetter) {
        return Placeholders.parseNodes(textNode, pattern, placeholders$PlaceholderGetter).toText(ParserContext.of(PlaceholderContext.KEY, placeholderContext));
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(TextNode textNode, PlaceholderContext placeholderContext, Pattern pattern) {
        return Placeholders.parseNodes(textNode, pattern).toText(ParserContext.of(PlaceholderContext.KEY, placeholderContext));
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(class00392 class003922, Pattern pattern, Set<String> set, ParserContext$Key<Placeholders$PlaceholderGetter> parserContext$Key) {
        return Placeholders.parseNodes(TextNode.convert(class003922), pattern, set, parserContext$Key).toText(ParserContext.of());
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(class00392 class003922, Pattern pattern, Map<String, class00392> map) {
        return Placeholders.parseNodes(TextNode.convert(class003922), pattern, map).toText(ParserContext.of());
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(class00392 class003922, PlaceholderContext placeholderContext, Pattern pattern) {
        return Placeholders.parseNodes(TextNode.convert(class003922), pattern).toText(ParserContext.of(PlaceholderContext.KEY, placeholderContext));
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(class00392 class003922, PlaceholderContext placeholderContext, Pattern pattern, Placeholders$PlaceholderGetter placeholders$PlaceholderGetter) {
        return Placeholders.parseNodes(TextNode.convert(class003922), pattern, placeholders$PlaceholderGetter).toText(ParserContext.of(PlaceholderContext.KEY, placeholderContext));
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(TextNode textNode, Pattern pattern, Set<String> set, ParserContext$Key<Placeholders$PlaceholderGetter> parserContext$Key) {
        return Placeholders.parseNodes(textNode, pattern, set, parserContext$Key).toText();
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(TextNode textNode, Pattern pattern, Map<String, class00392> map) {
        return Placeholders.parseNodes(textNode, pattern, map).toText();
    }

    @Deprecated(forRemoval=true)
    public static class00392 parseText(TextNode textNode, PlaceholderContext placeholderContext, Pattern pattern, Map<String, class00392> map) {
        return Placeholders.parseNodes(textNode, pattern, map).toText(ParserContext.of(PlaceholderContext.KEY, placeholderContext));
    }

    public static class00392 parseText(class00392 class003922, PlaceholderContext placeholderContext) {
        return Placeholders.parseNodes(TextNode.convert(class003922)).toText(ParserContext.of(PlaceholderContext.KEY, placeholderContext));
    }

    static {
        PlayerPlaceholders.register();
        ServerPlaceholders.register();
        WorldPlaceholders.register();
    }

    public static void remove(class01894 class018942) {
        if (PLACEHOLDERS.remove(class018942) != null) {
            for (Placeholders$PlaceholderListChangedCallback placeholders$PlaceholderListChangedCallback : CHANGED_CALLBACKS) {
                placeholders$PlaceholderListChangedCallback.onPlaceholderListChange(class018942, true);
            }
        }
    }

    public static void register(class01894 class018942, PlaceholderHandler placeholderHandler) {
        PLACEHOLDERS.put(class018942, placeholderHandler);
        for (Placeholders$PlaceholderListChangedCallback placeholders$PlaceholderListChangedCallback : CHANGED_CALLBACKS) {
            placeholders$PlaceholderListChangedCallback.onPlaceholderListChange(class018942, false);
        }
    }

    @Deprecated(forRemoval=true)
    public static ParentNode parseNodes(TextNode textNode, Pattern pattern) {
        return Placeholders.parseNodes(textNode, pattern, PlaceholderContext.KEY);
    }

    public static ParentNode parseNodes(TextNode textNode, ParserContext$Key<PlaceholderContext> parserContext$Key) {
        return Placeholders.asSingleParent(TagLikeParser.placeholder(TagLikeParser.PLACEHOLDER, parserContext$Key, DEFAULT_PLACEHOLDER_GETTER).parseNodes(textNode));
    }

    public static ParentNode parseNodes(TextNode textNode) {
        return Placeholders.asSingleParent(DEFAULT_PLACEHOLDER_PARSER.parseNodes(textNode));
    }

    @Deprecated(forRemoval=true)
    public static ParentNode parseNodes(TextNode textNode, Pattern pattern, Set<String> set, ParserContext$Key<Placeholders$PlaceholderGetter> parserContext$Key, ParserContext$Key<PlaceholderContext> parserContext$Key2) {
        return Placeholders.asSingleParent(PatternPlaceholderParser.of(pattern, parserContext$Key2, new Placeholders$2(parserContext$Key, set)).parseNodes(textNode));
    }

    @Deprecated(forRemoval=true)
    public static ParentNode parseNodes(TextNode textNode, Pattern pattern, Set<String> set, ParserContext$Key<Placeholders$PlaceholderGetter> parserContext$Key) {
        return Placeholders.parseNodes(textNode, pattern, set, parserContext$Key, PlaceholderContext.KEY);
    }

    @Deprecated(forRemoval=true)
    public static ParentNode parseNodes(TextNode textNode, Pattern pattern, Map<String, class00392> map) {
        return Placeholders.asSingleParent(PatternPlaceholderParser.ofTextMap(pattern, map).parseNodes(textNode));
    }

    @Deprecated(forRemoval=true)
    public static ParentNode parseNodes(TextNode textNode, Pattern pattern, Placeholders$PlaceholderGetter placeholders$PlaceholderGetter, ParserContext$Key<PlaceholderContext> parserContext$Key) {
        return Placeholders.asSingleParent(PatternPlaceholderParser.of(pattern, parserContext$Key, placeholders$PlaceholderGetter).parseNodes(textNode));
    }

    @Deprecated(forRemoval=true)
    public static ParentNode parseNodes(TextNode textNode, Pattern pattern, ParserContext$Key<PlaceholderContext> parserContext$Key) {
        return Placeholders.asSingleParent(PatternPlaceholderParser.of(pattern, parserContext$Key, DEFAULT_PLACEHOLDER_GETTER).parseNodes(textNode));
    }

    @Deprecated(forRemoval=true)
    public static ParentNode parseNodes(TextNode textNode, Pattern pattern, Placeholders$PlaceholderGetter placeholders$PlaceholderGetter) {
        return Placeholders.parseNodes(textNode, pattern, placeholders$PlaceholderGetter, PlaceholderContext.KEY);
    }

    private static ParentNode asSingleParent(TextNode ... textNodeArray) {
        if (textNodeArray.length == 1 && textNodeArray[0] instanceof ParentNode) {
            return (ParentNode)textNodeArray[0];
        }
        return new ParentNode(textNodeArray);
    }

    public static PlaceholderResult parsePlaceholder(class01894 class018942, String string, PlaceholderContext placeholderContext) {
        if (PLACEHOLDERS.containsKey(class018942)) {
            return PLACEHOLDERS.get(class018942).onPlaceholderRequest(placeholderContext, string);
        }
        return PlaceholderResult.invalid("Placeholder doesn't exist!");
    }

    public static ImmutableMap<class01894, PlaceholderHandler> getPlaceholders() {
        return ImmutableMap.copyOf(PLACEHOLDERS);
    }

    public static void registerChangeEvent(Placeholders$PlaceholderListChangedCallback placeholders$PlaceholderListChangedCallback) {
        CHANGED_CALLBACKS.add(placeholders$PlaceholderListChangedCallback);
    }
}

