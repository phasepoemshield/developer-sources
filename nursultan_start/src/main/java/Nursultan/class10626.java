/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09363
 *  Nursultan.class09373
 *  Nursultan.class09410
 *  Nursultan.class09422
 *  Nursultan.class10584
 *  Nursultan.class10766
 *  Nursultan.class10854
 *  Nursultan.class10874
 *  Nursultan.class11303
 *  Nursultan.class11938
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class06202
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class09363;
import Nursultan.class09373;
import Nursultan.class09410;
import Nursultan.class09422;
import Nursultan.class10584;
import Nursultan.class10665;
import Nursultan.class10675;
import Nursultan.class10681;
import Nursultan.class10691;
import Nursultan.class10766;
import Nursultan.class10854;
import Nursultan.class10874;
import Nursultan.class11303;
import Nursultan.class11938;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.concurrent.ExecutorService;
import minecraft.class06202;
import minecraft.class07689;

public class class10626 {
    public static Object N_0;
    public static Object N_1;

    public class10626() {
        ((ExecutorService)class11938.L_1).submit(() -> {
            new class09363().N((CommandDispatcher)N_0);
            new class10665().N((CommandDispatcher<class07689>)((CommandDispatcher)N_0));
            new class10874().N((CommandDispatcher)N_0);
            new class10675().N((CommandDispatcher<class07689>)((CommandDispatcher)N_0));
            new class09410().N((CommandDispatcher)N_0);
            new class10584().N((CommandDispatcher)N_0);
            new class10766().N((CommandDispatcher)N_0);
            new class09373().N((CommandDispatcher)N_0);
            new class10854().N((CommandDispatcher)N_0);
            new class09422().N((CommandDispatcher)N_0);
            new class10691().N((CommandDispatcher<class07689>)((CommandDispatcher)N_0));
            new class10681().N((CommandDispatcher<class07689>)((CommandDispatcher)N_0));
        });
    }

    static {
        class10626.N();
        N_0 = new CommandDispatcher();
        N_1 = Character.valueOf('.');
    }

    public void N(StringReader stringReader) {
        try {
            ((CommandDispatcher)N_0).execute(stringReader, (Object)class06202.Nq().NE().L());
        }
        catch (CommandSyntaxException commandSyntaxException) {
            class11303.y((Object)commandSyntaxException.getMessage());
        }
    }

    private static void N() {
        N_0 = null;
        N_1 = Character.valueOf('.');
    }
}

