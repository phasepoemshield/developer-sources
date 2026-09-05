/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01212
 *  minecraft.class01590
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  net.fabricmc.loader.api.metadata.ContactInformation
 *  org.jspecify.annotations.Nullable
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget$DescriptionEntry;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget$LinkEntry;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget$MailableContactEntry;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget$MojangCreditsEntry;
import com.terraformersmc.modmenu.util.mod.Mod;
import java.util.Map;
import java.util.Set;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01212;
import minecraft.class01590;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import net.fabricmc.loader.api.metadata.ContactInformation;
import org.jspecify.annotations.Nullable;

public class DescriptionListWidget
extends class01212<DescriptionListWidget$DescriptionEntry> {
    private static final class00392 HAS_UPDATE_TEXT = class00392.L((String)"modmenu.hasUpdate");
    private static final class00392 EXPERIMENTAL_TEXT = class00392.L((String)"modmenu.experimental").N(class06541.field_1065);
    private static final class00392 DOWNLOAD_TEXT = class00392.L((String)"modmenu.downloadLink").N(class06541.field_1078).N(class06541.field_1073);
    private static final class00392 CHILD_HAS_UPDATE_TEXT = class00392.L((String)"modmenu.childHasUpdate");
    private static final class00392 LINKS_TEXT = class00392.L((String)"modmenu.links");
    private static final class00392 SOURCE_TEXT = class00392.L((String)"modmenu.source").N(class06541.field_1078).N(class06541.field_1073);
    private static final class00392 LICENSE_TEXT = class00392.L((String)"modmenu.license");
    private static final class00392 VIEW_CREDITS_TEXT = class00392.L((String)"modmenu.viewCredits").N(class06541.field_1078).N(class06541.field_1073);
    private static final class00392 CREDITS_TEXT = class00392.L((String)"modmenu.credits");
    final ModsScreen parent;
    final class01590 textRenderer;
    private Mod selectedMod = null;

    static /* synthetic */ class06202 access$000(DescriptionListWidget descriptionListWidget) {
        return descriptionListWidget.field_22740;
    }

    static /* synthetic */ class06202 access$100(DescriptionListWidget descriptionListWidget) {
        return descriptionListWidget.field_22740;
    }

    static /* synthetic */ class06202 access$200(DescriptionListWidget descriptionListWidget) {
        return descriptionListWidget.field_22740;
    }

    static /* synthetic */ class06202 access$400(DescriptionListWidget descriptionListWidget) {
        return descriptionListWidget.field_22740;
    }

    static /* synthetic */ class06202 access$300(DescriptionListWidget descriptionListWidget) {
        return descriptionListWidget.field_22740;
    }

    public DescriptionListWidget(class06202 class062022, int n, int n2, int n3, int n4, DescriptionListWidget descriptionListWidget, ModsScreen modsScreen) {
        super(class062022, n, n2, n3, n4);
        this.parent = modsScreen;
        this.textRenderer = (class01590)class062022.i_3;
        if (descriptionListWidget != null) {
            this.updateSelectedMod(descriptionListWidget.selectedMod);
            this.method_44382(descriptionListWidget.method_44387());
        }
        if (modsScreen.getSelectedEntry() != null) {
            this.updateSelectedMod(modsScreen.getSelectedEntry().getMod());
        }
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    public void updateSelectedMod(Mod mod) {
        this.selectedMod = mod;
        this.method_25339();
        this.method_44382(-1.7976931348623157E308);
        this.rebuildUI();
    }

    private class00392 creditsRoleText(String string) {
        String string2 = string.replaceAll("[ -]", "_").toLowerCase();
        Object object = string.endsWith("r") ? string + "s" : string;
        return class00392.N((String)("modmenu.credits.role." + string2), (String)object).y((class00392)class00392.y((String)":"));
    }

    public DescriptionListWidget$DescriptionEntry getSelectedOrNull() {
        return null;
    }

    private void rebuildUI() {
        block32: {
            Object object4;
            Object object22;
            Mod mod;
            int n;
            DescriptionListWidget$DescriptionEntry descriptionListWidget$DescriptionEntry;
            block33: {
                Object object3;
                if (this.selectedMod == null) {
                    return;
                }
                descriptionListWidget$DescriptionEntry = new DescriptionListWidget$DescriptionEntry(this, class01028.N);
                n = this.method_25322() - 5;
                mod = this.selectedMod;
                class00392 class003922 = mod.getFormattedDescription();
                if (!class003922.getString().isEmpty()) {
                    for (class01028 class010282 : this.textRenderer.L((class05936)class003922, n)) {
                        this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, class010282));
                    }
                }
                if (ModMenuConfig.UPDATE_CHECKER.getValue() && !ModMenuConfig.DISABLE_UPDATE_CHECKER.getValue().contains(mod.getId())) {
                    object3 = mod.getUpdateInfo();
                    if (object3 != null && object3.isUpdateAvailable()) {
                        this.method_25321((class01202)descriptionListWidget$DescriptionEntry);
                        int n2 = 0;
                        for (Object object22 : this.textRenderer.L((class05936)HAS_UPDATE_TEXT, n - 11)) {
                            object4 = new DescriptionListWidget$DescriptionEntry(this, (class01028)object22);
                            if (n2 == 0) {
                                ((DescriptionListWidget$DescriptionEntry)((Object)object4)).setUpdateTextEntry();
                            }
                            this.method_25321((class01202)object4);
                            ++n2;
                        }
                        for (Object object22 : this.textRenderer.L((class05936)EXPERIMENTAL_TEXT, n - 16)) {
                            this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, (class01028)object22, 8));
                        }
                        class00392 class003923 = object3.getUpdateMessage();
                        object22 = object3.getDownloadLink();
                        if (class003923 == null) {
                            class003923 = DOWNLOAD_TEXT;
                        } else if (object22 != null) {
                            class003923 = class003923.L().N(class06541.field_1078).N(class06541.field_1073);
                        }
                        for (class01028 class010283 : this.textRenderer.L((class05936)class003923, n - 16)) {
                            if (object22 != null) {
                                this.method_25321((class01202)new DescriptionListWidget$LinkEntry(this, class010283, (String)object22, 8));
                                continue;
                            }
                            this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, class010283, 8));
                        }
                    }
                    if (mod.getChildHasUpdate()) {
                        this.method_25321((class01202)descriptionListWidget$DescriptionEntry);
                        int n3 = 0;
                        for (Object object22 : this.textRenderer.L((class05936)CHILD_HAS_UPDATE_TEXT, n - 11)) {
                            object4 = new DescriptionListWidget$DescriptionEntry(this, (class01028)object22);
                            if (n3 == 0) {
                                ((DescriptionListWidget$DescriptionEntry)((Object)object4)).setUpdateTextEntry();
                            }
                            this.method_25321((class01202)object4);
                            ++n3;
                        }
                    }
                }
                object3 = mod.getLinks();
                String string3 = mod.getSource();
                if (!(object3.isEmpty() && string3 == null || ModMenuConfig.HIDE_MOD_LINKS.getValue())) {
                    this.method_25321((class01202)descriptionListWidget$DescriptionEntry);
                    for (Object object22 : this.textRenderer.L((class05936)LINKS_TEXT, n)) {
                        this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, (class01028)object22));
                    }
                    if (string3 != null) {
                        int n4 = 8;
                        object22 = this.textRenderer.L((class05936)SOURCE_TEXT, n - 16).iterator();
                        while (object22.hasNext()) {
                            object4 = (class01028)object22.next();
                            this.method_25321((class01202)new DescriptionListWidget$LinkEntry(this, (class01028)object4, string3, n4));
                            n4 = 16;
                        }
                    }
                    object3.forEach((string, string2) -> {
                        int n2 = 8;
                        for (class01028 class010282 : this.textRenderer.L((class05936)class00392.L((String)string).N(class06541.field_1078).N(class06541.field_1073), n - 16)) {
                            this.method_25321((class01202)new DescriptionListWidget$LinkEntry(this, class010282, (String)string2, n2));
                            n2 = 16;
                        }
                    });
                }
                Set<String> set = mod.getLicense();
                if (!ModMenuConfig.HIDE_MOD_LICENSE.getValue() && !set.isEmpty()) {
                    this.method_25321((class01202)descriptionListWidget$DescriptionEntry);
                    for (Object object4 : this.textRenderer.L((class05936)LICENSE_TEXT, n)) {
                        this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, (class01028)object4));
                    }
                    object22 = set.iterator();
                    while (object22.hasNext()) {
                        object4 = (String)object22.next();
                        int n5 = 8;
                        for (Object object5 : this.textRenderer.L((class05936)class00392.y((String)object4), n - 16)) {
                            this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, (class01028)object5, n5));
                            n5 = 16;
                        }
                    }
                }
                if (ModMenuConfig.HIDE_MOD_CREDITS.getValue()) break block32;
                if (!"minecraft".equals(mod.getId())) break block33;
                this.method_25321((class01202)descriptionListWidget$DescriptionEntry);
                for (Object object4 : this.textRenderer.L((class05936)VIEW_CREDITS_TEXT, n)) {
                    this.method_25321((class01202)new DescriptionListWidget$MojangCreditsEntry(this, (class01028)object4));
                }
                break block32;
            }
            if ("java".equals(mod.getId()) || (object22 = mod.getCredits()).isEmpty()) break block32;
            this.method_25321((class01202)descriptionListWidget$DescriptionEntry);
            for (class01028 class010284 : this.textRenderer.L((class05936)CREDITS_TEXT, n)) {
                this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, class010284));
            }
            object4 = object22.entrySet().iterator();
            while (object4.hasNext()) {
                int n6 = 8;
                Map.Entry entry = (Map.Entry)object4.next();
                for (Object object6 : this.textRenderer.L((class05936)this.creditsRoleText((String)entry.getKey()), n - 16)) {
                    this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, (class01028)object6, n6));
                    n6 = 16;
                }
                for (Object object6 : (Set)entry.getValue()) {
                    n6 = 16;
                    for (class01028 class010285 : this.textRenderer.L((class05936)class00392.y((String)object6), n - 24)) {
                        ContactInformation contactInformation = mod.getContact((String)object6);
                        if (contactInformation != null && contactInformation.get("email").isPresent()) {
                            this.method_25321((class01202)new DescriptionListWidget$MailableContactEntry(this, class010285, (String)contactInformation.get("email").get(), n6));
                        } else {
                            this.method_25321((class01202)new DescriptionListWidget$DescriptionEntry(this, class010285, n6));
                        }
                        n6 = 24;
                    }
                }
                if (!object4.hasNext()) continue;
                this.method_25321((class01202)descriptionListWidget$DescriptionEntry);
            }
        }
    }

    public /* synthetic */ class01202 method_25334() {
        return this.getSelectedOrNull();
    }

    public void method_47399(class03428 class034282) {
        if (this.selectedMod != null) {
            class034282.N(class03457.field_33788, this.selectedMod.getTranslatedName() + " " + this.selectedMod.getPrefixedVersion());
        }
    }

    public int method_25322() {
        return this.field_22758 - 10;
    }

    public void method_25311(class01054 class010542, int n, int n2, float f) {
        this.method_49603(class010542);
        super.method_25311(class010542, n, n2, f);
        class010542.R();
    }

    public int method_65507() {
        return this.field_22758 - 6 + this.method_46426();
    }
}

