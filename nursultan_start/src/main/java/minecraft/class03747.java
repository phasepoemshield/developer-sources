/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class03914
 *  minecraft.class04476
 *  minecraft.class04551
 *  minecraft.class05257
 *  minecraft.class05633
 *  minecraft.class06887
 *  minecraft.class07001
 *  minecraft.class07529
 *  minecraft.class07717
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import minecraft.class03914;
import minecraft.class04476;
import minecraft.class04551;
import minecraft.class05257;
import minecraft.class05633;
import minecraft.class06887;
import minecraft.class07001;
import minecraft.class07529;
import minecraft.class07717;

public class class03747 {
    public static void N(String[] stringArray) throws IOException {
        class07529.N((class04551)class05257.N);
        class03914.N();
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            class03747.N(stringArray2[i]);
        }
    }

    private static void N(String string) throws IOException {
        try (Stream<Path> var1 = Files.walk(Paths.get(string, new String[0]), new FileVisitOption[0]);){
            var1.filter(path -> path.toString().endsWith(".snbt")).forEach(path -> {
                try {
                    String string = Files.readString(path);
                    class07001 class070012 = class07717.N((String)string);
                    class07001 class070013 = class05633.y((String)path.toString(), (class07001)class070012);
                    class06887.N((class04476)class04476.N, (Path)path, (String)class07717.N((class07001)class070013));
                }
                catch (CommandSyntaxException | IOException throwable) {
                    throw new RuntimeException(throwable);
                }
            });
        }
    }
}

