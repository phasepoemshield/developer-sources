/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03608
 *  minecraft.class05096
 *  minecraft.class05220
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03608;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05389;

public abstract class class05407
extends class05096 {
    protected static final int G = 17;
    protected static final int l = 7;
    protected static final long d = 0x140000000L;
    protected static final int w = -11776948;
    protected static final int k = -9671572;
    protected static final int Y = -8388737;
    protected static final int Q = -13408581;
    protected static final int O = -9670204;
    protected static final int g = 32;
    protected static final int I = 8;
    protected static final class01894 J = class01894.y((String)"textures/gui/title/realms.png");
    protected static final int o = 128;
    protected static final int q = 34;
    protected static final int K = 128;
    protected static final int V = 64;
    private final List<class05389> N = Lists.newArrayList();

    public class05407(class00392 class003922) {
        super(class003922);
    }

    protected static class03608 U() {
        return class03608.N((int)128, (int)34, (class01894)J, (int)128, (int)64);
    }

    public class00392 z() {
        return class05220.N((Collection)this.N.stream().map(class05389::N).collect(Collectors.toList()));
    }

    protected static int N(int n) {
        return 40 + n * 13;
    }

    protected class05389 N(class05389 class053892) {
        this.N.add(class053892);
        return (class05389)this.method_37060(class053892);
    }
}

