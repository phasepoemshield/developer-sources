/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01089
 *  minecraft.class06202
 *  minecraft.class06305
 *  minecraft.class06846
 *  minecraft.class08280
 *  minecraft.class08354
 *  minecraft.class08361
 *  minecraft.class08500
 */
package Nursultan;

import java.io.IOException;
import java.io.InputStream;
import minecraft.class01089;
import minecraft.class06202;
import minecraft.class06305;
import minecraft.class06846;
import minecraft.class08280;
import minecraft.class08354;
import minecraft.class08361;
import minecraft.class08500;

public class class10574
extends class08361 {
    public class10574() {
        super(class06305.N);
    }

    public class08354 method_65809(class01089 class010892) throws IOException {
        try (InputStream inputStream = class06202.Nq().x().y().u(class06305.N);){
            class08354 class083542 = new class08354(class08280.N((InputStream)inputStream), new class08500(true, true, class06846.field_64077, 0.0f));
            return class083542;
        }
    }
}

