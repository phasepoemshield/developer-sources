/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class05699
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class07018
 *  minecraft.class07536
 *  minecraft.class08394
 *  minecraft.class08829
 *  minecraft.class08918
 */
package com.terraformersmc.modmenu.gui.widget.entries;

import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.gui.widget.ModListWidget;
import com.terraformersmc.modmenu.gui.widget.UpdateAvailableBadge;
import com.terraformersmc.modmenu.gui.widget.entries.ParentEntry;
import com.terraformersmc.modmenu.util.DrawingUtil;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.ModBadgeRenderer;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class05699;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class07018;
import minecraft.class07536;
import minecraft.class08394;
import minecraft.class08829;
import minecraft.class08918;

public class ModListEntry
extends class05699<ModListEntry> {
    public static final class01894 UNKNOWN_ICON = class01894.y((String)"textures/misc/unknown_pack.png");
    private static final class01894 MOD_CONFIGURATION_ICON = class01894.N((String)"modmenu", (String)"textures/gui/mod_configuration.png");
    private static final class01894 ERROR_ICON = class01894.y((String)"world_list/error");
    private static final class01894 ERROR_HIGHLIGHTED_ICON = class01894.y((String)"world_list/error_highlighted");
    protected final class06202 client;
    public final Mod mod;
    protected final ModListWidget list;
    protected class01894 iconLocation;
    protected static final int FULL_ICON_SIZE = 32;
    protected static final int COMPACT_ICON_SIZE = 19;
    protected long sinceLastClick;
    protected int yOffset = 0;

    public ModListEntry(Mod mod, ModListWidget modListWidget) {
        this.mod = mod;
        this.list = modListWidget;
        this.client = class06202.Nq();
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.list.select(this);
        if (ModMenuConfig.QUICK_CONFIGURE.getValue() && this.list.getParent().getModHasConfigScreen(this.mod.getId())) {
            int n;
            int n2 = n = ModMenuConfig.COMPACT_LIST.getValue() ? 19 : 32;
            if (class066132.n() - (double)this.list.method_25342() <= (double)n) {
                this.openConfig();
            } else if (class07536.L() - this.sinceLastClick < 250L) {
                this.openConfig();
            }
        }
        this.sinceLastClick = class07536.L();
        return true;
    }

    public class01894 getIconTexture() {
        if (this.iconLocation == null) {
            this.iconLocation = class01894.N((String)"modmenu", (String)(this.mod.getId() + "_icon"));
            class08829 class088292 = this.mod.getIcon(this.list.getFabricIconHandler(), 64 * (Integer)((class05630)this.client.i_7).Nq().method_41753());
            this.client.NO().N(this.iconLocation, (class08918)class088292);
        }
        return this.iconLocation;
    }

    public void openConfig() {
        this.list.getParent().safelyOpenConfigScreen(this.mod.getId());
    }

    public Mod getMod() {
        return this.mod;
    }

    public void setYOffset(int n) {
        this.yOffset = n;
    }

    public int getYOffset() {
        return this.yOffset;
    }

    public int getXOffset() {
        return 0;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class05216 class052162;
        int n3 = this.method_46426() + this.getXOffset();
        int n4 = this.method_73382() + this.getYOffset();
        int n5 = this.method_73387();
        int n6 = ModMenuConfig.COMPACT_LIST.getValue() ? 19 : 32;
        String string = this.mod.getId();
        if ("java".equals(string)) {
            DrawingUtil.drawRandomVersionBackground(this.mod, class010542, n3, n4, n6, n6);
        }
        class010542.N(class08394.Na, this.getIconTexture(), n3, n4, 0.0f, 0.0f, n6, n6, n6, n6, class02566.y((float)1.0f));
        class05216 class052163 = class052162 = class00392.y((String)this.mod.getTranslatedName());
        int n7 = n5 - n6 - 3;
        class01590 class015902 = (class01590)this.client.i_3;
        if (class015902.N((class05936)class052162) > n7) {
            class05936 class059362 = class05936.R((String)"...");
            class052163 = class05936.N((class05936[])new class05936[]{class015902.N((class05936)class052162, n7 - class015902.N(class059362)), class059362});
        }
        class010542.y(class015902, class07018.y().N((class05936)class052163), n3 + n6 + 3, n4 + 1, -1);
        int n8 = 0;
        if (ModMenuConfig.UPDATE_CHECKER.getValue() && !ModMenuConfig.DISABLE_UPDATE_CHECKER.getValue().contains(string) && (this.mod.hasUpdate() || this.mod.getChildHasUpdate())) {
            UpdateAvailableBadge.renderBadge(class010542, n3 + n6 + 3 + class015902.N((class05936)class052162) + 2, n4);
            n8 = 11;
        }
        if (!ModMenuConfig.HIDE_BADGES.getValue()) {
            new ModBadgeRenderer(n3 + n6 + 3 + class015902.N((class05936)class052162) + 2 + n8, n4, n3 + n5, this.mod, this.list.getParent()).draw(class010542, n, n2);
        }
        if (!ModMenuConfig.COMPACT_LIST.getValue()) {
            String string2 = this.mod.getSummary();
            Objects.requireNonNull((class01590)this.client.i_3);
            DrawingUtil.drawWrappedString(class010542, string2, n3 + n6 + 3 + 4, n4 + 9 + 2, n5 - n6 - 7, 2, -8355712);
        } else {
            String string3 = this.mod.getPrefixedVersion();
            Objects.requireNonNull((class01590)this.client.i_3);
            DrawingUtil.drawWrappedString(class010542, string3, n3 + n6 + 3, n4 + 9 + 2, n5 - n6 - 7, 2, -8355712);
        }
        if (!(this instanceof ParentEntry) && ModMenuConfig.QUICK_CONFIGURE.getValue() && (this.list.getParent().getModHasConfigScreen(string) || this.list.getParent().modScreenErrors.containsKey(string))) {
            int n9 = ModMenuConfig.COMPACT_LIST.getValue() ? 152 : 256;
            if (((Boolean)((class05630)this.client.i_7).Nm().method_41753()).booleanValue() || bl) {
                boolean bl2;
                class010542.N(n3, n4, n3 + n6, n4 + n6, -1601138544);
                boolean bl3 = bl2 = n - n3 < n6;
                if (this.list.getParent().modScreenErrors.containsKey(string)) {
                    class010542.N(class08394.Na, bl2 ? ERROR_HIGHLIGHTED_ICON : ERROR_ICON, n3, n4, n6, n6);
                } else {
                    int n10 = bl2 ? n6 : 0;
                    class010542.N(class08394.Na, MOD_CONFIGURATION_ICON, n3, n4, 0.0f, (float)n10, n6, n6, n9, n9, class02566.y((float)1.0f));
                }
                if (bl2) {
                    class010542.N(this.M() ? class06608.u : class06608.B);
                }
            }
        }
    }

    public class00392 method_37006() {
        return class00392.y((String)this.mod.getTranslatedName());
    }
}

