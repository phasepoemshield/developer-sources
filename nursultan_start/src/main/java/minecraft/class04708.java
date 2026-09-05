/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01860
 *  minecraft.class01885
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05103
 *  minecraft.class05129
 *  minecraft.class05153
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05423
 *  minecraft.class06478
 *  minecraft.class06601
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import minecraft.class00392;
import minecraft.class01860;
import minecraft.class01885;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05103;
import minecraft.class05129;
import minecraft.class05153;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05423;
import minecraft.class06478;
import minecraft.class06601;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04708
extends class05407 {
    private static final Logger y = LogUtils.getLogger();
    private static final class05423 L = new class05423(Duration.ofSeconds(5L));
    private final List<class05129> u;
    private final class05096 i;
    protected final class01885 N = class01885.u();
    private volatile class00392 R;
    private @Nullable class01860 M;

    public class04708(class05096 class050962, class05129 ... class05129Array) {
        super(class05153.N);
        this.i = class050962;
        this.u = List.of(class05129Array);
        if (this.u.isEmpty()) {
            throw new IllegalArgumentException("No tasks added");
        }
        this.R = this.u.get(0).N();
        Runnable runnable = () -> {
            for (class05129 class051292 : class05129Array) {
                this.N(class051292.N());
                if (class051292.y()) break;
                class051292.run();
                if (!class051292.y()) continue;
                return;
            }
        };
        Thread thread = new Thread(runnable, "Realms-long-running-task");
        thread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class05103(y));
        thread.start();
    }

    protected void N() {
        Iterator<class05129> var1 = this.u.iterator();
        while (var1.hasNext()) {
            var1.next().i();
        }
        this.field_22787.N(this.i);
    }

    public void N(class00392 class003922) {
        if (this.M != null) {
            this.M.method_25355(class003922);
        }
        this.R = class003922;
    }

    public void method_25426() {
        this.N.L().y();
        this.N.N((class02102)class04708.U());
        this.M = new class01860(this.field_22793, this.R);
        this.N.N((class02102)this.M, (T class020722) -> class020722.L(10).i(30));
        this.N.N((class02102)class05362.method_46430((class00392)class05220.i, class053622 -> this.N()).N());
        this.N.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.v() == 256) {
            this.N();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        this.N.N();
        class02077.N((class02102)this.N, (class03255)this.method_48202());
    }

    public void method_25393() {
        super.method_25393();
        if (this.M != null) {
            L.N(this.field_22787.NT(), this.M.method_25369());
        }
    }

    public boolean method_73339() {
        return false;
    }
}

