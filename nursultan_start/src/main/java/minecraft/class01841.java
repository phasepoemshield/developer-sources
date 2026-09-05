/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00648
 *  minecraft.class02277
 *  minecraft.class02897
 *  minecraft.class03215
 *  minecraft.class03299
 *  minecraft.class03556
 *  minecraft.class04748
 *  minecraft.class05530
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import minecraft.class00648;
import minecraft.class01834;
import minecraft.class02277;
import minecraft.class02897;
import minecraft.class03215;
import minecraft.class03299;
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class05530;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01841
implements class01834 {
    private static final Logger y = LogUtils.getLogger();
    static final class03299 N = bl -> {};

    @Override
    public Path L() {
        throw new IllegalStateException("Attempted to stop Flight Recorder, but it's not supported on this JVM");
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public void y(class00648 class006482, class02897<?> class028972, SocketAddress socketAddress, int n) {
    }

    @Override
    public void y(class02277 class022772, class07321 class073212, class05530 class055302, int n) {
    }

    @Override
    public void N(float f) {
    }

    @Override
    public @Nullable class03299 N(class07321 class073212, class05946<class07299> class059462, String string) {
        return null;
    }

    @Override
    public class03299 N(class07321 class073212, class05946<class07299> class059462, class03556<class04748> class035562) {
        return N;
    }

    @Override
    public void N(class02277 class022772, class07321 class073212, class05530 class055302, int n) {
    }

    @Override
    public boolean N(class03215 class032152) {
        y.warn("Attempted to start Flight Recorder, but it's not supported on this JVM");
        return false;
    }

    @Override
    public void N(class00648 class006482, class02897<?> class028972, SocketAddress socketAddress, int n) {
    }

    @Override
    public void N(int n) {
    }

    @Override
    public class03299 R() {
        return N;
    }
}

