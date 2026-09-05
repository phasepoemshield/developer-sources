/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01975
 *  minecraft.class03264
 *  minecraft.class04125
 *  minecraft.class04127
 *  minecraft.class05425
 *  minecraft.class08437
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class00891;
import minecraft.class01975;
import minecraft.class03264;
import minecraft.class04125;
import minecraft.class04127;
import minecraft.class05399;
import minecraft.class05425;
import minecraft.class08437;

public class class05394
implements class05399 {
    private final class00891 N;
    private final List<class05425> y = new ArrayList<class05425>();

    private class05394(class00891 class008912) {
        this.N = class008912;
    }

    @Override
    public class04127 y() {
        return new class04127(Optional.empty(), Optional.of(new class04125(this.y.stream().map(class05425::N).toList())));
    }

    private void N(class01975 class019752) {
        class019752.N(this.N.E());
    }

    public class05394 N(class08437 class084372, class03264 class032642) {
        return this.N(class084372.N(), class032642);
    }

    public class05394 N(class01975 class019752, class03264 class032642) {
        this.N(class019752);
        this.y.add(new class05425(Optional.of(class019752), class032642));
        return this;
    }

    @Override
    public class00891 N() {
        return this.N;
    }

    public class05394 N(class03264 class032642) {
        this.y.add(new class05425(Optional.empty(), class032642));
        return this;
    }

    public static class05394 N(class00891 class008912) {
        return new class05394(class008912);
    }
}

