/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class07403
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import minecraft.class07403;
import org.slf4j.Logger;

public class class07932 {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = "RPC Connection #{}: ";

    public void N(class07403 class074032, String string, Object ... objectArray) {
        if (objectArray.length == 0) {
            N.info(y + string, (Object)class074032.N());
        } else {
            ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(objectArray));
            arrayList.addFirst(class074032.N());
            N.info(y + string, arrayList.toArray());
        }
    }
}

