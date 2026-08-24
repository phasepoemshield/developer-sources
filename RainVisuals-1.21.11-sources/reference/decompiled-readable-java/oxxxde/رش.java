/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Identifier
 */
package oxxxde;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010$\u00a8\u0006'"}, d2={"Loxxxde/\u0631\u0634;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_2960;", "soundEventId", "soundResourceId", "", "getVolumeMultiplier", "(Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)Ljava/lang/Float;", "", "shouldMutePlayback", "(Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)Z", "", "normalized", "isExpBottleSound", "(Ljava/lang/String;)Z", "isTridentReturnSound", "isFireworkSound", "", "normalizedKeys", "(Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)Ljava/util/Set;", "value", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "Loxxxde/\u062e\u0630;", "expBottle", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0637\u064f;", "expBottleVolume", "Loxxxde/\u0637\u064f;", "tridentReturn", "tridentReturnVolume", "firework", "fireworkVolume", "expBottleMarkers", "Ljava/util/Set;", "tridentReturnMarkers", "fireworkMarkers", "rain-visuals"})
public final class \u0631\u0634
extends Module {
    @NotNull
    private static final BooleanSetting expBottle;
    @NotNull
    private static final SliderSetting expBottleVolume;
    @NotNull
    private static final BooleanSetting firework;
    @NotNull
    public static final \u0631\u0634 INSTANCE;
    @NotNull
    private static final Set<String> tridentReturnMarkers;
    @NotNull
    private static final Set<String> expBottleMarkers;
    @NotNull
    private static final SliderSetting tridentReturnVolume;
    @NotNull
    private static final BooleanSetting tridentReturn;
    @NotNull
    private static final Set<String> fireworkMarkers;
    @NotNull
    private static final SliderSetting fireworkVolume;

    public final boolean shouldMutePlayback(@Nullable Identifier soundEventId, @Nullable Identifier soundResourceId) {
        boolean bl;
        Float f = this.getVolumeMultiplier(soundEventId, soundResourceId);
        if (f != null) {
            float it = ((Number)f).floatValue();
            boolean bl2 = false;
            bl = it <= 0.0f;
        } else {
            bl = false;
        }
        return bl;
    }

    private static final boolean fireworkVolume$lambda$0() {
        return (Boolean)firework.getValue();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isFireworkSound(String normalized) {
        CharSequence p0;
        Iterable $this$any$iv = fireworkMarkers;
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection) {
            if (((Collection)$this$any$iv).isEmpty()) {
                return false;
            }
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            if (!iterator2.hasNext()) return false;
            Object element$iv = iterator2.next();
            p0 = (CharSequence)element$iv;
            boolean bl = false;
        } while (!StringsKt.contains$default((CharSequence)normalized, p0, false, 2, null));
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isExpBottleSound(String normalized) {
        CharSequence p0;
        Iterable $this$any$iv = expBottleMarkers;
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection) {
            if (((Collection)$this$any$iv).isEmpty()) {
                return false;
            }
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            if (!iterator2.hasNext()) return false;
            Object element$iv = iterator2.next();
            p0 = (CharSequence)element$iv;
            boolean bl = false;
        } while (!StringsKt.contains$default((CharSequence)normalized, p0, false, 2, null));
        return true;
    }

    private final Set<String> normalizedKeys(Identifier soundEventId, Identifier soundResourceId) {
        Set<String> set;
        block1: {
            Identifier id;
            set = SetsKt.createSetBuilder();
            Set<String> $this$normalizedKeys_u24lambda_u240 = set;
            boolean bl = false;
            Identifier identifier = soundEventId;
            if (identifier != null) {
                id = identifier;
                boolean bl2 = false;
                String string = id.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                $this$normalizedKeys_u24lambda_u240.add(INSTANCE.normalize(string));
                String string2 = id.getPath();
                Intrinsics.checkNotNullExpressionValue(string2, "getPath(...)");
                $this$normalizedKeys_u24lambda_u240.add(INSTANCE.normalize(string2));
            }
            Identifier identifier2 = soundResourceId;
            if (identifier2 == null) break block1;
            id = identifier2;
            boolean bl3 = false;
            String string = id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            $this$normalizedKeys_u24lambda_u240.add(INSTANCE.normalize(string));
            String string3 = id.getPath();
            Intrinsics.checkNotNullExpressionValue(string3, "getPath(...)");
            $this$normalizedKeys_u24lambda_u240.add(INSTANCE.normalize(string3));
        }
        return SetsKt.build(set);
    }

    private final String normalize(String value) {
        String string = value;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        return string2;
    }

    static {
        INSTANCE = new \u0631\u0634();
        expBottle = Module.boolean$default(INSTANCE, "\u041f\u0443\u0437\u044b\u0440\u0451\u043a \u043e\u043f\u044b\u0442\u0430", false, null, 4, null);
        expBottleVolume = Module.slider$default(INSTANCE, "\u0413\u0440\u043e\u043c\u043a\u043e\u0441\u0442\u044c \u043f\u0443\u0437\u044b\u0440\u044c\u043a\u0430 \u043e\u043f\u044b\u0442\u0430", 10.0f, 0.0f, 10.0f, 1.0f, null, 32, null).setVisible(\u0631\u0634::expBottleVolume$lambda$0);
        tridentReturn = Module.boolean$default(INSTANCE, "\u0412\u043e\u0437\u0432\u0440\u0430\u0449\u0435\u043d\u0438\u0435 \u0442\u0440\u0435\u0437\u0443\u0431\u0446\u0430", false, null, 4, null);
        tridentReturnVolume = Module.slider$default(INSTANCE, "\u0413\u0440\u043e\u043c\u043a\u043e\u0441\u0442\u044c \u0442\u0440\u0435\u0437\u0443\u0431\u0446\u0430", 10.0f, 0.0f, 10.0f, 1.0f, null, 32, null).setVisible(\u0631\u0634::tridentReturnVolume$lambda$0);
        firework = Module.boolean$default(INSTANCE, "\u0424\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a", false, null, 4, null);
        fireworkVolume = Module.slider$default(INSTANCE, "\u0413\u0440\u043e\u043c\u043a\u043e\u0441\u0442\u044c \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430", 10.0f, 0.0f, 10.0f, 1.0f, null, 32, null).setVisible(\u0631\u0634::fireworkVolume$lambda$0);
        String[] stringArray = new String[3];
        stringArray[0] = "experience_bottle";
        stringArray[1] = "experience_orb";
        stringArray[2] = "splash_potion";
        expBottleMarkers = SetsKt.setOf(stringArray);
        stringArray = new String[4];
        stringArray[0] = "item.trident.return";
        stringArray[1] = "item/trident/return";
        stringArray[2] = "trident.return";
        stringArray[3] = "trident/return";
        tridentReturnMarkers = SetsKt.setOf(stringArray);
        stringArray = new String[4];
        stringArray[0] = "firework_rocket";
        stringArray[1] = "firework_rocket";
        stringArray[2] = "firework";
        stringArray[3] = "fireworks";
        fireworkMarkers = SetsKt.setOf(stringArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public final Float getVolumeMultiplier(@Nullable Identifier soundEventId, @Nullable Identifier soundResourceId) {
        String string;
        Float f;
        String p0;
        boolean $i$f$any;
        Iterable $this$any$iv;
        if (!this.isEnabled()) {
            return null;
        }
        Set<String> soundKeys = this.normalizedKeys(soundEventId, soundResourceId);
        if (soundKeys.isEmpty()) {
            return null;
        }
        if (((Boolean)expBottle.getValue()).booleanValue()) {
            boolean bl;
            block14: {
                $this$any$iv = soundKeys;
                $i$f$any = false;
                if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                    bl = false;
                } else {
                    for (Object element$iv : $this$any$iv) {
                        p0 = (String)element$iv;
                        boolean bl2 = false;
                        if (!this.isExpBottleSound(p0)) continue;
                        bl = true;
                        break block14;
                    }
                    bl = false;
                }
            }
            if (bl) {
                f = Float.valueOf(((Number)expBottleVolume.getValue()).floatValue() / 10.0f);
                return f;
            }
        }
        if (((Boolean)tridentReturn.getValue()).booleanValue()) {
            boolean bl;
            block15: {
                $this$any$iv = soundKeys;
                $i$f$any = false;
                if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                    bl = false;
                } else {
                    for (Object element$iv : $this$any$iv) {
                        p0 = (String)element$iv;
                        boolean bl3 = false;
                        if (!this.isTridentReturnSound(p0)) continue;
                        bl = true;
                        break block15;
                    }
                    bl = false;
                }
            }
            if (bl) {
                f = Float.valueOf(((Number)tridentReturnVolume.getValue()).floatValue() / 10.0f);
                return f;
            }
        }
        if ((Boolean)firework.getValue() == false) return null;
        $this$any$iv = soundKeys;
        $i$f$any = false;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            return null;
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            Object element$iv;
            if (!iterator2.hasNext()) return null;
            element$iv = iterator2.next();
            string = (String)element$iv;
            boolean bl = false;
        } while (!this.isFireworkSound(string));
        boolean bl = true;
        if (!bl) return null;
        f = Float.valueOf(((Number)fireworkVolume.getValue()).floatValue() / 10.0f);
        return f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isTridentReturnSound(String normalized) {
        CharSequence p0;
        Iterable $this$any$iv = tridentReturnMarkers;
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection) {
            if (((Collection)$this$any$iv).isEmpty()) {
                return false;
            }
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            if (!iterator2.hasNext()) return false;
            Object element$iv = iterator2.next();
            p0 = (CharSequence)element$iv;
            boolean bl = false;
        } while (!StringsKt.contains$default((CharSequence)normalized, p0, false, 2, null));
        return true;
    }

    private \u0631\u0634() {
        super("SoundsController", \u0638\u0646.getPLAYER(), "\u0420\u0435\u0433\u0443\u043b\u0438\u0440\u043e\u0432\u043a\u0430 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0445 \u0437\u0432\u0443\u043a\u043e\u0432");
    }

    private static final boolean tridentReturnVolume$lambda$0() {
        return (Boolean)tridentReturn.getValue();
    }

    private static final boolean expBottleVolume$lambda$0() {
        return (Boolean)expBottle.getValue();
    }
}

