/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10568
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class03172
 *  minecraft.class03475
 *  minecraft.class05855
 *  minecraft.class06267
 *  minecraft.class06268
 *  minecraft.class06270
 */
package minecraft;

import Nursultan.class10568;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class03172;
import minecraft.class03475;
import minecraft.class05855;
import minecraft.class06233;
import minecraft.class06246;
import minecraft.class06248;
import minecraft.class06250;
import minecraft.class06254;
import minecraft.class06262;
import minecraft.class06267;
import minecraft.class06268;
import minecraft.class06270;

public class class06238
implements class06270 {
    public static final MapCodec<class06238> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("hex_file").forGetter(class062382 -> class062382.L), (App)class06233.u.listOf().optionalFieldOf("size_overrides", List.of()).forGetter(class062382 -> class062382.u)).apply(instance, class06238::new));
    private final class01894 L;
    private final List<class06233> u;

    private class06238(class01894 class018942, List<class06233> list) {
        this.L = class018942;
        this.u = list;
    }

    public Either<class06246, class06254> y() {
        return Either.left(this::N);
    }

    private class06262 N(class01089 class010892) throws IOException {
        try (InputStream inputStream = class010892.u(this.L);){
            class06268 class062682 = this.N(inputStream);
            return class062682;
        }
    }

    private class06268 N(InputStream inputStream) throws IOException {
        class03475 class034752 = new class03475(class06267[]::new, n -> new class06267[n][]);
        class10568 class105682 = (arg_0, arg_1) -> ((class03475)class034752).N(arg_0, arg_1);
        try (ZipInputStream zipInputStream = new ZipInputStream(inputStream);){
            String string;
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                string = zipEntry.getName();
                if (!string.endsWith(".hex")) continue;
                class06268.N.info("Found {}, loading", (Object)string);
                class06268.N((InputStream)new class03172((InputStream)zipInputStream), (class10568)class105682);
            }
            string = new class03475(class06248[]::new, n -> new class06248[n][]);
            for (class06233 class062332 : this.u) {
                int n2 = class062332.N();
                int n3 = class062332.y();
                class06250 class062502 = class062332.L();
                for (int i = n2; i <= n3; ++i) {
                    class06267 class062672 = (class06267)class034752.y(i);
                    if (class062672 == null) continue;
                    string.N(i, (Object)new class06248(class062672, class062502.y(), class062502.L()));
                }
            }
            class034752.N((arg_0, arg_1) -> class06238.N((class03475)string, arg_0, arg_1));
            class06268 class062682 = new class06268((class03475)string);
            return class062682;
        }
    }

    private static /* synthetic */ void N(class03475 class034752, int n, class06267 class062672) {
        int n2 = class062672.u();
        int n3 = class06250.N(n2);
        int n4 = class06250.y(n2);
        class034752.N(n, (Object)new class06248(class062672, n3, n4));
    }

    public class05855 N() {
        return class05855.field_2313;
    }
}

