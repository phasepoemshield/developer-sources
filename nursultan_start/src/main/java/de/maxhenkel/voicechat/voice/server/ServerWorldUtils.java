/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.voice.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06889;

public class ServerWorldUtils {
    public static boolean isInRange(class06889 class068892, class06889 class068893, double d) {
        return class068892.M(class068893) <= d * d;
    }

    public static Collection<class04770> getPlayersInRange(class04782 class047822, class06889 class068892, double d, @Nullable Predicate<class04770> predicate) {
        ArrayList<class04770> arrayList = new ArrayList<class04770>();
        List list = class047822.method_18456();
        for (int i = 0; i < list.size(); ++i) {
            class04770 class047702 = (class04770)list.get(i);
            if (!ServerWorldUtils.isInRange(class047702.method_73189(), class068892, d) || predicate != null && !predicate.test(class047702)) continue;
            arrayList.add(class047702);
        }
        return arrayList;
    }
}

