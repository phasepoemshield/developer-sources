/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09763
 *  Nursultan.class09764
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  minecraft.class04189
 */
package minecraft;

import Nursultan.class09763;
import Nursultan.class09764;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.util.Queue;
import minecraft.class04189;

public class class02576 {
    private static final int N = 8;
    private final Queue<class09763> y = new class04189();
    private final Object2IntLinkedOpenHashMap<class09764> L = new Object2IntLinkedOpenHashMap();

    private static long y() {
        return System.currentTimeMillis();
    }

    public synchronized String N() {
        long l = class02576.y();
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.y.isEmpty()) {
            stringBuilder.append("\n\t\tLatest entries:\n");
            for (class09763 class097632 : this.y) {
                stringBuilder.append("\t\t\t").append(class097632.y()).append(":").append(class097632.L()).append(": ").append(class097632.u()).append(" (").append(l - class097632.N()).append("ms ago)").append("\n");
            }
        }
        if (!this.L.isEmpty()) {
            if (stringBuilder.isEmpty()) {
                stringBuilder.append("\n");
            }
            stringBuilder.append("\t\tEntry counts:\n");
            for (class09763 class097632 : Object2IntMaps.fastIterable(this.L)) {
                stringBuilder.append("\t\t\t").append(((class09764)class097632.getKey()).N()).append(":").append(((class09764)class097632.getKey()).y()).append(" x ").append(class097632.getIntValue()).append("\n");
            }
        }
        if (stringBuilder.isEmpty()) {
            return "~~NONE~~";
        }
        return stringBuilder.toString();
    }

    public synchronized void N(String string, Throwable throwable) {
        long l = class02576.y();
        String string2 = throwable.getMessage();
        this.y.add(new class09763(l, string, throwable.getClass(), string2));
        while (this.y.size() > 8) {
            this.y.remove();
        }
        class09764 class097642 = new class09764(string, throwable.getClass());
        int n = this.L.getInt((Object)class097642);
        this.L.putAndMoveToFirst((Object)class097642, n + 1);
    }
}

