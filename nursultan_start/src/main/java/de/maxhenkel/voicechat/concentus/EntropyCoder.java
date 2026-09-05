/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Inlines;

class EntropyCoder {
    private final int EC_WINDOW_SIZE;
    private final int EC_UINT_BITS;
    static final int BITRES = 3;
    private final int EC_SYM_BITS;
    private final int EC_CODE_BITS;
    private final long EC_SYM_MAX;
    private final int EC_CODE_SHIFT;
    private final long EC_CODE_TOP;
    private final long EC_CODE_BOT;
    private final int EC_CODE_EXTRA;
    private byte[] buf;
    private int buf_ptr;
    int storage;
    int end_offs;
    long end_window;
    int nend_bits;
    int nbits_total;
    int offs;
    long rng;
    long val;
    long ext;
    int rem;
    int error;
    private static final int[] correction = new int[]{35733, 38967, 42495, 46340, 50535, 55109, 60097, 65535};

    EntropyCoder() {
        this.EC_WINDOW_SIZE = 32;
        this.EC_UINT_BITS = 8;
        this.EC_SYM_BITS = 8;
        this.EC_CODE_BITS = 32;
        this.EC_SYM_MAX = 255L;
        this.EC_CODE_SHIFT = 23;
        this.EC_CODE_TOP = 0x80000000L;
        this.EC_CODE_BOT = 0x800000L;
        this.EC_CODE_EXTRA = 7;
        this.Reset();
    }

    long decode(long l) {
        l = Inlines.CapToUInt32(l);
        this.ext = Inlines.CapToUInt32(this.rng / l);
        long l2 = Inlines.CapToUInt32(this.val / this.ext);
        return Inlines.CapToUInt32(l - Inlines.EC_MINI(Inlines.CapToUInt32(l2 + 1L), l));
    }

    void encode(long l, long l2, long l3) {
        l = Inlines.CapToUInt32(l);
        l2 = Inlines.CapToUInt32(l2);
        l3 = Inlines.CapToUInt32(l3);
        long l4 = Inlines.CapToUInt32(this.rng / l3);
        if (l > 0L) {
            this.val += Inlines.CapToUInt32(this.rng - l4 * (l3 - l));
            this.rng = Inlines.CapToUInt32(l4 * (l2 - l));
        } else {
            this.rng = Inlines.CapToUInt32(this.rng - l4 * (l3 - l2));
        }
        this.enc_normalize();
    }

    void Reset() {
        this.buf = null;
        this.buf_ptr = 0;
        this.storage = 0;
        this.end_offs = 0;
        this.end_window = 0L;
        this.nend_bits = 0;
        this.offs = 0;
        this.rng = 0L;
        this.val = 0L;
        this.ext = 0L;
        this.rem = 0;
        this.error = 0;
    }

    void Assign(EntropyCoder entropyCoder) {
        this.buf = entropyCoder.buf;
        this.buf_ptr = entropyCoder.buf_ptr;
        this.storage = entropyCoder.storage;
        this.end_offs = entropyCoder.end_offs;
        this.end_window = entropyCoder.end_window;
        this.nend_bits = entropyCoder.nend_bits;
        this.nbits_total = entropyCoder.nbits_total;
        this.offs = entropyCoder.offs;
        this.rng = entropyCoder.rng;
        this.val = entropyCoder.val;
        this.ext = entropyCoder.ext;
        this.rem = entropyCoder.rem;
        this.error = entropyCoder.error;
    }

    int dec_bit_logp(long l) {
        int n;
        long l2 = this.val;
        long l3 = this.rng;
        long l4 = l3 >> (int)l;
        int n2 = n = l2 < l4 ? 1 : 0;
        if (n == 0) {
            this.val = Inlines.CapToUInt32(l2 - l4);
        }
        this.rng = n != 0 ? l4 : l3 - l4;
        this.dec_normalize();
        return n;
    }

    void enc_bit_logp(int n, int n2) {
        long l = this.rng;
        long l2 = this.val;
        long l3 = l >> n2;
        l -= l3;
        if (n != 0) {
            this.val = Inlines.CapToUInt32(l2 + l);
        }
        this.rng = n != 0 ? l3 : l;
        this.enc_normalize();
    }

