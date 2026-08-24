/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.Style
 *  net.minecraft.text.StyleSpriteSource
 *  net.minecraft.text.StyleSpriteSource$Font
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextColor
 *  net.minecraft.util.Identifier
 */
package oxxxde;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.StyleSpriteSource;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2={"Loxxxde/\u0631\u0627;", "", "<init>", "()V", "Lnet/minecraft/class_2561;", "createIcon", "()Lnet/minecraft/class_2561;", "name", "mark", "(Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;", "markForTab", "icon", "", "isMarked", "(Lnet/minecraft/class_2561;)Z", "", "GLYPH", "Ljava/lang/String;", "TAB_SPACER", "INSERTION", "Lnet/minecraft/class_11719$class_11721;", "font", "Lnet/minecraft/class_11719$class_11721;", "rain-visuals"})
public final class \u0631\u0627 {
    @NotNull
    private static final String TAB_SPACER = "  ";
    @NotNull
    public static final \u0631\u0627 INSTANCE = new \u0631\u0627();
    @NotNull
    private static final StyleSpriteSource.Font font = new StyleSpriteSource.Font(Identifier.of((String)"rain", (String)"socials"));
    @NotNull
    private static final String GLYPH = "\ue001";
    @NotNull
    private static final String INSERTION = "rain-social";

    @JvmStatic
    @NotNull
    public static final Text icon() {
        return INSTANCE.createIcon();
    }

    private \u0631\u0627() {
    }

    @JvmStatic
    @NotNull
    public static final Text mark(@NotNull Text name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MutableText mutableText = Text.empty().styled(\u0631\u0627::mark$lambda$0).append(INSTANCE.createIcon()).append(name);
        Intrinsics.checkNotNullExpressionValue(mutableText, "append(...)");
        return (Text)mutableText;
    }

    @JvmStatic
    @NotNull
    public static final Text markForTab(@NotNull Text name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MutableText mutableText = Text.empty().styled(\u0631\u0627::markForTab$lambda$0).append((Text)Text.literal((String)TAB_SPACER)).append(name);
        Intrinsics.checkNotNullExpressionValue(mutableText, "append(...)");
        return (Text)mutableText;
    }

    private static final Style createIcon$lambda$0(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return style.withFont((StyleSpriteSource)font).withColor(TextColor.fromRgb((int)0xFFFFFF));
    }

    @JvmStatic
    public static final boolean isMarked(@NotNull Text name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String string = name.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return StringsKt.indexOf$default((CharSequence)string, GLYPH, 0, false, 6, null) >= 0 || Intrinsics.areEqual(name.getStyle().getInsertion(), INSERTION);
    }

    private static final Style markForTab$lambda$0(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return style.withInsertion(INSERTION);
    }

    private static final Style mark$lambda$0(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return style.withInsertion(INSERTION);
    }

    private final Text createIcon() {
        MutableText mutableText = Text.literal((String)GLYPH).styled(\u0631\u0627::createIcon$lambda$0);
        Intrinsics.checkNotNullExpressionValue(mutableText, "withStyle(...)");
        return (Text)mutableText;
    }
}

