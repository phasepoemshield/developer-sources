/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viaversion.util.DumpUtil
 *  minecraft.class00392
 *  minecraft.class04654
 *  minecraft.class05362
 *  minecraft.class06197
 *  minecraft.class07536
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viaversion.util.DumpUtil;
import java.io.File;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class04654;
import minecraft.class05362;
import minecraft.class06197;
import minecraft.class07536;

public final class ReportIssuesScreen
extends VFPScreen {
    public static final ReportIssuesScreen INSTANCE = new ReportIssuesScreen();
    private final Map<String, Runnable> actions = new LinkedHashMap<String, Runnable>();
    private long delay = -1L;

    public ReportIssuesScreen() {
        super((class00392)class00392.L((String)"screen.viafabricplus.report_issues"), true);
        if (!this.actions.isEmpty()) {
            return;
        }
        this.actions.put("report.viafabricplus.bug_report", () -> {
            class07536.m().N(URI.create("https://github.com/ViaVersion/ViaFabricPlus/issues/new?assignees=&labels=bug&projects=&template=bug_report.yml"));
            this.setupSubtitle((class00392)class00392.L((String)"report.viafabricplus.bug_report.response"));
        });
        this.actions.put("report.viafabricplus.feature_request", () -> {
            class07536.m().N(URI.create("https://github.com/ViaVersion/ViaFabricPlus/issues/new?assignees=&labels=enhancement&projects=&template=feature_request.yml"));
            this.setupSubtitle((class00392)class00392.L((String)"report.viafabricplus.feature_request.response"));
        });
        this.actions.put("report.viafabricplus.create_via_dump", () -> DumpUtil.postDump((UUID)this.field_22787.Ny().y()).whenComplete((string, throwable) -> {
            if (throwable != null) {
                this.setupSubtitle((class00392)class00392.L((String)"report.viafabricplus.create_via_dump.failed"));
                ViaFabricPlusImpl.INSTANCE.getLogger().error("Failed to create a dump", throwable);
                return;
            }
            this.setupSubtitle((class00392)class00392.L((String)"report.viafabricplus.create_via_dump.success"));
            ((class06197)this.field_22787.L_3).N(string);
        }));
        this.actions.put("report.viafabricplus.open_logs", () -> {
            class07536.m().N(new File((File)this.field_22787.l_1, "logs"));
            this.setupSubtitle((class00392)class00392.L((String)"report.viafabricplus.open_logs.response"));
        });
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.setupDefaultSubtitle();
        int n = 0;
        for (Map.Entry<String, Runnable> entry : this.actions.entrySet()) {
            this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)entry.getKey()), class053622 -> ((Runnable)entry.getValue()).run()).N(this.field_22789 / 2 - 100, this.field_22790 / 2 - 25 + n * 23).y(200, 20).N());
            ++n;
        }
    }

    public void method_25393() {
        super.method_25393();
        if (this.delay != -1L && System.currentTimeMillis() - this.delay > 5000L) {
            this.setupDefaultSubtitle();
            this.delay = -1L;
        }
    }

    @Override
    public void setupSubtitle(class00392 class003922) {
        super.setupSubtitle(class003922);
        this.delay = System.currentTimeMillis();
    }
}

