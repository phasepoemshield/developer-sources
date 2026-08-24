/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.PlainTextContent$Literal
 *  net.minecraft.text.Style
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextContent
 *  net.minecraft.util.Formatting
 */
package oxxxde;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.text.MutableText;
import net.minecraft.text.PlainTextContent;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010 \u00a8\u0006\""}, d2={"Loxxxde/\u0633\u0646;", "", "<init>", "()V", "Lnet/minecraft/class_2561;", "input", "", "target", "replacement", "replace", "(Lnet/minecraft/class_2561;Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2561;", "Lnet/minecraft/class_5250;", "result", "current", "", "appendReplaced", "(Lnet/minecraft/class_5250;Lnet/minecraft/class_2561;Ljava/lang/String;Ljava/lang/String;)V", "string", "replaceSymbols", "(Ljava/lang/String;)Ljava/lang/String;", "text", "(Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;", "value", "", "containsNonAscii", "(Ljava/lang/String;)Z", "", "Lkotlin/Pair;", "symbolReplacements", "Ljava/util/List;", "", "replacementTargets", "[Ljava/lang/String;", "replacementValues", "rain-visuals"})
public final class \u0633\u0646 {
    @NotNull
    private static final String[] replacementValues;
    @NotNull
    public static final \u0633\u0646 INSTANCE;
    @NotNull
    private static final String[] replacementTargets;
    @NotNull
    private static final List<Pair<String, String>> symbolReplacements;

