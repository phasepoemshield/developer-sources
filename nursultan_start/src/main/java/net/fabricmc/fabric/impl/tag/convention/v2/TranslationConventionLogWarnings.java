/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00751
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class04227
 *  minecraft.class07018
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
 *  net.fabricmc.loader.api.FabricLoader
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.tag.convention.v2;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Locale;
import minecraft.class00751;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class04227;
import minecraft.class07018;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.impl.tag.convention.v2.TranslationConventionLogWarnings$LogWarningMode;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TranslationConventionLogWarnings
implements ModInitializer {
    private static Logger LOGGER = LoggerFactory.getLogger(TranslationConventionLogWarnings.class);
    private static final TranslationConventionLogWarnings$LogWarningMode LOG_UNTRANSLATED_WARNING_MODE = TranslationConventionLogWarnings.setupLogWarningModeProperty();

    private static /* synthetic */ void lambda$setupUntranslatedItemTagWarning$0(class07018 class070182, List list, class03552 class035522) {
        if (class035522.B().y().y().equals("minecraft")) {
            return;
        }
        if (!class070182.N(class035522.B().getTranslationKey())) {
            list.add(class035522.B());
        }
    }

    private static TranslationConventionLogWarnings$LogWarningMode setupLogWarningModeProperty() {
        TranslationConventionLogWarnings$LogWarningMode translationConventionLogWarnings$LogWarningMode = FabricLoader.getInstance().isDevelopmentEnvironment() ? TranslationConventionLogWarnings$LogWarningMode.SHORT : TranslationConventionLogWarnings$LogWarningMode.SILENCED;
        String string = System.getProperty("fabric-tag-conventions-v2.missingTagTranslationWarning", translationConventionLogWarnings$LogWarningMode.name()).toUpperCase(Locale.ROOT);
        try {
            return TranslationConventionLogWarnings$LogWarningMode.valueOf(string);
        }
        catch (Exception exception) {
            LOGGER.error("Unknown entry `{}` for property `fabric-tag-conventions-v2.missingTagTranslationWarning`.", (Object)string);
            return TranslationConventionLogWarnings$LogWarningMode.SILENCED;
        }
    }

    private static void setupUntranslatedItemTagWarning() {
        ServerLifecycleEvents.SERVER_STARTED.register(class027962 -> {
            class07018 class070182 = class07018.y();
            class00751 class007512 = class027962.yt().N(class04227.F);
            ObjectArrayList objectArrayList = new ObjectArrayList();
            class007512.U().forEach(arg_0 -> TranslationConventionLogWarnings.lambda$setupUntranslatedItemTagWarning$0(class070182, (List)objectArrayList, arg_0));
            if (objectArrayList.isEmpty()) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n\tDev warning - Untranslated Item Tags detected. Please translate your item tags so other mods such as recipe viewers can properly display your tag's name.\n\tThe format desired is tag.item.<namespace>.<path> for the translation key with slashes in path turned into periods.\n\tTo disable this message, set this system property in your runs: `-Dfabric-tag-conventions-v2.missingTagTranslationWarning=SILENCED`.\n\tTo see individual untranslated item tags found, set the system property to `-Dfabric-tag-conventions-v2.missingTagTranslationWarning=VERBOSE`.\n\tDefault is `SHORT`.\n");
            if (LOG_UNTRANSLATED_WARNING_MODE.verbose()) {
                stringBuilder.append("\nUntranslated item tags:");
                for (class03530 class035302 : objectArrayList) {
                    stringBuilder.append("\n     ").append(class035302.y());
                }
            }
            LOGGER.warn(stringBuilder.toString());
            if (LOG_UNTRANSLATED_WARNING_MODE == TranslationConventionLogWarnings$LogWarningMode.FAIL) {
                throw new RuntimeException("Tag translation validation failed");
            }
        });
    }

    public void onInitialize() {
        if (LOG_UNTRANSLATED_WARNING_MODE != TranslationConventionLogWarnings$LogWarningMode.SILENCED) {
            TranslationConventionLogWarnings.setupUntranslatedItemTagWarning();
        }
    }
}

