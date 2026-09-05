/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00001
 *  minecraft.class00235
 *  minecraft.class00710
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class00948
 *  minecraft.class01226
 *  minecraft.class01894
 *  minecraft.class01951
 *  minecraft.class02204
 *  minecraft.class02206
 *  minecraft.class02207
 *  minecraft.class02262
 *  minecraft.class02484
 *  minecraft.class02485
 *  minecraft.class02692
 *  minecraft.class02699
 *  minecraft.class02708
 *  minecraft.class02710
 *  minecraft.class02716
 *  minecraft.class02719
 *  minecraft.class02749
 *  minecraft.class02813
 *  minecraft.class02820
 *  minecraft.class02830
 *  minecraft.class02837
 *  minecraft.class02841
 *  minecraft.class02847
 *  minecraft.class02854
 *  minecraft.class02859
 *  minecraft.class03252
 *  minecraft.class03262
 *  minecraft.class03270
 *  minecraft.class03274
 *  minecraft.class03490
 *  minecraft.class03530
 *  minecraft.class03582
 *  minecraft.class03591
 *  minecraft.class03696
 *  minecraft.class03733
 *  minecraft.class03759
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04392
 *  minecraft.class04460
 *  minecraft.class04461
 *  minecraft.class04463
 *  minecraft.class04473
 *  minecraft.class04593
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04810
 *  minecraft.class04909
 *  minecraft.class05344
 *  minecraft.class05460
 *  minecraft.class05462
 *  minecraft.class05946
 *  minecraft.class06107
 *  minecraft.class06244
 *  minecraft.class06483
 *  minecraft.class06486
 *  minecraft.class06488
 *  minecraft.class06493
 *  minecraft.class06494
 *  minecraft.class06495
 *  minecraft.class06499
 *  minecraft.class06502
 *  minecraft.class06913
 *  minecraft.class06914
 *  minecraft.class06918
 *  minecraft.class06920
 *  minecraft.class06924
 *  minecraft.class06926
 *  minecraft.class06927
 *  minecraft.class06931
 *  minecraft.class06933
 *  minecraft.class06935
 *  minecraft.class06938
 *  minecraft.class06939
 *  minecraft.class06944
 *  minecraft.class06947
 *  minecraft.class06949
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07211
 *  minecraft.class07504
 *  minecraft.class08092
 *  minecraft.class08129
 *  minecraft.class08213
 *  minecraft.class08225
 *  minecraft.class08427
 *  minecraft.class08557
 *  minecraft.class08565
 *  minecraft.class08576
 *  minecraft.class08582
 *  minecraft.class08588
 *  minecraft.class08609
 *  minecraft.class08620
 *  minecraft.class08699
 *  minecraft.class08721
 *  minecraft.class08723
 *  minecraft.class08725
 *  minecraft.class08973
 *  minecraft.class08981
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import minecraft.class00001;
import minecraft.class00235;
import minecraft.class00710;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class00948;
import minecraft.class01226;
import minecraft.class01894;
import minecraft.class01951;
import minecraft.class02204;
import minecraft.class02206;
import minecraft.class02207;
import minecraft.class02262;
import minecraft.class02484;
import minecraft.class02485;
import minecraft.class02692;
import minecraft.class02699;
import minecraft.class02708;
import minecraft.class02710;
import minecraft.class02716;
import minecraft.class02719;
import minecraft.class02749;
import minecraft.class02813;
import minecraft.class02820;
import minecraft.class02830;
import minecraft.class02837;
import minecraft.class02841;
import minecraft.class02847;
import minecraft.class02854;
import minecraft.class02859;
import minecraft.class03252;
import minecraft.class03262;
import minecraft.class03270;
import minecraft.class03274;
import minecraft.class03490;
import minecraft.class03530;
import minecraft.class03582;
import minecraft.class03591;
import minecraft.class03696;
import minecraft.class03733;
import minecraft.class03759;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04392;
import minecraft.class04460;
import minecraft.class04461;
import minecraft.class04463;
import minecraft.class04473;
import minecraft.class04593;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04810;
import minecraft.class04909;
import minecraft.class05344;
import minecraft.class05460;
import minecraft.class05462;
import minecraft.class05946;
import minecraft.class06107;
import minecraft.class06244;
import minecraft.class06483;
import minecraft.class06486;
import minecraft.class06488;
import minecraft.class06493;
import minecraft.class06494;
import minecraft.class06495;
import minecraft.class06499;
import minecraft.class06502;
import minecraft.class06504;
import minecraft.class06507;
import minecraft.class06515;
import minecraft.class06517;
import minecraft.class06518;
import minecraft.class06519;
import minecraft.class06527;
import minecraft.class06530;
import minecraft.class06548;
import minecraft.class06549;
import minecraft.class06550;
import minecraft.class06552;
import minecraft.class06553;
import minecraft.class06554;
import minecraft.class06559;
import minecraft.class06560;
import minecraft.class06561;
import minecraft.class06563;
import minecraft.class06564;
import minecraft.class06565;
import minecraft.class06566;
import minecraft.class06567;
import minecraft.class06568;
import minecraft.class06569;
import minecraft.class06571;
import minecraft.class06573;
import minecraft.class06576;
import minecraft.class06578;
import minecraft.class06579;
import minecraft.class06581;
import minecraft.class06582;
import minecraft.class06585;
import minecraft.class06586;
import minecraft.class06587;
import minecraft.class06590;
import minecraft.class06592;
import minecraft.class06593;
import minecraft.class06594;
import minecraft.class06913;
import minecraft.class06914;
import minecraft.class06918;
import minecraft.class06920;
import minecraft.class06924;
import minecraft.class06926;
import minecraft.class06927;
import minecraft.class06931;
import minecraft.class06933;
import minecraft.class06935;
import minecraft.class06938;
import minecraft.class06939;
import minecraft.class06944;
import minecraft.class06947;
import minecraft.class06949;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07211;
import minecraft.class07504;
import minecraft.class08092;
import minecraft.class08129;
import minecraft.class08213;
import minecraft.class08225;
import minecraft.class08427;
import minecraft.class08557;
import minecraft.class08565;
import minecraft.class08576;
import minecraft.class08582;
import minecraft.class08588;
import minecraft.class08609;
import minecraft.class08620;
import minecraft.class08699;
import minecraft.class08721;
import minecraft.class08723;
import minecraft.class08725;
import minecraft.class08973;
import minecraft.class08981;

