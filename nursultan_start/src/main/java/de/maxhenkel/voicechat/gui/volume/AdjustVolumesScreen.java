/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class06613
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.volume;

import de.maxhenkel.voicechat.gui.VoiceChatScreenBase;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumeList;
import java.util.Locale;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class06613;
import minecraft.class08394;

public class AdjustVolumesScreen
extends VoiceChatScreenBase {
    protected static final class01894 TEXTURE = class01894.N((String)"voicechat", (String)"textures/gui/gui_volumes.png");
    protected static final class00392 TITLE = class00392.L((String)"gui.voicechat.adjust_volume.title");
    protected static final class00392 SEARCH_HINT = class00392.L((String)"message.voicechat.search_hint").N(class06541.field_1056).N(class06541.field_1080);
    protected static final class00392 EMPTY_SEARCH = class00392.L((String)"message.voicechat.search_empty").N(class06541.field_1080);
    protected static final int HEADER_SIZE = 16;
    protected static final int FOOTER_SIZE = 8;
    protected static final int SEARCH_HEIGHT = 16;
    protected static final int UNIT_SIZE = 18;
    protected static final int CELL_HEIGHT = 36;
    protected AdjustVolumeList volumeList;
    protected class04927 searchBox;
    protected String lastSearch = "";
    protected int units;

    public AdjustVolumesScreen() {
        super(TITLE, 236, 0);
    }

    private void checkSearchStringUpdate(String string) {
        if (!(string = string.toLowerCase(Locale.ROOT)).equals(this.lastSearch)) {
            this.volumeList.setFilter(string);
            this.lastSearch = string;
        }
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.guiLeft += 2;
        this.guiTop = 32;
        int n = class04995.u((float)3.1111112f);
        this.units = Math.max(n, (this.field_22790 - 16 - 8 - this.guiTop * 2 - 16) / 18);
        this.ySize = 16 + this.units * 18 + 8;
        if (this.volumeList != null) {
            this.volumeList.updateSize(this.field_22789, this.units * 18 - 16, 0, this.guiTop + 16 + 16);
        } else {
            this.volumeList = new AdjustVolumeList(this.field_22789, this.units * 18 - 16, this.guiTop + 16 + 16, 36, this);
        }
        String string = this.searchBox != null ? this.searchBox.method_1882() : "";
        this.searchBox = new class04927(this.field_22793, this.guiLeft + 28, this.guiTop + 16 + 6, 196, 16, SEARCH_HINT);
        this.searchBox.method_1880(16);
        this.searchBox.method_1858(false);
        this.searchBox.method_1862(true);
        this.searchBox.method_1868(-1);
        this.searchBox.method_1852(string);
        this.searchBox.method_1863(this::checkSearchStringUpdate);
        this.method_25429((class04654)this.searchBox);
        this.method_25429((class04654)this.volumeList);
    }

    public void method_25393() {
        super.method_25393();
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop, 0.0f, 0.0f, this.xSize, 16, 256, 256);
        for (int i = 0; i < this.units; ++i) {
            class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop + 16 + 18 * i, 0.0f, 16.0f, this.xSize, 18, 256, 256);
        }
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop + 16 + 18 * this.units, 0.0f, 34.0f, this.xSize, 8, 256, 256);
        class010542.N(class08394.Na, TEXTURE, this.guiLeft + 10, this.guiTop + 16 + 6 - 2, (float)this.xSize, 0.0f, 12, 12, 256, 256);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.searchBox.method_25370()) {
            this.searchBox.method_25402(class066132, bl);
        }
        return super.method_25402(class066132, bl);
    }

    @Override
    public void renderForeground(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.field_22793, TITLE, this.field_22789 / 2 - this.field_22793.N((class05936)TITLE) / 2, this.guiTop + 5, -12566464, false);
        if (!this.volumeList.isEmpty()) {
            this.volumeList.method_25394(class010542, n, n2, f);
        } else if (!this.searchBox.method_1882().isEmpty()) {
            int n3 = this.field_22789 / 2;
            int n4 = this.guiTop + 16 + this.units * 18 / 2;
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, EMPTY_SEARCH, n3, n4 - 9 / 2, -1);
        }
        if (!this.searchBox.method_25370() && this.searchBox.method_1882().isEmpty()) {
            class010542.N(this.field_22793, SEARCH_HINT, this.searchBox.method_46426(), this.searchBox.method_46427(), -1, false);
        } else {
            this.searchBox.method_25394(class010542, n, n2, f);
        }
    }
}

