/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01424
 *  minecraft.class01465
 *  minecraft.class01477
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07726
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.DataInput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import minecraft.class01424;
import minecraft.class01465;
import minecraft.class01477;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class07001;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07726;

class class07012
implements class01477<class07001> {
    private static class03154 L(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        byte by;
        class077262.y(48L);
        block13: while ((by = dataInput.readByte()) != 0) {
            class01424 var4 = class01465.N((int)by);
            switch (class031752.N(var4)) {
                case field_36251: {
                    return class03154.field_36255;
                }
                case field_36250: {
                    class07707.N((DataInput)dataInput);
                    var4.y(dataInput, class077262);
                    break block13;
                }
                case field_36249: {
                    class07707.N((DataInput)dataInput);
                    var4.y(dataInput, class077262);
                    continue block13;
                }
                default: {
                    String string = class07012.i(dataInput, class077262);
                    switch (class031752.N(var4, string)) {
                        case field_36251: {
                            return class03154.field_36255;
                        }
                        case field_36250: {
                            var4.y(dataInput, class077262);
                            break block13;
                        }
                        case field_36249: {
                            var4.y(dataInput, class077262);
                            continue block13;
                        }
                    }
                    class077262.y(36L);
                    switch (var4.N(dataInput, class031752, class077262)) {
                        case field_36255: {
                            return class03154.field_36255;
                        }
                    }
                    continue block13;
                }
            }
        }
        if (by != 0) {
            while ((by = dataInput.readByte()) != 0) {
                class07707.N((DataInput)dataInput);
                class01465.N((int)by).y(dataInput, class077262);
            }
        }
        return class031752.y();
    }

    private static HashMap L() {
        return null;
    }

    class07012() {
    }

    private static String i(DataInput dataInput, class07726 class077262) throws IOException {
        String string = dataInput.readUTF();
        class077262.y(28L);
        class077262.N(2L, (long)string.length());
        return string;
    }

    private static class07001 u(DataInput dataInput, class07726 class077262) throws IOException {
        byte by;
        class077262.y(48L);
        Map<String, class07709> map = class07012.L();
        map = class07012.N(map);
        while ((by = dataInput.readByte()) != 0) {
            class07709 class077092;
            String string = class07012.i(dataInput, class077262);
            if (map.put(string, class077092 = class07001.N(class01465.N((int)by), string, dataInput, class077262)) != null) continue;
            class077262.y(36L);
        }
        return new class07001(map);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void y(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.u();
        try {
            byte by;
            while ((by = dataInput.readByte()) != 0) {
                class07707.N((DataInput)dataInput);
                class01465.N((int)by).y(dataInput, class077262);
            }
        }
        finally {
            class077262.i();
        }
    }

    public String y() {
        return "TAG_Compound";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        class077262.u();
        try {
            class03154 class031542 = class07012.L(dataInput, class031752, class077262);
            return class031542;
        }
        finally {
            class077262.i();
        }
    }

    private static Map N(Map map) {
        return new Object2ObjectOpenHashMap();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class07001 L(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.u();
        try {
            class07001 class070012 = class07012.u(dataInput, class077262);
            return class070012;
        }
        finally {
            class077262.i();
        }
    }

    public String N() {
        return "COMPOUND";
    }
}

