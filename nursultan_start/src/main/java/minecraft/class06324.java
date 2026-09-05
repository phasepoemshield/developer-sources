/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jerozgen.languagereload.mixin.LanguageSelectionListWidgetAccessor
 *  minecraft.class01202
 *  minecraft.class05724
 *  minecraft.class06202
 *  minecraft.class08430
 */
package minecraft;

import java.util.List;
import java.util.Locale;
import jerozgen.languagereload.mixin.LanguageSelectionListWidgetAccessor;
import minecraft.class01202;
import minecraft.class05724;
import minecraft.class06202;
import minecraft.class06279;
import minecraft.class06280;
import minecraft.class08430;

public class class06324
extends class05724<class06280>
implements LanguageSelectionListWidgetAccessor {
    final /* synthetic */ class06279 N;

    public class06324(class06279 class062792, class06202 class062022) {
        this.N = class062792;
        super(class062022, class062792.field_22789, class062792.field_22790 - 33 - 53, 33, 18);
        String string = class062792.N.N();
        class062792.N.y().forEach((string2, class084302) -> {
            class06280 class062802 = new class06280(this, (String)string2, (class08430)class084302);
            this.method_25321((class01202)class062802);
            if (string.equals(string2)) {
                this.method_25313((class01202)class062802);
            }
        });
        if (this.method_25334() != null) {
            this.method_25324((class01202)((class06280)this.method_25334()));
        }
    }

    static /* synthetic */ int N(class06324 class063242) {
        return class063242.field_22758;
    }

    public static /* synthetic */ class06324 N(class06279 class062792, class06202 class062022) {
        return new class06324(class062792, class062022);
    }

    void N(String string) {
        List list = this.N.N.y().entrySet().stream().filter(entry -> string.isEmpty() || ((class08430)entry.getValue()).L().toLowerCase(Locale.ROOT).contains(string.toLowerCase(Locale.ROOT)) || ((class08430)entry.getValue()).y().toLowerCase(Locale.ROOT).contains(string.toLowerCase(Locale.ROOT))).map(entry -> new class06280(this, (String)entry.getKey(), (class08430)entry.getValue())).toList();
        this.method_25314(list);
        this.method_65506();
    }

    public int method_25322() {
        return super.method_25322() + 50;
    }
}

