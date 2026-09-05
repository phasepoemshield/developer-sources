/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 */
package minecraft;

import java.util.Arrays;
import java.util.Collection;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class05216;

public class class05220 {
    public static final class00392 N = class00392.i();
    public static final class00392 y = class00392.L((String)"options.on");
    public static final class00392 L = class00392.L((String)"options.off");
    public static final class00392 u = class00392.L((String)"gui.done");
    public static final class00392 i = class00392.L((String)"gui.cancel");
    public static final class00392 R = class00392.L((String)"gui.yes");
    public static final class00392 M = class00392.L((String)"gui.no");
    public static final class00392 B = class00392.L((String)"gui.ok");
    public static final class00392 Z = class00392.L((String)"gui.proceed");
    public static final class00392 z = class00392.L((String)"gui.continue");
    public static final class00392 U = class00392.L((String)"gui.back");
    public static final class00392 E = class00392.L((String)"gui.toTitle");
    public static final class00392 W = class00392.L((String)"gui.acknowledge");
    public static final class00392 m = class00392.L((String)"chat.link.open");
    public static final class00392 P = class00392.L((String)"chat.copy");
    public static final class00392 s = class00392.L((String)"gui.copy_link_to_clipboard");
    public static final class00392 T = class00392.L((String)"menu.disconnect");
    public static final class00392 b = class00392.L((String)"menu.returnToMenu");
    public static final class00392 j = class00392.L((String)"connect.failed.transfer");
    public static final class00392 v = class00392.L((String)"connect.failed");
    public static final class00392 n = class00392.y((String)"\n");
    public static final class00392 t = class00392.y((String)". ");
    public static final class00392 G = class00392.y((String)"...");
    public static final class00392 l = class05220.N();

    public static class05216 L(long l) {
        return class00392.N((String)"gui.minutes", (Object[])new Object[]{l});
    }

    public static class00392 y(class00392 ... class00392Array) {
        return class05220.N(Arrays.asList(class00392Array));
    }

    public static class00392 y(boolean bl) {
        return bl ? b : T;
    }

    public static class05216 y(long l) {
        return class00392.N((String)"gui.hours", (Object[])new Object[]{l});
    }

    public static class05216 N(class00392 ... class00392Array) {
        class05216 class052162 = class00392.i();
        for (int i = 0; i < class00392Array.length; ++i) {
            class052162.y(class00392Array[i]);
            if (i == class00392Array.length - 1) continue;
            class052162.y(t);
        }
        return class052162;
    }

    public static class05216 N(class00392 class003922, class00392 class003923) {
        return class00392.N((String)"options.generic_value", (Object[])new Object[]{class003922, class003923});
    }

    public static class00392 N(Collection<? extends class00392> collection) {
        return class00390.N(collection, (class00392)n);
    }

    public static class00392 N(boolean bl) {
        return bl ? y : L;
    }

    public static class05216 N() {
        return class00392.y((String)" ");
    }

    public static class05216 N(class00392 class003922, boolean bl) {
        return class00392.N((String)(bl ? "options.on.composed" : "options.off.composed"), (Object[])new Object[]{class003922});
    }

    public static class05216 N(long l) {
        return class00392.N((String)"gui.days", (Object[])new Object[]{l});
    }
}