    void enc_patch_initial_bits(long l, int n) {
        Inlines.OpusAssert(n <= 8);
        int n2 = 8 - n;
        long l2 = (1 << n) - 1 << n2;
        if (this.offs > 0) {
            this.buf[this.buf_ptr] = (byte)((long)this.buf[this.buf_ptr] & (l2 ^ 0xFFFFFFFFFFFFFFFFL) | Inlines.CapToUInt32(l << n2));
        } else if (this.rem >= 0) {
            this.rem = (int)Inlines.CapToUInt32(Inlines.CapToUInt32((long)this.rem & (l2 ^ 0xFFFFFFFFFFFFFFFFL) | l) << n2);
        } else if (this.rng <= 0x80000000L >> n) {
            this.val = Inlines.CapToUInt32(this.val & (l2 << 23 ^ 0xFFFFFFFFFFFFFFFFL) | Inlines.CapToUInt32(Inlines.CapToUInt32(l) << 23 + n2));
        } else {
            this.error = -1;
        }
    }

    long dec_uint(long l) {
        Inlines.OpusAssert((l = Inlines.CapToUInt32(l)) > 1L);
        int n = Inlines.EC_ILOG(--l);
        if (n > 8) {
            long l2 = Inlines.CapToUInt32((l >> (n -= 8)) + 1L);
            long l3 = Inlines.CapToUInt32(this.decode(l2));
            this.dec_update(l3, l3 + 1L, l2);
            long l4 = Inlines.CapToUInt32(l3 << n | (long)this.dec_bits(n));
            if (l4 <= l) {
                return l4;
            }
            this.error = 1;
            return l;
        }
        long l5 = Inlines.CapToUInt32(this.decode(++l));
        this.dec_update(l5, l5 + 1L, l);
        return l5;
    }

    void dec_update(long l, long l2, long l3) {
        l = Inlines.CapToUInt32(l);
        l2 = Inlines.CapToUInt32(l2);
        l3 = Inlines.CapToUInt32(l3);
        long l4 = Inlines.CapToUInt32(this.ext * (l3 - l2));
        this.val -= l4;
        this.rng = l > 0L ? Inlines.CapToUInt32(this.ext * (l2 - l)) : this.rng - l4;
        this.dec_normalize();
    }

    void enc_uint(long l, long l2) {
        l = Inlines.CapToUInt32(l);
        Inlines.OpusAssert((l2 = Inlines.CapToUInt32(l2)) > 1L);
        int n = Inlines.EC_ILOG(--l2);
        if (n > 8) {
            long l3 = Inlines.CapToUInt32((l2 >> (n -= 8)) + 1L);
            long l4 = Inlines.CapToUInt32(l >> n);
            this.encode(l4, l4 + 1L, l3);
            this.enc_bits(l & Inlines.CapToUInt32((1 << n) - 1), n);
        } else {
            this.encode(l, l + 1L, l2 + 1L);
        }
    }

    int dec_bits(int n) {
        long l = this.end_window;
        int n2 = this.nend_bits;
        if (n2 < n) {
            do {
                l = Inlines.CapToUInt32(l | (long)(this.read_byte_from_end() << n2));
            } while ((n2 += 8) <= 24);
        }
        int n3 = (int)(0xFFFFFFFFFFFFFFFFL & (l & (long)((1 << n) - 1)));
        this.end_window = Inlines.CapToUInt32(l >>= n);
        this.nend_bits = n2 -= n;
        this.nbits_total += n;
        return n3;
    }

    int tell_frac() {
        long l;
        int n = this.nbits_total << 3;
        int n2 = Inlines.EC_ILOG(this.rng);
        int n3 = (int)(this.rng >> n2 - 16);
        l = Inlines.CapToUInt32(l + (long)(n3 > correction[(int)(l = Inlines.CapToUInt32((n3 >> 12) - 8))] ? 1 : 0));
        n2 = (int)((long)(n2 << 3) + l);
        return n - n2;
    }

    void enc_bits(long l, int n) {
        l = Inlines.CapToUInt32(l);
        long l2 = this.end_window;
        int n2 = this.nend_bits;
        Inlines.OpusAssert(n > 0);
        if (n2 + n > 32) {
            do {
                this.error |= this.write_byte_at_end(l2 & 0xFFL);
                l2 >>= 8;
            } while ((n2 -= 8) >= 8);
        }
        l2 |= Inlines.CapToUInt32(l << n2);
        this.end_window = l2;
        this.nend_bits = n2 += n;
        this.nbits_total += n;
    }

    int tell() {
        int n = this.nbits_total - Inlines.EC_ILOG(this.rng);
        return n;
    }

    int get_error() {
        return this.error;
    }

