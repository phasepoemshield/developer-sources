/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.KeybindTextContent
 *  net.minecraft.text.PlainTextContent$Literal
 *  net.minecraft.text.Style
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextColor
 *  net.minecraft.text.TextContent
 *  net.minecraft.text.TranslatableTextContent
 */
package oxxxde;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.client.util.render.font.MsdfGlyph;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.text.KeybindTextContent;
import net.minecraft.text.PlainTextContent;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.text.TextContent;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062e\u0638;
import oxxxde.\u0633\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0013\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Loxxxde/\u0633\u064b;", "", "<init>", "()V", "Lnet/minecraft/class_2561;", "text", "", "Loxxxde/\u063a;", "parseTextToColoredGlyphs", "(Lnet/minecraft/class_2561;)Ljava/util/List;", "", "currentColor", "", "out", "", "parseTextRecursive", "(Lnet/minecraft/class_2561;ILjava/util/List;)V", "CACHE_LIMIT", "I", "oxxxde/\u062e\u0638", "glyphCache", "Loxxxde/\u062e\u0638;", "rain-visuals"})
public final class \u0633\u064b {
    @NotNull
    private static final \u062e\u0638 glyphCache;
    private static final int CACHE_LIMIT = 1000;
    @NotNull
    public static final \u0633\u064b INSTANCE;

    private \u0633\u064b() {
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final List<MsdfGlyph.ColoredGlyph> parseTextToColoredGlyphs(@NotNull Text text) {
        void var2_4;
        Intrinsics.checkNotNullParameter(text, "text");
        List list = (List)glyphCache.get((Object)text);
        if (list != null) {
            void var3_2;
            List it = list;
            boolean bl = false;
            return var3_2;
        }
        ArrayList out = new ArrayList(text.getString().length());
        this.parseTextRecursive(text, -1, out);
        ((Map)glyphCache).put(text, out);
        return (List)var2_4;
    }

    static {
        INSTANCE = new \u0633\u064b();
        glyphCache = new \u062e\u0638();
    }

    /*
     * WARNING - void declaration
     */
    private final void parseTextRecursive(Text text, int currentColor, List<MsdfGlyph.ColoredGlyph> out) {
        Style style = text.getStyle();
        Intrinsics.checkNotNullExpressionValue(style, "getStyle(...)");
        Style style2 = style;
        TextColor textColor = style2.getColor();
        int color = textColor != null ? textColor.getRgb() | 0xFF000000 : currentColor;
        TextContent textContent = text.getContent();
        Intrinsics.checkNotNullExpressionValue(textContent, "getContents(...)");
        TextContent content = textContent;
        TextContent textContent2 = content;
        String string = textContent2 instanceof PlainTextContent.Literal ? ((PlainTextContent.Literal)content).string() : (textContent2 instanceof TranslatableTextContent ? ((TranslatableTextContent)content).getKey() : (textContent2 instanceof KeybindTextContent ? ((KeybindTextContent)content).getKey() : ""));
        Intrinsics.checkNotNull(string);
        String raw = string;
        boolean bl = ((CharSequence)raw).length() == 0;
        if (bl) {
            for (Object e : text.getSiblings()) {
                Intrinsics.checkNotNullExpressionValue(e, "next(...)");
                Text sibling = (Text)e;
                this.parseTextRecursive(sibling, color, out);
            }
            return;
        }
        raw = \u0633\u0646.INSTANCE.replaceSymbols(raw);
        int i = 0;
        while (i < raw.length()) {
            char c;
            block9: {
                block8: {
                    c = raw.charAt(i);
                    if (c == '\u00a7') break block8;
                    if (c != '&') break block9;
                }
                if (i + 1 < raw.length()) {
                    i += 2;
                    continue;
                }
            }
            out.add(new MsdfGlyph.ColoredGlyph(c, color));
            ++i;
        }
        for (Object e : text.getSiblings()) {
            void var3_3;
            Intrinsics.checkNotNullExpressionValue(e, "next(...)");
            Text sibling = (Text)e;
            this.parseTextRecursive(sibling, color, (List<MsdfGlyph.ColoredGlyph>)var3_3);
        }
    }
}

