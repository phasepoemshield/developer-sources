/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09664;
import Nursultan.class09673;
import Nursultan.class09684;
import Nursultan.class09688;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class class09674 {
    private static final Properties Z;
    private String z;
    public boolean N = true;
    public boolean y = true;
    public boolean L = true;
    public boolean u = true;
    public class09684 i = class09684.LAST_TO_FIRST;
    public class09664 R = class09664.NORMAL;
    public class09688 M = class09688.PROPORTIONAL;
    public static boolean B;

    class09674(String string) {
        this.z = string;
    }

    public void y() {
        try {
            File file = new File(this.z);
            boolean bl = file.exists();
            File file2 = file.getParentFile();
            if (!file2.exists()) {
                file2.mkdirs();
            }
            FileWriter fileWriter = new FileWriter(file);
            class09674.N(fileWriter, "RMBTweak", this.N);
            class09674.N(fileWriter, "LMBTweakWithItem", this.y);
            class09674.N(fileWriter, "LMBTweakWithoutItem", this.L);
            class09674.N(fileWriter, "WheelTweak", this.u);
            class09674.N(fileWriter, "WheelSearchOrder", String.valueOf(this.i.ordinal()));
            class09674.N(fileWriter, "WheelScrollDirection", String.valueOf(this.R.ordinal()));
            class09674.N(fileWriter, "ScrollItemScaling", String.valueOf(this.M.ordinal()));
            class09674.N(fileWriter, "Debug", B);
            fileWriter.close();
            if (!bl) {
                class09673.N("Created the config file.");
            }
        }
        catch (IOException iOException) {
            class09673.N("Failed to write the config file: " + this.z);
            iOException.printStackTrace();
        }
    }

    private static int N(String string, int n) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    private static void N(FileWriter fileWriter, String string, boolean bl) throws IOException {
        class09674.N(fileWriter, string, bl ? "1" : "0");
    }

    private static void N(FileWriter fileWriter, String string, String string2) throws IOException {
        fileWriter.write(string + "=" + string2 + "\n");
    }

    public void N() {
        Properties properties = new Properties(Z);
        try {
            FileReader fileReader = new FileReader(this.z);
            properties.load(fileReader);
            fileReader.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            class09673.N("Generating the config file at: " + this.z);
            this.y();
            return;
        }
        catch (IOException iOException) {
            class09673.N("Failed to read the config file: " + this.z);
            iOException.printStackTrace();
        }
        this.N = class09674.N(properties.getProperty("RMBTweak"), 1) != 0;
        this.y = class09674.N(properties.getProperty("LMBTweakWithItem"), 1) != 0;
        this.L = class09674.N(properties.getProperty("LMBTweakWithoutItem"), 1) != 0;
        this.u = class09674.N(properties.getProperty("WheelTweak"), 1) != 0;
        this.i = class09684.N(class09674.N(properties.getProperty("WheelSearchOrder"), 1));
        this.R = class09664.N(class09674.N(properties.getProperty("WheelScrollDirection"), 0));
        this.M = class09688.N(class09674.N(properties.getProperty("ScrollItemScaling"), 0));
        B = class09674.N(properties.getProperty("Debug"), 0) != 0;
    }
}

