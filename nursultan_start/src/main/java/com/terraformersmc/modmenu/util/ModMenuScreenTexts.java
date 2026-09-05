/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05220
 *  minecraft.class06541
 */
package com.terraformersmc.modmenu.util;

import minecraft.class00392;
import minecraft.class05220;
import minecraft.class06541;

public final class ModMenuScreenTexts {
    public static final class00392 CONFIGURE = class00392.L((String)"modmenu.configure");
    public static final class00392 DROP_CONFIRM = class00392.L((String)"modmenu.dropConfirm");
    public static final class00392 DROP_INFO_LINE_1 = class00392.L((String)"modmenu.dropInfo.line1");
    public static final class00392 DROP_INFO_LINE_2 = class00392.L((String)"modmenu.dropInfo.line2");
    public static final class00392 DROP_SUCCESSFUL_LINE_1 = class00392.L((String)"modmenu.dropSuccessful.line1");
    public static final class00392 DROP_SUCCESSFUL_LINE_2 = class00392.L((String)"modmenu.dropSuccessful.line2");
    public static final class00392 ISSUES = class00392.L((String)"modmenu.issues");
    public static final class00392 MODS_FOLDER = class00392.L((String)"modmenu.modsFolder");
    public static final class00392 SEARCH = class00392.L((String)"modmenu.search");
    public static final class00392 TITLE = class00392.L((String)"modmenu.title");
    public static final class00392 TOGGLE_FILTER_OPTIONS = class00392.L((String)"modmenu.toggleFilterOptions");
    public static final class00392 WEBSITE = class00392.L((String)"modmenu.website");

    private ModMenuScreenTexts() {
    }

    public static class00392 modIdTooltip(String string) {
        return class00392.N((String)"modmenu.modIdToolTip", (Object[])new Object[]{string});
    }

    public static class00392 configureError(String string, Throwable throwable) {
        return class00392.N((String)"modmenu.configure.error", (Object[])new Object[]{string, string}).y(class05220.n).y(class05220.n).i(throwable.toString()).N(class06541.field_1061);
    }
}

