/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  minecraft.class01093
 *  minecraft.class01623
 *  minecraft.class01693
 *  minecraft.class01695
 *  minecraft.class02796
 *  minecraft.class03914
 *  minecraft.class04777
 *  minecraft.class04785
 *  minecraft.class04833
 *  minecraft.class05485
 *  minecraft.class07536
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import minecraft.class01093;
import minecraft.class01623;
import minecraft.class01693;
import minecraft.class01695;
import minecraft.class02796;
import minecraft.class03914;
import minecraft.class04777;
import minecraft.class04785;
import minecraft.class04833;
import minecraft.class05485;
import minecraft.class07536;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class class00217 {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = "gametestserver";
    private static final String L = "gametestworld";
    private static final OptionParser u = new OptionParser();
    private static final OptionSpec<String> i = u.accepts("universe", "The path to where the test server world will be created. Any existing folder will be replaced.").withRequiredArg().defaultsTo((Object)"gametestserver", (Object[])new String[0]);
    private static final OptionSpec<File> R = u.accepts("report", "Exports results in a junit-like XML report at the given path.").withRequiredArg().ofType(File.class);
    private static final OptionSpec<String> M = u.accepts("tests", "Which test(s) to run (namespaced ID selector using wildcards). Empty means run all.").withRequiredArg();
    private static final OptionSpec<Boolean> B = u.accepts("verify", "Runs the tests specified with `test` or `testNamespace` 100 times for each 90 degree rotation step").withRequiredArg().ofType(Boolean.class).defaultsTo((Object)false, (Object[])new Boolean[0]);
    private static final OptionSpec<String> Z = u.accepts("packs", "A folder of datapacks to include in the world").withRequiredArg();
    private static final OptionSpec<Void> z = u.accepts("help").forHelp();

    private static void N(String string) throws IOException {
        Path path = Paths.get(string, new String[0]);
        if (Files.exists(path, new LinkOption[0])) {
            FileUtils.deleteDirectory((File)path.toFile());
        }
        Files.createDirectories(path, new FileAttribute[0]);
    }

    private static /* synthetic */ class01695 N(class04785 class047852, class01623 class016232, OptionSet optionSet, Thread thread) {
        return class01695.N((Thread)thread, (class04785)class047852, (class01623)class016232, class00217.N(optionSet, M), (boolean)optionSet.has(B));
    }

    private static void N(String string, String string2) throws IOException {
        Path path;
        Path path2 = Paths.get(string, new String[0]).resolve(L).resolve("datapacks");
        if (!Files.exists(path2, new LinkOption[0])) {
            Files.createDirectories(path2, new FileAttribute[0]);
        }
        if (Files.exists(path = Paths.get(string2, new String[0]), new LinkOption[0])) {
            try (Stream<Path> var4 = Files.list(path);){
                for (Path path3 : var4.toList()) {
                    Path path4 = path2.resolve(path3.getFileName());
                    if (Files.isDirectory(path3, new LinkOption[0])) {
                        if (!Files.isRegularFile(path3.resolve("pack.mcmeta"), new LinkOption[0])) continue;
                        FileUtils.copyDirectory((File)path3.toFile(), (File)path4.toFile());
                        N.info("Included folder pack {}", (Object)path3.getFileName());
                        continue;
                    }
                    if (!path3.toString().endsWith(".zip")) continue;
                    Files.copy(path3, path4, new CopyOption[0]);
                    N.info("Included zip pack {}", (Object)path3.getFileName());
                }
            }
        }
    }

    public static void N(String[] stringArray, Consumer<String> consumer) throws Exception {
        String string;
        u.allowsUnrecognizedOptions();
        OptionSet optionSet = u.parse(stringArray);
        if (optionSet.has(z)) {
            u.printHelpOn((OutputStream)System.err);
            return;
        }
        if (((Boolean)optionSet.valueOf(B)).booleanValue() && !optionSet.has(M)) {
            N.error("Please specify a test selection to run the verify option. For example: --verify --tests example:test_something_*");
            System.exit(-1);
        }
        N.info("Running GameTestMain with cwd '{}', universe path '{}'", (Object)System.getProperty("user.dir"), optionSet.valueOf(i));
        if (optionSet.has(R)) {
            class04833.N((class05485)new class01693((File)R.value(optionSet)));
        }
        class03914.N();
        class07536.s();
        String string2 = (String)optionSet.valueOf(i);
        class00217.N(string2);
        consumer.accept(string2);
        if (optionSet.has(Z)) {
            string = (String)optionSet.valueOf(Z);
            class00217.N(string2, string);
        }
        string = class04777.y((Path)Paths.get(string2, new String[0])).i(L);
        class01623 class016232 = class01093.N((class04785)string);
        class02796.N(arg_0 -> class00217.N((class04785)string, class016232, optionSet, arg_0));
    }

    private static Optional<String> N(OptionSet optionSet, OptionSpec<String> optionSpec) {
        return optionSet.has(optionSpec) ? Optional.of((String)optionSet.valueOf(optionSpec)) : Optional.empty();
    }
}

