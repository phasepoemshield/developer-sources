/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01312
 *  minecraft.class04067
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01312;
import minecraft.class04067;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;

public class class04411
extends class05765<class04067> {
    private static final int N = 60;
    private static final int y = 100;
    private int L;

    protected void L(class04782 class047822, class04067 class040672, long l) {
        class040672.method_18380(class01312.field_18076);
    }

    public class04411() {
        super((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18457), 100);
    }

    protected void u(class04782 class047822, class04067 class040672, long l) {
        ++this.L;
    }

    protected void y(class04782 class047822, class04067 class040672, long l) {
        if (class040672.method_52535()) {
            return;
        }
        class040672.method_18380(class01312.field_37422);
        this.L = 0;
    }

    protected boolean N(class04782 class047822, class04067 class040672) {
        return class040672.method_18376() == class01312.field_18076;
    }

    protected boolean N(class04782 class047822, class04067 class040672, long l) {
        return this.L < 60;
    }
}