    /*
     * WARNING - void declaration
     */
    private final boolean containsNonAscii(String value) {
        int index = 0;
        int n = ((CharSequence)value).length();
        while (index < n) {
            void var2_2;
            if (value.charAt(index) > '\u007f') {
                return true;
            }
            ++var2_2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Text replaceSymbols(@NotNull Text text) {
        Text text2;
        Intrinsics.checkNotNullParameter(text, "text");
        Text out = text;
        String string = out.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String raw = string;
        if (!this.containsNonAscii(raw)) {
            return out;
        }
        int index = 0;
        int n = replacementTargets.length;
        while (index < n) {
            void var4_4;
            String target = replacementTargets[index];
            if (StringsKt.contains$default((CharSequence)raw, target, false, 2, null)) {
                text2 = this.replace(out, target, replacementValues[index]);
            }
            ++var4_4;
        }
        return text2;
    }

    @NotNull
    public final Text replace(@NotNull Text input, @NotNull String target, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        MutableText mutableText = Text.empty().setStyle(input.getStyle());
        Intrinsics.checkNotNullExpressionValue(mutableText, "setStyle(...)");
        MutableText result = mutableText;
        this.appendReplaced(result, input, target, replacement);
        return (Text)result;
    }

    static {
        int n;
        INSTANCE = new \u0633\u0646();
        Pair[] pairArray = new Pair[53];
        pairArray[0] = TuplesKt.to("\u043a\u201d\u2014", Formatting.BLUE + "MODER");
        pairArray[1] = TuplesKt.to("\u043a\u201d\u0490", Formatting.BLUE + "ST.MODER");
        pairArray[2] = TuplesKt.to("\u043a\u201d\u040e", Formatting.LIGHT_PURPLE + "MODER+");
        pairArray[3] = TuplesKt.to("\u043a\u201d\u0402", Formatting.GRAY + "PLAYER");
        pairArray[4] = TuplesKt.to("\u043a\u201d\u2030", Formatting.YELLOW + "HELPER");
        pairArray[5] = TuplesKt.to("\u0432\u2014\u2020", "@");
        pairArray[6] = TuplesKt.to("\u0432\u201d\u0453", "|");
        pairArray[7] = TuplesKt.to("\u043a\u201d\u0456", Formatting.AQUA + "ML.ADMIN");
        pairArray[8] = TuplesKt.to("\u043a\u201d\u2026", Formatting.RED + "Y" + Formatting.WHITE + "T");
        pairArray[9] = TuplesKt.to("\u043a\u201d\u201a", Formatting.BLUE + "D.MODER");
        pairArray[10] = TuplesKt.to("\u043a\u2022\u00a0", Formatting.YELLOW + "D.HELPER");
        pairArray[11] = TuplesKt.to("\u043a\u2022\u201e", Formatting.RED + "DRACULA");
        pairArray[12] = TuplesKt.to("\u043a\u201d\u2013", Formatting.AQUA + "OVERLORD");
        pairArray[13] = TuplesKt.to("\u043a\u2022\u20ac", Formatting.GREEN + "COBRA");
        pairArray[14] = TuplesKt.to("\u043a\u201d\u0401", Formatting.LIGHT_PURPLE + "DRAGON");
        pairArray[15] = TuplesKt.to("\u043a\u201d\u00a4", Formatting.RED + "IMPERATOR");
        pairArray[16] = TuplesKt.to("\u043a\u201d\u00a0", Formatting.GOLD + "MAGISTER");
        pairArray[17] = TuplesKt.to("\u043a\u201d\u201e", Formatting.BLUE + "HERO");
        pairArray[18] = TuplesKt.to("\u043a\u201d\u2019", Formatting.GREEN + "AVENGER");
        pairArray[19] = TuplesKt.to("\u043a\u2022\u2019", Formatting.WHITE + "RABBIT");
        pairArray[20] = TuplesKt.to("\u043a\u201d\u20ac", Formatting.YELLOW + "TITAN");
        pairArray[21] = TuplesKt.to("\u043a\u2022\u0402", Formatting.DARK_GREEN + "HYDRA");
        pairArray[22] = TuplesKt.to("\u043a\u201d\u00b6", Formatting.GOLD + "TIGER");
        pairArray[23] = TuplesKt.to("\u043a\u201d\u0406", Formatting.DARK_PURPLE + "BULL");
        pairArray[24] = TuplesKt.to("\u043a\u2022\u2013", Formatting.BLACK + "BUNNY");
        pairArray[25] = TuplesKt.to("\u043a\u2022\u2014\u043a\u2022\u0098", Formatting.YELLOW + "SPONSOR");
        pairArray[26] = TuplesKt.to("\ud83d\udd25", "@");
        pairArray[27] = TuplesKt.to("\u0431\u0491\u0402", "A");
        pairArray[28] = TuplesKt.to("\u041a\u2122", "B");
        pairArray[29] = TuplesKt.to("\u0431\u0491\u201e", "C");
        pairArray[30] = TuplesKt.to("\u0431\u0491\u2026", "D");
        pairArray[31] = TuplesKt.to("\u0431\u0491\u2021", "E");
        pairArray[32] = TuplesKt.to("\u0422\u201c", "F");
        pairArray[33] = TuplesKt.to("\u0419\u045e", "G");
        pairArray[34] = TuplesKt.to("\u041a\u045a", "H");
        pairArray[35] = TuplesKt.to("\u0419\u0404", "I");
        pairArray[36] = TuplesKt.to("\u0431\u0491\u0409", "J");
        pairArray[37] = TuplesKt.to("\u0431\u0491\u2039", "K");
        pairArray[38] = TuplesKt.to("\u041a\u045f", "L");
        pairArray[39] = TuplesKt.to("\u0431\u0491\u040c", "M");
        pairArray[40] = TuplesKt.to("\u0419\u0491", "N");
        pairArray[41] = TuplesKt.to("\u043a\u045a\u00b1", "S");
        pairArray[42] = TuplesKt.to("\u0431\u0491\u040f", "O");
        pairArray[43] = TuplesKt.to("\u0431\u0491\u0098", "P");
        pairArray[44] = TuplesKt.to("\u0417\u00ab", "Q");
        pairArray[45] = TuplesKt.to("\u041a\u0402", "R");
        pairArray[46] = TuplesKt.to("\u0431\u0491\u203a", "T");
        pairArray[47] = TuplesKt.to("\u0431\u0491\u045a", "U");
        pairArray[48] = TuplesKt.to("\u0431\u0491\u00a0", "V");
        pairArray[49] = TuplesKt.to("\u0431\u0491\u040e", "W");
        pairArray[50] = TuplesKt.to("\u043a\u045a\u00b0", "F");
        pairArray[51] = TuplesKt.to("\u041a\u040f", "Y");
        pairArray[52] = TuplesKt.to("\u0431\u0491\u045e", "Z");
        symbolReplacements = CollectionsKt.listOf(pairArray);
        int n2 = 0;
        int n3 = symbolReplacements.size();
        String[] stringArray = new String[n3];
        while (n2 < n3) {
            n = n2++;
            stringArray[n] = symbolReplacements.get(n).getFirst();
        }
        replacementTargets = stringArray;
        n2 = 0;
        n3 = symbolReplacements.size();
        stringArray = new String[n3];
        while (n2 < n3) {
            n = n2++;
            stringArray[n] = symbolReplacements.get(n).getSecond();
        }
        replacementValues = stringArray;
    }

    private final void appendReplaced(MutableText result, Text current, String target, String replacement) {
        TextContent textContent = current.getContent();
        Intrinsics.checkNotNullExpressionValue(textContent, "getContents(...)");
        TextContent content = textContent;
        Style style = current.getStyle();
        Intrinsics.checkNotNullExpressionValue(style, "getStyle(...)");
        Style style2 = style;
        if (content instanceof PlainTextContent.Literal) {
            String replaced = Pattern.compile(Pattern.quote(target), 2).matcher(((PlainTextContent.Literal)content).string()).replaceAll(replacement);
            result.append((Text)Text.literal((String)replaced).setStyle(style2));
        }
        for (Object e : current.getSiblings()) {
            Intrinsics.checkNotNullExpressionValue(e, "next(...)");
            Text sibling = (Text)e;
            this.appendReplaced(result, sibling, target, replacement);
        }
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final String replaceSymbols(@NotNull String string) {
        String string2;
        Intrinsics.checkNotNullParameter(string, "string");
        String out = \u062f.INSTANCE.protectString(string);
        if (!this.containsNonAscii(out)) {
            return out;
        }
        int index = 0;
        int n = replacementTargets.length;
        while (index < n) {
            void var3_3;
            String target = replacementTargets[index];
            if (StringsKt.contains$default((CharSequence)out, target, false, 2, null)) {
                string2 = StringsKt.replace$default(out, target, replacementValues[index], false, 4, null);
            }
            ++var3_3;
        }
        return string2;
    }

    private \u0633\u0646() {
    }
}

