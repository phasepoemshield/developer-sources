/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00648
 *  minecraft.class02277
 *  minecraft.class02897
 *  minecraft.class03215
 *  minecraft.class03223
 *  minecraft.class03299
 *  minecraft.class03556
 *  minecraft.class04748
 *  minecraft.class05530
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.net.SocketAddress;
import java.nio.file.Path;
import jdk.jfr.FlightRecorder;
import minecraft.class00648;
import minecraft.class01841;
import minecraft.class02277;
import minecraft.class02897;
import minecraft.class03215;
import minecraft.class03223;
import minecraft.class03299;
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class05530;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public interface class01834 {
    public static final class01834 M = Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() && FlightRecorder.isAvailable() ? class03223.y() : new class01841();

    public Path L();

    public boolean i();

    public boolean u();

    public void y(class02277 var1, class07321 var2, class05530 var3, int var4);

    public void y(class00648 var1, class02897<?> var2, SocketAddress var3, int var4);

    public void N(float var1);

    public boolean N(class03215 var1);

    public @Nullable class03299 N(class07321 var1, class05946<class07299> var2, String var3);

    public @Nullable class03299 N(class07321 var1, class05946<class07299> var2, class03556<class04748> var3);

    public void N(class00648 var1, class02897<?> var2, SocketAddress var3, int var4);

    public void N(int var1);

    public void N(class02277 var1, class07321 var2, class05530 var3, int var4);

    public @Nullable class03299 R();
}

