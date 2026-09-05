/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.logging.LogUtils
 *  minecraft.class00068
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01894
 *  minecraft.class04563
 *  minecraft.class05304
 *  minecraft.class06202
 *  minecraft.class07980
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import minecraft.class00068;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01894;
import minecraft.class04563;
import minecraft.class05304;
import minecraft.class05681;
import minecraft.class05692;
import minecraft.class05697;
import minecraft.class05714;
import minecraft.class05724;
import minecraft.class06202;
import minecraft.class07980;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05691
extends class05724<class05681> {
    static final class01894 N = class01894.y((String)"server_list/incompatible");
    static final class01894 y = class01894.y((String)"server_list/unreachable");
    static final class01894 L = class01894.y((String)"server_list/ping_1");
    static final class01894 u = class01894.y((String)"server_list/ping_2");
    static final class01894 i = class01894.y((String)"server_list/ping_3");
    static final class01894 R = class01894.y((String)"server_list/ping_4");
    static final class01894 M = class01894.y((String)"server_list/ping_5");
    static final class01894 B = class01894.y((String)"server_list/pinging_1");
    static final class01894 Z = class01894.y((String)"server_list/pinging_2");
    static final class01894 z = class01894.y((String)"server_list/pinging_3");
    static final class01894 U = class01894.y((String)"server_list/pinging_4");
    static final class01894 E = class01894.y((String)"server_list/pinging_5");
    static final class01894 W = class01894.y((String)"server_list/join_highlighted");
    static final class01894 m = class01894.y((String)"server_list/join");
    static final class01894 P = class01894.y((String)"server_list/move_up_highlighted");
    static final class01894 s = class01894.y((String)"server_list/move_up");
    static final class01894 T = class01894.y((String)"server_list/move_down_highlighted");
    static final class01894 b = class01894.y((String)"server_list/move_down");
    static final Logger j = LogUtils.getLogger();
    static final ThreadPoolExecutor v = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(j)).build());
    static final class00392 n = class00392.L((String)"lanServer.scanning");
    static final class00392 t = class00392.L((String)"multiplayer.status.cannot_resolve").y(-65536);
    static final class00392 G = class00392.L((String)"multiplayer.status.cannot_connect").y(-65536);
    static final class00392 l = class00392.L((String)"multiplayer.status.incompatible");
    static final class00392 d = class00392.L((String)"multiplayer.status.no_connection");
    static final class00392 w = class00392.L((String)"multiplayer.status.pinging");
    static final class00392 k = class00392.L((String)"multiplayer.status.online");
    private final class05304 Y;
    private final List<class05692> Q = Lists.newArrayList();
    private final class05681 O = new class05714();
    private final List<class05697> g = Lists.newArrayList();

    static /* synthetic */ void L(class05691 class056912, class01054 class010542) {
        class056912.method_76256(class010542);
    }

    private void L() {
        class05681 class056812 = (class05681)this.method_25334();
        ArrayList<class05692> arrayList = new ArrayList<class05692>(this.Q);
        arrayList.add((class05692)this.O);
        arrayList.addAll(this.g);
        this.method_25314(arrayList);
        if (class056812 != null) {
            for (class05681 class056813 : arrayList) {
                if (!class056813.N(class056812)) continue;
                this.method_25313(class056813);
                break;
            }
        }
    }

    public class05691(class05304 class053042, class06202 class062022, int n, int n2, int n3, int n4) {
        super(class062022, n, n2, n3, n4);
        this.Y = class053042;
    }

    static /* synthetic */ void y(class05691 class056912, class01054 class010542) {
        class056912.method_76256(class010542);
    }

    public void y() {
    }

    static /* synthetic */ void N(class05691 class056912, int n, int n2) {
        class056912.method_73368(n, n2);
    }

    public void method_25313(@Nullable class05681 class056812) {
        super.method_25313((class01202)class056812);
        this.Y.N();
    }

    public void N(List<class00068> list) {
        int n = list.size() - this.g.size();
        this.g.clear();
        for (class00068 object : list) {
            this.g.add(new class05697(this.Y, object));
        }
        this.L();
        for (int i = this.g.size() - n; i < this.g.size(); ++i) {
            class05697 class056972 = this.g.get(i);
            int n2 = i - this.g.size() + this.method_25396().size();
            int n3 = this.method_25337(n2);
            if (this.method_25319(n2) < this.method_46427() || n3 > this.method_55443()) continue;
            this.field_22740.NT().L((class00392)class00392.N((String)"multiplayer.lan.server_found", (Object[])new Object[]{class056972.y()}));
        }
    }

    public void N(class04563 class045632) {
        this.Q.clear();
        for (int i = 0; i < class045632.L(); ++i) {
            this.Q.add(new class05692(this, this.Y, class045632.N(i)));
        }
        this.L();
    }

    static /* synthetic */ void N(class05691 class056912, class01054 class010542) {
        class056912.method_76256(class010542);
    }

    public int method_25322() {
        return 305;
    }
}

