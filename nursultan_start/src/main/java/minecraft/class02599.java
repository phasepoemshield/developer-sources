/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02277
 *  minecraft.class07080
 *  minecraft.class07321
 *  minecraft.class07878
 */
package minecraft;

import minecraft.class02277;
import minecraft.class07080;
import minecraft.class07321;
import minecraft.class07878;

public interface class02599 {
    public void y(Throwable var1, class02277 var2, class07321 var3);

    default public void N(class07321 class073212, class07321 class073213, class02277 class022772) {
        this.N((Throwable)class02599.N(class073212, class073213), class022772, class073213);
    }

    public static class07878 N(class07321 class073212, class07321 class073213) {
        class07080 class070802 = class07080.N((Throwable)new IllegalStateException("Retrieved chunk position " + String.valueOf(class073212) + " does not match requested " + String.valueOf(class073213)), (String)"Chunk found in invalid location");
        class070802.N("Misplaced Chunk").N("Stored Position", () -> ((class07321)class073212).toString());
        return new class07878(class070802);
    }

    public void N(Throwable var1, class02277 var2, class07321 var3);
}

