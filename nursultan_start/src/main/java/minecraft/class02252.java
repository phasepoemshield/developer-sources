/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class03723
 *  minecraft.class03754
 *  minecraft.class05096
 *  minecraft.class05220
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class03723;
import minecraft.class03754;
import minecraft.class05096;
import minecraft.class05220;

public class class02252 {
    private static final int N = 8226750;
    private static final class00392 y = class00392.L((String)"mco.info").y(8226750);
    private static final class00392 L = class00392.L((String)"mco.warning").y(-65536);

    public static class03723 L(class05096 class050962, class00392 class003922, Consumer<class03723> consumer) {
        return new class03754(class050962, L).N(class003922).N(class05220.B, consumer).N();
    }

    public static class03723 y(class05096 class050962, class00392 class003922, Consumer<class03723> consumer) {
        return new class03754(class050962, L).N(class003922).N(class05220.z, consumer).N(class05220.i, class03723::method_25419).N();
    }

    public static class03723 N(class05096 class050962, class00392 class003922, class00392 class003923, Consumer<class03723> consumer) {
        return new class03754(class050962, class003922).N(class003923).N(class05220.z, consumer).N(class05220.i, class03723::method_25419).N();
    }

    public static class03723 N(class05096 class050962, class00392 class003922, Consumer<class03723> consumer) {
        return new class03754(class050962, y).N(class003922).N(class05220.z, consumer).N(class05220.i, class03723::method_25419).N();
    }
}

