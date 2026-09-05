/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParser
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  eu.pb4.placeholders.api.node.KeybindNode
 *  eu.pb4.placeholders.api.node.LiteralNode
 *  eu.pb4.placeholders.api.node.NbtNode
 *  eu.pb4.placeholders.api.node.ScoreNode
 *  eu.pb4.placeholders.api.node.SelectorNode
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.node.TranslatedNode
 *  eu.pb4.placeholders.api.node.parent.BoldNode
 *  eu.pb4.placeholders.api.node.parent.ClickActionNode
 *  eu.pb4.placeholders.api.node.parent.ColorNode
 *  eu.pb4.placeholders.api.node.parent.FontNode
 *  eu.pb4.placeholders.api.node.parent.FormattingNode
 *  eu.pb4.placeholders.api.node.parent.GradientNode
 *  eu.pb4.placeholders.api.node.parent.HoverNode
 *  eu.pb4.placeholders.api.node.parent.HoverNode$Action
 *  eu.pb4.placeholders.api.node.parent.HoverNode$EntityNodeContent
 *  eu.pb4.placeholders.api.node.parent.HoverNode$LazyItemStackNodeContent
 *  eu.pb4.placeholders.api.node.parent.InsertNode
 *  eu.pb4.placeholders.api.node.parent.ItalicNode
 *  eu.pb4.placeholders.api.node.parent.ObfuscatedNode
 *  eu.pb4.placeholders.api.node.parent.ParentNode
 *  eu.pb4.placeholders.api.node.parent.StrikethroughNode
 *  eu.pb4.placeholders.api.node.parent.TransformNode
 *  eu.pb4.placeholders.api.node.parent.UnderlinedNode
 *  minecraft.class00380
 *  minecraft.class00392
 *  minecraft.class00397
 *  minecraft.class00403
 *  minecraft.class00405
 *  minecraft.class00425
 *  minecraft.class00654
 *  minecraft.class01449
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04457
 *  minecraft.class05194
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07078
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07755
 *  minecraft.class08262
 */
package eu.pb4.placeholders.impl.textparser;

import com.google.gson.JsonParser;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import eu.pb4.placeholders.api.node.KeybindNode;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.NbtNode;
import eu.pb4.placeholders.api.node.ScoreNode;
import eu.pb4.placeholders.api.node.SelectorNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.TranslatedNode;
import eu.pb4.placeholders.api.node.parent.BoldNode;
import eu.pb4.placeholders.api.node.parent.ClickActionNode;
import eu.pb4.placeholders.api.node.parent.ColorNode;
import eu.pb4.placeholders.api.node.parent.FontNode;
import eu.pb4.placeholders.api.node.parent.FormattingNode;
import eu.pb4.placeholders.api.node.parent.GradientNode;
import eu.pb4.placeholders.api.node.parent.HoverNode;
import eu.pb4.placeholders.api.node.parent.InsertNode;
import eu.pb4.placeholders.api.node.parent.ItalicNode;
import eu.pb4.placeholders.api.node.parent.ObfuscatedNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.StrikethroughNode;
import eu.pb4.placeholders.api.node.parent.TransformNode;
import eu.pb4.placeholders.api.node.parent.UnderlinedNode;
import eu.pb4.placeholders.api.parsers.TextParserV1;
import eu.pb4.placeholders.api.parsers.TextParserV1$NodeList;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeValue;
import eu.pb4.placeholders.api.parsers.TextParserV1$TextTag;
import eu.pb4.placeholders.impl.GeneralUtils;
import eu.pb4.placeholders.impl.GeneralUtils$MutableTransformer;
import eu.pb4.placeholders.impl.textparser.TextParserImpl;
import eu.pb4.placeholders.impl.textparser.TextTagsV1$BooleanTag;
import eu.pb4.placeholders.impl.textparser.TextTagsV1$Wrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import minecraft.class00380;
import minecraft.class00392;
import minecraft.class00397;
import minecraft.class00403;
import minecraft.class00405;
import minecraft.class00425;
import minecraft.class00654;
import minecraft.class01449;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04457;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07078;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07755;
import minecraft.class08262;

