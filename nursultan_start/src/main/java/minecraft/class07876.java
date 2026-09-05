/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01929
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04770
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07453
 *  minecraft.class08303
 *  minecraft.class08329
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class01929;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04770;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07453;
import minecraft.class08303;
import minecraft.class08329;
import org.slf4j.Logger;

public abstract class class07876
extends class07453 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 100;
    private int L;

    public void method_5773() {
        ++this.L;
        super.method_5773();
    }

    public class07876(class07078<? extends class07876> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public boolean v() {
        return this.L > 100;
    }

    public boolean N(class04770 class047702) {
        try (class04495 class044952 = new class04495(this.method_71370(), N);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)this.method_56673());
            this.method_5647((class08329)class083032);
            class083032.N("id", this.method_5653());
            if (class047702.method_74073(class083032.y())) {
                this.method_31472();
                boolean bl = true;
                return bl;
            }
        }
        return false;
    }
}

