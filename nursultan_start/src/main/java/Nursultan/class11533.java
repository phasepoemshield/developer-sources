/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11536;
import Nursultan.class12018;
import java.util.regex.Pattern;

public class class11533
extends class11536<String> {
    public Object N_0;
    public Object N_1;

    public String L() {
        this.T();
        return (String)this.N_0;
    }

    @Override
    public String i() {
        this.T();
        String string = (String)super.i();
        if (string == null || (Pattern)this.N_1 != null && !((Pattern)this.N_1).matcher(string).matches()) {
            return (String)this.U();
        }
        return string;
    }

    private void T() {
    }

    public class11533(class12018 class120182, String string, String string2, Pattern pattern) {
        super(class120182, string);
        this.T();
        this.N_0 = string2;
        this.N_1 = pattern;
    }

    @Override
    public void N(String string) {
        this.T();
        if (string == null || (Pattern)this.N_1 != null && !((Pattern)this.N_1).matcher(string).matches()) {
            super.N((String)this.U());
            return;
        }
        super.N(string);
    }

    public Pattern R() {
        this.T();
        return (Pattern)this.N_1;
    }
}