    void enc_done() {
        int n;
        int n2 = 32 - Inlines.EC_ILOG(this.rng);
        long l = Inlines.CapToUInt32(Integer.MAX_VALUE >>> n2);
        long l2 = Inlines.CapToUInt32(Inlines.CapToUInt32(this.val + l) & (l ^ 0xFFFFFFFFFFFFFFFFL));
        if ((l2 | l) >= this.val + this.rng) {
            ++n2;
            l2 = Inlines.CapToUInt32(Inlines.CapToUInt32(this.val + (l >>= 1)) & (l ^ 0xFFFFFFFFFFFFFFFFL));
        }
        while (n2 > 0) {
            this.enc_carry_out((int)(l2 >> 23));
            l2 = Inlines.CapToUInt32(l2 << 8 & Integer.MAX_VALUE);
            n2 -= 8;
        }
        if (this.rem >= 0 || this.ext > 0L) {
            this.enc_carry_out(0);
        }
        long l3 = this.end_window;
        for (n = this.nend_bits; n >= 8; n -= 8) {
            this.error |= this.write_byte_at_end(l3 & 0xFFL);
            l3 >>= 8;
        }
        if (this.error == 0) {
            Arrays.MemSetWithOffset(this.buf, (byte)0, this.buf_ptr + this.offs, this.storage - this.offs - this.end_offs);
            if (n > 0) {
                if (this.end_offs >= this.storage) {
                    this.error = -1;
                } else {
                    n2 = -n2;
                    if (this.offs + this.end_offs >= this.storage && n2 < n) {
                        l3 = Inlines.CapToUInt32(l3 & (long)((1 << n2) - 1));
                        this.error = -1;
                    }
                    int n3 = this.buf_ptr + this.storage - this.end_offs - 1;
                    this.buf[n3] = (byte)(this.buf[n3] | (byte)(l3 & 0xFFL));
                }
            }
        }
    }

    void enc_shrink(int n) {
        Inlines.OpusAssert(this.offs + this.end_offs <= n);
        Arrays.MemMove(this.buf, this.buf_ptr + n - this.end_offs, this.buf_ptr + this.storage - this.end_offs, this.end_offs);
        this.storage = n;
    }

    void enc_init(byte[] byArray, int n, int n2) {
        this.buf = byArray;
        this.buf_ptr = n;
        this.end_offs = 0;
        this.end_window = 0L;
        this.nend_bits = 0;
        this.nbits_total = 33;
        this.offs = 0;
        this.rng = Inlines.CapToUInt32(0x80000000L);
        this.rem = -1;
        this.val = 0L;
        this.ext = 0L;
        this.storage = n2;
        this.error = 0;
    }

    void dec_init(byte[] byArray, int n, int n2) {
        this.buf = byArray;
        this.buf_ptr = n;
        this.storage = n2;
        this.end_offs = 0;
        this.end_window = 0L;
        this.nend_bits = 0;
        this.nbits_total = 9;
        this.offs = 0;
        this.rng = 128L;
        this.rem = this.read_byte();
        this.val = Inlines.CapToUInt32(this.rng - 1L - (long)(this.rem >> 1));
        this.error = 0;
        this.dec_normalize();
    }

    int dec_icdf(short[] sArray, int n) {
        long l;
        long l2 = this.rng;
        long l3 = this.val;
        long l4 = l2 >> n;
        int n2 = -1;
        do {
            l = l2;
        } while (l3 < (l2 = Inlines.CapToUInt32(l4 * (long)sArray[++n2])));
        this.val = Inlines.CapToUInt32(l3 - l2);
        this.rng = Inlines.CapToUInt32(l - l2);
        this.dec_normalize();
        return n2;
    }

    int dec_icdf(short[] sArray, int n, int n2) {
        long l;
        long l2 = this.rng;
        long l3 = this.val;
        long l4 = l2 >> n2;
        int n3 = n - 1;
        do {
            l = l2;
        } while (l3 < (l2 = Inlines.CapToUInt32(l4 * (long)sArray[++n3])));
        this.val = Inlines.CapToUInt32(l3 - l2);
        this.rng = Inlines.CapToUInt32(l - l2);
        this.dec_normalize();
        return n3 - n;
    }

