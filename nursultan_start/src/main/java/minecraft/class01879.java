/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04189
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collection;
import minecraft.class04189;
import org.slf4j.Logger;

public class class01879 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 50;
    private static final String L = "command_history.txt";
    private final Path u;
    private final class04189<String> i = new class04189(50);

    public class01879(Path path) {
        this.u = path.resolve(L);
        if (Files.exists(this.u, new LinkOption[0])) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(this.u, StandardCharsets.UTF_8);){
                this.i.addAll((Collection)bufferedReader.lines().toList());
            }
            catch (Exception exception) {
                N.error("Failed to read {}, command history will be missing", (Object)L, (Object)exception);
            }
        }
    }

    private void y() {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(this.u, StandardCharsets.UTF_8, new OpenOption[0]);){
            for (String string : this.i) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        }
        catch (IOException iOException) {
            N.error("Failed to write {}, command history will be missing", (Object)L, (Object)iOException);
        }
    }

    public Collection<String> N() {
        return this.i;
    }

    public void N(String string) {
        if (!string.equals(this.i.peekLast())) {
            if (this.i.size() >= 50) {
                this.i.removeFirst();
            }
            this.i.addLast((Object)string);
            this.y();
        }
    }
}

