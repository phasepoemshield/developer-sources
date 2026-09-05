/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class01766
 *  minecraft.class06794
 *  minecraft.class07680
 *  minecraft.class07701
 *  minecraft.class07765
 */
package Nursultan;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class01766;
import minecraft.class06794;
import minecraft.class07680;
import minecraft.class07701;
import minecraft.class07765;

public class class10789
implements class07765 {
    private final class06794 N;

    public class10789(class06794 class067942) {
        this.N = class067942;
    }

    public Collection<class01766> getNames(class07701 class077012, Supplier<Collection<class01766>> supplier) throws CommandSyntaxException {
        List var3 = this.N.y(class077012);
        if (var3.isEmpty()) {
            throw class07680.u.create();
        }
        return List.copyOf(var3);
    }
}

