/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DynamicOps
 *  eu.pb4.placeholders.api.arguments.SimpleArguments
 *  eu.pb4.placeholders.api.arguments.StringArgs
 *  eu.pb4.placeholders.api.node.DynamicPlayerHeadNode
 *  eu.pb4.placeholders.api.node.DynamicPlayerHeadNode$Type
 *  eu.pb4.placeholders.api.node.KeybindNode
 *  eu.pb4.placeholders.api.node.NbtNode
 *  eu.pb4.placeholders.api.node.ObjectNode
 *  eu.pb4.placeholders.api.node.ScoreNode
 *  eu.pb4.placeholders.api.node.SelectorNode
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.node.TranslatedNode
 *  eu.pb4.placeholders.api.node.parent.BoldNode
 *  eu.pb4.placeholders.api.node.parent.ClickActionNode
 *  eu.pb4.placeholders.api.node.parent.DynamicColorNode
 *  eu.pb4.placeholders.api.node.parent.DynamicShadowNode
 *  eu.pb4.placeholders.api.node.parent.FontNode
 *  eu.pb4.placeholders.api.node.parent.GradientNode
 *  eu.pb4.placeholders.api.node.parent.GradientNode$GradientProvider
 *  eu.pb4.placeholders.api.node.parent.HoverNode
 *  eu.pb4.placeholders.api.node.parent.HoverNode$Action
 *  eu.pb4.placeholders.api.node.parent.HoverNode$EntityNodeContent
 *  eu.pb4.placeholders.api.node.parent.HoverNode$LazyItemStackNodeContent
 *  eu.pb4.placeholders.api.node.parent.InsertNode
 *  eu.pb4.placeholders.api.node.parent.ItalicNode
 *  eu.pb4.placeholders.api.node.parent.ObfuscatedNode
 *  eu.pb4.placeholders.api.node.parent.ParentNode
 *  eu.pb4.placeholders.api.node.parent.ShadowNode
 *  eu.pb4.placeholders.api.node.parent.StrikethroughNode
 *  eu.pb4.placeholders.api.node.parent.StyledNode
 *  eu.pb4.placeholders.api.node.parent.StyledNode$HoverData
 *  eu.pb4.placeholders.api.node.parent.TransformNode
 *  eu.pb4.placeholders.api.node.parent.UnderlinedNode
 *  minecraft.class00392
 *  minecraft.class00397
 *  minecraft.class00403
 *  minecraft.class00405
 *  minecraft.class00411
 *  minecraft.class00654
 *  minecraft.class00926
 *  minecraft.class00942
 *  minecraft.class01449
 *  minecraft.class01894
 *  minecraft.class02689
 *  minecraft.class04457
 *  minecraft.class05194
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06609
 *  minecraft.class07001
 *  minecraft.class07078
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07755
 *  minecraft.class08262
 */
package eu.pb4.placeholders.impl.textparser;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import eu.pb4.placeholders.api.arguments.SimpleArguments;
import eu.pb4.placeholders.api.arguments.StringArgs;
import eu.pb4.placeholders.api.node.DynamicPlayerHeadNode;
import eu.pb4.placeholders.api.node.KeybindNode;
import eu.pb4.placeholders.api.node.NbtNode;
import eu.pb4.placeholders.api.node.ObjectNode;
import eu.pb4.placeholders.api.node.ScoreNode;
import eu.pb4.placeholders.api.node.SelectorNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.TranslatedNode;
import eu.pb4.placeholders.api.node.parent.BoldNode;
import eu.pb4.placeholders.api.node.parent.ClickActionNode;
import eu.pb4.placeholders.api.node.parent.DynamicColorNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode;
import eu.pb4.placeholders.api.node.parent.FontNode;
import eu.pb4.placeholders.api.node.parent.GradientNode;
import eu.pb4.placeholders.api.node.parent.HoverNode;
import eu.pb4.placeholders.api.node.parent.InsertNode;
import eu.pb4.placeholders.api.node.parent.ItalicNode;
import eu.pb4.placeholders.api.node.parent.ObfuscatedNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.ShadowNode;
import eu.pb4.placeholders.api.node.parent.StrikethroughNode;
import eu.pb4.placeholders.api.node.parent.StyledNode;
import eu.pb4.placeholders.api.node.parent.TransformNode;
import eu.pb4.placeholders.api.node.parent.UnderlinedNode;
import eu.pb4.placeholders.api.parsers.tag.NodeCreator;
import eu.pb4.placeholders.api.parsers.tag.SimpleTags;
import eu.pb4.placeholders.api.parsers.tag.TagRegistry;
import eu.pb4.placeholders.api.parsers.tag.TextTag;
import eu.pb4.placeholders.impl.GeneralUtils;
import eu.pb4.placeholders.impl.GeneralUtils$MutableTransformer;
import eu.pb4.placeholders.impl.StringArgOps;
import eu.pb4.placeholders.impl.textparser.TextParserImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00397;
import minecraft.class00403;
import minecraft.class00405;
import minecraft.class00411;
import minecraft.class00654;
import minecraft.class00926;
import minecraft.class00942;
import minecraft.class01449;
import minecraft.class01894;
import minecraft.class02689;
import minecraft.class04457;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06609;
import minecraft.class07001;
import minecraft.class07078;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07755;
import minecraft.class08262;

