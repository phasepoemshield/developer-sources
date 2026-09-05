/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01283
 *  minecraft.class01603
 *  minecraft.class01611
 *  minecraft.class01612
 *  minecraft.class01622
 *  minecraft.class01623
 *  minecraft.class01626
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02268
 *  minecraft.class02298
 *  minecraft.class02955
 *  minecraft.class02968
 *  minecraft.class02974
 *  minecraft.class02980
 *  minecraft.class02997
 *  minecraft.class03794
 *  minecraft.class04173
 *  minecraft.class04785
 *  minecraft.class05071
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.nio.file.Path;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01057;
import minecraft.class01061;
import minecraft.class01090;
import minecraft.class01283;
import minecraft.class01603;
import minecraft.class01611;
import minecraft.class01612;
import minecraft.class01622;
import minecraft.class01623;
import minecraft.class01626;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02268;
import minecraft.class02298;
import minecraft.class02955;
import minecraft.class02968;
import minecraft.class02974;
import minecraft.class02980;
import minecraft.class02997;
import minecraft.class03794;
import minecraft.class04173;
import minecraft.class04785;
import minecraft.class05071;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

public class class01093
extends class02980 {
    private static final class01612 N = new class01612((class00392)class00392.L((String)"dataPack.vanilla.description"), class07529.y().method_70592(class01603.field_14190).N());
    private static final class02974 i = new class02974(class03794.B);
    private static final class02955 R = class02955.N((class02968)class01612.y, (Object)N, (class02968)class02974.N, (Object)i);
    private static final class02267 M = new class02267("vanilla", (class00392)class00392.L((String)"dataPack.vanilla.name"), class01283.L, Optional.of(u));
    private static final class02268 B = new class02268(false, class01090.field_14281, false);
    private static final class02268 Z = new class02268(false, class01090.field_14280, false);
    private static final class01894 z = class01894.y((String)"datapacks");

    public class01093(class04173 class041732) {
        super(class01603.field_14190, class01093.N(), z, class041732);
    }

    public static class01623 y() {
        return new class01623(new class01057[]{new class01093(new class04173(path -> true))});
    }

    public static class01623 N(Path path, class04173 class041732) {
        return new class01623(new class01057[]{new class01093(class041732), new class01626(path, class01603.field_14190, class01283.i, class041732)});
    }

    public static class01623 N(class04785 class047852) {
        return class01093.N(class047852.N(class05071.z), class047852.u().i());
    }

    protected @Nullable class01055 N(String string, class01061 class010612, class00392 class003922) {
        return class01055.N(class01093.N(string, class003922), class010612, class01603.field_14190, Z);
    }

    public static class01611 N() {
        return new class02997().N(R).N(new String[]{"minecraft"}).y().N().N(M);
    }

    protected class00392 N(String string) {
        return class00392.y((String)string);
    }

    protected @Nullable class01055 N(class01622 class016222) {
        return class01055.N(M, class01093.y((class01622)class016222), class01603.field_14190, B);
    }

    private static class02267 N(String string, class00392 class003922) {
        return new class02267(string, class003922, class01283.u, Optional.of(class02298.N((String)string)));
    }
}