    void enc_icdf(int n, short[] sArray, int n2, int n3) {
        long l = Inlines.CapToUInt32(this.rng >> n3);
        if (n > 0) {
            this.val += Inlines.CapToUInt32(this.rng - Inlines.CapToUInt32(l * (long)sArray[n2 + n - 1]));
            this.rng = Inlines.CapToUInt32(l * Inlines.CapToUInt32(sArray[n2 + n - 1] - sArray[n2 + n]));
        } else {
            this.rng = Inlines.CapToUInt32(this.rng - l * (long)sArray[n2 + n]);
        }
        this.enc_normalize();
    }

    void enc_icdf(int n, short[] sArray, int n2) {
        long l = Inlines.CapToUInt32(this.rng >> n2);
        if (n > 0) {
            this.val += Inlines.CapToUInt32(this.rng - Inlines.CapToUInt32(l * (long)sArray[n - 1]));
            this.rng = l * Inlines.CapToUInt32(sArray[n - 1] - sArray[n]);
        } else {
            this.rng = Inlines.CapToUInt32(this.rng - l * (long)sArray[n]);
        }
        this.enc_normalize();
    }

    int write_byte(long l) {
        if (this.offs + this.end_offs >= this.storage) {
            return -1;
        }
        this.buf[this.buf_ptr + this.offs++] = (byte)(l & 0xFFL);
        return 0;
    }

    int read_byte() {
        return this.offs < this.storage ? Inlines.SignedByteToUnsignedInt(this.buf[this.buf_ptr + this.offs++]) : 0;
    }

    long decode_bin(int n) {
        this.ext = this.rng >> n;
        long l = Inlines.CapToUInt32(this.val / this.ext);
        return Inlines.CapToUInt32(Inlines.CapToUInt32(1L << n) - Inlines.EC_MINI(Inlines.CapToUInt32(l + 1L), 1L << n));
    }

    byte[] get_buffer() {
        byte[] byArray = new byte[this.storage];
        System.arraycopy(this.buf, this.buf_ptr, byArray, 0, this.storage);
        return byArray;
    }

    void encode_bin(long l, long l2, int n) {
        l = Inlines.CapToUInt32(l);
        l2 = Inlines.CapToUInt32(l2);
        long l3 = Inlines.CapToUInt32(this.rng >> n);
        if (l > 0L) {
            this.val = Inlines.CapToUInt32(this.val + Inlines.CapToUInt32(this.rng - l3 * ((long)(1 << n) - l)));
            this.rng = Inlines.CapToUInt32(l3 * (l2 - l));
        } else {
            this.rng = Inlines.CapToUInt32(this.rng - l3 * ((long)(1 << n) - l2));
        }
        this.enc_normalize();
    }

    int range_bytes() {
        return this.offs;
    }

    int write_byte_at_end(long l) {
        if (this.offs + this.end_offs >= this.storage) {
            return -1;
        }
        this.buf[this.buf_ptr + (this.storage - ++this.end_offs)] = (byte)(l & 0xFFL);
        return 0;
    }

    void dec_normalize() {
        while (this.rng <= 0x800000L) {
            this.nbits_total += 8;
            this.rng = Inlines.CapToUInt32(this.rng << 8);
            int n = this.rem;
            this.rem = this.read_byte();
            n = (n << 8 | this.rem) >> 1;
            this.val = Inlines.CapToUInt32((this.val << 8) + (0xFFL & (long)(~n)) & Integer.MAX_VALUE);
        }
    }

    void enc_carry_out(int n) {
        if ((long)n != 255L) {
            int n2 = n >> 8;
            if (this.rem >= 0) {
                this.error |= this.write_byte(Inlines.CapToUInt32(this.rem + n2));
            }
            if (this.ext > 0L) {
                long l = 255L + (long)n2 & 0xFFL;
                do {
                    this.error |= this.write_byte(l);
                } while (--this.ext > 0L);
            }
            this.rem = (int)((long)n & 0xFFL);
        } else {
            ++this.ext;
        }
    }

    void enc_normalize() {
        while (this.rng <= 0x800000L) {
            this.enc_carry_out((int)(this.val >> 23));
            this.val = Inlines.CapToUInt32(this.val << 8 & Integer.MAX_VALUE);
            this.rng = Inlines.CapToUInt32(this.rng << 8);
            this.nbits_total += 8;
        }
    }

    void write_buffer(byte[] byArray, int n, int n2, int n3) {
        System.arraycopy(byArray, n, this.buf, this.buf_ptr + n2, n3);
    }

    int read_byte_from_end() {
        return this.end_offs < this.storage ? Inlines.SignedByteToUnsignedInt(this.buf[this.buf_ptr + (this.storage - ++this.end_offs)]) : 0;
    }
}

