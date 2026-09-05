/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class04355
 *  minecraft.class04370
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 *  minecraft.class06202
 */
package jerozgen.languagereload.config;

import jerozgen.languagereload.LanguageReload;
import jerozgen.languagereload.config.Config;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class04355;
import minecraft.class04370;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;
import minecraft.class06202;

public class ConfigScreen
extends class05914 {
    private static final class04370<Boolean> MULTILINGUAL_SEARCH = class04370.method_41750((String)"options.languagereload.multilingualItemSearch", (class04355)class04370.method_42717((class00392)class00392.L((String)"options.languagereload.multilingualItemSearch.tooltip")), (boolean)true, bl -> {
        Config.getInstance().multilingualItemSearch = bl;
        Config.save();
        LanguageReload.reloadLanguages();
    });
    private static final class04370<Boolean> REMOVABLE_DEFAULT_LANGUAGE = class04370.method_47604((String)"options.languagereload.removableDefaultLanguage", bl -> bl != false ? class04141.N((class00392)class00392.L((String)"options.languagereload.removableDefaultLanguage.removable.tooltip")) : class04141.N((class00392)class00392.L((String)"options.languagereload.removableDefaultLanguage.fixed.tooltip")), (class003922, bl) -> bl != false ? class00392.L((String)"options.languagereload.removableDefaultLanguage.removable") : class00392.L((String)"options.languagereload.removableDefaultLanguage.fixed"), (boolean)false, bl -> {
        Config.getInstance().removableDefaultLanguage = bl;
        Config.save();
    });

    public ConfigScreen(class05096 class050962) {
        super(class050962, (class05630)class06202.Nq().i_7, (class00392)class00392.L((String)"options.languagereload.title"));
        MULTILINGUAL_SEARCH.method_41748((Object)Config.getInstance().multilingualItemSearch);
        REMOVABLE_DEFAULT_LANGUAGE.method_41748((Object)Config.getInstance().removableDefaultLanguage);
    }

    public void method_60325() {
        if (this.field_51824 != null) {
            this.field_51824.N(new class04370[]{MULTILINGUAL_SEARCH, REMOVABLE_DEFAULT_LANGUAGE});
        }
    }
}

