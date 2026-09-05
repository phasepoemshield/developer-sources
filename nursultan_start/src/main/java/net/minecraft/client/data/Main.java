/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10512
 *  joptsimple.AbstractOptionSpec
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 *  minecraft.class03914
 *  minecraft.class07094
 *  minecraft.class07125
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08306
 *  minecraft.class08581
 *  minecraft.class08729
 *  minecraft.class08824
 */
package net.minecraft.client.data;

import Nursultan.class10512;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import minecraft.class03914;
import minecraft.class07094;
import minecraft.class07125;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08306;
import minecraft.class08581;
import minecraft.class08729;
import minecraft.class08824;

public class Main {
    public static void main(String[] stringArray) throws IOException {
        class07529.N();
        OptionParser optionParser = new OptionParser();
        AbstractOptionSpec var2 = optionParser.accepts("help", "Show the help menu").forHelp();
        OptionSpecBuilder optionSpecBuilder = optionParser.accepts("client", "Include client generators");
        OptionSpecBuilder optionSpecBuilder2 = optionParser.accepts("all", "Include all generators");
        ArgumentAcceptingOptionSpec var5 = optionParser.accepts("output", "Output folder").withRequiredArg().defaultsTo((Object)"generated", (Object[])new String[0]);
        OptionSet optionSet = optionParser.parse(stringArray);
        if (optionSet.has((OptionSpec)var2) || !optionSet.hasOptions()) {
            optionParser.printHelpOn((OutputStream)System.out);
            return;
        }
        Path path = Paths.get((String)var5.value(optionSet), new String[0]);
        boolean bl = optionSet.has((OptionSpec)optionSpecBuilder2) || optionSet.has((OptionSpec)optionSpecBuilder);
        class03914.N();
        class08824.N();
        class07094 class070942 = new class07094(path, class07529.y(), true);
        Main.N(class070942, bl);
        class070942.method_10315();
        class07536.U();
    }

    public static void N(class07094 class070942, boolean bl) {
        class07125 class071252 = class070942.method_46564(bl);
        class071252.method_46566(class10512::new);
        class071252.method_46566(class08729::new);
        class071252.method_46566(class08306::new);
        class071252.method_46566(class08581::new);
    }
}

