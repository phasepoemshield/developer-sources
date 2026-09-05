/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01091
 *  minecraft.class01202
 *  minecraft.class01894
 *  minecraft.class03428
 *  minecraft.class04749
 *  minecraft.class05096
 *  minecraft.class05724
 *  minecraft.class05942
 *  minecraft.class05944
 *  minecraft.class05978
 *  minecraft.class06202
 *  minecraft.class06325
 *  minecraft.class06434
 *  minecraft.class06541
 *  minecraft.class07080
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01091;
import minecraft.class01202;
import minecraft.class01894;
import minecraft.class03428;
import minecraft.class04749;
import minecraft.class05096;
import minecraft.class05213;
import minecraft.class05217;
import minecraft.class05226;
import minecraft.class05724;
import minecraft.class05942;
import minecraft.class05944;
import minecraft.class05978;
import minecraft.class06202;
import minecraft.class06325;
import minecraft.class06434;
import minecraft.class06541;
import minecraft.class07080;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05231
extends class05724<class05978> {
    public static final DateTimeFormatter N = class07536.N((FormatStyle)FormatStyle.SHORT);
    static final class01894 y = class01894.y((String)"world_list/error_highlighted");
    static final class01894 L = class01894.y((String)"world_list/error");
    static final class01894 u = class01894.y((String)"world_list/marked_join_highlighted");
    static final class01894 i = class01894.y((String)"world_list/marked_join");
    static final class01894 R = class01894.y((String)"world_list/warning_highlighted");
    static final class01894 M = class01894.y((String)"world_list/warning");
    static final class01894 B = class01894.y((String)"world_list/join_highlighted");
    static final class01894 Z = class01894.y((String)"world_list/join");
    static final Logger z = LogUtils.getLogger();
    static final class00392 U = class00392.L((String)"selectWorld.tooltip.fromNewerVersion1").N(class06541.field_1061);
    static final class00392 E = class00392.L((String)"selectWorld.tooltip.fromNewerVersion2").N(class06541.field_1061);
    static final class00392 W = class00392.L((String)"selectWorld.tooltip.snapshot1").N(class06541.field_1065);
    static final class00392 m = class00392.L((String)"selectWorld.tooltip.snapshot2").N(class06541.field_1065);
    static final class00392 P = class00392.L((String)"selectWorld.locked").N(class06541.field_1061);
    static final class00392 s = class00392.L((String)"selectWorld.conversion.tooltip").N(class06541.field_1061);
    static final class00392 T = class00392.L((String)"selectWorld.incompatible.tooltip").N(class06541.field_1061);
    static final class00392 b = class00392.L((String)"selectWorld.experimental");
    private final class05096 n;
    private CompletableFuture<List<class06434>> t;
    private @Nullable List<class06434> G;
    private final class05942 l;
    final class05217 j;
    private String d;
    private boolean w;
    private final @Nullable Consumer<class06434> k;
    final @Nullable Consumer<class05944> v;

    public Optional<class05944> L() {
        class05978 class059782 = (class05978)this.method_25334();
        if (class059782 instanceof class05944) {
            return Optional.of((class05944)class059782);
        }
        return Optional.empty();
    }

    class05231(class05096 class050962, class06202 class062022, int n, int n2, String string, @Nullable class05231 class052312, @Nullable Consumer<class06434> consumer, @Nullable Consumer<class05944> consumer2, class05217 class052172) {
        super(class062022, n, n2, 0, 36);
        this.n = class050962;
        this.l = new class05942(class062022);
        this.d = string;
        this.k = consumer;
        this.v = consumer2;
        this.j = class052172;
        this.t = class052312 != null ? class052312.t : this.Z();
        this.method_25321((class01202)this.l);
        this.N(this.R());
    }

    private CompletableFuture<List<class06434>> Z() {
        class04749 class047492;
        try {
            class047492 = this.field_22740.NL().y();
        }
        catch (class01091 class010912) {
            z.error("Couldn't load level list", (Throwable)class010912);
            this.N(class010912.N());
            return CompletableFuture.completedFuture(List.of());
        }
        return this.field_22740.NL().N(class047492).exceptionally(throwable -> {
            this.field_22740.u(class07080.N((Throwable)throwable, (String)"Couldn't load level list"));
            return List.of();
        });
    }

    public class05096 i() {
        return this.n;
    }

    private void z() {
        this.method_65506();
        this.n.method_37064(true);
    }

    public void u() {
        this.y();
        this.field_22740.N(this.n);
    }

    public void y() {
        this.t = this.Z();
    }

    static /* synthetic */ void y(class05231 class052312, class01054 class010542) {
        class052312.method_76256(class010542);
    }

    static /* synthetic */ class06202 N(class05231 class052312) {
        return class052312.field_22740;
    }

    private void N(String string, List<class06434> list) {
        ArrayList<class05944> arrayList = new ArrayList<class05944>();
        Optional<class05944> var4 = this.L();
        class05944 class059442 = null;
        for (class06434 class064343 : list.stream().filter(class064342 -> this.N(string.toLowerCase(Locale.ROOT), (class06434)class064342)).toList()) {
            class05944 class059443 = new class05944(this, this, class064343);
            if (var4.isPresent() && var4.get().z().N().equals(class059443.z().N())) {
                class059442 = class059443;
            }
            arrayList.add(class059443);
        }
        this.method_73373(this.method_25396().stream().filter(class059782 -> !arrayList.contains(class059782)).toList());
        arrayList.forEach(class059782 -> {
            if (!this.method_25396().contains(class059782)) {
                this.method_25321((class01202)class059782);
            }
        });
        this.method_25313((class05978)class059442);
        this.z();
    }

    private boolean N(String string, class06434 class064342) {
        return class064342.y().toLowerCase(Locale.ROOT).contains(string) || class064342.N().toLowerCase(Locale.ROOT).contains(string);
    }

    public void N(String string) {
        if (this.G != null && !string.equals(this.d)) {
            this.N(string, this.G);
        }
        this.d = string;
    }

    private void N(class00392 class003922) {
        this.field_22740.N((class05096)new class06325((class00392)class00392.L((String)"selectWorld.unable_to_load"), class003922));
    }

    public void method_25313(@Nullable class05978 class059782) {
        super.method_25313((class01202)class059782);
        if (this.k != null) {
            this.k.accept(class059782 instanceof class05944 ? ((class05944)class059782).N : null);
        }
    }

    static /* synthetic */ void N(class05231 class052312, class01054 class010542) {
        class052312.method_76256(class010542);
    }

    private void N(@Nullable List<class06434> list) {
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            switch (this.j.ordinal()) {
                case 0: {
                    class05213.N(this.field_22740, () -> this.field_22740.N(null));
                    break;
                }
                case 1: {
                    this.method_25339();
                    this.method_25321((class01202)new class05226(class00392.L((String)"mco.upload.select.world.none"), this.n.method_64506()));
                }
            }
        } else {
            this.N(this.d, list);
            this.G = list;
        }
    }

    private @Nullable List<class06434> R() {
        try {
            List list;
            List var1 = this.t.getNow(null);
            if (this.j == class05217.field_62202) {
                if (var1 != null && !this.w) {
                    this.w = true;
                    list = var1.stream().filter(class06434::t).toList();
                } else {
                    return null;
                }
            }
            return list;
        }
        catch (CancellationException | CompletionException runtimeException) {
            return null;
        }
    }

    public void method_47399(class03428 class034282) {
        if (this.method_25396().contains(this.l)) {
            this.l.method_37020(class034282);
            return;
        }
        super.method_47399(class034282);
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        List<class06434> var5 = this.R();
        if (var5 != this.G) {
            this.N(var5);
        }
        super.method_48579(class010542, n, n2, f);
    }

    public void method_25339() {
        this.method_25396().forEach(class05978::close);
        super.method_25339();
    }

    public int method_25322() {
        return 270;
    }
}

