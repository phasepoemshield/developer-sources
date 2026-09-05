/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.KeybindNode
 *  eu.pb4.placeholders.api.node.LiteralNode
 *  eu.pb4.placeholders.api.node.NbtNode
 *  eu.pb4.placeholders.api.node.ObjectNode
 *  eu.pb4.placeholders.api.node.ScoreNode
 *  eu.pb4.placeholders.api.node.SelectorNode
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.node.TranslatedNode
 *  eu.pb4.placeholders.api.node.parent.ColorNode
 *  eu.pb4.placeholders.api.node.parent.DynamicShadowNode
 *  eu.pb4.placeholders.api.node.parent.FormattingNode
 *  eu.pb4.placeholders.api.node.parent.GradientNode$GradientProvider
 *  eu.pb4.placeholders.api.node.parent.HoverNode$Action
 *  eu.pb4.placeholders.api.node.parent.HoverNode$EntityNodeContent
 *  eu.pb4.placeholders.api.node.parent.ParentNode
 *  eu.pb4.placeholders.api.node.parent.ParentTextNode
 *  eu.pb4.placeholders.api.node.parent.StyledNode
 *  eu.pb4.placeholders.api.node.parent.StyledNode$HoverData
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00380
 *  minecraft.class00388
 *  minecraft.class00391
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class00413
 *  minecraft.class00414
 *  minecraft.class00418
 *  minecraft.class00421
 *  minecraft.class00623
 *  minecraft.class00625
 *  minecraft.class00627
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class00661
 *  minecraft.class00923
 *  minecraft.class01725
 *  minecraft.class01751
 *  minecraft.class02484
 *  minecraft.class04439
 *  minecraft.class05194
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06584
 *  net.fabricmc.loader.api.FabricLoader
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package eu.pb4.placeholders.impl;

