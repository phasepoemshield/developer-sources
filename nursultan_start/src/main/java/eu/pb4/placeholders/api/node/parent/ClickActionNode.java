/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParser
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  eu.pb4.placeholders.impl.StringArgOps
 *  java.lang.MatchException
 *  minecraft.class00405
 *  minecraft.class00623
 *  minecraft.class00625
 *  minecraft.class00626
 *  minecraft.class00627
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class00654
 *  minecraft.class00661
 *  minecraft.class00669
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07755
 *  minecraft.class09037
 */
package eu.pb4.placeholders.api.node.parent;

import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.arguments.StringArgs;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ClickActionNode$Action;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.node.parent.SimpleStylingNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.impl.StringArgOps;
import java.net.URI;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class00623;
import minecraft.class00625;
import minecraft.class00626;
import minecraft.class00627;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class00654;
import minecraft.class00661;
import minecraft.class00669;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07755;
import minecraft.class09037;

public final class ClickActionNode
extends SimpleStylingNode {
    private final class00654 action;
    private final TextNode value;
    private final Either<TextNode, StringArgs> data;
    private static final class01929 DEFAULT_WRAPPER = class01042.N((class00751)class04206.NF);

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray, NodeParser nodeParser) {
        return new ClickActionNode(textNodeArray, this.action, TextNode.asSingle(nodeParser.parseNodes(this.value)), this.data != null && this.data.left().isPresent() ? Either.left((Object)TextNode.asSingle(nodeParser.parseNodes((TextNode)this.data.left().orElseThrow()))) : this.data);
    }

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new ClickActionNode(textNodeArray, this.action, this.value, this.data);
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        return switch (this.action) {
            default -> throw new MatchException(null, null);
            case class00654.field_11749 -> {
                try {
                    class00405 var2_2;
                    yield var2_2 = class00405.N.N((class00647)new class00652(URI.create(this.value.toText(parserContext).getString())));
                }
                catch (Exception var3_14) {
                    class00405 var2_3;
                    yield var2_3 = class00405.N;
                }
            }
            case class00654.field_11748 -> {
                try {
                    class00405 var2_4;
                    yield var2_4 = class00405.N.N((class00647)new class00661(Integer.parseInt(this.value.toText(parserContext).getString())));
                }
                catch (Exception var3_15) {
                    class00405 var2_5;
                    yield var2_5 = class00405.N;
                }
            }
            case class00654.field_11746 -> {
                class00405 var2_6;
                yield var2_6 = class00405.N.N((class00647)new class00623(this.value.toText(parserContext).getString()));
            }
            case class00654.field_11750 -> {
                class00405 var2_7;
                yield var2_7 = class00405.N.N((class00647)new class00625(this.value.toText(parserContext).getString()));
            }
            case class00654.field_11745 -> {
                class00405 var2_8;
                yield var2_8 = class00405.N.N((class00647)new class00640(this.value.toText(parserContext).getString()));
            }
            case class00654.field_21462 -> {
                class00405 var2_9;
                yield var2_9 = class00405.N.N((class00647)new class00627(this.value.toText(parserContext).getString()));
            }
            case class00654.field_60822 -> {
                try {
                    class00405 var2_10;
                    Object var3_16 = parserContext.contains(ParserContext$Key.WRAPPER_LOOKUP) ? parserContext.getOrThrow(ParserContext$Key.WRAPPER_LOOKUP) : (parserContext.contains(PlaceholderContext.KEY) ? parserContext.getOrThrow(PlaceholderContext.KEY).server().yt() : DEFAULT_WRAPPER);
                    yield var2_10 = class00405.N.N((class00647)new class00669(class01894.N((String)this.value.toText(parserContext).getString()), this.data == null ? Optional.empty() : Optional.of(this.data.left().isPresent() ? (class07709)class07755.N((DynamicOps)var3_16.N((DynamicOps)class07713.N)).y(((TextNode)this.data.left().orElseThrow()).toText(parserContext).getString()) : (class07709)StringArgOps.INSTANCE.convertTo((DynamicOps)class07713.N, Either.right((Object)((StringArgs)this.data.right().orElseThrow()))))));
                }
                catch (Throwable var3_17) {
                    class00405 var2_11;
                    yield var2_11 = class00405.N;
                }
            }
            case class00654.field_60821 -> {
                class00405 var2_13;
                Object var3_18 = parserContext.contains(ParserContext$Key.WRAPPER_LOOKUP) ? parserContext.getOrThrow(ParserContext$Key.WRAPPER_LOOKUP) : (parserContext.contains(PlaceholderContext.KEY) ? parserContext.getOrThrow(PlaceholderContext.KEY).server().yt() : DEFAULT_WRAPPER);
                class03556 var4_19 = null;
                String var5_20 = this.value.toText(parserContext).getString();
                class01894 var6_21 = class01894.L((String)var5_20);
                if (var6_21 != null) {
                    var4_19 = var3_18.u(class05946.N((class05946)class04227.yL, (class01894)var6_21)).orElse(null);
                }
                if (var4_19 == null) {
                    try {
                        var4_19 = (class03556)((Pair)class09037.u.decode((DynamicOps)var3_18.N((DynamicOps)JsonOps.INSTANCE), (Object)JsonParser.parseString((String)var5_20)).getOrThrow()).getFirst();
                    }
                    catch (Throwable var7_22) {
                        // empty catch block
                    }
                }
                if (var4_19 != null) {
                    class00405 var2_12;
                    yield var2_12 = class00405.N.N((class00647)new class00626(var4_19));
                }
                yield var2_13 = class00405.N;
            }
        };
    }

    @Deprecated(forRemoval=true)
    public ClickActionNode(TextNode[] textNodeArray, ClickActionNode$Action clickActionNode$Action, TextNode textNode) {
        super(textNodeArray);
        this.action = clickActionNode$Action.vanillaType();
        this.value = textNode;
        this.data = null;
    }

    public ClickActionNode(TextNode[] textNodeArray, class00654 class006542, TextNode textNode) {
        this(textNodeArray, class006542, textNode, null);
    }

    public ClickActionNode(TextNode[] textNodeArray, class00654 class006542, TextNode textNode, Either<TextNode, StringArgs> either) {
        super(textNodeArray);
        this.action = class006542;
        this.value = textNode;
        this.data = either;
    }

    public TextNode value() {
        return this.value;
    }

    @Override
    public String toString() {
        return "ClickActionNode{action=" + this.action.method_15434() + ", value=" + String.valueOf(this.value) + ", data=" + String.valueOf(this.data) + "}";
    }

    @Deprecated(forRemoval=true)
    public ClickActionNode$Action action() {
        return switch (this.action) {
            default -> throw new MatchException(null, null);
            case class00654.field_11749 -> ClickActionNode$Action.OPEN_URL;
            case class00654.field_11746 -> ClickActionNode$Action.OPEN_FILE;
            case class00654.field_11748 -> ClickActionNode$Action.CHANGE_PAGE;
            case class00654.field_11750 -> ClickActionNode$Action.RUN_COMMAND;
            case class00654.field_11745 -> ClickActionNode$Action.SUGGEST_COMMAND;
            case class00654.field_21462 -> ClickActionNode$Action.COPY_TO_CLIPBOARD;
            case class00654.field_60821 -> ClickActionNode$Action.SHOW_DIALOG;
            case class00654.field_60822 -> ClickActionNode$Action.CUSTOM;
        };
    }

    public class00654 clickEventAction() {
        return this.action;
    }

    @Override
    public boolean isDynamicNoChildren() {
        return this.value.isDynamic() || this.data != null && this.data.left().isEmpty() && ((TextNode)this.data.left().orElseThrow()).isDynamic();
    }
}