public final class BuiltinTags {
    public static final class05194 DEFAULT_COLOR = class05194.N((class06541)class06541.field_1068);

    public static void register() {
        class01894 class018942 = new HashMap();
        class018942.put(class06541.field_1065, List.of("orange"));
        class018942.put(class06541.field_1080, List.of("grey", "light_gray", "light_grey"));
        class018942.put(class06541.field_1076, List.of("pink"));
        class018942.put(class06541.field_1064, List.of("purple"));
        class018942.put(class06541.field_1063, List.of("dark_grey"));
        HashMap<String, class05194> hashMap = new HashMap<String, class05194>();
        for (class06541 class065412 : class06541.values()) {
            if (class065412.L()) continue;
            List<String> list = class018942.getOrDefault(class065412, List.of());
            for (String string : list) {
                hashMap.put(string, class05194.N((class06541)class065412));
            }
            TagRegistry.registerDefault(SimpleTags.color(class065412.R(), list, class065412));
        }
        Function function = DynamicColorNode.extendedTextColorParse(hashMap::get);
        TagRegistry.registerDefault(TextTag.enclosing("bold", List.of("b"), "formatting", true, NodeCreator.bool(BoldNode::new)));
        TagRegistry.registerDefault(TextTag.enclosing("underline", List.of("underlined", "u"), "formatting", true, NodeCreator.bool(UnderlinedNode::new)));
        TagRegistry.registerDefault(TextTag.enclosing("strikethrough", List.of("st"), "formatting", true, NodeCreator.bool(StrikethroughNode::new)));
        TagRegistry.registerDefault(TextTag.enclosing("obfuscated", List.of("obf", "matrix"), "formatting", true, NodeCreator.bool(ObfuscatedNode::new)));
        TagRegistry.registerDefault(TextTag.enclosing("italic", List.of("i", "em"), "formatting", true, NodeCreator.bool(ItalicNode::new)));
        TagRegistry.registerDefault(TextTag.enclosing("color", List.of("colour", "c"), "color", true, (textNodeArray, stringArgs, nodeParser) -> new DynamicColorNode(textNodeArray, nodeParser.parseNode(stringArgs.get("value", 0, "white")), function)));
        TagRegistry.registerDefault(TextTag.enclosing("shadow", List.of("shadow_color"), "color", false, (textNodeArray, stringArgs, nodeParser) -> {
            try {
                int n;
                if (stringArgs.contains("scale") && stringArgs.size() == 1) {
                    return new DynamicShadowNode(textNodeArray, Float.parseFloat(stringArgs.get("scale", "0")), 1.0f);
                }
                String string = stringArgs.get("value", 0);
                if (string == null) {
                    return new DynamicShadowNode(textNodeArray);
                }
                if (string.startsWith("#")) {
                    n = Integer.parseUnsignedInt(string.substring(1), 16);
                    if (string.length() == 7) {
                        n = n & 0xFFFFFF | 0xFF000000;
                    }
                } else {
                    n = ((class05194)function.apply(string)).N() | 0xFF000000;
                }
                return new ShadowNode(textNodeArray, n);
            }
            catch (Throwable throwable) {
                return new ParentNode(textNodeArray);
            }
        }));
        TagRegistry.registerDefault(TextTag.enclosing("font", "other_formatting", false, (textNodeArray, stringArgs, nodeParser) -> {
            Object object = stringArgs.get("value");
            if (object == null) {
                if (stringArgs.size() > 1) {
                    object = stringArgs.getNext("key", "minecraft") + ":" + stringArgs.getNext("path", "");
                } else {
                    object = stringArgs.getNext("val");
                    if (object == null) {
                        object = stringArgs.input().strip();
                    }
                }
            }
            return new FontNode(textNodeArray, class01894.L((String)object));
        }));
        class018942 = class01894.N((String)"");
        TagRegistry.registerDefault(TextTag.self("atlas", "special", false, (textNodeArray, stringArgs, nodeParser) -> {
            class01894 class018943 = Objects.requireNonNullElse(class01894.L((String)stringArgs.getNext("atlas", "")), class018942);
            class01894 class018944 = Objects.requireNonNullElse(class01894.L((String)stringArgs.getNext("texture", "")), class018942);
            return new ObjectNode((class00926)new class00942(class018943, class018944));
        }));
        class018942 = class01894.N((String)"");
        TagRegistry.registerDefault(TextTag.self("player", "special", false, (textNodeArray, stringArgs, nodeParser) -> {
            boolean bl = SimpleArguments.bool((String)stringArgs.get("hat"), (boolean)true);
            String string = stringArgs.get("texture");
            if (string != null) {
                PropertyMap propertyMap = new PropertyMap((Multimap)ImmutableMultimap.of((Object)"textures", (Object)new Property("textures", string, null)));
                return new ObjectNode((class00926)new class06609(class02689.N((GameProfile)new GameProfile(class07536.R, "", propertyMap)), bl));
            }
            String string2 = stringArgs.getNext("name", "");
            String string3 = stringArgs.get("uuid");
            if (string3 != null) {
                return new DynamicPlayerHeadNode(nodeParser.parseNode(string3), bl, DynamicPlayerHeadNode.Type.UUID);
            }
            UUID uUID = null;
            if (string3 == null) {
                try {
                    uUID = UUID.fromString(string2);
                }
                catch (Throwable throwable) {}
            } else {
                try {
                    uUID = UUID.fromString(string3);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            if (uUID != null) {
                try {
                    return new ObjectNode((class00926)new class06609(class02689.N((UUID)uUID), bl));
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            if (string2 != null) {
                return new DynamicPlayerHeadNode(nodeParser.parseNode(string2), bl, DynamicPlayerHeadNode.Type.EITHER);
            }
            return new ObjectNode((class00926)new class06609(class02689.N((String)""), bl));
        }));
        TagRegistry.registerDefault(TextTag.self("lang", List.of("translate"), "special", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                String string;
                String string2 = stringArgs.getNext("key");
                String string3 = stringArgs.get("fallback");
                ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
                int n = 0;
                while ((string = stringArgs.getNext("" + n++)) != null) {
                    arrayList.add(nodeParser.parseNode(string));
                }
                return TranslatedNode.ofFallback((String)string2, (String)string3, (Object[])arrayList.toArray(TextParserImpl.CASTER));
            }
            return TextNode.empty();
        }));
        TagRegistry.registerDefault(TextTag.self("lang_fallback", List.of("translatef", "langf", "translate_fallback"), "special", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                String string;
                String string2 = stringArgs.getNext("key");
                String string3 = stringArgs.getNext("fallback");
                ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
                int n = 0;
                while ((string = stringArgs.getNext("" + n++)) != null) {
                    arrayList.add(nodeParser.parseNode(string));
                }
                return TranslatedNode.ofFallback((String)string2, (String)string3, (Object[])arrayList.toArray(TextParserImpl.CASTER));
            }
            return TextNode.empty();
        }));
        TagRegistry.registerDefault(TextTag.self("keybind", List.of("key"), "special", false, stringArgs -> new KeybindNode(stringArgs.getNext("value", ""))));
        TagRegistry.registerDefault(TextTag.enclosing("click", "click_action", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                String string = stringArgs.getNext("type");
                String string2 = stringArgs.getNext("value", "");
                String string3 = stringArgs.getNext("data", null);
                StringArgs stringArgs2 = stringArgs.getNested("data");
                for (class00654 class006542 : class00654.values()) {
                    if (!class006542.method_15434().equals(string) || !class006542.N()) continue;
                    return new ClickActionNode(textNodeArray, class006542, nodeParser.parseNode(string2), string3 != null ? Either.left((Object)nodeParser.parseNode(string3)) : (stringArgs2 != null ? Either.right((Object)stringArgs2) : null));
                }
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("show_dialog", "click_action", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                return new ClickActionNode(textNodeArray, class00654.field_60821, nodeParser.parseNode(stringArgs.get("value", 0, "")));
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("custom_click", List.of("click"), "click_action", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                String string = stringArgs.get("value", 0, "");
                String string2 = stringArgs.get("data", 1);
                StringArgs stringArgs2 = stringArgs.getNested("data");
                return new ClickActionNode(textNodeArray, class00654.field_60822, nodeParser.parseNode(string), string2 != null ? Either.left((Object)nodeParser.parseNode(string2)) : (stringArgs2 != null ? Either.right((Object)stringArgs2) : null));
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("run_command", List.of("run_cmd"), "click_action", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                return new ClickActionNode(textNodeArray, class00654.field_11750, nodeParser.parseNode(stringArgs.get("value", 0, "")));
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("suggest_command", List.of("cmd"), "click_action", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                return new ClickActionNode(textNodeArray, class00654.field_11745, nodeParser.parseNode(stringArgs.getNext("value", "")));
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("open_url", List.of("url"), "click_action", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                return new ClickActionNode(textNodeArray, class00654.field_11749, nodeParser.parseNode(stringArgs.get("value", 0, "")));
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("copy_to_clipboard", List.of("copy"), "click_action", false, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                return new ClickActionNode(textNodeArray, class00654.field_21462, nodeParser.parseNode(stringArgs.get("value", 0)));
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("change_page", List.of("page"), "click_action", true, (textNodeArray, stringArgs, nodeParser) -> {
            if (!stringArgs.isEmpty()) {
                return new ClickActionNode(textNodeArray, class00654.field_11748, nodeParser.parseNode(stringArgs.get("value", 0)));
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("hover", "hover_event", true, (textNodeArray, stringArgs, nodeParser) -> {
            block22: {
                try {
                    String string = stringArgs.get("type");
                    if (string != null || stringArgs.size() > 1) {
                        if (string == null) {
                            string = stringArgs.getNext("type", "");
                        }
                        switch (string = string.toLowerCase(Locale.ROOT)) {
                            case "show_text": 
                            case "text": {
                                return new HoverNode(textNodeArray, HoverNode.Action.TEXT_NODE, (Object)nodeParser.parseNode(stringArgs.getNext("value", "")));
                            }
                            case "show_entity": 
                            case "entity": {
                                String string2 = stringArgs.getNext("entity", "");
                                String string3 = stringArgs.getNext("uuid", class07536.R.toString());
                                return new HoverNode(textNodeArray, HoverNode.Action.ENTITY_NODE, (Object)new HoverNode.EntityNodeContent(class07078.N((String)string2).orElse(class07078.Nh), UUID.fromString(string3), (TextNode)new ParentNode(new TextNode[]{nodeParser.parseNode(stringArgs.get("name", 3, ""))})));
                            }
                            case "show_item": 
                            case "item": {
                                String string4 = stringArgs.getNext("value", "");
                                try {
                                    class07001 class070012 = class07755.N((String)string4);
                                    return new HoverNode(textNodeArray, HoverNode.Action.LAZY_ITEM_STACK, (Object)new HoverNode.LazyItemStackNodeContent(class01894.N((String)class070012.y("id", "")), class070012.y("count") ? class070012.y("count", 1) : 1, (DynamicOps)class07713.N, class070012.y("components") ? (class07709)class070012.W("components").orElse(null) : null));
                                }
                                catch (Throwable throwable) {
                                    try {
                                        class01894 class018942 = class01894.N((String)stringArgs.get("item", string4));
                                        int n = 1;
                                        String string5 = stringArgs.getNext("count", "1");
                                        if (string5 != null) {
                                            n = Integer.parseInt(string5);
                                        }
                                        return new HoverNode(textNodeArray, HoverNode.Action.LAZY_ITEM_STACK, (Object)new HoverNode.LazyItemStackNodeContent(class018942, n, (DynamicOps)StringArgOps.INSTANCE, (Object)Either.right((Object)stringArgs.getNestedOrEmpty("components"))));
                                    }
                                    catch (Throwable throwable2) {
                                        break;
                                    }
                                }
                            }
                            default: {
                                return new HoverNode(textNodeArray, HoverNode.Action.TEXT_NODE, (Object)nodeParser.parseNode(stringArgs.get("value", string)));
                            }
                        }
                        break block22;
                    }
                    return new HoverNode(textNodeArray, HoverNode.Action.TEXT_NODE, (Object)nodeParser.parseNode(stringArgs.getNext("value")));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            return new ParentNode(textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("insert", List.of("insertion"), "click_action", false, (textNodeArray, stringArgs, nodeParser) -> new InsertNode(textNodeArray, nodeParser.parseNode(stringArgs.get("value", 0)))));
        TagRegistry.registerDefault(TextTag.enclosing("clear_color", List.of("uncolor", "colorless"), "special", false, (textNodeArray, stringArgs, nodeParser) -> GeneralUtils.removeColors(TextNode.asSingle((TextNode[])textNodeArray))));
        TagRegistry.registerDefault(TextTag.enclosing("rainbow", List.of("rb"), "gradient", true, (textNodeArray, stringArgs, nodeParser) -> {
            String string = stringArgs.get("type", "");
            float f = SimpleArguments.floatNumber((String)stringArgs.getNext("frequency", stringArgs.get("freq", stringArgs.get("f"))), (float)1.0f);
            float f2 = SimpleArguments.floatNumber((String)stringArgs.getNext("saturation", stringArgs.get("sat", stringArgs.get("s"))), (float)1.0f);
            float f3 = SimpleArguments.floatNumber((String)stringArgs.getNext("offset", stringArgs.get("off", stringArgs.get("o"))), (float)0.0f);
            int n = SimpleArguments.intNumber((String)stringArgs.getNext("length", stringArgs.get("len", stringArgs.get("l"))), (int)-1);
            int n2 = SimpleArguments.intNumber((String)stringArgs.get("value", stringArgs.get("val", stringArgs.get("v"))), (int)1);
            return new GradientNode(textNodeArray, switch (string) {
                case "oklab", "okhcl" -> {
                    if (n < 0) {
                        yield GradientNode.GradientProvider.rainbowOkLch((float)f2, (float)n2, (float)f, (float)f3);
                    }
                    yield GradientNode.GradientProvider.rainbowOkLch((float)f2, (float)n2, (float)f, (float)f3, (int)n);
                }
                case "hvs" -> {
                    if (n < 0) {
                        yield GradientNode.GradientProvider.rainbowHvs((float)f2, (float)n2, (float)f, (float)f3);
                    }
                    yield GradientNode.GradientProvider.rainbowHvs((float)f2, (float)n2, (float)f, (float)f3, (int)n);
                }
                default -> n < 0 ? GradientNode.GradientProvider.rainbow((float)f2, (float)n2, (float)f, (float)f3) : GradientNode.GradientProvider.rainbow((float)f2, (float)n2, (float)f, (float)f3, (int)n);
            });
        }));
        TagRegistry.registerDefault(TextTag.enclosing("gradient", List.of("gr"), "gradient", true, (textNodeArray, stringArgs, nodeParser) -> {
            String string;
            ArrayList arrayList = new ArrayList();
            int n = 0;
            String string2 = stringArgs.get("type", "");
            while ((string = stringArgs.getNext("" + n)) != null) {
                class05194.N((String)string).result().ifPresent(arrayList::add);
            }
            return new GradientNode(textNodeArray, switch (string2) {
                case "oklab" -> GradientNode.GradientProvider.colorsOkLab(arrayList);
                case "hvs" -> GradientNode.GradientProvider.colorsHvs(arrayList);
                case "hard" -> GradientNode.GradientProvider.colorsHard(arrayList);
                default -> GradientNode.GradientProvider.colors(arrayList);
            });
        }));
        TagRegistry.registerDefault(TextTag.enclosing("hard_gradient", List.of("hgr"), "gradient", true, (textNodeArray, stringArgs, nodeParser) -> {
            String string;
            ArrayList arrayList = new ArrayList();
            int n = 0;
            while ((string = stringArgs.getNext("" + n)) != null) {
                class05194.N((String)string).result().ifPresent(arrayList::add);
            }
            if (arrayList.isEmpty()) {
                return new ParentNode(textNodeArray);
            }
            return GradientNode.colorsHard(arrayList, (TextNode[])textNodeArray);
        }));
        TagRegistry.registerDefault(TextTag.enclosing("clear", "special", false, (textNodeArray, stringArgs, nodeParser) -> new TransformNode(textNodeArray, BuiltinTags.getTransform(stringArgs))));
        TagRegistry.registerDefault(TextTag.enclosing("rawstyle", "special", false, (textNodeArray, stringArgs, nodeParser) -> {
            DataResult dataResult = class00411.y.decode((DynamicOps)StringArgOps.INSTANCE, (Object)Either.right((Object)stringArgs));
            if (dataResult.error().isPresent()) {
                System.out.println(((DataResult.Error)dataResult.error().get()).message());
                return TextNode.asSingle((TextNode[])textNodeArray);
            }
            return new StyledNode(textNodeArray, (class00405)((Pair)dataResult.result().get()).getFirst(), (StyledNode.HoverData)null, null, null);
        }));
        TagRegistry.registerDefault(TextTag.self("score", "special", false, (textNodeArray, stringArgs, nodeParser) -> new ScoreNode(stringArgs.getNext("name", ""), stringArgs.getNext("objective", ""))));
        TagRegistry.registerDefault(TextTag.self("selector", "special", false, (textNodeArray, stringArgs, nodeParser) -> {
            String string = stringArgs.getNext("pattern", "@p");
            String string2 = stringArgs.getNext("separator");
            Optional optional = class08262.N((String)string).result();
            if (optional.isEmpty()) {
                return TextNode.empty();
            }
            return new SelectorNode((class08262)optional.get(), string2 != null ? Optional.of(TextNode.of((String)string2)) : Optional.empty());
        }));
        TagRegistry.registerDefault(TextTag.self("nbt", "special", false, (textNodeArray, stringArgs, nodeParser) -> {
            class00397 class003972;
            String string = stringArgs.getNext("source", "");
            String string2 = stringArgs.getNext("path", "");
            switch (string) {
                case "block": {
                    class00397 class003973 = new class00397(string2);
                    break;
                }
                case "entity": {
                    class00397 class003973 = new class00403(string2);
                    break;
                }
                case "storage": {
                    class00397 class003973 = new class01449(class01894.L((String)string2));
                    break;
                }
                default: {
                    class00397 class003973 = class003972 = null;
                }
            }
            if (class003972 == null) {
                return TextNode.empty();
            }
            String string3 = stringArgs.getNext("separator");
            Optional optional = string3 != null ? Optional.of(TextNode.asSingle((TextNode[])new TextNode[]{nodeParser.parseNode(string3)})) : Optional.empty();
            boolean bl = SimpleArguments.bool((String)stringArgs.getNext("interpret"), (boolean)false);
            return new NbtNode(string2, bl, optional, (class04457)class003972);
        }));
    }

    private static Function<class05216, class00392> getTransform(StringArgs stringArgs) {
        if (stringArgs.isEmpty()) {
            return GeneralUtils$MutableTransformer.CLEAR;
        }
        Function<class00405, class00405> function = class004052 -> class004052;
        Iterator iterator = stringArgs.ordered().iterator();
        while (iterator.hasNext()) {
            String string;
            function = function.andThen(switch (string = (String)iterator.next()) {
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
        return SimpleArguments.bool((String)string, (boolean)string.isEmpty());
    }
}

