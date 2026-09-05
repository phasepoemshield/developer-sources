/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.placeholder.PlaceholderNode
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.Placeholders$PlaceholderGetter;
import eu.pb4.placeholders.api.node.DirectTextNode;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.TranslatedNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.impl.placeholder.PlaceholderNode;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00392;

@Deprecated(forRemoval=true)
public record PatternPlaceholderParser(Pattern pattern, Function<String, TextNode> placeholderProvider) implements NodeParser
{
    public static final Pattern PLACEHOLDER_PATTERN = Pattern.compile("(?<!((?<!(\\\\))\\\\))[%](?<id>[^%]+:[^%]+)[%]");
    public static final Pattern ALT_PLACEHOLDER_PATTERN = Pattern.compile("(?<!((?<!(\\\\))\\\\))[{](?<id>[^{}]+:[^{}]+)[}]");
    public static final Pattern PLACEHOLDER_PATTERN_CUSTOM = Pattern.compile("(?<!((?<!(\\\\))\\\\))[%](?<id>[^%]+)[%]");
    public static final Pattern ALT_PLACEHOLDER_PATTERN_CUSTOM = Pattern.compile("(?<!((?<!(\\\\))\\\\))[{](?<id>[^{}]+)[}]");
    public static final Pattern PREDEFINED_PLACEHOLDER_PATTERN = Pattern.compile("(?<!((?<!(\\\\))\\\\))\\$[{](?<id>[^}]+)}");

    public static PatternPlaceholderParser of(Pattern pattern, ParserContext$Key<PlaceholderContext> parserContext$Key, Placeholders$PlaceholderGetter placeholders$PlaceholderGetter) {
        return new PatternPlaceholderParser(pattern, string -> {
            String[] stringArray = string.split(" ", 2);
            if (placeholders$PlaceholderGetter.exists(stringArray[0])) {
                return new PlaceholderNode(parserContext$Key, stringArray[0], placeholders$PlaceholderGetter, placeholders$PlaceholderGetter.isContextOptional(), stringArray.length == 2 ? stringArray[1] : null);
            }
            return null;
        });
    }

    @Override
    public TextNode[] parseNodes(TextNode textNode) {
        if (textNode instanceof TranslatedNode) {
            TranslatedNode translatedNode = (TranslatedNode)textNode;
            return new TextNode[]{translatedNode.transform(this)};
        }
        if (textNode instanceof LiteralNode) {
            LiteralNode literalNode = (LiteralNode)textNode;
            ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
            String string = literalNode.value();
            Matcher matcher = this.pattern.matcher(string);
            int n = 0;
            while (matcher.find()) {
                String string2 = matcher.group("id");
                int n2 = matcher.start();
                int n3 = matcher.end();
                TextNode textNode2 = this.placeholderProvider.apply(string2);
                if (textNode2 != null) {
                    if (n2 != 0) {
                        arrayList.add(new LiteralNode(string.substring(n, n2)));
                    }
                    arrayList.add(textNode2);
                    n = n3;
                    continue;
                }
                matcher.region(n2 + 1, string.length());
            }
            if (n != string.length()) {
                arrayList.add(new LiteralNode(string.substring(n)));
            }
            return arrayList.toArray(new TextNode[0]);
        }
        if (textNode instanceof ParentTextNode) {
            ParentTextNode parentTextNode = (ParentTextNode)textNode;
            ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
            for (TextNode textNode3 : parentTextNode.getChildren()) {
                arrayList.add(TextNode.asSingle(this.parseNodes(textNode3)));
            }
            return new TextNode[]{parentTextNode.copyWith(arrayList.toArray(new TextNode[0]), (NodeParser)this)};
        }
        return new TextNode[]{textNode};
    }

    public static PatternPlaceholderParser ofNodeMap(Pattern pattern, Map<String, TextNode> map) {
        return new PatternPlaceholderParser(pattern, map::get);
    }

    public static PatternPlaceholderParser ofTextMap(Pattern pattern, Map<String, class00392> map) {
        return new PatternPlaceholderParser(pattern, string -> {
            class00392 class003922 = (class00392)map.get(string);
            return class003922 != null ? new DirectTextNode(class003922) : null;
        });
    }
}

