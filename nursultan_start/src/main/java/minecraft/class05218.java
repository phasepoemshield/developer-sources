/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class04654
 *  minecraft.class05086
 *  minecraft.class05706
 *  minecraft.class06202
 *  minecraft.class06318
 *  minecraft.class06541
 *  minecraft.class06839
 *  minecraft.class07305
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class04654;
import minecraft.class05086;
import minecraft.class05191;
import minecraft.class05211;
import minecraft.class05221;
import minecraft.class05229;
import minecraft.class05706;
import minecraft.class06202;
import minecraft.class06318;
import minecraft.class06541;
import minecraft.class06839;
import minecraft.class07305;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class05218
extends class06318<class05211> {
    private static final int y = 24;
    final /* synthetic */ class05191 N;
    private final Map L;

    public class05218(class05191 class051912, class07305 class073052) {
        this.N = class051912;
        super(class06202.Nq(), class051912.field_22789, class051912.N.u(), class051912.N.L(), 24);
        this.L = new HashMap();
        HashMap hashMap = Maps.newHashMap();
        class073052.N((class05706)new class05229(this, class051912, hashMap));
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(class05086::N))).forEach(entry2 -> {
            this.method_25321((class01202)new class05221(this.N, ((class05086)entry2.getKey()).y().N(class06541.field_1067, class06541.field_1054)));
            ((Map)entry2.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(class06839::L))).forEach(entry -> {
                CallbackInfo callbackInfo = new CallbackInfo("", true);
                this.N((Map.Entry)entry, callbackInfo);
                if (callbackInfo.isCancelled()) {
                    return;
                }
                this.method_25321((class01202)((class05211)((Object)((Object)((Object)entry.getValue())))));
            });
        });
        this.N(class051912, class073052, null);
    }

    private void N(Map.Entry entry, CallbackInfo callbackInfo) {
        CustomGameRuleCategory.getCategory((class06839)((class06839)entry.getKey())).ifPresent(customGameRuleCategory2 -> {
            this.L.computeIfAbsent(customGameRuleCategory2, customGameRuleCategory -> new ArrayList()).add((class05211)((Object)((Object)entry.getValue())));
            callbackInfo.cancel();
        });
    }

    private void N(class05191 class051912, class07305 class073052, CallbackInfo callbackInfo) {
        this.L.forEach((customGameRuleCategory, list) -> {
            class05191 class051913 = class051912;
            Objects.requireNonNull(class051913);
            this.method_25321((class01202)new class05221(class051913, customGameRuleCategory.getName()));
            for (class05211 class052112 : list) {
                this.method_25321((class01202)class052112);
            }
        });
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        super.method_48579(class010542, n, n2, f);
        class05211 class052112 = (class05211)this.method_37019();
        if (class052112 != null && class052112.field_24311 != null) {
            class010542.N(class052112.field_24311, n, n2);
        }
    }
}

