/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.List;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.ItemHighliterModule;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u00017B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\rJ;\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010.\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010(R\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u0010(R\u0014\u00100\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00101\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u0010(R\u0014\u00102\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u0010(R\u0014\u00103\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u0010(R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0016048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106\u00a8\u00068"}, d2={"Loxxxde/\u062b\u0631;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_332;", "context", "Lnet/minecraft/class_1799;", "stack", "", "x", "y", "", "renderHighlight", "(Lnet/minecraft/class_332;Lnet/minecraft/class_1799;II)V", "Lnet/minecraft/class_1792;", "item", "", "name", "Ljava/awt/Color;", "defaultColor", "configKey", "colorText", "Loxxxde/\u0632\u063a;", "highlightEntry", "(Lnet/minecraft/class_1792;Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/module/modules/render/ItemHighliterModule$HighlightEntry;", "resolveItemColor", "(Lnet/minecraft/class_1799;)Ljava/awt/Color;", "baseColor", "resolveColor", "(Ljava/awt/Color;)Ljava/awt/Color;", "ITEM_SIZE", "I", "Loxxxde/\u062e\u0630;", "pulse", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0637\u064f;", "pulseSpeed", "Loxxxde/\u0637\u064f;", "pulseMinAlpha", "enderEye", "Loxxxde/\u0632\u063a;", "sugar", "totem", "experienceBottle", "netheriteScrap", "driedKelp", "goldenApple", "enchantedGoldenApple", "chorusFruit", "enderPearl", "snowball", "splashPotion", "", "highlights", "Ljava/util/List;", "HighlightEntry", "rain-visuals"})
@RecompileFormat
public final class \u062b\u0631
extends Module {
    @NotNull
    private static final ItemHighliterModule.HighlightEntry driedKelp;
    @NotNull
    private static final BooleanSetting pulse;
    @NotNull
    private static final SliderSetting pulseMinAlpha;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry totem;
    @NotNull
    private static final SliderSetting pulseSpeed;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry splashPotion;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry sugar;
    @NotNull
    public static final \u062b\u0631 INSTANCE;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry snowball;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry experienceBottle;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry chorusFruit;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry netheriteScrap;
    private static final int ITEM_SIZE = 16;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry enderEye;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry enchantedGoldenApple;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry enderPearl;
    @NotNull
    private static final ItemHighliterModule.HighlightEntry goldenApple;
    @NotNull
    private static final List<ItemHighliterModule.HighlightEntry> highlights;

    static /* synthetic */ ItemHighliterModule.HighlightEntry highlightEntry$default(\u062b\u0631 \u062b\u06312, Item item, String string, Color color, String string2, String string3, int n, Object object) {
        if ((n & 8) != 0) {
            string2 = string;
        }
        if ((n & 0x10) != 0) {
            string3 = "\u0426\u0432\u0435\u0442";
        }
        return \u062b\u06312.highlightEntry(item, string, color, string2, string3);
    }

    private final Color resolveColor(Color baseColor) {
        if (!((Boolean)pulse.getValue()).booleanValue()) {
            return baseColor;
        }
        float minimumFactor = RangesKt.coerceIn(((Number)pulseMinAlpha.getValue()).floatValue() / 100.0f, 0.0f, 1.0f);
        double time = (double)System.currentTimeMillis() / 1000.0;
        float wave = (float)((Math.sin(time * ((Number)pulseSpeed.getValue()).doubleValue() * 2.0 * Math.PI) + 1.0) * 0.5);
        float alphaFactor = minimumFactor + (1.0f - minimumFactor) * wave;
        int alpha = RangesKt.coerceIn(MathKt.roundToInt((float)baseColor.getAlpha() * alphaFactor), 0, 255);
        return new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), alpha);
    }

    private static final boolean pulseSpeed$lambda$0() {
        return (Boolean)pulse.getValue();
    }

    private static final boolean highlightEntry$lambda$0(BooleanSetting $toggle) {
        return (Boolean)$toggle.getValue();
    }

    public final void renderHighlight(@NotNull DrawContext context, @NotNull ItemStack stack, int x, int y) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stack, "stack");
        Color color = this.resolveItemColor(stack);
        if (color == null) {
            return;
        }
        Color baseColor = color;
        context.fill(x, y, x + 16, y + 16, this.resolveColor(baseColor).getRGB());
    }

    private static final boolean pulseMinAlpha$lambda$0() {
        return (Boolean)pulse.getValue();
    }

    static {
        INSTANCE = new \u062b\u0631();
        pulse = Module.boolean$default(INSTANCE, "\u041f\u0443\u043b\u044c\u0441\u0430\u0446\u0438\u044f", false, null, 4, null);
        pulseSpeed = Module.slider$default(INSTANCE, "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u0443\u043b\u044c\u0441\u0430\u0446\u0438\u0438", 2.0f, 0.1f, 8.0f, 0.1f, null, 32, null).setVisible(\u062b\u0631::pulseSpeed$lambda$0);
        pulseMinAlpha = Module.slider$default(INSTANCE, "\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c", 30.0f, 0.0f, 100.0f, 1.0f, null, 32, null).setVisible(\u062b\u0631::pulseMinAlpha$lambda$0);
        Item item = Items.ENDER_EYE;
        Intrinsics.checkNotNullExpressionValue(item, "ENDER_EYE");
        enderEye = \u062b\u0631.highlightEntry$default(INSTANCE, item, "\u0414\u0435\u0437\u043e\u0440\u0435\u0438\u043d\u0442\u0430\u0446\u0438\u044f", new Color(255, 84, 84, 255), null, null, 24, null);
        Item item2 = Items.SUGAR;
        Intrinsics.checkNotNullExpressionValue(item2, "SUGAR");
        sugar = \u062b\u0631.highlightEntry$default(INSTANCE, item2, "\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c", new Color(255, 255, 255, 255), null, null, 24, null);
        Item item3 = Items.TOTEM_OF_UNDYING;
        Intrinsics.checkNotNullExpressionValue(item3, "TOTEM_OF_UNDYING");
        totem = \u062b\u0631.highlightEntry$default(INSTANCE, item3, "\u0422\u043e\u0442\u0435\u043c", new Color(126, 255, 111, 255), null, null, 24, null);
        Item item4 = Items.EXPERIENCE_BOTTLE;
        Intrinsics.checkNotNullExpressionValue(item4, "EXPERIENCE_BOTTLE");
        experienceBottle = \u062b\u0631.highlightEntry$default(INSTANCE, item4, "\u041f\u0443\u0437\u044b\u0440\u0451\u043a \u043e\u043f\u044b\u0442\u0430", new Color(89, 255, 150, 255), null, null, 24, null);
        Item item5 = Items.NETHERITE_SCRAP;
        Intrinsics.checkNotNullExpressionValue(item5, "NETHERITE_SCRAP");
        netheriteScrap = \u062b\u0631.highlightEntry$default(INSTANCE, item5, "\u0422\u0440\u0430\u043f\u043a\u0430", new Color(125, 125, 125, 255), null, null, 24, null);
        Item item6 = Items.DRIED_KELP;
        Intrinsics.checkNotNullExpressionValue(item6, "DRIED_KELP");
        driedKelp = \u062b\u0631.highlightEntry$default(INSTANCE, item6, "\u041f\u043b\u0430\u0441\u0442", new Color(140, 176, 88, 255), null, null, 24, null);
        Item item7 = Items.GOLDEN_APPLE;
        Intrinsics.checkNotNullExpressionValue(item7, "GOLDEN_APPLE");
        goldenApple = \u062b\u0631.highlightEntry$default(INSTANCE, item7, "\u0417\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e", new Color(255, 210, 64, 255), null, null, 24, null);
        Item item8 = Items.ENCHANTED_GOLDEN_APPLE;
        Intrinsics.checkNotNullExpressionValue(item8, "ENCHANTED_GOLDEN_APPLE");
        enchantedGoldenApple = \u062b\u0631.highlightEntry$default(INSTANCE, item8, "\u0417\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e", new Color(255, 104, 220, 255), null, null, 24, null);
        Item item9 = Items.CHORUS_FRUIT;
        Intrinsics.checkNotNullExpressionValue(item9, "CHORUS_FRUIT");
        chorusFruit = \u062b\u0631.highlightEntry$default(INSTANCE, item9, "\u0425\u043e\u0440\u0443\u0441", new Color(198, 118, 255, 255), null, null, 24, null);
        Item item10 = Items.ENDER_PEARL;
        Intrinsics.checkNotNullExpressionValue(item10, "ENDER_PEARL");
        enderPearl = \u062b\u0631.highlightEntry$default(INSTANCE, item10, "\u042d\u043d\u0434\u0435\u0440 \u0436\u0435\u043c\u0447\u0443\u0433", new Color(87, 255, 220, 255), null, null, 24, null);
        Item item11 = Items.SNOWBALL;
        Intrinsics.checkNotNullExpressionValue(item11, "SNOWBALL");
        snowball = \u062b\u0631.highlightEntry$default(INSTANCE, item11, "\u0421\u043d\u0435\u0436\u043e\u043a \u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430", new Color(210, 244, 255, 255), null, null, 24, null);
        Item item12 = Items.SPLASH_POTION;
        Intrinsics.checkNotNullExpressionValue(item12, "SPLASH_POTION");
        splashPotion = \u062b\u0631.highlightEntry$default(INSTANCE, item12, "\u0412\u0437\u0440\u044b\u0432\u043d\u043e\u0435 \u0437\u0435\u043b\u044c\u0435", new Color(112, 170, 255, 255), null, null, 24, null);
        ItemHighliterModule.HighlightEntry[] highlightEntryArray = new ItemHighliterModule.HighlightEntry[12];
        highlightEntryArray[0] = enderEye;
        highlightEntryArray[1] = sugar;
        highlightEntryArray[2] = totem;
        highlightEntryArray[3] = experienceBottle;
        highlightEntryArray[4] = netheriteScrap;
        highlightEntryArray[5] = driedKelp;
        highlightEntryArray[6] = goldenApple;
        highlightEntryArray[7] = enchantedGoldenApple;
        highlightEntryArray[8] = chorusFruit;
        highlightEntryArray[9] = enderPearl;
        highlightEntryArray[10] = snowball;
        highlightEntryArray[11] = splashPotion;
        highlights = CollectionsKt.listOf(highlightEntryArray);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Color resolveItemColor(ItemStack stack) {
        Object v1;
        block2: {
            if (!this.isEnabled()) return null;
            if (stack.isEmpty()) {
                return null;
            }
            Iterable $this$firstOrNull$iv = highlights;
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var6_5;
                ItemHighliterModule.HighlightEntry entry = (ItemHighliterModule.HighlightEntry)element$iv;
                boolean bl = false;
                boolean bl2 = ((Boolean)entry.getToggle().getValue()).booleanValue() && stack.isOf(entry.getItem());
                if (!bl2) continue;
                v1 = var6_5;
                break block2;
            }
            v1 = null;
        }
        ItemHighliterModule.HighlightEntry highlightEntry = v1;
        if (highlightEntry == null) return null;
        ColorSetting colorSetting = highlightEntry.getColor();
        if (colorSetting == null) return null;
        Color color = (Color)colorSetting.getValue();
        return color;
    }

    private \u062b\u0631() {
        super("ItemHighliter", \u0638\u0646.getRENDER(), "\u041f\u043e\u0434\u0441\u0432\u0435\u0447\u0438\u0432\u0430\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435");
    }

    private final ItemHighliterModule.HighlightEntry highlightEntry(Item item, String name, Color defaultColor, String configKey, String colorText) {
        BooleanSetting toggle = this.boolean(name, true, configKey + ".enabled");
        Setting color = this.color(colorText, defaultColor, configKey + ".color").setVisible(() -> \u062b\u0631.highlightEntry$lambda$0(toggle));
        return new ItemHighliterModule.HighlightEntry(item, toggle, (ColorSetting)color);
    }
}