@Deprecated(forRemoval=true)
public final class TextTagsV1 {
    private static TextParserV1$TagNodeBuilder wrap(TextTagsV1$Wrapper textTagsV1$Wrapper) {
        return (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            return new TextParserV1$TagNodeValue(textTagsV1$Wrapper.wrap(textParserV1$NodeList.nodes(), string2), textParserV1$NodeList.length());
        };
    }

    public static void register() {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
        hashMap.put("gold", List.of("orange"));
        hashMap.put("gray", List.of("grey"));
        hashMap.put("light_purple", List.of("pink"));
        hashMap.put("dark_gray", List.of("dark_grey"));
        for (class06541 class065412 : class06541.values()) {
            if (class065412.L()) continue;
            TextParserV1.registerDefault(TextParserV1$TextTag.of(class065412.R(), hashMap.containsKey(class065412.R()) ? (List)hashMap.get(class065412.R()) : List.of(), "color", true, TextTagsV1.wrap((textNodeArray, string) -> new FormattingNode(textNodeArray, class065412))));
        }
        TextParserV1.registerDefault(TextParserV1$TextTag.of("bold", List.of("b"), "formatting", true, TextTagsV1.bool(BoldNode::new)));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("underline", List.of("underlined", "u"), "formatting", true, TextTagsV1.bool(UnderlinedNode::new)));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("strikethrough", List.of("st"), "formatting", true, TextTagsV1.bool(StrikethroughNode::new)));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("obfuscated", List.of("obf", "matrix"), "formatting", true, TextTagsV1.bool(ObfuscatedNode::new)));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("italic", List.of("i", "em"), "formatting", true, TextTagsV1.bool(ItalicNode::new)));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("color", List.of("colour", "c"), "color", true, TextTagsV1.wrap((textNodeArray, string) -> new ColorNode(textNodeArray, (class05194)class05194.N((String)TextParserImpl.cleanArgument(string)).result().orElse(null)))));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("font", "other_formatting", false, TextTagsV1.wrap((textNodeArray, string) -> new FontNode(textNodeArray, class01894.L((String)TextParserImpl.cleanArgument(string))))));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("lang", List.of("translate"), "special", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TranslatedNode translatedNode = string2.split(":");
            if (((String[])translatedNode).length > 0) {
                ArrayList<ParentNode> arrayList = new ArrayList<ParentNode>();
                boolean bl = false;
                for (String string5 : translatedNode) {
                    if (!bl) {
                        bl = true;
                        continue;
                    }
                    arrayList.add(new ParentNode(TextParserImpl.parse(TextParserImpl.removeEscaping(TextParserImpl.cleanArgument(string5)), textParserV1$TagParserGetter)));
                }
                TranslatedNode translatedNode2 = TranslatedNode.of((String)TextParserImpl.removeEscaping(TextParserImpl.cleanArgument(translatedNode[0])), (Object[])arrayList.toArray(TextParserImpl.CASTER));
                return new TextParserV1$TagNodeValue((TextNode)translatedNode2, 0);
            }
            return TextParserV1$TagNodeValue.EMPTY;
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("lang_fallback", List.of("translatef", "langf", "translate_fallback"), "special", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TranslatedNode translatedNode = string2.split(":");
            if (((String[])translatedNode).length > 1) {
                ArrayList<ParentNode> arrayList = new ArrayList<ParentNode>();
                int n = 0;
                for (String string5 : translatedNode) {
                    if (n < 2) {
                        ++n;
                        continue;
                    }
                    arrayList.add(new ParentNode(TextParserImpl.parse(TextParserImpl.removeEscaping(TextParserImpl.cleanArgument(string5)), textParserV1$TagParserGetter)));
                }
                TranslatedNode translatedNode2 = TranslatedNode.ofFallback((String)TextParserImpl.removeEscaping(TextParserImpl.cleanArgument(translatedNode[0])), (String)TextParserImpl.removeEscaping(TextParserImpl.cleanArgument(translatedNode[1])), (Object[])arrayList.toArray(TextParserImpl.CASTER));
                return new TextParserV1$TagNodeValue((TextNode)translatedNode2, 0);
            }
            return TextParserV1$TagNodeValue.EMPTY;
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("keybind", List.of("key"), "special", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            if (!string2.isEmpty()) {
                return new TextParserV1$TagNodeValue((TextNode)new KeybindNode(TextParserImpl.cleanArgument(string2)), 0);
            }
            return TextParserV1$TagNodeValue.EMPTY;
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("click", "click_action", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            String[] stringArray = string2.split(":", 2);
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            if (stringArray.length > 1) {
                for (class00654 class006542 : class00654.values()) {
                    if (!class006542.method_15434().equals(TextParserImpl.cleanArgument(stringArray[0])) || !class006542.N()) continue;
                    return textParserV1$NodeList.value((TextNode)new ClickActionNode(textParserV1$NodeList.nodes(), class006542, (TextNode)new LiteralNode(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[1])))));
                }
            }
            return textParserV1$NodeList.value((TextNode)new ParentNode(textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("run_command", List.of("run_cmd"), "click_action", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            if (!string2.isEmpty()) {
                return textParserV1$NodeList.value((TextNode)new ClickActionNode(textParserV1$NodeList.nodes(), class00654.field_11750, (TextNode)new LiteralNode(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(string2)))));
            }
            return textParserV1$NodeList.value((TextNode)new ParentNode(textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("suggest_command", List.of("cmd"), "click_action", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            if (!string2.isEmpty()) {
                return textParserV1$NodeList.value((TextNode)new ClickActionNode(textParserV1$NodeList.nodes(), class00654.field_11745, (TextNode)new LiteralNode(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(string2)))));
            }
            return textParserV1$NodeList.value((TextNode)new ParentNode(textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("open_url", List.of("url"), "click_action", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            if (!string2.isEmpty()) {
                return textParserV1$NodeList.value((TextNode)new ClickActionNode(textParserV1$NodeList.nodes(), class00654.field_11749, (TextNode)new LiteralNode(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(string2)))));
            }
            return textParserV1$NodeList.value((TextNode)new ParentNode(textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("copy_to_clipboard", List.of("copy"), "click_action", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            if (!string2.isEmpty()) {
                return textParserV1$NodeList.value((TextNode)new ClickActionNode(textParserV1$NodeList.nodes(), class00654.field_21462, (TextNode)new LiteralNode(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(string2)))));
            }
            return textParserV1$NodeList.value((TextNode)new ParentNode(textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("change_page", List.of("page"), "click_action", true, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            if (!string2.isEmpty()) {
                return textParserV1$NodeList.value((TextNode)new ClickActionNode(textParserV1$NodeList.nodes(), class00654.field_11748, (TextNode)new LiteralNode(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(string2)))));
            }
            return textParserV1$NodeList.value((TextNode)new ParentNode(textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("hover", "hover_event", true, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList;
            block11: {
                String[] stringArray = string2.split(":", 2);
                textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
                try {
                    if (stringArray.length > 1) {
                        class00425 class004252 = class00425.field_46604.parse((DynamicOps)JsonOps.INSTANCE, (Object)JsonParser.parseString((String)TextParserImpl.cleanArgument(stringArray[0].toLowerCase(Locale.ROOT)))).result().orElse(null);
                        if (class004252 == class00425.field_24342) {
                            return textParserV1$NodeList.value((TextNode)new HoverNode(textParserV1$NodeList.nodes(), HoverNode.Action.TEXT_NODE, (Object)new ParentNode(TextParserImpl.parse(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[1])), textParserV1$TagParserGetter))));
                        }
                        if (class004252 == class00425.field_24344) {
                            if ((stringArray = stringArray[1].split(":", 3)).length == 3) {
                                return textParserV1$NodeList.value((TextNode)new HoverNode(textParserV1$NodeList.nodes(), HoverNode.Action.ENTITY_NODE, (Object)new HoverNode.EntityNodeContent(class07078.N((String)TextParserImpl.restoreOriginalEscaping(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[0])))).orElse(class07078.Nh), UUID.fromString(TextParserImpl.cleanArgument(stringArray[1])), (TextNode)new ParentNode(TextParserImpl.parse(TextParserImpl.restoreOriginalEscaping(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[2]))), textParserV1$TagParserGetter)))));
                            }
                            break block11;
                        }
                        if (class004252 == class00425.field_24343) {
                            try {
                                class07001 class070012 = class07755.N((String)TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[1])));
                                return textParserV1$NodeList.value((TextNode)new HoverNode(textParserV1$NodeList.nodes(), HoverNode.Action.LAZY_ITEM_STACK, (Object)new HoverNode.LazyItemStackNodeContent(class01894.N((String)class070012.y("id", "")), class070012.y("count") ? class070012.y("count", 1) : 1, (DynamicOps)class07713.N, class070012.y("components") ? (class07709)class070012.W("components").orElse(null) : null)));
                            }
                            catch (Throwable throwable) {
                                stringArray = stringArray[1].split(":", 2);
                                if (stringArray.length > 0) {
                                    class06584 class065842 = ((class06581)class04206.B.N(class01894.N((String)stringArray[0]))).E();
                                    if (stringArray.length > 1) {
                                        class065842.i(Integer.parseInt(stringArray[1]));
                                    }
                                    return textParserV1$NodeList.value((TextNode)new HoverNode(textParserV1$NodeList.nodes(), HoverNode.Action.VANILLA_ITEM_STACK, (Object)new class00380(class065842)));
                                }
                                break block11;
                            }
                        }
                        return textParserV1$NodeList.value((TextNode)new HoverNode(textParserV1$NodeList.nodes(), HoverNode.Action.TEXT_NODE, (Object)new ParentNode(TextParserImpl.parse(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(string2)), textParserV1$TagParserGetter))));
                    }
                    return textParserV1$NodeList.value((TextNode)new HoverNode(textParserV1$NodeList.nodes(), HoverNode.Action.TEXT_NODE, (Object)new ParentNode(TextParserImpl.parse(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(string2)), textParserV1$TagParserGetter))));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            return textParserV1$NodeList.value((TextNode)new ParentNode(textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("insert", List.of("insertion"), "click_action", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            return textParserV1$NodeList.value((TextNode)new InsertNode(textParserV1$NodeList.nodes(), (TextNode)new LiteralNode(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(string2)))));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("clear_color", List.of("uncolor", "colorless"), "special", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            return textParserV1$NodeList.value(GeneralUtils.removeColors((TextNode)new ParentNode(textParserV1$NodeList.nodes())));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("rainbow", List.of("rb"), "gradient", true, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            String[] stringArray = string2.split(":");
            float f = 1.0f;
            float f2 = 1.0f;
            float f3 = 0.0f;
            int n = -1;
            if (stringArray.length >= 1) {
                try {
                    f = Float.parseFloat(stringArray[0]);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (stringArray.length >= 2) {
                try {
                    f2 = Float.parseFloat(stringArray[1]);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (stringArray.length >= 3) {
                try {
                    f3 = Float.parseFloat(stringArray[2]);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (stringArray.length >= 4) {
                try {
                    n = Integer.parseInt(stringArray[3]);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            return textParserV1$NodeList.value((TextNode)(n < 0 ? GradientNode.rainbow((float)f2, (float)1.0f, (float)f, (float)f3, (TextNode[])textParserV1$NodeList.nodes()) : GradientNode.rainbow((float)f2, (float)1.0f, (float)f, (float)f3, (int)n, (TextNode[])textParserV1$NodeList.nodes())));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("gradient", List.of("gr"), "gradient", true, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            String[] stringArray = string2.split(":");
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            ArrayList arrayList = new ArrayList();
            for (String string5 : stringArray) {
                class05194.N((String)string5).result().ifPresent(arrayList::add);
            }
            return textParserV1$NodeList.value((TextNode)GradientNode.colors(arrayList, (TextNode[])textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("hard_gradient", List.of("hgr"), "gradient", true, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            String[] stringArray = string2.split(":");
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            ArrayList arrayList = new ArrayList();
            for (String string5 : stringArray) {
                class05194.N((String)string5).result().ifPresent(arrayList::add);
            }
            if (arrayList.isEmpty()) {
                return textParserV1$NodeList.value((TextNode)new ParentNode(textParserV1$NodeList.nodes()));
            }
            return textParserV1$NodeList.value((TextNode)GradientNode.colorsHard(arrayList, (TextNode[])textParserV1$NodeList.nodes()));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("clear", "special", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            String[] stringArray = string2.isEmpty() ? new String[]{} : string2.split(":");
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            return textParserV1$NodeList.value((TextNode)new TransformNode(textParserV1$NodeList.nodes(), TextTagsV1.getTransform(stringArray)));
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("score", "special", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            String[] stringArray = string2.split(":");
            if (stringArray.length == 2) {
                return new TextParserV1$TagNodeValue((TextNode)new ScoreNode(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[0])), TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[1]))), 0);
            }
            return TextParserV1$TagNodeValue.EMPTY;
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("selector", "special", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            String[] stringArray = string2.split(":");
            String string5 = TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[0]));
            Optional optional = class08262.N((String)string5).result();
            if (optional.isEmpty()) {
                return TextParserV1$TagNodeValue.EMPTY;
            }
            if (stringArray.length == 2) {
                return new TextParserV1$TagNodeValue((TextNode)new SelectorNode((class08262)optional.get(), Optional.of(TextNode.asSingle((TextNode[])TextParserImpl.recursiveParsing(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[1])), textParserV1$TagParserGetter, null).nodes()))), 0);
            }
            if (stringArray.length == 1) {
                return new TextParserV1$TagNodeValue((TextNode)new SelectorNode((class08262)optional.get(), Optional.empty()), 0);
            }
            return TextParserV1$TagNodeValue.EMPTY;
        }));
        TextParserV1.registerDefault(TextParserV1$TextTag.of("nbt", "special", false, (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            class00397 class003972;
            String[] stringArray = string2.split(":");
            if (stringArray.length < 3) {
                return TextParserV1$TagNodeValue.EMPTY;
            }
            String string5 = TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[1]));
            switch (stringArray[0]) {
                case "block": {
                    class00397 class003973 = new class00397(string5);
                    break;
                }
                case "entity": {
                    class00397 class003973 = new class00403(string5);
                    break;
                }
                case "storage": {
                    class00397 class003973 = new class01449(class01894.L((String)string5));
                    break;
                }
                default: {
                    class00397 class003973 = class003972 = null;
                }
            }
            if (class003972 == null) {
                return TextParserV1$TagNodeValue.EMPTY;
            }
            Object object = stringArray.length > 3 ? Optional.of(TextNode.asSingle((TextNode[])TextParserImpl.recursiveParsing(TextParserImpl.restoreOriginalEscaping(TextParserImpl.cleanArgument(stringArray[3])), textParserV1$TagParserGetter, null).nodes())) : Optional.empty();
            boolean bl = stringArray.length > 4 && Boolean.parseBoolean(stringArray[4]);
            return new TextParserV1$TagNodeValue((TextNode)new NbtNode(stringArray[2], bl, (Optional)object, (class04457)class003972), 0);
        }));
    }

    private static TextParserV1$TagNodeBuilder bool(TextTagsV1$BooleanTag textTagsV1$BooleanTag) {
        return (string, string2, string3, textParserV1$TagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserImpl.recursiveParsing(string3, textParserV1$TagParserGetter, string4);
            return new TextParserV1$TagNodeValue(textTagsV1$BooleanTag.wrap(textParserV1$NodeList.nodes(), TextTagsV1.isntFalse(string2)), textParserV1$NodeList.length());
        };
    }

    private static Function<class05216, class00392> getTransform(String[] stringArray) {
        if (stringArray.length == 0) {
            return GeneralUtils$MutableTransformer.CLEAR;
        }
        Function<class00405, class00405> function = class004052 -> class004052;
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            String string;
            function = function.andThen(switch (string = stringArray2[i]) {
                case "hover" -> class004052 -> class004052.N(null);
                case "click" -> class004052 -> class004052.N(null);
                case "color" -> class004052 -> class004052.N((class05194)null);
                case "insertion" -> class004052 -> class004052.N(null);
                case "font" -> class004052 -> class004052.N(null);
                case "bold" -> class004052 -> class004052.N(null);
                case "italic" -> class004052 -> class004052.y(null);
                case "underline" -> class004052 -> class004052.L(null);
                case "strikethrough" -> class004052 -> class004052.u(null);
                case "all" -> class004052 -> class00405.N;
                default -> class004052 -> class004052;
            });
        }
        return new GeneralUtils$MutableTransformer(function);
    }

    private static boolean isntFalse(String string) {
        return string.isEmpty() || !string.equals("false");
    }
}

