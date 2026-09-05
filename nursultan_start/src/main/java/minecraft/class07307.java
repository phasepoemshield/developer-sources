/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00674
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07438
 *  minecraft.class08005
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import minecraft.class00674;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07299;
import minecraft.class07302;
import minecraft.class07438;
import minecraft.class08005;
import org.jspecify.annotations.Nullable;

public interface class07307 {
    public @Nullable class07438 L();

    public boolean M();

    public boolean B();

    public float i();

    public @Nullable class07049 u();

    public class07302 y();

    public static @Nullable class07438 N(@Nullable class07049 class070492) {
        class07438 class074382;
        class07049 class070493 = class070492;
        int n = 0;
        block5: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00674.class, class07438.class, class08005.class}, (Object)class070493, (int)n)) {
                case 0: {
                    class074382 = ((class00674)class070493).z();
                    break block5;
                }
                case 1: {
                    class074382 = (class07438)class070493;
                    break block5;
                }
                case 2: {
                    class07049 class070494 = ((class08005)class070493).z();
                    if (!(class070494 instanceof class07438)) {
                        n = 3;
                        continue block5;
                    }
                    class07438 class074383 = (class07438)class070494;
                    class074382 = class074383;
                    break block5;
                }
                default: {
                    class074382 = null;
                    break block5;
                }
            }
            break;
        }
        return class074382;
    }

    public static class07072 N(class07299 class072992, @Nullable class07049 class070492) {
        return class072992.method_48963().u(class070492, (class07049)class07307.N(class070492));
    }

    public class04782 N();

    public class06889 R();
}