import eu.pb4.placeholders.api.node.KeybindNode;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.NbtNode;
import eu.pb4.placeholders.api.node.ObjectNode;
import eu.pb4.placeholders.api.node.ScoreNode;
import eu.pb4.placeholders.api.node.SelectorNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.TranslatedNode;
import eu.pb4.placeholders.api.node.parent.ColorNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode;
import eu.pb4.placeholders.api.node.parent.FormattingNode;
import eu.pb4.placeholders.api.node.parent.GradientNode;
import eu.pb4.placeholders.api.node.parent.HoverNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.node.parent.StyledNode;
import eu.pb4.placeholders.impl.GeneralUtils$TextLengthPair;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00380;
import minecraft.class00388;
import minecraft.class00391;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00413;
import minecraft.class00414;
import minecraft.class00418;
import minecraft.class00421;
import minecraft.class00623;
import minecraft.class00625;
import minecraft.class00627;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class00661;
import minecraft.class00923;
import minecraft.class01725;
import minecraft.class01751;
import minecraft.class02484;
import minecraft.class04439;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralUtils {
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"Text Placeholder API");
    public static final boolean IS_DEV = FabricLoader.getInstance().isDevelopmentEnvironment();
    public static final TextNode[] CASTER = new TextNode[0];

    public static boolean isEmpty(class00392 class003922) {
        class01725 class017252;
        class04439 class044392;
        return (class003922.method_10851() == class01751.L || (class044392 = class003922.method_10851()) instanceof class01725 && (class017252 = (class01725)class044392).comp_737().isEmpty()) && class003922.method_10855().isEmpty();
    }

    public static class05216 toGradientShadow(class00392 class003923, float f, float f2, GradientNode.GradientProvider gradientProvider) {
        return GeneralUtils.recursiveGradient(class003923, gradientProvider, 0, GeneralUtils.getGradientLength(class003923), class003922 -> class003922.method_10866().y() == null && class003922.method_10866().N() == null, (class004052, class051942) -> class004052.y(DynamicShadowNode.modifiedColor((int)class051942.N(), (float)f, (float)f2)), class003922 -> class003922.method_10866().y() != null ? class003922.L() : GeneralUtils.cloneTransformText(class003922, class052162 -> {
            class05194 class051942 = class052162.method_10866().N();
            return class052162.y(class052162.method_10866().y(DynamicShadowNode.modifiedColor((int)Objects.requireNonNull(class051942).N(), (float)f, (float)f2)));
        }, class003923 -> class003923 == class003922 || class003923.method_10866().y() == null && class003923.method_10866().N() != null)).text();
    }

    public static class05216 cloneTransformText(class00392 class003922, Function<class05216, class05216> function, Predicate<class00392> predicate) {
        class05216 class052162;
        if (!predicate.test(class003922)) {
            return class003922.L();
        }
        Object object3 = class003922.method_10851();
        if (object3 instanceof class00388) {
            class00388 class003882 = (class00388)object3;
            object3 = new ArrayList();
            for (Object object2 : class003882.u()) {
                if (object2 instanceof class00392) {
                    class00392 class003923 = (class00392)object2;
                    ((ArrayList)object3).add(GeneralUtils.cloneTransformText(class003923, function));
                    continue;
                }
                ((ArrayList)object3).add(object2);
            }
            class052162 = class00392.N((String)class003882.y(), (Object[])((ArrayList)object3).toArray());
        } else {
            class052162 = class003922.y();
        }
        for (Object object3 : class003922.method_10855()) {
            class052162.y((class00392)GeneralUtils.cloneTransformText((class00392)object3, function, predicate));
        }
        class052162.y(class003922.method_10866());
        return function.apply(class052162);
    }

    public static class05216 cloneTransformText(class00392 class003923, Function<class05216, class05216> function) {
        return GeneralUtils.cloneTransformText(class003923, function, class003922 -> true);
    }

    public static ParentNode convertToNodes(class00392 class003922) {
        class00413 class004132;
        class00421 class004212;
        StyledNode.HoverData<?> hoverData2;
        Object object;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object2 = class003922.method_10851();
        if (object2 instanceof class01725) {
            object = (class01725)object2;
            arrayList.add(new LiteralNode(object.comp_737()));
        } else {
            object2 = class003922.method_10851();
            if (object2 instanceof class00388) {
                hoverData2 = (StyledNode.HoverData<?>)object2;
                object2 = new ArrayList();
                for (Object object3 : hoverData2.u()) {
                    if (object3 instanceof class00392) {
                        class00392 class003923 = (class00392)object3;
                        ((ArrayList)object2).add(GeneralUtils.convertToNodes(class003923));
                        continue;
                    }
                    if (object3 instanceof String) {
                        String string = (String)object3;
                        ((ArrayList)object2).add(new LiteralNode(string));
                        continue;
                    }
                    ((ArrayList)object2).add(object3);
                }
                arrayList.add(TranslatedNode.ofFallback((String)hoverData2.y(), (String)hoverData2.L(), (Object[])((ArrayList)object2).toArray()));
            } else {
                object2 = class003922.method_10851();
                if (object2 instanceof class00421) {
                    class004212 = (class00421)object2;
                    arrayList.add(new ScoreNode(class004212.y(), class004212.L()));
                } else {
                    object2 = class003922.method_10851();
                    if (object2 instanceof class00413) {
                        class004132 = (class00413)object2;
                        arrayList.add(new KeybindNode(class004132.y()));
                    } else {
                        object2 = class003922.method_10851();
                        if (object2 instanceof class00414) {
                            class00414 class004142 = (class00414)object2;
                            arrayList.add(new SelectorNode(class004142.y(), class004142.L().map(GeneralUtils::convertToNodes)));
                        } else {
                            object2 = class003922.method_10851();
                            if (object2 instanceof class00418) {
                                class00418 class004182 = (class00418)object2;
                                arrayList.add(new NbtNode(class004182.y(), class004182.L(), class004182.u().map(GeneralUtils::convertToNodes), class004182.i()));
                            } else {
                                object2 = class003922.method_10851();
                                if (object2 instanceof class00923) {
                                    class00923 class009232 = (class00923)object2;
                                    arrayList.add(new ObjectNode(class009232.y()));
                                }
                            }
                        }
                    }
                }
            }
        }
        for (StyledNode.HoverData<?> hoverData2 : class003922.method_10855()) {
            arrayList.add(GeneralUtils.convertToNodes((class00392)hoverData2));
        }
        if (class003922.method_10866() == class00405.N) {
            return new ParentNode(arrayList);
        }
        object = class003922.method_10866();
        hoverData2 = object.z() != null ? GeneralUtils.getHoverValue((class00405)object) : null;
        class004212 = object.Z() != null ? GeneralUtils.getClickValue((class00405)object) : null;
        class004132 = object.U() != null ? new LiteralNode(object.U()) : null;
        return new StyledNode(arrayList.toArray(new TextNode[0]), (class00405)object, hoverData2, (TextNode)class004212, (TextNode)class004132);
    }

    public static class00392 deepTransform(class00392 class003922) {
        class05216 class052162 = GeneralUtils.cloneText(class003922);
        GeneralUtils.removeHoverAndClick(class052162);
        return class052162;
    }

    public static class00392 getItemText(class06584 class065842, boolean bl) {
        if (!class065842.R()) {
            class05216 class052162 = class00392.i().y(class065842.d());
            if (class065842.L(class02484.B)) {
                class052162.N(class06541.field_1056);
            }
            if (bl) {
                class052162.N(class065842.O().N());
            }
            class052162.N(class004052 -> class004052.N((class00395)new class00380(class065842)));
            return class052162;
        }
        return class00392.i().y(class06584.E.d());
    }

    private static GeneralUtils$TextLengthPair recursiveGradient(class00392 class003922, GradientNode.GradientProvider gradientProvider, int n, int n2, Predicate<class00392> predicate, BiFunction<class00405, class05194, class00405> biFunction, Function<class00392, class05216> function) {
        if (predicate.test(class003922)) {
            class05216 class052162 = class00392.i().y(class003922.method_10866());
            class04439 class044392 = class003922.method_10851();
            if (class044392 instanceof class01725) {
                class01725 class017252 = (class01725)class044392;
                int n3 = class017252.comp_737().length();
                for (int i = 0; i < n3; ++i) {
                    char c;
                    int n4 = class017252.comp_737().charAt(i);
                    int n5 = Character.isHighSurrogate((char)n4) && i + 1 < n3 ? (Character.isLowSurrogate(c = class017252.comp_737().charAt(++i)) ? Character.toCodePoint((char)n4, c) : n4) : n4;
                    class052162.y((class00392)class00392.y((String)Character.toString(n5)).y(biFunction.apply(class00405.N, gradientProvider.getColorAt(n++, n2))));
                }
            } else if (class003922.method_10851() != class01751.L) {
                class052162.y((class00392)class003922.y().y(biFunction.apply(class00405.N, gradientProvider.getColorAt(n++, n2))));
            }
            for (class00392 class003923 : class003922.method_10855()) {
                GeneralUtils$TextLengthPair generalUtils$TextLengthPair = GeneralUtils.recursiveGradient(class003923, gradientProvider, n, n2, predicate, biFunction, function);
                n = generalUtils$TextLengthPair.length;
                class052162.y((class00392)generalUtils$TextLengthPair.text);
            }
            return new GeneralUtils$TextLengthPair(class052162, n);
        }
        return new GeneralUtils$TextLengthPair(function.apply(class003922), n + class003922.getString().length());
    }

    private static TextNode getClickValue(class00405 class004052) {
        if (class004052.Z() != null) {
            class00647 class006472 = class004052.Z();
            Objects.requireNonNull(class006472);
            class00647 class006473 = class006472;
            int n = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00661.class, class00627.class, class00623.class, class00652.class, class00625.class, class00640.class}, (Object)class006473, (int)n)) {
                case 0 -> {
                    class00661 var3_3 = (class00661)class006473;
                    yield TextNode.of((String)String.valueOf(var3_3.y()));
                }
                case 1 -> {
                    class00627 var4_4 = (class00627)class006473;
                    yield TextNode.of((String)var4_4.y());
                }
                case 2 -> {
                    class00623 var5_5 = (class00623)class006473;
                    yield TextNode.of((String)var5_5.y().getPath());
                }
                case 3 -> {
                    class00652 var6_6 = (class00652)class006473;
                    yield TextNode.of((String)var6_6.y().toString());
                }
                case 4 -> {
                    class00625 var7_7 = (class00625)class006473;
                    yield TextNode.of((String)var7_7.y());
                }
                case 5 -> {
                    class00640 var8_8 = (class00640)class006473;
                    yield TextNode.of((String)var8_8.y());
                }
                default -> null;
            };
        }
        return null;
    }

    private static StyledNode.HoverData<?> getHoverValue(class00405 class004052) {
        if (class004052.z() != null) {
            class00395 class003952 = class004052.z();
            if (class003952 instanceof class00401) {
                class00401 class004012 = (class00401)class003952;
                return new StyledNode.HoverData(HoverNode.Action.TEXT_NODE, (Object)GeneralUtils.convertToNodes(class004012.y()));
            }
            class003952 = class004052.z();
            if (class003952 instanceof class00391) {
                class00391 class003912 = (class00391)class003952;
                return new StyledNode.HoverData(HoverNode.Action.ENTITY_NODE, (Object)new HoverNode.EntityNodeContent(class003912.y().y, class003912.y().L, (TextNode)class003912.y().u.map(GeneralUtils::convertToNodes).orElse(null)));
            }
            class003952 = class004052.z();
            if (class003952 instanceof class00380) {
                class00380 class003802 = (class00380)class003952;
                return new StyledNode.HoverData(HoverNode.Action.VANILLA_ITEM_STACK, (Object)class003802);
            }
        }
        return null;
    }

    private static int getGradientLength(class00392 class003922) {
        int n;
        class04439 class0443922 = class003922.method_10851();
        if (class0443922 instanceof class01725) {
            class01725 class017252 = (class01725)class0443922;
            n = class017252.comp_737().codePointCount(0, class017252.comp_737().length());
        } else {
            n = class003922.method_10851() == class01751.L ? 0 : 1;
        }
        int n2 = n;
        for (class04439 class0443922 : class003922.method_10855()) {
            n2 += GeneralUtils.getGradientLength((class00392)class0443922);
        }
        return n2;
    }

    public static TextNode removeColors(TextNode textNode) {
        if (textNode instanceof ParentTextNode) {
            ParentTextNode parentTextNode = (ParentTextNode)textNode;
            ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
            for (TextNode textNode2 : parentTextNode.getChildren()) {
                arrayList.add(GeneralUtils.removeColors(textNode2));
            }
            if (textNode instanceof ColorNode || textNode instanceof FormattingNode) {
                return new ParentNode(arrayList.toArray(new TextNode[0]));
            }
            if (textNode instanceof StyledNode) {
                StyledNode styledNode = (StyledNode)textNode;
                return new StyledNode(arrayList.toArray(new TextNode[0]), styledNode.rawStyle().N((class05194)null), styledNode.hover(), styledNode.clickValue(), styledNode.insertion());
            }
            return parentTextNode.copyWith(arrayList.toArray(new TextNode[0]));
        }
        return textNode;
    }

    public static String durationToString(long l) {
        long l2 = l % 60L;
        long l3 = l / 60L % 60L;
        long l4 = l / 3600L % 24L;
        long l5 = l / 86400L;
        if (l5 > 0L) {
            return String.format("%dd%dh%dm%ds", l5, l4, l3, l2);
        }
        if (l4 > 0L) {
            return String.format("%dh%dm%ds", l4, l3, l2);
        }
        if (l3 > 0L) {
            return String.format("%dm%ds", l3, l2);
        }
        if (l2 > 0L) {
            return String.format("%ds", l2);
        }
        return "---";
    }

    public static int rgbToInt(float f, float f2, float f3) {
        return ((int)(f * 255.0f) & 0xFF) << 16 | ((int)(f2 * 255.0f) & 0xFF) << 8 | (int)(f3 * 255.0f) & 0xFF;
    }

    public static class05216 cloneText(class00392 class003922) {
        class05216 class052162;
        Object object3 = class003922.method_10851();
        if (object3 instanceof class00388) {
            class00388 class003882 = (class00388)object3;
            object3 = new ArrayList();
            for (Object object2 : class003882.u()) {
                if (object2 instanceof class00392) {
                    class00392 class003923 = (class00392)object2;
                    ((ArrayList)object3).add(GeneralUtils.cloneText(class003923));
                    continue;
                }
                ((ArrayList)object3).add(object2);
            }
            class052162 = class00392.N((String)class003882.y(), (Object[])((ArrayList)object3).toArray());
        } else {
            class052162 = class003922.y();
        }
        for (Object object3 : class003922.method_10855()) {
            class052162.y((class00392)GeneralUtils.cloneText((class00392)object3));
        }
        class052162.y(class003922.method_10866());
        return class052162;
    }

    public static class00392 removeHoverAndClick(class00392 class003922) {
        class05216 class052162 = GeneralUtils.cloneText(class003922);
        GeneralUtils.removeHoverAndClick(class052162);
        return class052162;
    }

    private static void removeHoverAndClick(class05216 class052162) {
        class04439 class0443922;
        if (class052162.method_10866() != null) {
            class052162.y(class052162.method_10866().N(null).N(null));
        }
        if ((class0443922 = class052162.method_10851()) instanceof class00388) {
            class00388 class003882 = (class00388)class0443922;
            for (int i = 0; i < class003882.u().length; ++i) {
                Object object = class003882.u()[i];
                if (!(object instanceof class05216)) continue;
                class05216 class052163 = (class05216)object;
                GeneralUtils.removeHoverAndClick(class052163);
            }
        }
        for (class04439 class0443922 : class052162.method_10855()) {
            GeneralUtils.removeHoverAndClick((class05216)class0443922);
        }
    }

    public static class05216 toGradient(class00392 class003923, GradientNode.GradientProvider gradientProvider) {
        return GeneralUtils.recursiveGradient(class003923, gradientProvider, 0, GeneralUtils.getGradientLength(class003923), class003922 -> class003922.method_10866().N() == null, class00405::N, class00392::L).text();
    }
}