public class class06570 {
    public static final class06581 N = class06570.N(class00869.N, class06947::new);
    public static final class06581 y = class06570.N(class00869.y);
    public static final class06581 L = class06570.N(class00869.L);
    public static final class06581 u = class06570.N(class00869.u);
    public static final class06581 i = class06570.N(class00869.i);
    public static final class06581 R = class06570.N(class00869.R);
    public static final class06581 M = class06570.N(class00869.M);
    public static final class06581 B = class06570.N(class00869.B);
    public static final class06581 Z = class06570.N(class00869.nZ);
    public static final class06581 z = class06570.N(class00869.nz);
    public static final class06581 U = class06570.N(class00869.nm);
    public static final class06581 E = class06570.N(class00869.bc);
    public static final class06581 W = class06570.N(class00869.bw);
    public static final class06581 m = class06570.N(class00869.bk);
    public static final class06581 P = class06570.N(class00869.bY);
    public static final class06581 s = class06570.N(class00869.bQ);
    public static final class06581 T = class06570.N(class00869.bo);
    public static final class06581 b = class06570.N(class00869.bO);
    public static final class06581 j = class06570.N(class00869.bg);
    public static final class06581 v = class06570.N(class00869.bI);
    public static final class06581 n = class06570.N(class00869.bJ);
    public static final class06581 t = class06570.N(class00869.bq);
    public static final class06581 G = class06570.N(class00869.bK);
    public static final class06581 l = class06570.N(class00869.bV);
    public static final class06581 d = class06570.N(class00869.be);
    public static final class06581 w = class06570.N(class00869.bH);
    public static final class06581 k = class06570.N(class00869.vF);
    public static final class06581 Y = class06570.N(class00869.Z);
    public static final class06581 Q = class06570.N(class00869.z);
    public static final class06581 O = class06570.N(class00869.U);
    public static final class06581 g = class06570.N(class00869.E);
    public static final class06581 I = class06570.N(class00869.nM);
    public static final class06581 J = class06570.N(class00869.nB);
    public static final class06581 o = class06570.N(class00869.sn);
    public static final class06581 q = class06570.N(class00869.sE);
    public static final class06581 K = class06570.N(class00869.W);
    public static final class06581 V = class06570.N(class00869.m);
    public static final class06581 e = class06570.N(class00869.P);
    public static final class06581 H = class06570.N(class00869.s);
    public static final class06581 c = class06570.N(class00869.T);
    public static final class06581 X = class06570.N(class00869.b);
    public static final class06581 a = class06570.N(class00869.j);
    public static final class06581 p = class06570.N(class00869.v);
    public static final class06581 F = class06570.N(class00869.t);
    public static final class06581 A = class06570.N(class00869.G);
    public static final class06581 f = class06570.N(class00869.l);
    public static final class06581 C = class06570.N(class00869.sQ);
    public static final class06581 S = class06570.N(class00869.sO);
    public static final class06581 x = class06570.N(class00869.d);
    public static final class06581 D = class06570.N(class00869.w);
    public static final class06581 h = class06570.N(class00869.k);
    public static final class06581 r = class06570.N(class00869.Y);
    public static final class06581 NN = class06570.N(class00869.Q);
    public static final class06581 Ny = class06570.N(class00869.O);
    public static final class06581 NL = class06570.N(class00869.g);
    public static final class06581 Nu = class06570.N(class00869.I);
    public static final class06581 Ni = class06570.N(class00869.J);
    public static final class06581 NR = class06570.N(class00869.o);
    public static final class06581 NM = class06570.N(class00869.q);
    public static final class06581 NB = class06570.N(class00869.e);
    public static final class06581 NZ = class06570.N(class00869.H);
    public static final class06581 Nz = class06570.N(class00869.a);
    public static final class06581 NU = class06570.N(class00869.c);
    public static final class06581 NE = class06570.N(class00869.X);
    public static final class06581 NW = class06570.N(class00869.C);
    public static final class06581 Nm = class06570.N(class00869.S);
    public static final class06581 NP = class06570.N(class00869.A);
    public static final class06581 Ns = class06570.N(class00869.f);
    public static final class06581 NT = class06570.N(class00869.jN);
    public static final class06581 Nb = class06570.N(class00869.jy);
    public static final class06581 Nj = class06570.N(class00869.p);
    public static final class06581 Nv = class06570.N(class00869.F);
    public static final class06581 Nn = class06570.N(class00869.iU);
    public static final class06581 Nt = class06570.N(class00869.iE);
    public static final class06581 NG = class06570.N(class00869.Mv);
    public static final class06581 Nl = class06570.N(class00869.Mn);
    public static final class06581 Nd = class06570.N(class00869.Nh);
    public static final class06581 Nw = class06570.N(class00869.Nr);
    public static final class06581 Nk = class06570.N(class00869.LC);
    public static final class06581 NY = class06570.N(class00869.LS);
    public static final class06581 NQ = class06570.N(class00869.x);
    public static final class06581 NO = class06570.N(class00869.BA);
    public static final class06581 Ng = class06570.N(class00869.Tz, new class06573().N());
    public static final class06581 NI = class06570.N(class00869.zv);
    public static final class06581 NJ = class06570.N(class00869.ng);
    public static final class06581 No = class06570.N(class00869.nI);
    public static final class06581 Nq = class06570.N(class00869.nJ);
    public static final class06581 NK = class06570.N(class00869.nA, new class06573().N(class06495.field_8904));
    public static final class06581 NV = class06570.N(class00869.bv);
    public static final class06581 Ne = class06570.N(class00869.bn);
    public static final class06581 NH = class06570.N(class00869.Lj);
    public static final class06581 Nc = class06570.N(class00869.bx);
    public static final class06581 NX = class06570.N(class00869.Lb);
    public static final class06581 Na = class06570.N(class00869.Lx);
    public static final class06581 Np = class06570.N(class00869.TZ, new class06573().N());
    public static final class06581 NF = class06570.N(class00869.bD);
    public static final class06581 NA = class06570.N(class00869.bh);
    public static final class06581 Nf = class06570.N(class00869.br);
    public static final class06581 NC = class06570.N(class00869.jz);
    public static final class06581 NS = class06570.N(class00869.jZ);
    public static final class06581 Nx = class06570.N(class00869.jB);
    public static final class06581 ND = class06570.N(class00869.jM);
    public static final class06581 Nh = class06570.N(class00869.jR);
    public static final class06581 Nr = class06570.N(class00869.ji);
    public static final class06581 yN = class06570.N(class00869.ju);
    public static final class06581 yy = class06570.N(class00869.jL);
    public static final class06581 yL = class06570.N(class00869.jb);
    public static final class06581 yu = class06570.N(class00869.jT);
    public static final class06581 yi = class06570.N(class00869.js);
    public static final class06581 yR = class06570.N(class00869.jP);
    public static final class06581 yM = class06570.N(class00869.jt);
    public static final class06581 yB = class06570.N(class00869.jn);
    public static final class06581 yZ = class06570.N(class00869.jv);
    public static final class06581 yz = class06570.N(class00869.jj);
    public static final class06581 yU = class06570.N(class00869.jG);
    public static final class06581 yE = class06570.N(class00869.jd);
    public static final class06581 yW = class06570.N(class00869.jl);
    public static final class06581 ym = class06570.N(class00869.jw);
    public static final class06581 yP = class06570.N(class00869.jm);
    public static final class06581 ys = class06570.N(class00869.jW);
    public static final class06581 yT = class06570.N(class00869.jE);
    public static final class06581 yb = class06570.N(class00869.jU);
    public static final class06581 yj = class06570.N(class00869.jO);
    public static final class06581 yv = class06570.N(class00869.jQ);
    public static final class06581 yn = class06570.N(class00869.jY);
    public static final class06581 yt = class06570.N(class00869.jk);
    public static final class06581 yG = class06570.N(class00869.jo);
    public static final class06581 yl = class06570.N(class00869.jJ);
    public static final class06581 yd = class06570.N(class00869.jI);
    public static final class06581 yw = class06570.N(class00869.jg);
    public static final class06581 yk = class06570.N(class00869.je);
    public static final class06581 yY = class06570.N(class00869.jV);
    public static final class06581 yQ = class06570.N(class00869.jK);
    public static final class06581 yO = class06570.N(class00869.jq);
    public static final class06581 yg = class06570.N(class00869.D);
    public static final class06581 yI = class06570.N(class00869.h);
    public static final class06581 yJ = class06570.N(class00869.r);
    public static final class06581 yo = class06570.N(class00869.NN);
    public static final class06581 yq = class06570.N(class00869.Ny);
    public static final class06581 yK = class06570.N(class00869.NL);
    public static final class06581 yV = class06570.N(class00869.Ni);
    public static final class06581 ye = class06570.N(class00869.Nu);
    public static final class06581 yH = class06570.N(class00869.NR);
    public static final class06581 yc = class06570.N(class00869.NM);
    public static final class06581 yX = class06570.N(class00869.NB);
    public static final class06581 ya = class06570.N(class00869.sT);
    public static final class06581 yp = class06570.N(class00869.sB);
    public static final class06581 yF = class06570.N(class00869.NZ);
    public static final class06581 yA = class06570.N(class00869.NT);
    public static final class06581 yf = class06570.N(class00869.Nz);
    public static final class06581 yC = class06570.N(class00869.NU);
    public static final class06581 yS = class06570.N(class00869.NE);
    public static final class06581 yx = class06570.N(class00869.NW);
    public static final class06581 yD = class06570.N(class00869.Nm);
    public static final class06581 yh = class06570.N(class00869.NP);
    public static final class06581 yr = class06570.N(class00869.Ns);
    public static final class06581 LN = class06570.N(class00869.Nb);
    public static final class06581 Ly = class06570.N(class00869.sb);
    public static final class06581 LL = class06570.N(class00869.sZ);
    public static final class06581 Lu = class06570.N(class00869.NY);
    public static final class06581 Li = class06570.N(class00869.NQ);
    public static final class06581 LR = class06570.N(class00869.NO);
    public static final class06581 LM = class06570.N(class00869.Ng);
    public static final class06581 LB = class06570.N(class00869.NI);
    public static final class06581 LZ = class06570.N(class00869.NJ);
    public static final class06581 Lz = class06570.N(class00869.No);
    public static final class06581 LU = class06570.N(class00869.Nq);
    public static final class06581 LE = class06570.N(class00869.NK);
    public static final class06581 LW = class06570.N(class00869.sv);
    public static final class06581 Lm = class06570.N(class00869.sU);
    public static final class06581 LP = class06570.N(class00869.Nj);
    public static final class06581 Ls = class06570.N(class00869.Nv);
    public static final class06581 LT = class06570.N(class00869.Nn);
    public static final class06581 Lb = class06570.N(class00869.Nt);
    public static final class06581 Lj = class06570.N(class00869.NG);
    public static final class06581 Lv = class06570.N(class00869.Nl);
    public static final class06581 Ln = class06570.N(class00869.Nd);
    public static final class06581 Lt = class06570.N(class00869.n);
    public static final class06581 LG = class06570.N(class00869.Nw);
    public static final class06581 Ll = class06570.N(class00869.Nk);
    public static final class06581 Ld = class06570.N(class00869.sj);
    public static final class06581 Lw = class06570.N(class00869.sz);
    public static final class06581 Lk = class06570.N(class00869.NV);
    public static final class06581 LY = class06570.N(class00869.Ne);
    public static final class06581 LQ = class06570.N(class00869.NH);
    public static final class06581 LO = class06570.N(class00869.Nc);
    public static final class06581 Lg = class06570.N(class00869.NX);
    public static final class06581 LI = class06570.N(class00869.Na);
    public static final class06581 LJ = class06570.N(class00869.Np);
    public static final class06581 Lo = class06570.N(class00869.NF);
    public static final class06581 Lq = class06570.N(class00869.NA);
    public static final class06581 LK = class06570.N(class00869.Nf);
    public static final class06581 LV = class06570.N(class00869.NC);
    public static final class06581 Le = class06570.N(class00869.NS);
    public static final class06581 LH = class06570.N(class00869.Nx);
    public static final class06581 Lc = class06570.N(class00869.ND);
    public static final class06581 LX = class06570.N(class00869.bX);
    public static final class06581 La = class06570.N(class00869.yN);
    public static final class06581 Lp = class06570.N(class00869.yL);
    public static final class06581 LF = class06570.N(class00869.yu);
    public static final class06581 LA = class06570.N(class00869.yi);
    public static final class06581 Lf = class06570.N(class00869.yw);
    public static final class06581 LC = class06570.N(class00869.yk);
    public static final class06581 LS = class06570.N(class00869.yY);
    public static final class06581 Lx = class06570.N(class00869.yO);
    public static final class06581 LD = class06570.N(class00869.vS);
    public static final class06581 Lh = class06570.N(class00869.vx);
    public static final class06581 Lr = class06570.N(class00869.yQ);
    public static final class06581 uN = class06570.N(class00869.tN);
    public static final class06581 uy = class06570.N(class00869.yg);
    public static final class06581 uL = class06570.N(class00869.yI);
    public static final class06581 uu = class06570.N(class00869.yJ);
    public static final class06581 ui = class06570.N(class00869.mA);
    public static final class06581 uR = class06570.N(class00869.yV);
    public static final class06581 uM = class06570.N(class00869.ye);
    public static final class06581 uB = class06570.N(class00869.yH);
    public static final class06581 uZ = class06570.N(class00869.yc);
    public static final class06581 uz = class06570.N(class00869.yX);
    public static final class06581 uU = class06570.N(class00869.ya);
    public static final class06581 uE = class06570.N(class00869.yp);
    public static final class06581 uW = class06570.N(class00869.yF);
    public static final class06581 um = class06570.N(class00869.yA);
    public static final class06581 uP = class06570.N(class00869.yf);
    public static final class06581 us = class06570.N(class00869.yC);
    public static final class06581 uT = class06570.N(class00869.yS);
    public static final class06581 ub = class06570.N(class00869.yx);
    public static final class06581 uj = class06570.N(class00869.yD);
    public static final class06581 uv = class06570.N(class00869.yh);
    public static final class06581 un = class06570.N(class00869.yr);
    public static final class06581 ut = class06570.N(class00869.Ly);
    public static final class06581 uG = class06570.N(class00869.nx);
    public static final class06581 ul = class06570.N(class00869.nD);
    public static final class06581 ud = class06570.N(class00869.Lu);
    public static final class06581 uw = class06570.N(class00869.Li);
    public static final class06581 uk = class06570.N(class00869.LR);
    public static final class06581 uY = class06570.N(class00869.LM);
    public static final class06581 uQ = class06570.N(class00869.LB);
    public static final class06581 uO = class06570.N(class00869.LZ);
    public static final class06581 ug = class06570.N(class00869.Lz);
    public static final class06581 uI = class06570.N(class00869.LU);
    public static final class06581 uJ = class06570.N(class00869.LE);
    public static final class06581 uo = class06570.N(class00869.LW);
    public static final class06581 uq = class06570.N(class00869.LP);
    public static final class06581 uK = class06570.N(class00869.Lm);
    public static final class06581 uV = class06570.N(class00869.LL);
    public static final class06581 ue = class06570.N(class00869.Ed);
    public static final class06581 uH = class06570.N(class00869.vC);
    public static final class06581 uc = class06570.N(class00869.Ls);
    public static final class06581 uX = class06570.N(class00869.LT);
    public static final class06581 ua = class06570.N(class00869.st);
    public static final class06581 up = class06570.N(class00869.sW);
    public static final class06581 uF = class06570.N(class00869.sY);
    public static final class06581 uA = class06570.N(class00869.sP);
    public static final class06581 uf = class06570.N(class00869.ss);
    public static final class06581 uC = class06570.N(class00869.sl);
    public static final class06581 uS = class06570.N(class00869.sw);
    public static final class06581 ux = class06570.N(class00869.it);
    public static final class06581 uD = class06570.N(class00869.Wh);
    public static final class06581 uh = class06570.N(class00869.vh);
    public static final class06581 ur = class06570.N(class00869.vr);
    public static final class06581 iN = class06570.N(class00869.nN);
    public static final class06581 iy = class06570.N(class00869.vD);
    public static final class06581 iL = class06570.N(class00869.ny);
    public static final class06581 iu = class06570.N(class00869.nC);
    public static final class06581 ii = class06570.N(class00869.nS);
    public static final class06581 iR = class06570.N(class00869.nf);
    public static final class06581 iM = class06570.N(class00869.nR);
    public static final class06581 iB = class06570.N(class00869.nL, class00869.nu);
    public static final class06581 iZ = class06570.N(class00869.ni, class06578::new);
    public static final class06581 iz = class06570.N(class00869.mx);
    public static final class06581 iU = class06570.N(class00869.UE);
    public static final class06581 iE = class06570.N(class00869.UW);
    public static final class06581 iW = class06570.N(class00869.Um);
    public static final class06581 im = class06570.N(class00869.UP);
    public static final class06581 iP = class06570.N(class00869.Us);
    public static final class06581 is = class06570.N(class00869.UT);
    public static final class06581 iT = class06570.N(class00869.Ub);
    public static final class06581 ib = class06570.N(class00869.Uj);
    public static final class06581 ij = class06570.N(class00869.Uv);
    public static final class06581 iv = class06570.N(class00869.Un);
    public static final class06581 in = class06570.N(class00869.Ut);
    public static final class06581 it = class06570.N(class00869.sg);
    public static final class06581 iG = class06570.N(class00869.sI);
    public static final class06581 il = class06570.N(class00869.UG);
    public static final class06581 id = class06570.N(class00869.Ul);
    public static final class06581 iw = class06570.N(class00869.Ud);
    public static final class06581 ik = class06570.N(class00869.Uw);
    public static final class06581 iY = class06570.N(class00869.Uk);
    public static final class06581 iQ = class06570.N(class00869.UY);
    public static final class06581 iO = class06570.N(class00869.UQ);
    public static final class06581 ig = class06570.N(class00869.UO);
    public static final class06581 iI = class06570.N(class00869.Ug);
    public static final class06581 iJ = class06570.N(class00869.UI);
    public static final class06581 io = class06570.N(class00869.UJ);
    public static final class06581 iq = class06570.N(class00869.Uo);
    public static final class06581 iK = class06570.N(class00869.Uq);
    public static final class06581 iV = class06570.N(class00869.UK);
    public static final class06581 ie = class06570.N(class00869.ZD);
    public static final class06581 iH = class06570.N(class00869.Zh);
    public static final class06581 ic = class06570.N(class00869.Zr);
    public static final class06581 iX = class06570.N(class00869.UH);
    public static final class06581 ia = class06570.N(class00869.Uc);
    public static final class06581 ip = class06570.N(class00869.Ue);
    public static final class06581 iF = class06570.N(class00869.UV);
    public static final class06581 iA = class06570.N(class00869.Lv);
    public static final class06581 f_if__1 = class06570.N(class00869.Ll, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 iC = class06570.N(class00869.Ld, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 iS = class06570.N(class00869.Lw, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 ix = class06570.N(class00869.Lk, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 iD = class06570.N(class00869.LY, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 ih = class06570.N(class00869.LQ, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 ir = class06570.N(class00869.LO, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 RN = class06570.N(class00869.Lg, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 Ry = class06570.N(class00869.LI, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 RL = class06570.N(class00869.LJ, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 Ru = class06570.N(class00869.Lo, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 Ri = class06570.N(class00869.Lq, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 RR = class06570.N(class00869.Lt);
    public static final class06581 RM = class06570.N(class00869.LG, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 RB = class06570.N(class00869.nX, new class06573().N(class02484.Nt, class03490.N).N(class02484.NG, class02854.N));
    public static final class06581 RZ = class06570.N(class00869.LK);
    public static final class06581 Rz = class06570.N(class00869.LV);
    public static final class06581 RU = class06570.N(class00869.Le, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.LH, class07211.field_11033, class065732));
    public static final class06581 RE = class06570.N(class00869.Es);
    public static final class06581 RW = class06570.N(class00869.ET);
    public static final class06581 Rm = class06570.N(class00869.Eb);
    public static final class06581 RP = class06570.N(class00869.Ej);
    public static final class06581 Rs = class06570.N(class00869.Ev);
    public static final class06581 RT = class06570.N(class00869.En);
    public static final class06581 Rb = class06570.N(class00869.La);
    public static final class06581 Rj = class06570.N(class00869.Lp);
    public static final class06581 Rv = class06570.N(class00869.LA, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 Rn = class06570.N(class00869.LD);
    public static final class06581 Rt = class06570.N(class00869.Lr);
    public static final class06581 RG = class06570.N(class00869.uN, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 Rl = class06570.N(class00869.uW);
    public static final class06581 Rd = class06570.N(class00869.uP);
    public static final class06581 Rw = class06570.N(class00869.is);
    public static final class06581 Rk = class06570.N(class00869.iT);
    public static final class06581 RY = class06570.N(class00869.ib);
    public static final class06581 RQ = class06570.N(class00869.ij);
    public static final class06581 RO = class06570.N(class00869.iv);
    public static final class06581 Rg = class06570.N(class00869.in);
    public static final class06581 RI = class06570.N(class00869.iG);
    public static final class06581 RJ = class06570.N(class00869.il);
    public static final class06581 Ro = class06570.N(class00869.UD);
    public static final class06581 Rq = class06570.N(class00869.Uh);
    public static final class06581 RK = class06570.N(class00869.Ur);
    public static final class06581 RV = class06570.N(class00869.EN);
    public static final class06581 Re = class06570.N(class00869.Ey);
    public static final class06581 RH = class06570.N(class00869.EL);
    public static final class06581 Rc = class06570.N(class00869.Eu);
    public static final class06581 RX = class06570.N(class00869.Ei);
    public static final class06581 Ra = class06570.N(class00869.ER);
    public static final class06581 Rp = class06570.N(class00869.sq);
    public static final class06581 RF = class06570.N(class00869.sK);
    public static final class06581 RA = class06570.N(class00869.Ro);
    public static final class06581 Rf = class06570.N(class00869.iK, class065732 -> class00001.N((class06573)class065732).N(class02484.o, class08725.N((class07085)class07085.field_6169).y(false).N(class01894.y((String)"misc/pumpkinblur")).N()));
    public static final class06581 RC = class06570.N(class00869.iV);
    public static final class06581 RS = class06570.N(class00869.id);
    public static final class06581 Rx = class06570.N(class00869.iw);
    public static final class06581 RD = class06570.N(class00869.ik);
    public static final class06581 Rh = class06570.N(class00869.iY);
    public static final class06581 Rr = class06570.N(class00869.iQ);
    public static final class06581 MN = class06570.N(class00869.nO);
    public static final class06581 My = class06570.N(class00869.iO, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.ig, class07211.field_11033, class065732));
    public static final class06581 ML = class06570.N(class00869.iI, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.iJ, class07211.field_11033, class065732));
    public static final class06581 Mu = class06570.N(class00869.io);
    public static final class06581 Mi = class06570.N(class00869.Rv);
    public static final class06581 MR = class06570.N(class00869.Rn);
    public static final class06581 MM = class06570.N(class00869.Rt);
    public static final class06581 MB = class06570.N(class00869.RG);
    public static final class06581 MZ = class06570.N(class00869.Rl);
    public static final class06581 Mz = class06570.N(class00869.Rd);
    public static final class06581 MU = class06570.N(class00869.nQ);
    public static final class06581 ME = class06570.N(class00869.Rm);
    public static final class06581 MW = class06570.N(class00869.RP);
    public static final class06581 Mm = class06570.N(class00869.Rs);
    public static final class06581 MP = class06570.N(class00869.RT);
    public static final class06581 Ms = class06570.N(class00869.Rb);
    public static final class06581 MT = class06570.N(class00869.Rj);
    public static final class06581 Mb = class06570.N(class00869.nt);
    public static final class06581 Mj = class06570.N(class00869.nk);
    public static final class06581 Mv = class06570.N(class00869.nb);
    public static final class06581 Mn = class06570.N(class00869.nY);
    public static final class06581 Mt = class06570.N(class00869.nw);
    public static final class06581 MG = class06570.N(class00869.nc);
    public static final class06581 Ml = class06570.N(class00869.Rw);
    public static final class06581 Md = class06570.N(class00869.Rk);
    public static final class06581 Mw = class06570.N(class00869.RY);
    public static final class06581 Mk = class06570.N(class00869.RQ);
    public static final class08129 MY = class08129.N((class00948)class00869.RO, class06570::N);
    public static final class06581 MQ = class06570.N(class00869.Rg);
    public static final class08129 MO = class08129.N((class00948)class00869.RI, class06570::N);
    public static final class06581 Mg = class06570.N(class00869.RJ);
    public static final class06581 MI = class06570.N(class00869.Rq);
    public static final class06581 MJ = class06570.N(class00869.Rc);
    public static final class06581 Mo = class06570.N(class00869.RX);
    public static final class06581 Mq = class06570.N("resin_clump", class06570.y(class00869.Ra));
    public static final class06581 MK = class06570.N(class00869.Rx);
    public static final class06581 MV = class06570.N(class00869.RD);
    public static final class06581 Me = class06570.N(class00869.Rh);
    public static final class06581 MH = class06570.N(class00869.Rr);
    public static final class06581 Mc = class06570.N(class00869.MN);
    public static final class06581 MX = class06570.N(class00869.My);
    public static final class06581 Ma = class06570.N(class00869.RF);
    public static final class06581 Mp = class06570.N(class00869.RA);
    public static final class06581 MF = class06570.N(class00869.Rf);
    public static final class06581 MA = class06570.N(class00869.RC);
    public static final class06581 Mf = class06570.N(class00869.RS, class06519::new);
    public static final class06581 MC = class06570.N(class00869.ML);
    public static final class06581 MS = class06570.N(class00869.TK);
    public static final class06581 Mx = class06570.N(class00869.Tq);
    public static final class06581 MD = class06570.N(class00869.Mu);
    public static final class06581 Mh = class06570.N(class00869.Mi);
    public static final class06581 Mr = class06570.N(class00869.bA);
    public static final class06581 BN = class06570.N(class00869.bf);
    public static final class06581 By = class06570.N(class00869.bC);
    public static final class06581 BL = class06570.N(class00869.bS);
    public static final class06581 Bu = class06570.N(class00869.MM);
    public static final class06581 Bi = class06570.N(class00869.Mm);
    public static final class06581 BR = class06570.N(class00869.MP);
    public static final class06581 BM = class06570.N(class00869.Et);
    public static final class06581 BB = class06570.N(class00869.Ms, new class06573().N(class06495.field_8904));
    public static final class06581 BZ = class06570.N(class00869.Mj);
    public static final class06581 Bz = class06570.N(class00869.Mt);
    public static final class06581 BU = class06570.N(class00869.Md);
    public static final class06581 BE = class06570.N(class00869.LF);
    public static final class06581 BW = class06570.N(class00869.Mw);
    public static final class06581 Bm = class06570.N(class00869.Mk);
    public static final class06581 BP = class06570.N(class00869.MY);
    public static final class06581 Bs = class06570.N(class00869.ZJ);
    public static final class06581 BT = class06570.N(class00869.Zo);
    public static final class06581 Bb = class06570.N(class00869.Zq);
    public static final class06581 Bj = class06570.N(class00869.ZK);
    public static final class06581 Bv = class06570.N(class00869.ZV);
    public static final class06581 Bn = class06570.N(class00869.Ze);
    public static final class06581 Bt = class06570.N(class00869.ZH);
    public static final class06581 BG = class06570.N(class00869.sX);
    public static final class06581 Bl = class06570.N(class00869.sa);
    public static final class06581 Bd = class06570.N(class00869.MQ, class06590::new, new class06573().N(class06495.field_8904));
    public static final class06581 Bw = class06570.N(class00869.MO, new class06573().N(class06495.field_8903));
    public static final class06581 Bk = class06570.N(class00869.Mg);
    public static final class06581 BY = class06570.N(class00869.MI);
    public static final class06581 BQ = class06570.N(class00869.PQ);
    public static final class06581 BO = class06570.N(class00869.PO);
    public static final class06581 Bg = class06570.N(class00869.Pg);
    public static final class06581 BI = class06570.N(class00869.PI);
    public static final class06581 BJ = class06570.N(class00869.PJ);
    public static final class06581 Bo = class06570.N(class00869.Po);
    public static final class06581 Bq = class06570.N(class00869.Pq);
    public static final class06581 BK = class06570.N(class00869.PK);
    public static final class06581 BV = class06570.N(class00869.PV);
    public static final class06581 Be = class06570.N(class00869.Pe);
    public static final class06581 BH = class06570.N(class00869.PH);
    public static final class06581 Bc = class06570.N(class00869.Pc);
    public static final class06581 BX = class06570.N(class00869.PX);
    public static final class06581 Ba = class06570.N(class00869.Tv);
    public static final class06581 Bp = class06570.N(class00869.To);
    public static final class06581 BF = class06570.N(class00869.TY);
    public static final class06581 BA = class06570.N(class00869.nW);
    public static final class06581 Bf = class06570.N(class00869.nT);
    public static final class06581 BC = class06570.N(class00869.nd);
    public static final class06581 BS = class06570.N(class00869.nn);
    public static final class06581 Bx = class06570.N(class00869.BK);
    public static final class06581 BD = class06570.N(class00869.BV);
    public static final class06581 Bh = class06570.N(class00869.Be);
    public static final class06581 Br = class06570.N(class00869.BS);
    public static final class06581 ZN = class06570.N(class00869.BC);
    public static final class06581 Zy = class06570.N(class00869.TV);
    public static final class06581 ZL = class06570.N(class00869.Bx);
    public static final class06581 Zu = class06570.N(class00869.BD);
    public static final class06581 Zi = class06570.N(class00869.ZN);
    public static final class06581 ZR = class06570.N(class00869.Zy);
    public static final class06581 ZM = class06570.N(class00869.ZL);
    public static final class06581 ZB = class06570.N(class00869.Zu);
    public static final class06581 ZZ = class06570.N(class00869.Zi);
    public static final class06581 Zz = class06570.N(class00869.ZR);
    public static final class06581 ZU = class06570.N(class00869.ZM);
    public static final class06581 ZE = class06570.N(class00869.ZB);
    public static final class06581 ZW = class06570.N(class00869.ZZ);
    public static final class06581 Zm = class06570.N(class00869.Zz);
    public static final class06581 ZP = class06570.N(class00869.ZU);
    public static final class06581 Zs = class06570.N(class00869.ZE);
    public static final class06581 ZT = class06570.N(class00869.ZW);
    public static final class06581 Zb = class06570.N(class00869.Zm);
    public static final class06581 Zj = class06570.N(class00869.ZP);
    public static final class06581 Zv = class06570.N(class00869.Zs);
    public static final class06581 Zn = class06570.N(class00869.ZX, new class06573().N(class06495.field_8904));
    public static final class06581 Zt = class06570.N(class00869.Za, class065732 -> class065732.N(class06495.field_8904).N(class02484.Nl, class02841.N.N((class08092)class04392.L, (Comparable)Integer.valueOf(15))));
    public static final class06581 ZG = class06570.N(class00869.zy);
    public static final class06581 Zl = class06570.N(class00869.zL, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7952)));
    public static final class06581 Zd = class06570.N(class00869.zu, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7946)));
    public static final class06581 Zw = class06570.N(class00869.zi, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7958)));
    public static final class06581 Zk = class06570.N(class00869.zR, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7951)));
    public static final class06581 ZY = class06570.N(class00869.zM, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7947)));
    public static final class06581 ZQ = class06570.N(class00869.zB, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7961)));
    public static final class06581 ZO = class06570.N(class00869.zZ, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7954)));
    public static final class06581 Zg = class06570.N(class00869.zz, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7944)));
    public static final class06581 ZI = class06570.N(class00869.zU, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7967)));
    public static final class06581 ZJ = class06570.N(class00869.zE, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7955)));
    public static final class06581 Zo = class06570.N(class00869.zW, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7945)));
    public static final class06581 Zq = class06570.N(class00869.zm, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7966)));
    public static final class06581 ZK = class06570.N(class00869.zP, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7957)));
    public static final class06581 ZV = class06570.N(class00869.zs, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7942)));
    public static final class06581 Ze = class06570.N(class00869.zT, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7964)));
    public static final class06581 ZH = class06570.N(class00869.zb, class065732 -> class065732.N(class02484.o, class08725.N((class06563)class06563.field_7963)));
    public static final class06581 Zc = class06570.N(class00869.zj);
    public static final class06581 ZX = class06570.N(class00869.zn);
    public static final class06581 Za = class06570.N(class00869.Ek);
    public static final class06581 Zp = class06570.N(class00869.zt, class06578::new);
    public static final class06581 ZF = class06570.N(class00869.zG, class06578::new);
    public static final class06581 ZA = class06570.N(class00869.zl, class06578::new);
    public static final class06581 Zf = class06570.N(class00869.zd, class06578::new);
    public static final class06581 ZC = class06570.N(class00869.zw, class06578::new);
    public static final class06581 ZS = class06570.N(class00869.zk, class06578::new);
    public static final class06581 Zx = class06570.N(class00869.ic);
    public static final class06581 ZD = class06570.N(class00869.iX);
    public static final class06581 Zh = class06570.N(class00869.ia);
    public static final class06581 Zr = class06570.N(class00869.ip);
    public static final class06581 zN = class06570.N(class00869.iF);
    public static final class06581 zy = class06570.N(class00869.iA);
    public static final class06581 zL = class06570.N(class00869.f_if__1);
    public static final class06581 zu = class06570.N(class00869.iC);
    public static final class06581 zi = class06570.N(class00869.iS);
    public static final class06581 zR = class06570.N(class00869.ix);
    public static final class06581 zM = class06570.N(class00869.iD);
    public static final class06581 zB = class06570.N(class00869.ih);
    public static final class06581 zZ = class06570.N(class00869.ir);
    public static final class06581 zz = class06570.N(class00869.RN);
    public static final class06581 zU = class06570.N(class00869.Ry);
    public static final class06581 zE = class06570.N(class00869.RL);
    public static final class06581 zW = class06570.N(class00869.ZT);
    public static final class06581 zm = class06570.N(class00869.Zb);
    public static final class06581 zP = class06570.N(class00869.Zj);
    public static final class06581 zs = class06570.N(class00869.Zv);
    public static final class06581 zT = class06570.N(class00869.Zn);
    public static final class06581 zb = class06570.N(class00869.Zt);
    public static final class06581 zj = class06570.N(class00869.ZG);
    public static final class06581 zv = class06570.N(class00869.Zl);
    public static final class06581 zn = class06570.N(class00869.Zd);
    public static final class06581 zt = class06570.N(class00869.Zw);
    public static final class06581 zG = class06570.N(class00869.Zk);
    public static final class06581 zl = class06570.N(class00869.ZY);
    public static final class06581 zd = class06570.N(class00869.ZQ);
    public static final class06581 zw = class06570.N(class00869.ZO);
    public static final class06581 zk = class06570.N(class00869.Zg);
    public static final class06581 zY = class06570.N(class00869.ZI);
    public static final class06581 zQ = class06570.N(class00869.ZF);
    public static final class06581 zO = class06570.N(class00869.ZA);
    public static final class06581 zg = class06570.N(class00869.Zf);
    public static final class06581 zI = class06570.N(class00869.ZC);
    public static final class06581 zJ = class06570.N(class00869.ZS);
    public static final class06581 zo = class06570.N(class00869.Zx);
    public static final class06581 zq = class06570.N(class00869.zN);
    public static final class06581 zK = class06570.N(class00869.UB);
    public static final class06581 zV = class06570.N(class00869.UZ);
    public static final class06581 ze = class06570.N(class00869.Uz);
    public static final class06581 zH = class06570.N(class00869.UU);
    public static final class06581 zc = class06570.N(class00869.EQ, class06590::new, new class06573().N(class06495.field_8904));
    public static final class06581 zX = class06570.N(class00869.EO, class06590::new, new class06573().N(class06495.field_8904));
    public static final class06581 za = class06570.N(class00869.EI);
    public static final class06581 zp = class06570.N(class00869.EJ);
    public static final class06581 zF = class06570.N(class00869.sm);
    public static final class06581 zA = class06570.N(class00869.Eo);
    public static final class06581 zf = class06570.N(class00869.Eq);
    public static final class06581 zC = class06570.N(class00869.EK, new class06573().N(class06495.field_8904));
    public static final class06581 zS = class06570.N(class00869.Ee, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 zx = class06570.N(class00869.EH, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 zD = class06570.N(class00869.Ec, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 zh = class06570.N(class00869.EX, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 zr = class06570.N(class00869.Ea, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UN = class06570.N(class00869.Ep, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 Uy = class06570.N(class00869.EF, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UL = class06570.N(class00869.EA, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 Uu = class06570.N(class00869.Ef, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 Ui = class06570.N(class00869.EC, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UR = class06570.N(class00869.ES, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UM = class06570.N(class00869.Ex, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UB = class06570.N(class00869.ED, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UZ = class06570.N(class00869.Eh, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 Uz = class06570.N(class00869.Er, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UU = class06570.N(class00869.WN, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UE = class06570.N(class00869.Wy, new class06573().N(1).N(class02484.NG, class02854.N));
    public static final class06581 UW = class06570.N(class00869.WL);
    public static final class06581 Um = class06570.N(class00869.Wu);
    public static final class06581 UP = class06570.N(class00869.Wi);
    public static final class06581 Us = class06570.N(class00869.WR);
    public static final class06581 UT = class06570.N(class00869.WM);
    public static final class06581 Ub = class06570.N(class00869.WB);
    public static final class06581 Uj = class06570.N(class00869.WZ);
    public static final class06581 Uv = class06570.N(class00869.Wz);
    public static final class06581 Un = class06570.N(class00869.WU);
    public static final class06581 Ut = class06570.N(class00869.WE);
    public static final class06581 UG = class06570.N(class00869.WW);
    public static final class06581 Ul = class06570.N(class00869.Wm);
    public static final class06581 Ud = class06570.N(class00869.WP);
    public static final class06581 Uw = class06570.N(class00869.Ws);
    public static final class06581 Uk = class06570.N(class00869.WT);
    public static final class06581 UY = class06570.N(class00869.Wb);
    public static final class06581 UQ = class06570.N(class00869.Wj);
    public static final class06581 UO = class06570.N(class00869.Wv);
    public static final class06581 Ug = class06570.N(class00869.Wn);
    public static final class06581 UI = class06570.N(class00869.Wt);
    public static final class06581 UJ = class06570.N(class00869.WG);
    public static final class06581 Uo = class06570.N(class00869.Wl);
    public static final class06581 Uq = class06570.N(class00869.Wd);
    public static final class06581 UK = class06570.N(class00869.Ww);
    public static final class06581 UV = class06570.N(class00869.Wk);
    public static final class06581 Ue = class06570.N(class00869.WY);
    public static final class06581 UH = class06570.N(class00869.WQ);
    public static final class06581 Uc = class06570.N(class00869.WO);
    public static final class06581 UX = class06570.N(class00869.Wg);
    public static final class06581 Ua = class06570.N(class00869.WI);
    public static final class06581 Up = class06570.N(class00869.WJ);
    public static final class06581 UF = class06570.N(class00869.Wo);
    public static final class06581 UA = class06570.N(class00869.Wq);
    public static final class06581 Uf = class06570.N(class00869.WK);
    public static final class06581 UC = class06570.N(class00869.WV);
    public static final class06581 US = class06570.N(class00869.We);
    public static final class06581 Ux = class06570.N(class00869.WH);
    public static final class06581 UD = class06570.N(class00869.Wc);
    public static final class06581 Uh = class06570.N(class00869.WX);
    public static final class06581 Ur = class06570.N(class00869.Wa);
    public static final class06581 EN = class06570.N(class00869.Wp);
    public static final class06581 Ey = class06570.N(class00869.WF);
    public static final class06581 EL = class06570.N(class00869.WA);
    public static final class06581 Eu = class06570.N(class00869.Wf);
    public static final class06581 Ei = class06570.N(class00869.WC);
    public static final class06581 ER = class06570.N(class00869.WS);
    public static final class06581 EM = class06570.N(class00869.Wx);
    public static final class06581 EB = class06570.N(class00869.WD);
    public static final class06581 EZ = class06570.N(class00869.my);
    public static final class06581 Ez = class06570.N(class00869.mL, class065732 -> class065732.N(class06495.field_8907));
    public static final class06581 EU = class06570.N(class00869.mu);
    public static final class06581 EE = class06570.N(class00869.mi);
    public static final class06581 EW = class06570.N(class00869.mR);
    public static final class06581 Em = class06570.N(class00869.mM);
    public static final class06581 EP = class06570.N(class00869.mB);
    public static final class06581 Es = class06570.N(class00869.mZ);
    public static final class06581 ET = class06570.N(class00869.mz);
    public static final class06581 Eb = class06570.N(class00869.mU);
    public static final class06581 Ej = class06570.N(class00869.mE);
    public static final class06581 Ev = class06570.N(class00869.mW);
    public static final class06581 En = class06570.N(class00869.mm);
    public static final class06581 Et = class06570.N(class00869.mv);
    public static final class06581 EG = class06570.N(class00869.mn);
    public static final class06581 El = class06570.N(class00869.mt);
    public static final class06581 Ed = class06570.N(class00869.mG);
    public static final class06581 Ew = class06570.N(class00869.ml);
    public static final class06581 Ek = class06570.N(class00869.ms);
    public static final class06581 EY = class06570.N(class00869.mT);
    public static final class06581 EQ = class06570.N(class00869.mb);
    public static final class06581 EO = class06570.N(class00869.mj);
    public static final class06581 Eg = class06570.N(class00869.mP);
    public static final class06581 EI = class06570.N(class00869.mO, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.mc, class07211.field_11033, class065732));
    public static final class06581 EJ = class06570.N(class00869.mg, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.mX, class07211.field_11033, class065732));
    public static final class06581 Eo = class06570.N(class00869.mI, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.ma, class07211.field_11033, class065732));
    public static final class06581 Eq = class06570.N(class00869.mJ, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.mp, class07211.field_11033, class065732));
    public static final class06581 EK = class06570.N(class00869.mo, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.mF, class07211.field_11033, class065732));
    public static final class06581 EV = class06570.N(class00869.md, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.mq, class07211.field_11033, class065732));
    public static final class06581 Ee = class06570.N(class00869.mw, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.mK, class07211.field_11033, class065732));
    public static final class06581 EH = class06570.N(class00869.mk, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.mV, class07211.field_11033, class065732));
    public static final class06581 Ec = class06570.N(class00869.mY, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.me, class07211.field_11033, class065732));
    public static final class06581 EX = class06570.N(class00869.mQ, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.mH, class07211.field_11033, class065732));
    public static final class06581 Ea = class06570.N(class00869.mf);
    public static final class06581 Ep = class06570.N(class00869.mC, new class06573().N(class06495.field_8907));
    public static final class06581 EF = class06570.N(class00869.Py);
    public static final class06581 EA = class06570.N(class00869.PL);
    public static final class06581 Ef = class06570.N(class00869.Pu);
    public static final class06581 EC = class06570.N(class00869.Pi);
    public static final class06581 ES = class06570.N(class00869.PR);
    public static final class06581 Ex = class06570.N(class00869.PM);
    public static final class06581 ED = class06570.N(class00869.PB);
    public static final class06581 Eh = class06570.N(class00869.PZ);
    public static final class06581 Er = class06570.N(class00869.Pz);
    public static final class06581 WN = class06570.N(class00869.PU);
    public static final class06581 Wy = class06570.N(class00869.PE);
    public static final class06581 WL = class06570.N(class00869.PW);
    public static final class06581 Wu = class06570.N(class00869.Pm);
    public static final class06581 Wi = class06570.N(class00869.PP);
    public static final class06581 WR = class06570.N(class00869.nU);
    public static final class06581 WM = class06570.N(class00869.nP);
    public static final class06581 WB = class06570.N(class00869.nG);
    public static final class06581 WZ = class06570.N(class00869.nj);
    public static final class06581 Wz = class06570.N(class00869.Ps);
    public static final class06581 WU = class06570.N(class00869.PT);
    public static final class06581 WE = class06570.N(class00869.Pb);
    public static final class06581 WW = class06570.N(class00869.Pj);
    public static final class06581 Wm = class06570.N(class00869.Pv);
    public static final class06581 WP = class06570.N(class00869.Pn);
    public static final class06581 Ws = class06570.N(class00869.Pt);
    public static final class06581 WT = class06570.N(class00869.PG);
    public static final class06581 Wb = class06570.N(class00869.Pl);
    public static final class06581 Wj = class06570.N(class00869.Pd);
    public static final class06581 Wv = class06570.N(class00869.Pw);
    public static final class06581 Wn = class06570.N(class00869.Pk);
    public static final class06581 Wt = class06570.N(class00869.PY);
    public static final class06581 WG = class06570.N(class00869.nE);
    public static final class06581 Wl = class06570.N(class00869.ns);
    public static final class06581 Wd = class06570.N(class00869.nl);
    public static final class06581 Ww = class06570.N(class00869.nv);
    public static final class06581 Wk = class06570.N(class00869.Pa, class06107::new);
    public static final class06581 WY = class06570.N("redstone", class06570.y(class00869.Lf), new class06573().y((class05946<class03252>)class03270.u));
    public static final class06581 WQ = class06570.N(class00869.iW, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.im, class07211.field_11033, class065732));
    public static final class06581 WO = class06570.N(class00869.BF);
    public static final class06581 Wg = class06570.N(class00869.iH);
    public static final class06581 WI = class06570.N(class00869.Ba);
    public static final class06581 WJ = class06570.N(class00869.yq);
    public static final class06581 Wo = class06570.N(class00869.yd);
    public static final class06581 Wq = class06570.N(class00869.Zc);
    public static final class06581 WK = class06570.N(class00869.TM);
    public static final class06581 WV = class06570.N(class00869.EV);
    public static final class06581 We = class06570.N(class00869.Bf, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 WH = class06570.N(class00869.yy, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 Wc = class06570.N(class00869.Br, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 WX = class06570.N(class00869.PD);
    public static final class06581 Wa = class06570.N(class00869.Tu);
    public static final class06581 Wp = class06570.N(class00869.uD);
    public static final class06581 WF = class06570.N(class00869.vq);
    public static final class06581 WA = class06570.N(class00869.vK);
    public static final class06581 Wf = class06570.N(class00869.vV);
    public static final class06581 WC = class06570.N(class00869.ve);
    public static final class06581 WS = class06570.N(class00869.vH);
    public static final class06581 Wx = class06570.N(class00869.vc);
    public static final class06581 WD = class06570.N(class00869.vX);
    public static final class06581 Wh = class06570.N(class00869.va);
    public static final class06581 Wr = class06570.N(class00869.Bp);
    public static final class06581 mN = class06570.N(class00869.bp);
    public static final class06581 my = class06570.N(class00869.bF);
    public static final class06581 mL = class06570.N(class00869.MG);
    public static final class06581 mu = class06570.N(class00869.BH, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 mi = class06570.N(class00869.Ln);
    public static final class06581 mR = class06570.N(class00869.MT);
    public static final class06581 mM = class06570.N(class00869.yR);
    public static final class06581 mB = class06570.N(class00869.iP);
    public static final class06581 mZ = class06570.N(class00869.TJ);
    public static final class06581 mz = class06570.N(class00869.BE);
    public static final class06581 mU = class06570.N(class00869.BW);
    public static final class06581 mE = class06570.N(class00869.Bm);
    public static final class06581 mW = class06570.N(class00869.BP);
    public static final class06581 mm = class06570.N(class00869.Bs);
    public static final class06581 mP = class06570.N(class00869.BT);
    public static final class06581 ms = class06570.N(class00869.Bb);
    public static final class06581 mT = class06570.N(class00869.Bj);
    public static final class06581 mb = class06570.N(class00869.Bv);
    public static final class06581 mj = class06570.N(class00869.Bn);
    public static final class06581 mv = class06570.N(class00869.sp);
    public static final class06581 mn = class06570.N(class00869.sF);
    public static final class06581 mt = class06570.N(class00869.uh);
    public static final class06581 mG = class06570.N(class00869.TI);
    public static final class06581 ml = class06570.N(class00869.Bc);
    public static final class06581 md = class06570.N(class00869.BX);
    public static final class06581 mw = class06570.N(class00869.iN);
    public static final class06581 mk = class06570.N(class00869.iy);
    public static final class06581 mY = class06570.N(class00869.iL);
    public static final class06581 mQ = class06570.N(class00869.iu);
    public static final class06581 mO = class06570.N(class00869.ii);
    public static final class06581 mg = class06570.N(class00869.iR);
    public static final class06581 mI = class06570.N(class00869.iM);
    public static final class06581 mJ = class06570.N(class00869.iB);
    public static final class06581 mo = class06570.N(class00869.iZ);
    public static final class06581 mq = class06570.N(class00869.iz);
    public static final class06581 mK = class06570.N(class00869.sJ);
    public static final class06581 mV = class06570.N(class00869.so);
    public static final class06581 me = class06570.N(class00869.ur, class06578::new);
    public static final class06581 mH = class06570.N(class00869.uE, class06578::new);
    public static final class06581 mc = class06570.N(class00869.EM, class06578::new);
    public static final class06581 mX = class06570.N(class00869.EB, class06578::new);
    public static final class06581 ma = class06570.N(class00869.EZ, class06578::new);
    public static final class06581 mp = class06570.N(class00869.Ez, class06578::new);
    public static final class06581 mF = class06570.N(class00869.EU, class06578::new);
    public static final class06581 mA = class06570.N(class00869.EE, class06578::new);
    public static final class06581 mf = class06570.N(class00869.EW, class06578::new);
    public static final class06581 mC = class06570.N(class00869.Em, class06578::new);
    public static final class06581 mS = class06570.N(class00869.EP, class06578::new);
    public static final class06581 mx = class06570.N(class00869.sA, class06578::new);
    public static final class06581 mD = class06570.N(class00869.sf, class06578::new);
    public static final class06581 mh = class06570.N(class00869.jH, class06578::new);
    public static final class06581 mr = class06570.N(class00869.jc, class06578::new);
    public static final class06581 PN = class06570.N(class00869.ja, class06578::new);
    public static final class06581 Py = class06570.N(class00869.jX, class06578::new);
    public static final class06581 PL = class06570.N(class00869.jp, class06578::new);
    public static final class06581 Pu = class06570.N(class00869.jF, class06578::new);
    public static final class06581 Pi = class06570.N(class00869.jf, class06578::new);
    public static final class06581 PR = class06570.N(class00869.jA, class06578::new);
    public static final class06581 PM = class06570.N(class00869.Zp);
    public static final class06581 PB = class06570.N(class00869.Ru);
    public static final class06581 PZ = class06570.N(class00869.Ri);
    public static final class06581 Pz = class06570.N(class00869.RR);
    public static final class06581 PU = class06570.N(class00869.RM);
    public static final class06581 PE = class06570.N(class00869.RB);
    public static final class06581 PW = class06570.N(class00869.RZ);
    public static final class06581 Pm = class06570.N(class00869.Rz);
    public static final class06581 PP = class06570.N(class00869.RU);
    public static final class06581 Ps = class06570.N(class00869.RE);
    public static final class06581 PT = class06570.N(class00869.RW);
    public static final class06581 Pb = class06570.N(class00869.sV);
    public static final class06581 Pj = class06570.N(class00869.se);
    public static final class06581 Pv = class06570.N(class00869.jC);
    public static final class06581 Pn = class06570.N(class00869.jS);
    public static final class06581 Pt = class06570.N(class00869.jD);
    public static final class06581 PG = class06570.N(class00869.jx);
    public static final class06581 Pl = class06570.N(class00869.jh);
    public static final class06581 Pd = class06570.N(class00869.jr);
    public static final class06581 Pw = class06570.N(class00869.vy);
    public static final class06581 Pk = class06570.N(class00869.vN);
    public static final class06581 PY = class06570.N(class00869.Rp);
    public static final class06581 PQ = class06570.N(class00869.UX);
    public static final class06581 PO = class06570.N(class00869.Ua);
    public static final class06581 Pg = class06570.N(class00869.Up);
    public static final class06581 PI = class06570.N(class00869.UF);
    public static final class06581 PJ = class06570.N(class00869.UA);
    public static final class06581 Po = class06570.N(class00869.Uf);
    public static final class06581 Pq = class06570.N(class00869.UC);
    public static final class06581 PK = class06570.N(class00869.US);
    public static final class06581 PV = class06570.N(class00869.Ux);
    public static final class06581 Pe = class06570.N(class00869.sH);
    public static final class06581 PH = class06570.N(class00869.sc);
    public static final class06581 Pc = class06570.N(class00869.yG);
    public static final class06581 PX = class06570.N(class00869.yl);
    public static final class06581 Pa = class06570.N(class00869.um);
    public static final class06581 Pp = class06570.N(class00869.Bh);
    public static final class06581 PF = class06570.N("saddle", new class06573().N(1).N(class02484.o, class08725.N()));
    public static final class06581 PA = class06570.N("white_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7952)));
    public static final class06581 Pf = class06570.N("orange_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7946)));
    public static final class06581 PC = class06570.N("magenta_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7958)));
    public static final class06581 PS = class06570.N("light_blue_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7951)));
    public static final class06581 Px = class06570.N("yellow_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7947)));
    public static final class06581 PD = class06570.N("lime_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7961)));
    public static final class06581 Ph = class06570.N("pink_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7954)));
    public static final class06581 Pr = class06570.N("gray_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7944)));
    public static final class06581 sN = class06570.N("light_gray_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7967)));
    public static final class06581 sy = class06570.N("cyan_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7955)));
    public static final class06581 sL = class06570.N("purple_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7945)));
    public static final class06581 su = class06570.N("blue_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7966)));
    public static final class06581 si = class06570.N("brown_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7957)));
    public static final class06581 sR = class06570.N("green_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7942)));
    public static final class06581 sM = class06570.N("red_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7964)));
    public static final class06581 sB = class06570.N("black_harness", new class06573().N(1).N(class02484.o, class08725.y((class06563)class06563.field_7963)));
    public static final class06581 sZ = class06570.N("minecart", (class06573 class065732) -> new class06564((class07078<? extends class07504>)class07078.NK, (class06573)class065732), new class06573().N(1));
    public static final class06581 sz = class06570.N("chest_minecart", (class06573 class065732) -> new class06564((class07078<? extends class07504>)class07078.Y, (class06573)class065732), new class06573().N(1));
    public static final class06581 sU = class06570.N("furnace_minecart", (class06573 class065732) -> new class06564((class07078<? extends class07504>)class07078.NM, (class06573)class065732), new class06573().N(1));
    public static final class06581 sE = class06570.N("tnt_minecart", (class06573 class065732) -> new class06564((class07078<? extends class07504>)class07078.yI, (class06573)class065732), new class06573().N(1));
    public static final class06581 sW = class06570.N("hopper_minecart", (class06573 class065732) -> new class06564((class07078<? extends class07504>)class07078.Ns, (class06573)class065732), new class06573().N(1));
    public static final class06581 sm = class06570.N("carrot_on_a_stick", (class06573 class065732) -> new class06931(class07078.Nh, 7, class065732), new class06573().y(25));
    public static final class06581 sP = class06570.N("warped_fungus_on_a_stick", (class06573 class065732) -> new class06931(class07078.yY, 1, class065732), new class06573().y(100));
    public static final class06581 ss = class06570.N("phantom_membrane");
    public static final class06581 sT = class06570.N("elytra", new class06573().y(432).N(class06495.field_8904).N(class02484.K, class06244.field_17274).N(class02484.o, class08725.N((class07085)class07085.field_6174).N(class04909.Nb).N(class08699.U).L(false).N()).L(ss));
    public static final class06581 sb = class06570.N("oak_boat", (class06573 class065732) -> new class06914(class07078.Nc, class065732), new class06573().N(1));
    public static final class06581 sj = class06570.N("oak_chest_boat", (class06573 class065732) -> new class06914(class07078.NX, class065732), new class06573().N(1));
    public static final class06581 sv = class06570.N("spruce_boat", (class06573 class065732) -> new class06914(class07078.yl, class065732), new class06573().N(1));
    public static final class06581 sn = class06570.N("spruce_chest_boat", (class06573 class065732) -> new class06914(class07078.yd, class065732), new class06573().N(1));
    public static final class06581 st = class06570.N("birch_boat", (class06573 class065732) -> new class06914(class07078.P, class065732), new class06573().N(1));
    public static final class06581 sG = class06570.N("birch_chest_boat", (class06573 class065732) -> new class06914(class07078.s, class065732), new class06573().N(1));
    public static final class06581 sl = class06570.N("jungle_boat", (class06573 class065732) -> new class06914(class07078.Nd, class065732), new class06573().N(1));
    public static final class06581 sd = class06570.N("jungle_chest_boat", (class06573 class065732) -> new class06914(class07078.Nw, class065732), new class06573().N(1));
    public static final class06581 sw = class06570.N("acacia_boat", (class06573 class065732) -> new class06914(class07078.L, class065732), new class06573().N(1));
    public static final class06581 sk = class06570.N("acacia_chest_boat", (class06573 class065732) -> new class06914(class07078.u, class065732), new class06573().N(1));
    public static final class06581 sY = class06570.N("cherry_boat", (class06573 class065732) -> new class06914(class07078.w, class065732), new class06573().N(1));
    public static final class06581 sQ = class06570.N("cherry_chest_boat", (class06573 class065732) -> new class06914(class07078.k, class065732), new class06573().N(1));
    public static final class06581 sO = class06570.N("dark_oak_boat", (class06573 class065732) -> new class06914(class07078.K, class065732), new class06573().N(1));
    public static final class06581 sg = class06570.N("dark_oak_chest_boat", (class06573 class065732) -> new class06914(class07078.V, class065732), new class06573().N(1));
    public static final class06581 sI = class06570.N("pale_oak_boat", (class06573 class065732) -> new class06914(class07078.NA, class065732), new class06573().N(1));
    public static final class06581 sJ = class06570.N("pale_oak_chest_boat", (class06573 class065732) -> new class06914(class07078.Nf, class065732), new class06573().N(1));
    public static final class06581 so = class06570.N("mangrove_boat", (class06573 class065732) -> new class06914(class07078.NI, class065732), new class06573().N(1));
    public static final class06581 sq = class06570.N("mangrove_chest_boat", (class06573 class065732) -> new class06914(class07078.NJ, class065732), new class06573().N(1));
    public static final class06581 sK = class06570.N("bamboo_raft", (class06573 class065732) -> new class06914(class07078.E, class065732), new class06573().N(1));
    public static final class06581 sV = class06570.N("bamboo_chest_raft", (class06573 class065732) -> new class06914(class07078.U, class065732), new class06573().N(1));
    public static final class06581 se = class06570.N(class00869.sh, class06590::new, new class06573().N(class06495.field_8904));
    public static final class06581 sH = class06570.N(class00869.sr, class06590::new, new class06573().N(class06495.field_8904));
    public static final class06581 sc = class06570.N(class00869.TN, class06590::new, new class06573().N(class06495.field_8904).N(class02484.Nl, class02841.N.N((class08092)class08620.y, (Comparable)class00235.field_56024)));
    public static final class06581 sX = class06570.N(class00869.Ty, class06590::new, new class06573().N(class06495.field_8904));
    public static final class06581 sa = class06570.N("turtle_helmet", new class06573().N(class06939.M, class03274.field_41934));
    public static final class06581 sp = class06570.N("turtle_scute");
    public static final class06581 sF = class06570.N("armadillo_scute");
    public static final class06581 sA = class06570.N("wolf_armor", new class06573().N(class06939.Z));
    public static final class06581 sf = class06570.N("flint_and_steel", class06571::new, new class06573().y(64));
    public static final class06581 sC = class06570.N("bowl");
    public static final class06581 sS = class06570.N("apple", new class06573().N(class05344.N));
    public static final class06581 sx = class06570.N("bow", class06924::new, new class06573().y(384).L(1));
    public static final class06581 sD = class06570.N("arrow", class06927::new);
    public static final class06581 sh = class06570.N("coal");
    public static final class06581 sr = class06570.N("charcoal");
    public static final class06581 TN = class06570.N("diamond", new class06573().y((class05946<class03252>)class03270.B));
    public static final class06581 Ty = class06570.N("emerald", new class06573().y((class05946<class03252>)class03270.M));
    public static final class06581 TL = class06570.N("lapis_lazuli", new class06573().y((class05946<class03252>)class03270.Z));
    public static final class06581 Tu = class06570.N("quartz", new class06573().y((class05946<class03252>)class03270.N));
    public static final class06581 Ti = class06570.N("amethyst_shard", new class06573().y((class05946<class03252>)class03270.z));
    public static final class06581 TR = class06570.N("raw_iron");
    public static final class06581 TM = class06570.N("iron_ingot", new class06573().y((class05946<class03252>)class03270.y));
    public static final class06581 TB = class06570.N("raw_copper");
    public static final class06581 TZ = class06570.N("copper_ingot", new class06573().y((class05946<class03252>)class03270.i));
    public static final class06581 Tz = class06570.N("raw_gold");
    public static final class06581 TU = class06570.N("gold_ingot", new class06573().y((class05946<class03252>)class03270.R));
    public static final class06581 TE = class06570.N("netherite_ingot", new class06573().N().y((class05946<class03252>)class03270.L));
    public static final class06581 TW = class06570.N("netherite_scrap", new class06573().N());
    public static final class06581 Tm = class06570.N("wooden_sword", new class06573().i(class02749.N, 3.0f, -2.4f));
    public static final class06581 TP = class06570.N("wooden_shovel", (class06573 class065732) -> new class06499(class02749.N, 1.5f, -3.0f, class065732));
    public static final class06581 Ts = class06570.N("wooden_pickaxe", new class06573().N(class02749.N, 1.0f, -2.8f));
    public static final class06581 TT = class06570.N("wooden_axe", (class06573 class065732) -> new class06938(class02749.N, 6.0f, -3.2f, class065732));
    public static final class06581 Tb = class06570.N("wooden_hoe", (class06573 class065732) -> new class06561(class02749.N, 0.0f, -3.0f, (class06573)class065732));
    public static final class06581 Tj = class06570.N("copper_sword", new class06573().i(class02749.L, 3.0f, -2.4f));
    public static final class06581 Tv = class06570.N("copper_shovel", (class06573 class065732) -> new class06499(class02749.L, 1.5f, -3.0f, class065732));
    public static final class06581 Tn = class06570.N("copper_pickaxe", new class06573().N(class02749.L, 1.0f, -2.8f));
    public static final class06581 Tt = class06570.N("copper_axe", (class06573 class065732) -> new class06938(class02749.L, 7.0f, -3.2f, class065732));
    public static final class06581 TG = class06570.N("copper_hoe", (class06573 class065732) -> new class06561(class02749.L, -1.0f, -2.0f, (class06573)class065732));
    public static final class06581 Tl = class06570.N("stone_sword", new class06573().i(class02749.y, 3.0f, -2.4f));
    public static final class06581 Td = class06570.N("stone_shovel", (class06573 class065732) -> new class06499(class02749.y, 1.5f, -3.0f, class065732));
    public static final class06581 Tw = class06570.N("stone_pickaxe", new class06573().N(class02749.y, 1.0f, -2.8f));
    public static final class06581 Tk = class06570.N("stone_axe", (class06573 class065732) -> new class06938(class02749.y, 7.0f, -3.2f, class065732));
    public static final class06581 TY = class06570.N("stone_hoe", (class06573 class065732) -> new class06561(class02749.y, -1.0f, -2.0f, (class06573)class065732));
    public static final class06581 TQ = class06570.N("golden_sword", new class06573().i(class02749.R, 3.0f, -2.4f));
    public static final class06581 TO = class06570.N("golden_shovel", (class06573 class065732) -> new class06499(class02749.R, 1.5f, -3.0f, class065732));
    public static final class06581 Tg = class06570.N("golden_pickaxe", new class06573().N(class02749.R, 1.0f, -2.8f));
    public static final class06581 TI = class06570.N("golden_axe", (class06573 class065732) -> new class06938(class02749.R, 6.0f, -3.0f, class065732));
    public static final class06581 TJ = class06570.N("golden_hoe", (class06573 class065732) -> new class06561(class02749.R, 0.0f, -3.0f, (class06573)class065732));
    public static final class06581 To = class06570.N("iron_sword", new class06573().i(class02749.u, 3.0f, -2.4f));
    public static final class06581 Tq = class06570.N("iron_shovel", (class06573 class065732) -> new class06499(class02749.u, 1.5f, -3.0f, class065732));
    public static final class06581 TK = class06570.N("iron_pickaxe", new class06573().N(class02749.u, 1.0f, -2.8f));
    public static final class06581 TV = class06570.N("iron_axe", (class06573 class065732) -> new class06938(class02749.u, 6.0f, -3.1f, class065732));
    public static final class06581 Te = class06570.N("iron_hoe", (class06573 class065732) -> new class06561(class02749.u, -2.0f, -1.0f, (class06573)class065732));
    public static final class06581 TH = class06570.N("diamond_sword", new class06573().i(class02749.i, 3.0f, -2.4f));
    public static final class06581 Tc = class06570.N("diamond_shovel", (class06573 class065732) -> new class06499(class02749.i, 1.5f, -3.0f, class065732));
    public static final class06581 TX = class06570.N("diamond_pickaxe", new class06573().N(class02749.i, 1.0f, -2.8f));
    public static final class06581 Ta = class06570.N("diamond_axe", (class06573 class065732) -> new class06938(class02749.i, 5.0f, -3.0f, class065732));
    public static final class06581 Tp = class06570.N("diamond_hoe", (class06573 class065732) -> new class06561(class02749.i, -3.0f, 0.0f, (class06573)class065732));
    public static final class06581 TF = class06570.N("netherite_sword", new class06573().i(class02749.M, 3.0f, -2.4f).N());
    public static final class06581 TA = class06570.N("netherite_shovel", (class06573 class065732) -> new class06499(class02749.M, 1.5f, -3.0f, class065732), new class06573().N());
    public static final class06581 Tf = class06570.N("netherite_pickaxe", new class06573().N(class02749.M, 1.0f, -2.8f).N());
    public static final class06581 TC = class06570.N("netherite_axe", (class06573 class065732) -> new class06938(class02749.M, 5.0f, -3.0f, class065732), new class06573().N());
    public static final class06581 TS = class06570.N("netherite_hoe", (class06573 class065732) -> new class06561(class02749.M, -4.0f, 0.0f, (class06573)class065732), new class06573().N());
    public static final class06581 Tx = class06570.N("stick");
    public static final class06581 TD = class06570.N("mushroom_stew", new class06573().N(1).N(class05344.d).N(sC));
    public static final class06581 Th = class06570.N("string", class06570.y(class00869.Ml));
    public static final class06581 Tr = class06570.N("feather");
    public static final class06581 bN = class06570.N("gunpowder");
    public static final class06581 by = class06570.N("wheat_seeds", class06570.y(class00869.Lh));
    public static final class06581 bL = class06570.N("wheat");
    public static final class06581 bu = class06570.N("bread", new class06573().N(class05344.R));
    public static final class06581 bi = class06570.N("leather_helmet", new class06573().N(class06939.N, class03274.field_41934));
    public static final class06581 bR = class06570.N("leather_chestplate", new class06573().N(class06939.N, class03274.field_41935));
    public static final class06581 bM = class06570.N("leather_leggings", new class06573().N(class06939.N, class03274.field_41936));
    public static final class06581 bB = class06570.N("leather_boots", new class06573().N(class06939.N, class03274.field_41937));
    public static final class06581 bZ = class06570.N("copper_helmet", new class06573().N(class06939.y, class03274.field_41934));
    public static final class06581 bz = class06570.N("copper_chestplate", new class06573().N(class06939.y, class03274.field_41935));
    public static final class06581 bU = class06570.N("copper_leggings", new class06573().N(class06939.y, class03274.field_41936));
    public static final class06581 bE = class06570.N("copper_boots", new class06573().N(class06939.y, class03274.field_41937));
    public static final class06581 bW = class06570.N("chainmail_helmet", new class06573().N(class06939.L, class03274.field_41934).N(class06495.field_8907));
    public static final class06581 bm = class06570.N("chainmail_chestplate", new class06573().N(class06939.L, class03274.field_41935).N(class06495.field_8907));
    public static final class06581 bP = class06570.N("chainmail_leggings", new class06573().N(class06939.L, class03274.field_41936).N(class06495.field_8907));
    public static final class06581 bs = class06570.N("chainmail_boots", new class06573().N(class06939.L, class03274.field_41937).N(class06495.field_8907));
    public static final class06581 bT = class06570.N("iron_helmet", new class06573().N(class06939.u, class03274.field_41934));
    public static final class06581 bb = class06570.N("iron_chestplate", new class06573().N(class06939.u, class03274.field_41935));
    public static final class06581 bj = class06570.N("iron_leggings", new class06573().N(class06939.u, class03274.field_41936));
    public static final class06581 bv = class06570.N("iron_boots", new class06573().N(class06939.u, class03274.field_41937));
    public static final class06581 bn = class06570.N("diamond_helmet", new class06573().N(class06939.R, class03274.field_41934));
    public static final class06581 bt = class06570.N("diamond_chestplate", new class06573().N(class06939.R, class03274.field_41935));
    public static final class06581 bG = class06570.N("diamond_leggings", new class06573().N(class06939.R, class03274.field_41936));
    public static final class06581 bl = class06570.N("diamond_boots", new class06573().N(class06939.R, class03274.field_41937));
    public static final class06581 bd = class06570.N("golden_helmet", new class06573().N(class06939.i, class03274.field_41934));
    public static final class06581 bw = class06570.N("golden_chestplate", new class06573().N(class06939.i, class03274.field_41935));
    public static final class06581 bk = class06570.N("golden_leggings", new class06573().N(class06939.i, class03274.field_41936));
    public static final class06581 bY = class06570.N("golden_boots", new class06573().N(class06939.i, class03274.field_41937));
    public static final class06581 bQ = class06570.N("netherite_helmet", new class06573().N(class06939.B, class03274.field_41934).N());
    public static final class06581 bO = class06570.N("netherite_chestplate", new class06573().N(class06939.B, class03274.field_41935).N());
    public static final class06581 bg = class06570.N("netherite_leggings", new class06573().N(class06939.B, class03274.field_41936).N());
    public static final class06581 bI = class06570.N("netherite_boots", new class06573().N(class06939.B, class03274.field_41937).N());
    public static final class06581 bJ = class06570.N("flint");
    public static final class06581 bo = class06570.N("porkchop", new class06573().N(class05344.Y));
    public static final class06581 bq = class06570.N("cooked_porkchop", new class06573().N(class05344.P));
    public static final class06581 bK = class06570.N("painting", (class06573 class065732) -> new class06554((class07078<? extends class00710>)class07078.NF, (class06573)class065732));
    public static final class06581 bV = class06570.N("golden_apple", new class06573().N(class05344.n, class08225.B));
    public static final class06581 be = class06570.N("enchanted_golden_apple", new class06573().N(class06495.field_8903).N(class05344.v, class08225.M).N(class02484.G, true));
    public static final class06581 bH = class06570.N(class00869.uy, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.us, class065732), new class06573().N(16));
    public static final class06581 bc = class06570.N(class00869.uL, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.uT, class065732), new class06573().N(16));
    public static final class06581 bX = class06570.N(class00869.uu, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.ub, class065732), new class06573().N(16));
    public static final class06581 ba = class06570.N(class00869.uM, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.un, class065732), new class06573().N(16));
    public static final class06581 bp = class06570.N(class00869.ui, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.uj, class065732), new class06573().N(16));
    public static final class06581 bF = class06570.N(class00869.uR, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.uv, class065732), new class06573().N(16));
    public static final class06581 bA = class06570.N(class00869.uB, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.ut, class065732), new class06573().N(16));
    public static final class06581 bf = class06570.N(class00869.uZ, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.uG, class065732), new class06573().N(16));
    public static final class06581 bC = class06570.N(class00869.uz, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.ul, class065732), new class06573().N(16));
    public static final class06581 bS = class06570.N(class00869.uU, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.ud, class065732), new class06573().N(16));
    public static final class06581 bx = class06570.N(class00869.sC, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.sx, class065732), new class06573().N(16));
    public static final class06581 bD = class06570.N(class00869.sS, (class00891 class008912, class06573 class065732) -> new class06494(class008912, class00869.sD, class065732), new class06573().N(16));
    public static final class06581 bh = class06570.N(class00869.uw, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.ue, class065732), new class06573().N(16));
    public static final class06581 br = class06570.N(class00869.uk, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.uH, class065732), new class06573().N(16));
    public static final class06581 jN = class06570.N(class00869.uY, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.uc, class065732), new class06573().N(16));
    public static final class06581 jy = class06570.N(class00869.ug, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.up, class065732), new class06573().N(16));
    public static final class06581 jL = class06570.N(class00869.uQ, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.uX, class065732), new class06573().N(16));
    public static final class06581 ju = class06570.N(class00869.uO, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.ua, class065732), new class06573().N(16));
    public static final class06581 ji = class06570.N(class00869.uI, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.uF, class065732), new class06573().N(16));
    public static final class06581 jR = class06570.N(class00869.uJ, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.uA, class065732), new class06573().N(16));
    public static final class06581 jM = class06570.N(class00869.uK, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.uf, class065732), new class06573().N(16));
    public static final class06581 jB = class06570.N(class00869.uV, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.ux, class065732), new class06573().N(16));
    public static final class06581 jZ = class06570.N(class00869.uo, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.uC, class065732), new class06573().N(16));
    public static final class06581 jz = class06570.N(class00869.uq, (class00891 class008912, class06573 class065732) -> new class03759(class008912, class00869.uS, class065732), new class06573().N(16));
    public static final class06581 jU = class06570.N("bucket", (class06573 class065732) -> new class06913(class04684.N, class065732), new class06573().N(16));
    public static final class06581 jE = class06570.N("water_bucket", (class06573 class065732) -> new class06913((class04651)class04684.L, class065732), new class06573().y(jU).N(1));
    public static final class06581 jW = class06570.N("lava_bucket", (class06573 class065732) -> new class06913((class04651)class04684.i, class065732), new class06573().y(jU).N(1));
    public static final class06581 jm = class06570.N("powder_snow_bucket", (class06573 class065732) -> new class04810(class00869.ba, class04909.uv, class065732), new class06573().N(1).L());
    public static final class06581 jP = class06570.N("snowball", class06483::new, new class06573().N(16));
    public static final class06581 js = class06570.N("leather");
    public static final class06581 jT = class06570.N("milk_bucket", new class06573().y(jU).N(class02484.w, class08225.W).N(jU).N(1));
    public static final class06581 jb = class06570.N("pufferfish_bucket", (class06573 class065732) -> new class06565((class07078<? extends class07079>)class07078.yR, (class04651)class04684.L, class04909.ub, (class06573)class065732), new class06573().N(1).N(class02484.NM, class02837.N).N(class02484.d, class05344.O));
    public static final class06581 jj = class06570.N("salmon_bucket", (class06573 class065732) -> new class06565((class07078<? extends class07079>)class07078.yZ, (class04651)class04684.L, class04909.ub, (class06573)class065732), new class06573().N(1).N(class02484.NM, class02837.N).N(class02484.d, class05344.q));
    public static final class06581 jv = class06570.N("cod_bucket", (class06573 class065732) -> new class06565((class07078<? extends class07079>)class07078.O, (class04651)class04684.L, class04909.ub, (class06573)class065732), new class06573().N(1).N(class02484.NM, class02837.N).N(class02484.d, class05344.z));
    public static final class06581 jn = class06570.N("tropical_fish_bucket", (class06573 class065732) -> new class06565((class07078<? extends class07079>)class07078.yq, (class04651)class04684.L, class04909.ub, (class06573)class065732), new class06573().N(1).N(class02484.NM, class02837.N).N(class02484.d, class05344.c));
    public static final class06581 jt = class06570.N("axolotl_bucket", (class06573 class065732) -> new class06565((class07078<? extends class07079>)class07078.z, (class04651)class04684.L, class04909.uT, (class06573)class065732), new class06573().N(1).N(class02484.NM, class02837.N));
    public static final class06581 jG = class06570.N("tadpole_bucket", (class06573 class065732) -> new class06565((class07078<? extends class07079>)class07078.yQ, (class04651)class04684.L, class04909.un, (class06573)class065732), new class06573().N(1).N(class02484.NM, class02837.N));
    public static final class06581 jl = class06570.N("brick");
    public static final class06581 jd = class06570.N("clay_ball");
    public static final class06581 jw = class06570.N(class00869.mN);
    public static final class06581 jk = class06570.N("paper");
    public static final class06581 jY = class06570.N("book", new class06573().L(1));
    public static final class06581 jQ = class06570.N("slime_ball");
    public static final class06581 jO = class06570.N("egg", class06549::new, new class06573().N(16).N(class02484.Np, new class02204(class08427.N)));
    public static final class06581 jg = class06570.N("blue_egg", class06549::new, new class06573().N(16).N(class02484.Np, new class02204(class08427.L)));
    public static final class06581 jI = class06570.N("brown_egg", class06549::new, new class06573().N(16).N(class02484.Np, new class02204(class08427.y)));
    public static final class06581 jJ = class06570.N("compass", class06926::new);
    public static final class06581 jo = class06570.N("recovery_compass", new class06573().N(class06495.field_8907));
    public static final class06581 jq = class06570.N("bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jK = class06570.N("white_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jV = class06570.N("orange_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 je = class06570.N("magenta_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jH = class06570.N("light_blue_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jc = class06570.N("yellow_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jX = class06570.N("lime_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 ja = class06570.N("pink_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jp = class06570.N("gray_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jF = class06570.N("light_gray_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jA = class06570.N("cyan_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jf = class06570.N("purple_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jC = class06570.N("blue_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jS = class06570.N("brown_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jx = class06570.N("green_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jD = class06570.N("red_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jh = class06570.N("black_bundle", class05462::new, new class06573().N(1).N(class02484.D, class02830.N));
    public static final class06581 jr = class06570.N("fishing_rod", class06579::new, new class06573().y(64).L(1));
    public static final class06581 vN = class06570.N("clock");
    public static final class06581 vy = class06570.N("spyglass", class05460::new, new class06573().N(1));
    public static final class06581 vL = class06570.N("glowstone_dust");
    public static final class06581 vu = class06570.N("cod", new class06573().N(class05344.z));
    public static final class06581 vi = class06570.N("salmon", new class06573().N(class05344.q));
    public static final class06581 vR = class06570.N("tropical_fish", new class06573().N(class05344.c));
    public static final class06581 vM = class06570.N("pufferfish", new class06573().N(class05344.O, class08225.z));
    public static final class06581 vB = class06570.N("cooked_cod", new class06573().N(class05344.W));
    public static final class06581 vZ = class06570.N("cooked_salmon", new class06573().N(class05344.T));
    public static final class06581 vz = class06570.N("ink_sac", class03591::new);
    public static final class06581 vU = class06570.N("glow_ink_sac", class03582::new);
    public static final class06581 vE = class06570.N("cocoa_beans", class06570.y(class00869.Mb));
    public static final class06581 vW = class06570.N("white_dye", (class06573 class065732) -> new class06559(class06563.field_7952, (class06573)class065732));
    public static final class06581 vm = class06570.N("orange_dye", (class06573 class065732) -> new class06559(class06563.field_7946, (class06573)class065732));
    public static final class06581 vP = class06570.N("magenta_dye", (class06573 class065732) -> new class06559(class06563.field_7958, (class06573)class065732));
    public static final class06581 vs = class06570.N("light_blue_dye", (class06573 class065732) -> new class06559(class06563.field_7951, (class06573)class065732));
    public static final class06581 vT = class06570.N("yellow_dye", (class06573 class065732) -> new class06559(class06563.field_7947, (class06573)class065732));
    public static final class06581 vb = class06570.N("lime_dye", (class06573 class065732) -> new class06559(class06563.field_7961, (class06573)class065732));
    public static final class06581 vj = class06570.N("pink_dye", (class06573 class065732) -> new class06559(class06563.field_7954, (class06573)class065732));
    public static final class06581 vv = class06570.N("gray_dye", (class06573 class065732) -> new class06559(class06563.field_7944, (class06573)class065732));
    public static final class06581 vn = class06570.N("light_gray_dye", (class06573 class065732) -> new class06559(class06563.field_7967, (class06573)class065732));
    public static final class06581 vt = class06570.N("cyan_dye", (class06573 class065732) -> new class06559(class06563.field_7955, (class06573)class065732));
    public static final class06581 vG = class06570.N("purple_dye", (class06573 class065732) -> new class06559(class06563.field_7945, (class06573)class065732));
    public static final class06581 vl = class06570.N("blue_dye", (class06573 class065732) -> new class06559(class06563.field_7966, (class06573)class065732));
    public static final class06581 vd = class06570.N("brown_dye", (class06573 class065732) -> new class06559(class06563.field_7957, (class06573)class065732));
    public static final class06581 vw = class06570.N("green_dye", (class06573 class065732) -> new class06559(class06563.field_7942, (class06573)class065732));
    public static final class06581 vk = class06570.N("red_dye", (class06573 class065732) -> new class06559(class06563.field_7964, (class06573)class065732));
    public static final class06581 vY = class06570.N("black_dye", (class06573 class065732) -> new class06559(class06563.field_7963, (class06573)class065732));
    public static final class06581 vQ = class06570.N("bone_meal", class06944::new);
    public static final class06581 vO = class06570.N("bone");
    public static final class06581 vg = class06570.N("sugar");
    public static final class06581 vI = class06570.N(class00869.ie, new class06573().N(1));
    public static final class06581 vJ = class06570.N(class00869.yM, class06935::new, new class06573().N(1));
    public static final class06581 vo = class06570.N(class00869.yB, class06935::new, new class06573().N(1));
    public static final class06581 vq = class06570.N(class00869.yZ, class06935::new, new class06573().N(1));
    public static final class06581 vK = class06570.N(class00869.yz, class06935::new, new class06573().N(1));
    public static final class06581 vV = class06570.N(class00869.yU, class06935::new, new class06573().N(1));
    public static final class06581 ve = class06570.N(class00869.yE, class06935::new, new class06573().N(1));
    public static final class06581 vH = class06570.N(class00869.yW, class06935::new, new class06573().N(1));
    public static final class06581 vc = class06570.N(class00869.ym, class06935::new, new class06573().N(1));
    public static final class06581 vX = class06570.N(class00869.yP, class06935::new, new class06573().N(1));
    public static final class06581 va = class06570.N(class00869.ys, class06935::new, new class06573().N(1));
    public static final class06581 vp = class06570.N(class00869.yT, class06935::new, new class06573().N(1));
    public static final class06581 vF = class06570.N(class00869.yb, class06935::new, new class06573().N(1));
    public static final class06581 vA = class06570.N(class00869.yj, class06935::new, new class06573().N(1));
    public static final class06581 vf = class06570.N(class00869.yv, class06935::new, new class06573().N(1));
    public static final class06581 vC = class06570.N(class00869.yn, class06935::new, new class06573().N(1));
    public static final class06581 vS = class06570.N(class00869.yt, class06935::new, new class06573().N(1));
    public static final class06581 vx = class06570.N("cookie", new class06573().N(class05344.b));
    public static final class06581 vD = class06570.N(class00869.na, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 vh = class06570.N("filled_map", class06548::new, new class06573().N(class02484.A, class02716.L).N(class02484.C, class02719.N));
    public static final class06581 vr = class06570.N("shears", class06515::new, new class06573().y(238).N(class02484.O, class06515.N()));
    public static final class06581 nN = class06570.N("melon_slice", new class06573().N(class05344.l));
    public static final class06581 ny = class06570.N("dried_kelp", new class06573().N(class05344.j, class08225.i));
    public static final class06581 nL = class06570.N((class05946<class06581>)class03733.N, class06570.y(class00869.Re));
    public static final class06581 nu = class06570.N((class05946<class06581>)class03733.y, class06570.y(class00869.RH));
    public static final class06581 ni = class06570.N("beef", new class06573().N(class05344.L));
    public static final class06581 nR = class06570.N("cooked_beef", new class06573().N(class05344.U));
    public static final class06581 nM = class06570.N("chicken", new class06573().N(class05344.B, class08225.R));
    public static final class06581 nB = class06570.N("cooked_chicken", new class06573().N(class05344.E));
    public static final class06581 nZ = class06570.N("rotten_flesh", new class06573().N(class05344.o, class08225.U));
    public static final class06581 nz = class06570.N("ender_pearl", class06566::new, new class06573().N(16).N(1.0f));
    public static final class06581 nU = class06570.N("blaze_rod");
    public static final class06581 nE = class06570.N("ghast_tear");
    public static final class06581 nW = class06570.N("gold_nugget");
    public static final class06581 nm = class06570.N("nether_wart", class06570.y(class00869.MR));
    public static final class06581 nP = class06570.N("glass_bottle", class06933::new);
    public static final class06581 ns = class06570.N("potion", class06586::new, new class06573().N(1).N(class02484.h, class06517.N).N(class02484.w, class08225.y).N(nP));
    public static final class06581 nT = class06570.N("spider_eye", new class06573().N(class05344.K, class08225.E));
    public static final class06581 nb = class06570.N("fermented_spider_eye");
    public static final class06581 nj = class06570.N("blaze_powder");
    public static final class06581 nv = class06570.N("magma_cream");
    public static final class06581 nn = class06570.N(class00869.MB, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 nt = class06570.N(class00869.MZ, class00869.Mz, class00869.MU, class00869.ME);
    public static final class06581 nG = class06570.N("ender_eye", class06552::new);
    public static final class06581 nl = class06570.N("glistering_melon_slice");
    public static final class06581 nd = class06570.N(class07078.Q);
    public static final class06581 nw = class06570.N(class07078.J);
    public static final class06581 nk = class06570.N(class07078.Nh);
    public static final class06581 nY = class06570.N(class07078.yz);
    public static final class06581 nQ = class06570.N(class07078.t);
    public static final class06581 nO = class06570.N(class07078.H);
    public static final class06581 ng = class06570.N(class07078.NT);
    public static final class06581 nI = class06570.N(class07078.Ne);
    public static final class06581 nJ = class06570.N(class07078.l);
    public static final class06581 no = class06570.N(class07078.Nx);
    public static final class06581 nq = class06570.N(class07078.yC);
    public static final class06581 nK = class06570.N(class07078.M);
    public static final class06581 nV = class06570.N(class07078.W);
    public static final class06581 ne = class06570.N(class07078.m);
    public static final class06581 nH = class06570.N(class07078.Ni);
    public static final class06581 nc = class06570.N(class07078.NW);
    public static final class06581 nX = class06570.N(class07078.NQ);
    public static final class06581 na = class06570.N(class07078.Na);
    public static final class06581 np = class06570.N(class07078.NC);
    public static final class06581 nF = class06570.N(class07078.yL);
    public static final class06581 nA = class06570.N(class07078.yM);
    public static final class06581 nf = class06570.N(class07078.z);
    public static final class06581 nC = class06570.N(class07078.O);
    public static final class06581 nS = class06570.N(class07078.e);
    public static final class06581 nx = class06570.N(class07078.NR);
    public static final class06581 nD = class06570.N(class07078.NE);
    public static final class06581 nh = class06570.N(class07078.NH);
    public static final class06581 nr = class06570.N(class07078.yR);
    public static final class06581 tN = class06570.N(class07078.yZ);
    public static final class06581 ty = class06570.N(class07078.yw);
    public static final class06581 tL = class06570.N(class07078.yQ);
    public static final class06581 tu = class06570.N(class07078.yq);
    public static final class06581 ti = class06570.N(class07078.yK);
    public static final class06581 tR = class06570.N(class07078.i);
    public static final class06581 tM = class06570.N(class07078.NV);
    public static final class06581 tB = class06570.N(class07078.yb);
    public static final class06581 tZ = class06570.N(class07078.g);
    public static final class06581 tz = class06570.N(class07078.Nn);
    public static final class06581 tU = class06570.N(class07078.yv);
    public static final class06581 tE = class06570.N(class07078.yJ);
    public static final class06581 tW = class06570.N(class07078.ye);
    public static final class06581 tm = class06570.N(class07078.yc);
    public static final class06581 tP = class06570.N(class07078.j);
    public static final class06581 ts = class06570.N(class07078.G);
    public static final class06581 tT = class06570.N(class07078.X);
    public static final class06581 tb = class06570.N(class07078.Nb);
    public static final class06581 tj = class06570.N(class07078.NS);
    public static final class06581 tv = class06570.N(class07078.ym);
    public static final class06581 tn = class06570.N(class07078.yP);
    public static final class06581 tt = class06570.N(class07078.yk);
    public static final class06581 tG = class06570.N(class07078.yF);
    public static final class06581 tl = class06570.N(class07078.yA);
    public static final class06581 td = class06570.N(class07078.yx);
    public static final class06581 tw = class06570.N(class07078.yD);
    public static final class06581 tk = class06570.N(class07078.yh);
    public static final class06581 tY = class06570.N(class07078.yr);
    public static final class06581 tQ = class06570.N(class07078.d);
    public static final class06581 tO = class06570.N(class07078.yG);
    public static final class06581 tg = class06570.N(class07078.v);
    public static final class06581 tI = class06570.N(class07078.o);
    public static final class06581 tJ = class06570.N(class07078.q);
    public static final class06581 to = class06570.N(class07078.p);
    public static final class06581 tq = class06570.N(class07078.Nm);
    public static final class06581 tK = class06570.N(class07078.ND);
    public static final class06581 tV = class06570.N(class07078.yW);
    public static final class06581 te = class06570.N(class07078.ys);
    public static final class06581 tH = class06570.N(class07078.yX);
    public static final class06581 tc = class06570.N(class07078.yp);
    public static final class06581 tX = class06570.N(class07078.x);
    public static final class06581 ta = class06570.N(class07078.yy);
    public static final class06581 tp = class06570.N(class07078.yB);
    public static final class06581 tF = class06570.N(class07078.yH);
    public static final class06581 tA = class06570.N(class07078.yV);
    public static final class06581 tf = class06570.N(class07078.T);
    public static final class06581 tC = class06570.N(class07078.NB);
    public static final class06581 tS = class06570.N(class07078.NZ);
    public static final class06581 tx = class06570.N(class07078.NP);
    public static final class06581 tD = class06570.N(class07078.Ng);
    public static final class06581 th = class06570.N(class07078.Nr);
    public static final class06581 tr = class06570.N(class07078.yN);
    public static final class06581 GN = class06570.N(class07078.yY);
    public static final class06581 Gy = class06570.N(class07078.yS);
    public static final class06581 GL = class06570.N(class07078.LN);
    public static final class06581 Gu = class06570.N(class07078.f);
    public static final class06581 Gi = class06570.N(class07078.F);
    public static final class06581 GR = class06570.N(class07078.A);
    public static final class06581 GM = class06570.N(class07078.yU);
    public static final class06581 GB = class06570.N("experience_bottle", class06582::new, new class06573().N(class06495.field_8907).N(class02484.G, true));
    public static final class06581 GZ = class06570.N("fire_charge", class06567::new);
    public static final class06581 Gz = class06570.N("wind_charge", class02262::new, new class06573().N(0.5f));
    public static final class06581 GU = class06570.N("writable_book", class06488::new, new class06573().N(1).N(class02484.Ny, class02699.N));
    public static final class06581 GE = class06570.N("written_book", class06527::new, new class06573().N(16).N(class02484.G, true));
    public static final class06581 GW = class06570.N("breeze_rod");
    public static final class06581 Gm = class06570.N("mace", class02485::new, new class06573().N(class06495.field_8904).y(500).N(class02484.O, class02485.y()).L(GW).N(class02485.N()).L(15).N(class02484.g, new class08609(1)));
    public static final class06581 GP = class06570.N("item_frame", (class06573 class065732) -> new class06576((class07078<? extends class00710>)class07078.Nl, (class06573)class065732));
    public static final class06581 Gs = class06570.N("glow_item_frame", (class06573 class065732) -> new class06576((class07078<? extends class00710>)class07078.NU, (class06573)class065732));
    public static final class06581 GT = class06570.N(class00869.MJ);
    public static final class06581 Gb = class06570.N("carrot", class06570.y(class00869.Bz), new class06573().N(class05344.M));
    public static final class06581 Gj = class06570.N("potato", class06570.y(class00869.BU), new class06573().N(class05344.Q));
    public static final class06581 Gv = class06570.N("baked_potato", new class06573().N(class05344.y));
    public static final class06581 Gn = class06570.N("poisonous_potato", new class06573().N(class05344.k, class08225.Z));
    public static final class06581 Gt = class06570.N("map", class06569::new);
    public static final class06581 GG = class06570.N("golden_carrot", new class06573().N(class05344.t));
    public static final class06581 Gl = class06570.N(class00869.Bt, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.BG, class07211.field_11033, class00001.N((class06573)class065732)), new class06573().N(class06495.field_8907).y(class07085.field_6169));
    public static final class06581 Gd = class06570.N(class00869.Bl, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.Bd, class07211.field_11033, class00001.N((class06573)class065732)), new class06573().N(class06495.field_8903).y(class07085.field_6169));
    public static final class06581 Gw = class06570.N(class00869.BY, (class00891 class008912, class06573 class065732) -> new class06592((class00891)class008912, class00869.BQ, class00001.N((class06573)class065732)), new class06573().N(class06495.field_8907).y(class07085.field_6169));
    public static final class06581 Gk = class06570.N(class00869.Bw, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.Bk, class07211.field_11033, class00001.N((class06573)class065732)), new class06573().N(class06495.field_8907).y(class07085.field_6169));
    public static final class06581 GY = class06570.N(class00869.BO, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.Bg, class07211.field_11033, class00001.N((class06573)class065732)), new class06573().N(class06495.field_8907).y(class07085.field_6169));
    public static final class06581 GQ = class06570.N(class00869.BI, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.BJ, class07211.field_11033, class00001.N((class06573)class065732)), new class06573().N(class06495.field_8904).y(class07085.field_6169));
    public static final class06581 GO = class06570.N(class00869.Bo, (class00891 class008912, class06573 class065732) -> new class06502(class008912, class00869.Bq, class07211.field_11033, class00001.N((class06573)class065732)), new class06573().N(class06495.field_8907).y(class07085.field_6169));
    public static final class06581 Gg = class06570.N("nether_star", new class06573().N(class06495.field_8903).N(class02484.G, true).N(class02484.Q, new class08721(class03696.E)));
    public static final class06581 GI = class06570.N("pumpkin_pie", new class06573().N(class05344.g));
    public static final class06581 GJ = class06570.N("firework_rocket", class06587::new, new class06573().N(class02484.NT, new class02813(1, List.of())));
    public static final class06581 Go = class06570.N("firework_star");
    public static final class06581 Gq = class06570.N("enchanted_book", new class06573().N(1).N(class06495.field_8903).N(class02484.p, class02710.N).N(class02484.G, true));
    public static final class06581 GK = class06570.N("nether_brick");
    public static final class06581 GV = class06570.N("resin_brick", new class06573().y((class05946<class03252>)class03270.U));
    public static final class06581 Ge = class06570.N("prismarine_shard");
    public static final class06581 GH = class06570.N("prismarine_crystals");
    public static final class06581 Gc = class06570.N("rabbit", new class06573().N(class05344.I));
    public static final class06581 GX = class06570.N("cooked_rabbit", new class06573().N(class05344.s));
    public static final class06581 Ga = class06570.N("rabbit_stew", new class06573().N(1).N(class05344.J).N(sC));
    public static final class06581 Gp = class06570.N("rabbit_foot");
    public static final class06581 GF = class06570.N("rabbit_hide");
    public static final class06581 GA = class06570.N("armor_stand", class06949::new, new class06573().N(16));
    public static final class06581 Gf = class06570.N("copper_horse_armor", new class06573().y(class06939.y));
    public static final class06581 GC = class06570.N("iron_horse_armor", new class06573().y(class06939.u));
    public static final class06581 GS = class06570.N("golden_horse_armor", new class06573().y(class06939.i));
    public static final class06581 Gx = class06570.N("diamond_horse_armor", new class06573().y(class06939.R));
    public static final class06581 GD = class06570.N("netherite_horse_armor", new class06573().y(class06939.B).N());
    public static final class06581 Gh = class06570.N("leather_horse_armor", new class06573().y(class06939.N));
    public static final class06581 Gr = class06570.N("lead", class06553::new);
    public static final class06581 lN = class06570.N("name_tag", class06550::new);
    public static final class06581 ly = class06570.N("command_block_minecart", (class06573 class065732) -> new class06564((class07078<? extends class07504>)class07078.I, (class06573)class065732), new class06573().N(1).N(class06495.field_8904));
    public static final class06581 lL = class06570.N("mutton", new class06573().N(class05344.w));
    public static final class06581 lu = class06570.N("cooked_mutton", new class06573().N(class05344.m));
    public static final class06581 li = class06570.N(class00869.zY, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zF, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lR = class06570.N(class00869.zQ, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zA, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lM = class06570.N(class00869.zO, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zf, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lB = class06570.N(class00869.zg, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zC, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lZ = class06570.N(class00869.zI, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zS, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lz = class06570.N(class00869.zJ, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zx, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lU = class06570.N(class00869.zo, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zD, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lE = class06570.N(class00869.zq, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zh, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lW = class06570.N(class00869.zK, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.zr, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lm = class06570.N(class00869.zV, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.UN, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lP = class06570.N(class00869.ze, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.Uy, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 ls = class06570.N(class00869.zH, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.UL, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lT = class06570.N(class00869.zc, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.Uu, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lb = class06570.N(class00869.zX, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.Ui, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lj = class06570.N(class00869.za, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.UR, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 lv = class06570.N(class00869.zp, (class00891 class008912, class06573 class065732) -> new class06920(class008912, class00869.UM, class065732), new class06573().N(16).N(class02484.Nv, class02708.L));
    public static final class06581 ln = class06570.N("end_crystal", class06594::new, new class06573().N(class02484.G, true));
    public static final class06581 lt = class06570.N("chorus_fruit", new class06573().N(class05344.Z, class08225.m).N(1.0f));
    public static final class06581 lG = class06570.N("popped_chorus_fruit");
    public static final class06581 ll = class06570.N("torchflower_seeds", class06570.y(class00869.EG));
    public static final class06581 ld = class06570.N("pitcher_pod", class06570.y(class00869.El));
    public static final class06581 lw = class06570.N("beetroot", new class06573().N(class05344.u));
    public static final class06581 lk = class06570.N("beetroot_seeds", class06570.y(class00869.Ew));
    public static final class06581 lY = class06570.N("beetroot_soup", new class06573().N(1).N(class05344.i).N(sC));
    public static final class06581 lQ = class06570.N("dragon_breath", new class06573().y(nP).N(class06495.field_8907));
    public static final class06581 lO = class06570.N("splash_potion", class06486::new, new class06573().N(1).N(class02484.h, class06517.N));
    public static final class06581 lg = class06570.N("spectral_arrow", class06507::new);
    public static final class06581 lI = class06570.N("tipped_arrow", class06504::new, new class06573().N(class02484.h, class06517.N).N(class02484.r, Float.valueOf(0.125f)));
    public static final class06581 lJ = class06570.N("lingering_potion", class06585::new, new class06573().N(1).N(class02484.h, class06517.N).N(class02484.r, Float.valueOf(0.25f)));
    public static final class06581 lo = class06570.N("shield", class06493::new, new class06573().y(336).N(class02484.Nv, class02708.L).N((class03530<class06581>)class01226.yt).y(class07085.field_6171).N(class02484.H, new class08576(0.25f, 1.0f, List.of(new class08565(90.0f, Optional.empty(), 0.0f, 1.0f)), new class08557(3.0f, 1.0f, 1.0f), Optional.of(class03696.L), Optional.of(class04909.wV), Optional.of(class04909.we))).N(class02484.NY, class04909.we));
    public static final class06581 lq = class06570.N("wooden_spear", new class06573().N(class02749.N, 0.65f, 0.7f, 0.75f, 5.0f, 14.0f, 10.0f, 5.1f, 15.0f, 4.6f));
    public static final class06581 lK = class06570.N("stone_spear", new class06573().N(class02749.y, 0.75f, 0.82f, 0.7f, 4.5f, 10.0f, 9.0f, 5.1f, 13.75f, 4.6f));
    public static final class06581 lV = class06570.N("copper_spear", new class06573().N(class02749.L, 0.85f, 0.82f, 0.65f, 4.0f, 9.0f, 8.25f, 5.1f, 12.5f, 4.6f));
    public static final class06581 le = class06570.N("iron_spear", new class06573().N(class02749.u, 0.95f, 0.95f, 0.6f, 2.5f, 8.0f, 6.75f, 5.1f, 11.25f, 4.6f));
    public static final class06581 lH = class06570.N("golden_spear", new class06573().N(class02749.R, 0.95f, 0.7f, 0.7f, 3.5f, 10.0f, 8.5f, 5.1f, 13.75f, 4.6f));
    public static final class06581 lc = class06570.N("diamond_spear", new class06573().N(class02749.i, 1.05f, 1.075f, 0.5f, 3.0f, 7.5f, 6.5f, 5.1f, 10.0f, 4.6f));
    public static final class06581 lX = class06570.N("netherite_spear", new class06573().N(class02749.M, 1.15f, 1.2f, 0.4f, 2.5f, 7.0f, 5.5f, 5.1f, 8.75f, 4.6f).N());
    public static final class06581 la = class06570.N("totem_of_undying", new class06573().N(1).N(class06495.field_8907).N(class02484.e, class08723.L));
    public static final class06581 lp = class06570.N("shulker_shell");
    public static final class06581 lF = class06570.N("iron_nugget");
    public static final class06581 lA = class06570.N("copper_nugget");
    public static final class06581 lf = class06570.N("knowledge_book", class06568::new, new class06573().N(1).N(class06495.field_8904).N(class02484.Nm, List.of()));
    public static final class06581 lC = class06570.N("debug_stick", class06560::new, new class06573().N(1).N(class06495.field_8904).N(class02484.Ni, class02847.N).N(class02484.G, true));
    public static final class06581 lS = class06570.N("music_disc_13", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.N));
    public static final class06581 lx = class06570.N("music_disc_cat", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.y));
    public static final class06581 lD = class06570.N("music_disc_blocks", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.L));
    public static final class06581 lh = class06570.N("music_disc_chirp", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.u));
    public static final class06581 lr = class06570.N("music_disc_creator", new class06573().N(1).N(class06495.field_8903).N((class05946<class02206>)class02207.b));
    public static final class06581 dN = class06570.N("music_disc_creator_music_box", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.j));
    public static final class06581 dy = class06570.N("music_disc_far", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.i));
    public static final class06581 dL = class06570.N("music_disc_lava_chicken", new class06573().N(1).N(class06495.field_8903).N((class05946<class02206>)class02207.n));
    public static final class06581 du = class06570.N("music_disc_mall", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.R));
    public static final class06581 di = class06570.N("music_disc_mellohi", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.M));
    public static final class06581 dR = class06570.N("music_disc_stal", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.B));
    public static final class06581 dM = class06570.N("music_disc_strad", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.Z));
    public static final class06581 dB = class06570.N("music_disc_ward", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.z));
    public static final class06581 dZ = class06570.N("music_disc_11", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.U));
    public static final class06581 dz = class06570.N("music_disc_wait", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.E));
    public static final class06581 dU = class06570.N("music_disc_otherside", new class06573().N(1).N(class06495.field_8903).N((class05946<class02206>)class02207.m));
    public static final class06581 dE = class06570.N("music_disc_relic", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.s));
    public static final class06581 dW = class06570.N("music_disc_5", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.P));
    public static final class06581 dm = class06570.N("music_disc_pigstep", new class06573().N(1).N(class06495.field_8903).N((class05946<class02206>)class02207.W));
    public static final class06581 dP = class06570.N("music_disc_precipice", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.T));
    public static final class06581 ds = class06570.N("music_disc_tears", new class06573().N(1).N(class06495.field_8907).N((class05946<class02206>)class02207.v));
    public static final class06581 dT = class06570.N("disc_fragment_5", class04461::new, new class06573().N(class06495.field_8907));
    public static final class06581 db = class06570.N("trident", class06518::new, new class06573().N(class06495.field_8903).y(250).N(class06518.y()).N(class02484.O, class06518.L()).L(1).N(class02484.g, new class08609(1)));
    public static final class06581 dj = class06570.N("nautilus_shell", new class06573().N(class06495.field_8907));
    public static final class06581 dv = class06570.N("iron_nautilus_armor", new class06573().L(class06939.u));
    public static final class06581 dn = class06570.N("golden_nautilus_armor", new class06573().L(class06939.i));
    public static final class06581 dt = class06570.N("diamond_nautilus_armor", new class06573().L(class06939.R));
    public static final class06581 dG = class06570.N("netherite_nautilus_armor", new class06573().L(class06939.B).N());
    public static final class06581 dl = class06570.N("copper_nautilus_armor", new class06573().L(class06939.y));
    public static final class06581 dd = class06570.N("heart_of_the_sea", new class06573().N(class06495.field_8907));
    public static final class06581 dw = class06570.N("crossbow", class06593::new, new class06573().N(1).y(465).N(class02484.x, class02820.N).L(1));
    public static final class06581 dk = class06570.N("suspicious_stew", new class06573().N(1).N(class05344.V).N(class02484.NN, class02692.N).N(sC));
    public static final class06581 dY = class06570.N(class00869.Pp);
    public static final class06581 dQ = class06570.N("flower_banner_pattern", new class06573().N(1).N(class02484.NW, class04463.y));
    public static final class06581 dO = class06570.N("creeper_banner_pattern", new class06573().N(1).N(class06495.field_8907).N(class02484.NW, class04463.L));
    public static final class06581 dg = class06570.N("skull_banner_pattern", new class06573().N(1).N(class06495.field_8903).N(class02484.NW, class04463.u));
    public static final class06581 dI = class06570.N("mojang_banner_pattern", new class06573().N(1).N(class06495.field_8903).N(class02484.NW, class04463.i));
    public static final class06581 dJ = class06570.N("globe_banner_pattern", new class06573().N(1).N(class02484.NW, class04463.R));
    public static final class06581 f_do__3 = class06570.N("piglin_banner_pattern", new class06573().N(1).N(class06495.field_8907).N(class02484.NW, class04463.M));
    public static final class06581 dq = class06570.N("flow_banner_pattern", new class06573().N(1).N(class06495.field_8903).N(class02484.NW, class04463.B));
    public static final class06581 dK = class06570.N("guster_banner_pattern", new class06573().N(1).N(class06495.field_8903).N(class02484.NW, class04463.Z));
    public static final class06581 dV = class06570.N("field_masoned_banner_pattern", new class06573().N(1).N(class02484.NW, class04463.z));
    public static final class06581 de = class06570.N("bordure_indented_banner_pattern", new class06573().N(1).N(class02484.NW, class04463.U));
    public static final class06581 dH = class06570.N("goat_horn", class04473::new, new class06573().N(class06495.field_8907).N(1).N(class02484.NZ, new class08582(class04460.L)));
    public static final class06581 dc = class06570.N(class00869.TL);
    public static final class06581 dX = class06570.N(class00869.PF, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 da = class06570.N(class00869.PA, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 dp = class06570.N(class00869.Pf, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 dF = class06570.N(class00869.PC);
    public static final class06581 dA = class06570.N(class00869.PS);
    public static final class06581 df = class06570.N(class00869.Px);
    public static final class06581 dC = class06570.N(class00869.Ph);
    public static final class06581 dS = class06570.N(class00869.Pr);
    public static final class06581 dx = class06570.N(class00869.sN);
    public static final class06581 dD = class06570.N(class00869.sy);
    public static final class06581 dh = class06570.N(class00869.sL);
    public static final class08129 dr = class08129.N((class00948)class00869.su, class06570::N);
    public static final class06581 wN = class06570.N("sweet_berries", class06570.y(class00869.sM), new class06573().N(class05344.e));
    public static final class06581 wy = class06570.N("glow_berries", class06570.y(class00869.vA), new class06573().N(class05344.H));
    public static final class06581 wL = class06570.N(class00869.si, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 wu = class06570.N(class00869.sR, class065732 -> class065732.N(class02484.NG, class02854.N));
    public static final class06581 wi = class06570.N(class00869.sG);
    public static final class06581 wR = class06570.N("honeycomb", class02859::new);
    public static final class06581 wM = class06570.N(class00869.Ti, new class06573().N(class02484.Nd, class08588.L).N(class02484.Nl, class02841.N.N((class08092)class04593.L, (Comparable)Integer.valueOf(0))));
    public static final class06581 wB = class06570.N(class00869.TR, new class06573().N(class02484.Nd, class08588.L).N(class02484.Nl, class02841.N.N((class08092)class04593.L, (Comparable)Integer.valueOf(0))));
    public static final class06581 wZ = class06570.N("honey_bottle", new class06573().y(nP).N(class05344.G, class08225.L).N(nP).N(16));
    public static final class06581 wz = class06570.N(class00869.TB);
    public static final class06581 wU = class06570.N(class00869.TT);
    public static final class06581 wE = class06570.N(class00869.TU);
    public static final class06581 wW = class06570.N(class00869.Tb);
    public static final class06581 wm = class06570.N(class00869.Tn);
    public static final class06581 wP = class06570.N(class00869.Tj);
    public static final class06581 ws = class06570.N(class00869.TQ);
    public static final class06581 wT = class06570.N(class00869.Tt);
    public static final class06581 wb = class06570.N(class00869.Tg);
    public static final class06581 wj = class06570.N(class00869.TO);
    public static final class06581 wv = class06570.N(class00869.Td);
    public static final class06581 wn = class06570.N(class00869.TG);
    public static final class06581 wt = class06570.N(class00869.Tw);
    public static final class06581 wG = class06570.N(class00869.Tk);
    public static final class06581 wl = class06570.N(class00869.Tl);
    public static final class06581 wd = class06570.N(class00869.TE);
    public static final class06581 ww = class06570.N(class00869.Te);
    public static final class06581 wk = class06570.N(class00869.TH);
    public static final class06581 wY = class06570.N(class00869.Tc);
    public static final class06581 wQ = class06570.N(class00869.TX);
    public static final class06581 wO = class06570.N(class00869.Ta);
    public static final class06581 wg = class06570.N(class00869.Tp);
    public static final class06581 wI = class06570.N(class00869.TF);
    public static final class06581 wJ = class06570.N(class00869.TA);
    public static final class06581 wo = class06570.N(class00869.Tf);
    public static final class06581 wq = class06570.N(class00869.TC);
    public static final class06581 wK = class06570.N(class00869.TS);
    public static final class06581 wV = class06570.N(class00869.Tx);
    public static final class06581 we = class06570.N(class00869.TD);
    public static final class06581 wH = class06570.N(class00869.Th);
    public static final class06581 wc = class06570.N(class00869.Tr);
    public static final class06581 wX = class06570.N(class00869.bN);
    public static final class06581 wa = class06570.N(class00869.by);
    public static final class06581 wp = class06570.N(class00869.bd);
    public static final class06581 wF = class06570.N(class00869.bl);
    public static final class06581 wA = class06570.N(class00869.bG);
    public static final class06581 wf = class06570.N(class00869.bt);
    public static final class06581 wC = class06570.N(class00869.vp);
    public static final class06581 wS = class06570.N(class00869.nK);
    public static final class06581 wx = class06570.N(class00869.nV);
    public static final class06581 wD = class06570.N(class00869.ne);
    public static final class06581 wh = class06570.N(class00869.nH, class06519::new);
    public static final class06581 wr = class06570.N("echo_shard", new class06573().N(class06495.field_8907));
    public static final class06581 kN = class06570.N("brush", class01951::new, new class06573().y(64));
    public static final class06581 ky = class06570.N("netherite_upgrade_smithing_template", class03262::y, new class06573().N(class06495.field_8907));
    public static final class06581 kL = class06570.N("sentry_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 ku = class06570.N("dune_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 ki = class06570.N("coast_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kR = class06570.N("wild_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kM = class06570.N("ward_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8903));
    public static final class06581 kB = class06570.N("eye_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8903));
    public static final class06581 kZ = class06570.N("vex_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8903));
    public static final class06581 kz = class06570.N("tide_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kU = class06570.N("snout_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kE = class06570.N("rib_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kW = class06570.N("spire_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8903));
    public static final class06581 km = class06570.N("wayfinder_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kP = class06570.N("shaper_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 ks = class06570.N("silence_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8904));
    public static final class06581 kT = class06570.N("raiser_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kb = class06570.N("host_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kj = class06570.N("flow_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kv = class06570.N("bolt_armor_trim_smithing_template", class03262::N, new class06573().N(class06495.field_8907));
    public static final class06581 kn = class06570.N("angler_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kt = class06570.N("archer_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kG = class06570.N("arms_up_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kl = class06570.N("blade_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kd = class06570.N("brewer_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kw = class06570.N("burn_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kk = class06570.N("danger_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kY = class06570.N("explorer_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kQ = class06570.N("flow_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kO = class06570.N("friend_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kg = class06570.N("guster_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kI = class06570.N("heart_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kJ = class06570.N("heartbreak_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 ko = class06570.N("howl_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kq = class06570.N("miner_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kK = class06570.N("mourner_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kV = class06570.N("plenty_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 ke = class06570.N("prize_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kH = class06570.N("scrape_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kc = class06570.N("sheaf_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kX = class06570.N("shelter_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 ka = class06570.N("skull_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kp = class06570.N("snort_pottery_sherd", new class06573().N(class06495.field_8907));
    public static final class06581 kF = class06570.N(class00869.vL);
    public static final class06581 kA = class06570.N(class00869.vu);
    public static final class06581 kf = class06570.N(class00869.vi);
    public static final class06581 kC = class06570.N(class00869.vR);
    public static final class06581 kS = class06570.N(class00869.vM);
    public static final class06581 kx = class06570.N(class00869.vB);
    public static final class06581 kD = class06570.N(class00869.vZ);
    public static final class06581 kh = class06570.N(class00869.vz);
    public static final class06581 kr = class06570.N(class00869.vU);
    public static final class06581 YN = class06570.N(class00869.vE);
    public static final class06581 Yy = class06570.N(class00869.vW);
    public static final class06581 YL = class06570.N(class00869.vm);
    public static final class06581 Yu = class06570.N(class00869.vP);
    public static final class06581 Yi = class06570.N(class00869.vs);
    public static final class06581 YR = class06570.N(class00869.vT);
    public static final class06581 YM = class06570.N(class00869.vb);
    public static final class06581 YB = class06570.N(class00869.vj);
    public static final class06581 YZ = class06570.N(class00869.vv);
    public static final class06581 Yz = class06570.N(class00869.vn);
    public static final class06581 YU = class06570.N(class00869.vt);
    public static final class06581 YE = class06570.N(class00869.vG);
    public static final class06581 YW = class06570.N(class00869.vl);
    public static final class06581 Ym = class06570.N(class00869.vd);
    public static final class06581 YP = class06570.N(class00869.vw);
    public static final class06581 Ys = class06570.N(class00869.vk, new class06573().N(class02484.Nl, class02841.N.N((class08092)class08981.L, (Comparable)class08973.field_61414)));
    public static final class06581 YT = class06570.N(class00869.vY, new class06573().N(class02484.Nl, class02841.N.N((class08092)class08981.L, (Comparable)class08973.field_61414)));
    public static final class06581 Yb = class06570.N(class00869.vQ, new class06573().N(class02484.Nl, class02841.N.N((class08092)class08981.L, (Comparable)class08973.field_61414)));
    public static final class06581 Yj = class06570.N(class00869.vO, new class06573().N(class02484.Nl, class02841.N.N((class08092)class08981.L, (Comparable)class08973.field_61414)));
    public static final class06581 Yv = class06570.N(class00869.vg, new class06573().N(class02484.Nl, class02841.N.N((class08092)class08981.L, (Comparable)class08973.field_61414)));
    public static final class06581 Yn = class06570.N(class00869.vI, new class06573().N(class02484.Nl, class02841.N.N((class08092)class08981.L, (Comparable)class08973.field_61414)));
    public static final class06581 Yt = class06570.N(class00869.vJ, new class06573().N(class02484.Nl, class02841.N.N((class08092)class08981.L, (Comparable)class08973.field_61414)));
    public static final class06581 YG = class06570.N(class00869.vo, new class06573().N(class02484.Nl, class02841.N.N((class08092)class08981.L, (Comparable)class08973.field_61414)));
    public static final class06581 Yl = class06570.N(class00869.np);
    public static final class06581 Yd = class06570.N("trial_key");
    public static final class06581 Yw = class06570.N("ominous_trial_key");
    public static final class06581 Yk = class06570.N(class00869.nF);
    public static final class06581 YY = class06570.N("ominous_bottle", new class06573().N(class06495.field_8907).N(class02484.w, class08225.u).N(class02484.NU, new class08213(0)));

    private static /* synthetic */ class06573 L(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 No(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 Z(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 z(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 u(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 y(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static Function<class06573, class06581> y(class00891 class008912) {
        return class065732 -> new class06918(class008912, class065732.L());
    }

    private static class05946<class06581> y(String string) {
        return class05946.N((class05946)class04227.F, (class01894)class01894.y((String)string));
    }

    public static class06581 N(class00891 class008912, class06573 class065732) {
        return class06570.N(class008912, class06918::new, class065732);
    }

    private static /* synthetic */ class06573 N(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    public static class06581 N(class00891 class008912) {
        return class06570.N(class008912, class06918::new);
    }

    private static class06581 N(class07078<?> class070782) {
        return class06570.N((class05946<class06581>)class05946.N((class05946)class04227.F, (class01894)class07078.N(class070782).M("_spawn_egg")), class06530::new, new class06573().N(class070782));
    }

    private static class05946<class06581> N(class05946<class00891> class059462) {
        return class05946.N((class05946)class04227.F, (class01894)class059462.N());
    }

    public static class06581 N(class05946<class06581> class059462, Function<class06573, class06581> function, class06573 class065732) {
        class06581 class065812 = function.apply(class065732.L(class059462));
        if (class065812 instanceof class06918) {
            ((class06918)class065812).N(class06581.R, class065812);
        }
        return (class06581)class00751.N((class00751)class04206.B, class059462, (Object)class065812);
    }

    public static class06581 N(class05946<class06581> class059462, Function<class06573, class06581> function) {
        return class06570.N(class059462, function, new class06573());
    }

    public static class06581 N(class00891 class008912, BiFunction<class00891, class06573, class06581> biFunction, class06573 class065733) {
        return class06570.N(class06570.N((class05946<class00891>)class008912.s().B()), (class06573 class065732) -> (class06581)biFunction.apply(class008912, (class06573)class065732), class065733.y());
    }

    public static class06581 N(class00891 class008912, BiFunction<class00891, class06573, class06581> biFunction) {
        return class06570.N(class008912, biFunction, new class06573());
    }

    public static class06581 N(String string, Function<class06573, class06581> function, class06573 class065732) {
        return class06570.N(class06570.y(string), function, class065732);
    }

    public static class06581 N(String string, class06573 class065732) {
        return class06570.N(class06570.y(string), class06581::new, class065732);
    }

    public static class06581 N(String string) {
        return class06570.N(class06570.y(string), class06581::new, new class06573());
    }

    public static class06581 N(class00891 class008912, class00891 ... class00891Array) {
        class06581 class065812 = class06570.N(class008912);
        for (class00891 class008913 : class00891Array) {
            class06581.R.put(class008913, class065812);
        }
        return class065812;
    }

    public static class06581 N(String string, Function<class06573, class06581> function) {
        return class06570.N(class06570.y(string), function, new class06573());
    }

    public static class06581 N(class00891 class008913, UnaryOperator<class06573> unaryOperator) {
        return class06570.N(class008913, (class00891 class008912, class06573 class065732) -> new class06918(class008912, (class06573)unaryOperator.apply((class06573)class065732)));
    }

    private static /* synthetic */ class06573 yi(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yZ(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yE(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yW(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yU(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yP(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yM(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yB(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yj(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yR(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 ys(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 NK(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yz(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 ym(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yb(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 NV(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 Nq(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }

    private static /* synthetic */ class06573 yT(class06573 class065732) {
        return class065732.N(class02484.NG, class02854.N);
    }
}

