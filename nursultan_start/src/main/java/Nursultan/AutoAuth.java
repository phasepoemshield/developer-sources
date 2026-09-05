/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10961
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11472
 *  Nursultan.class11512
 *  Nursultan.class11518
 *  Nursultan.class11524
 *  Nursultan.class11533
 *  Nursultan.class11686
 *  Nursultan.class11693
 *  Nursultan.class11698
 *  Nursultan.class11706
 *  Nursultan.class11782
 *  Nursultan.class11938
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class02511
 *  minecraft.class02775
 *  minecraft.class04459
 *  minecraft.class07536
 */
package Nursultan;

import Nursultan.class10961;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11472;
import Nursultan.class11512;
import Nursultan.class11518;
import Nursultan.class11524;
import Nursultan.class11533;
import Nursultan.class11686;
import Nursultan.class11693;
import Nursultan.class11698;
import Nursultan.class11706;
import Nursultan.class11782;
import Nursultan.class11938;
import java.lang.runtime.SwitchBootstraps;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class02511;
import minecraft.class02775;
import minecraft.class04459;
import minecraft.class07536;

@class11080(L="AutoAuth", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoAuth
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public boolean L_init;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;

    private void M(String string) {
        this.s();
        if (((Boolean)this.L_4).booleanValue()) {
            return;
        }
        String string2 = string.trim().toLowerCase();
        for (class11686 class116862 : (List)this.L_3) {
            if (!class116862.y(string2)) continue;
            this.N(class116862);
            return;
        }
    }

    public AutoAuth() {
        this.s();
        this.L_0 = new class11693((Path)u_1);
        this.L_1 = class11524.N((class11512)this, (String)"password", (String)((String)u_0), (Pattern)Pattern.compile("^[^\\s]{1,16}$"));
        this.L_2 = class11524.N((class11512)this, (String)"open-path", () -> {
            this.s();
            try {
                class07536.m().N(((class11693)this.L_0).N());
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
        this.L_3 = List.of(new class11698((class11693)this.L_0), new class11706((class11693)this.L_0));
    }

    static {
        AutoAuth.n();
        u_0 = ((class11472)class11938.L_2).Z() + ((class11472)class11938.L_2).M();
        u_1 = ((Path)class11518.N_0).resolve("auth").resolve("AutoAuth.json");
    }

    private void s() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_4 = false;
        }
    }

    private static void n() {
        u_0 = null;
        u_1 = null;
        u_2 = 40;
    }

    @class11782
    public void N(class10961 class109612) {
        class00381 class003812 = class109612.N();
        Objects.requireNonNull(class003812);
        class00381 var2 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class04459.class, class02511.class, class02775.class}, (Object)var2, (int)n)) {
            case 0: {
                class04459 class044592 = (class04459)var2;
                this.M(class044592.N().getString());
                break;
            }
            case 1: {
                class02511 class025112 = (class02511)var2;
                this.M(class025112.N().getString());
                break;
            }
            case 2: {
                class02775 class027752 = (class02775)var2;
                this.M(class027752.N().getString());
                break;
            }
        }
    }

    private void N(class11686 class116862) {
        this.s();
        this.L_4 = true;
        class11938.Z().y(40, () -> {
            this.s();
            String string = ((class11533)this.L_1).i().isBlank() ? (String)u_0 : ((class11533)this.L_1).i();
            class116862.N(string);
            class11938.Z().y(40, () -> {
                this.s();
                this.L_4 = false;
            });
        });
    }
}

