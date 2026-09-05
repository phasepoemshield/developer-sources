/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00570
 *  minecraft.class01056
 *  minecraft.class01417
 *  minecraft.class03448
 *  minecraft.class03677
 *  minecraft.class04648
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05671
 *  minecraft.class06202
 *  minecraft.class06384
 *  minecraft.class06428
 *  minecraft.class07267
 *  minecraft.class08396
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package jerozgen.languagereload;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jerozgen.languagereload.LanguageReload$1;
import jerozgen.languagereload.access.IAdvancementsScreen;
import jerozgen.languagereload.config.Config;
import jerozgen.languagereload.mixin.BookScreenAccessor;
import jerozgen.languagereload.mixin.ClientChunkManagerAccessor;
import jerozgen.languagereload.mixin.ClientChunkMapAccessor;
import jerozgen.languagereload.mixin.SignTextAccessor;
import jerozgen.languagereload.mixin.TextDisplayEntityAccessor;
import minecraft.class00394;
import minecraft.class00570;
import minecraft.class01056;
import minecraft.class01417;
import minecraft.class03448;
import minecraft.class03677;
import minecraft.class04648;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05671;
import minecraft.class06202;
import minecraft.class06384;
import minecraft.class06428;
import minecraft.class07267;
import minecraft.class08396;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LanguageReload
implements ClientModInitializer {
    public static Logger LOGGER = LogManager.getLogger((String)"jerozgen.languagereload.LanguageReload");
    public static final String MOD_ID = "languagereload";
    public static final String NO_LANGUAGE = "*";
    public static class06428 reloadLanguagesKey;
    public static boolean shouldSetSystemLanguage;

    public static LinkedList<String> getLanguages() {
        LinkedList<String> linkedList = new LinkedList<String>();
        String string = class06202.Nq().X().N();
        if (!string.equals(NO_LANGUAGE)) {
            linkedList.add(string);
        }
        linkedList.addAll(Config.getInstance().fallbacks);
        return linkedList;
    }

    public static void reloadLanguages() {
        Object object;
        Object object2;
        class06202 class062022 = class06202.Nq();
        class062022.X().method_14491(class062022.Nm());
        class062022.yZ();
        ((class01056)class062022.i_6).i().y();
        class05096 class050962 = (class05096)class062022.v_3;
        if (class050962 instanceof class05671) {
            object2 = (class05671)class050962;
            ((BookScreenAccessor)object2).languagereload_setCachedPageIndex(-1);
        } else {
            class050962 = (class05096)class062022.v_3;
            if (class050962 instanceof class01417) {
                object = (class01417)class050962;
                ((IAdvancementsScreen)object).languagereload_recreateWidgets();
            }
        }
        if ((class03448)class062022.T_3 != null) {
            object2 = (ClientChunkManagerAccessor)((class03448)class062022.T_3).U();
            object = ((ClientChunkMapAccessor)object2.languagereload_getChunks()).languagereload_getChunks();
            for (int i = 0; i < ((AtomicReferenceArray)object).length(); ++i) {
                class00570 class005702 = (class00570)((AtomicReferenceArray)object).get(i);
                if (class005702 == null) continue;
                for (class00394 class003942 : class005702.o().values()) {
                    if (!(class003942 instanceof class07267)) continue;
                    class07267 class072672 = (class07267)class003942;
                    ((SignTextAccessor)class072672.L()).languagereload_setOrderedMessages(null);
                    ((SignTextAccessor)class072672.u()).languagereload_setOrderedMessages(null);
                }
            }
            for (class00570 class005702 : ((class03448)class062022.T_3).M()) {
                if (!(class005702 instanceof class03677)) continue;
                class03677 class036772 = (class03677)class005702;
                ((TextDisplayEntityAccessor)class036772).languagereload_setTextLines(null);
            }
        }
    }

    public static void setLanguage(String string) {
        if (string == null || string.equals(NO_LANGUAGE)) {
            LanguageReload.setLanguage(NO_LANGUAGE, null);
        } else if (string.equals("en_us")) {
            LanguageReload.setLanguage("en_us", null);
        } else {
            LanguageReload.setLanguage(string, new LanguageReload$1());
        }
    }

    public static void setLanguage(String string, LinkedList<String> linkedList) {
        String string2 = string == null ? NO_LANGUAGE : string;
        LinkedList linkedList2 = linkedList == null ? new LinkedList() : linkedList;
        class06202 class062022 = class06202.Nq();
        class08396 class083962 = class062022.X();
        Config config = Config.getInstance();
        boolean bl = class083962.N().equals(string2);
        boolean bl2 = config.fallbacks.equals(linkedList2);
        if (bl && bl2) {
            return;
        }
        config.previousLanguage = class083962.N();
        config.previousFallbacks = config.fallbacks;
        config.language = string2;
        config.fallbacks = linkedList2;
        Config.save();
        class083962.N(string2);
        ((class05630)class062022.i_7).Nk = string2;
        ((class05630)class062022.i_7).Np();
        LanguageReload.reloadLanguages();
    }

    public void onInitializeClient() {
        reloadLanguagesKey = KeyBindingHelper.registerKeyBinding((class06428)new class06428("key.debug.reloadLanguages", class04648.field_1668, 74, class06384.Z));
    }
}

