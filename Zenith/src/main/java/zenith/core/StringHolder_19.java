package zenith;

import javax.security.auth.x500.X500Principal;

final class StringHolder_19 {
   private final String SecureRandomHolder_2;
   private final int length;
   private int longHolder_7;
   private int HostnameVerifierImpl;
   private int longHolder_4;
   private int ZenithInternal045;
   private char[] ZenithInternal044;

   public StringHolder_19(X500Principal x500principal) {
      this.SecureRandomHolder_2 = x500principal.getName("RFC2253");
      this.length = this.SecureRandomHolder_2.length();
   }

   private String CallableImpl() {
      while (this.longHolder_7 < this.length && this.ZenithInternal044[this.longHolder_7] == ' ') {
         this.longHolder_7++;
      }

      if (this.longHolder_7 == this.length) {
         return null;
      } else {
         this.HostnameVerifierImpl = this.longHolder_7++;

         while (
            this.longHolder_7 < this.length
               && this.ZenithInternal044[this.longHolder_7] != '='
               && this.ZenithInternal044[this.longHolder_7] != ' '
         ) {
            this.longHolder_7++;
         }

         if (this.longHolder_7 >= this.length) {
            throw new IllegalStateException("Unexpected end of DN: " + this.SecureRandomHolder_2);
         } else {
            this.longHolder_4 = this.longHolder_7;
            if (this.ZenithInternal044[this.longHolder_7] == ' ') {
               while (
                  this.longHolder_7 < this.length
                     && this.ZenithInternal044[this.longHolder_7] != '='
                     && this.ZenithInternal044[this.longHolder_7] == ' '
               ) {
                  this.longHolder_7++;
               }

               if (this.ZenithInternal044[this.longHolder_7] != '=' || this.longHolder_7 == this.length) {
                  throw new IllegalStateException("Unexpected end of DN: " + this.SecureRandomHolder_2);
               }
            }

            this.longHolder_7++;

            while (this.longHolder_7 < this.length && this.ZenithInternal044[this.longHolder_7] == ' ') {
               this.longHolder_7++;
            }

            if (this.longHolder_4 - this.HostnameVerifierImpl > 4
               && this.ZenithInternal044[this.HostnameVerifierImpl + 3] == '.'
               && (this.ZenithInternal044[this.HostnameVerifierImpl] == 'O' || this.ZenithInternal044[this.HostnameVerifierImpl] == 'o')
               && (
                  this.ZenithInternal044[this.HostnameVerifierImpl + 1] == 'I'
                     || this.ZenithInternal044[this.HostnameVerifierImpl + 1] == 'i'
               )
               && (
                  this.ZenithInternal044[this.HostnameVerifierImpl + 2] == 'D'
                     || this.ZenithInternal044[this.HostnameVerifierImpl + 2] == 'd'
               )) {
               this.HostnameVerifierImpl += 4;
            }

            return new String(this.ZenithInternal044, this.HostnameVerifierImpl, this.longHolder_4 - this.HostnameVerifierImpl);
         }
      }
   }

   private String longHolder_5() {
      this.longHolder_7++;
      this.HostnameVerifierImpl = this.longHolder_7;

      for (this.longHolder_4 = this.HostnameVerifierImpl; this.longHolder_7 != this.length; this.longHolder_4++) {
         if (this.ZenithInternal044[this.longHolder_7] == '"') {
            this.longHolder_7++;

            while (this.longHolder_7 < this.length && this.ZenithInternal044[this.longHolder_7] == ' ') {
               this.longHolder_7++;
            }

            return new String(this.ZenithInternal044, this.HostnameVerifierImpl, this.longHolder_4 - this.HostnameVerifierImpl);
         }

         if (this.ZenithInternal044[this.longHolder_7] == '\\') {
            this.ZenithInternal044[this.longHolder_4] = this.ZenithInternal084();
         } else {
            this.ZenithInternal044[this.longHolder_4] = this.ZenithInternal044[this.longHolder_7];
         }

         this.longHolder_7++;
      }

      throw new IllegalStateException("Unexpected end of DN: " + this.SecureRandomHolder_2);
   }

   private String ZenithInternal042() {
      if (this.longHolder_7 + 4 >= this.length) {
         throw new IllegalStateException("Unexpected end of DN: " + this.SecureRandomHolder_2);
      } else {
         this.HostnameVerifierImpl = this.longHolder_7++;

         label57:
         while (true) {
            if (this.longHolder_7 == this.length
               || this.ZenithInternal044[this.longHolder_7] == '+'
               || this.ZenithInternal044[this.longHolder_7] == ','
               || this.ZenithInternal044[this.longHolder_7] == ';') {
               this.longHolder_4 = this.longHolder_7;
               break;
            }

            if (this.ZenithInternal044[this.longHolder_7] == ' ') {
               this.longHolder_4 = this.longHolder_7++;

               while (true) {
                  if (this.longHolder_7 >= this.length || this.ZenithInternal044[this.longHolder_7] != ' ') {
                     break label57;
                  }

                  this.longHolder_7++;
               }
            }

            if (this.ZenithInternal044[this.longHolder_7] >= 'A'
               && this.ZenithInternal044[this.longHolder_7] <= 'F') {
               this.ZenithInternal044[this.longHolder_7] = (char)(
                  this.ZenithInternal044[this.longHolder_7] + ' '
               );
            }

            this.longHolder_7++;
         }

         int i = this.longHolder_4 - this.HostnameVerifierImpl;
         if (i >= 5 && (i & 1) != 0) {
            byte[] abyte = new byte[i / 2];
            int j = 0;

            for (int k = this.HostnameVerifierImpl + 1; j < abyte.length; j++) {
               abyte[j] = (byte)this.EventImpl_13(k);
               k += 2;
            }

            return new String(this.ZenithInternal044, this.HostnameVerifierImpl, i);
         } else {
            throw new IllegalStateException("Unexpected end of DN: " + this.SecureRandomHolder_2);
         }
      }
   }

   private String ZenithInternal101() {
      this.HostnameVerifierImpl = this.longHolder_7;
      this.longHolder_4 = this.longHolder_7;

      while (this.longHolder_7 < this.length) {
         switch (this.ZenithInternal044[this.longHolder_7]) {
            case ' ':
               this.ZenithInternal045 = this.longHolder_4;
               this.longHolder_7++;

               for (this.ZenithInternal044[this.longHolder_4++] = ' ';
                  this.longHolder_7 < this.length && this.ZenithInternal044[this.longHolder_7] == ' ';
                  this.longHolder_7++
               ) {
                  this.ZenithInternal044[this.longHolder_4++] = ' ';
               }

               if (this.longHolder_7 == this.length
                  || this.ZenithInternal044[this.longHolder_7] == ','
                  || this.ZenithInternal044[this.longHolder_7] == '+'
                  || this.ZenithInternal044[this.longHolder_7] == ';') {
                  return new String(this.ZenithInternal044, this.HostnameVerifierImpl, this.ZenithInternal045 - this.HostnameVerifierImpl);
               }
               break;
            case '+':
            case ',':
            case ';':
               return new String(this.ZenithInternal044, this.HostnameVerifierImpl, this.longHolder_4 - this.HostnameVerifierImpl);
            case '\\':
               this.ZenithInternal044[this.longHolder_4++] = this.ZenithInternal084();
               this.longHolder_7++;
               break;
            default:
               this.ZenithInternal044[this.longHolder_4++] = this.ZenithInternal044[this.longHolder_7];
               this.longHolder_7++;
         }
      }

      return new String(this.ZenithInternal044, this.HostnameVerifierImpl, this.longHolder_4 - this.HostnameVerifierImpl);
   }

   private char ZenithInternal084() {
      this.longHolder_7++;
      if (this.longHolder_7 == this.length) {
         throw new IllegalStateException("Unexpected end of DN: " + this.SecureRandomHolder_2);
      } else {
         switch (this.ZenithInternal044[this.longHolder_7]) {
            case ' ':
            case '"':
            case '#':
            case '%':
            case '*':
            case '+':
            case ',':
            case ';':
            case '<':
            case '=':
            case '>':
            case '\\':
            case '_':
               return this.ZenithInternal044[this.longHolder_7];
            default:
               return this.StringHolder_19();
         }
      }
   }

   private char StringHolder_19() {
      int i = this.EventImpl_13(this.longHolder_7);
      this.longHolder_7++;
      if (i < 128) {
         return (char)i;
      } else if (i >= 192 && i <= 247) {
         byte b0;
         if (i <= 223) {
            b0 = 1;
            i &= 31;
         } else if (i <= 239) {
            b0 = 2;
            i &= 15;
         } else {
            b0 = 3;
            i &= 7;
         }

         for (int k = 0; k < b0; k++) {
            this.longHolder_7++;
            if (this.longHolder_7 == this.length || this.ZenithInternal044[this.longHolder_7] != '\\') {
               return '?';
            }

            this.longHolder_7++;
            int j = this.EventImpl_13(this.longHolder_7);
            this.longHolder_7++;
            if ((j & 192) != 128) {
               return '?';
            }

            i = (i << 6) + (j & 63);
         }

         return (char)i;
      } else {
         return '?';
      }
   }

   private int EventImpl_13(int i) {
      if (i + 1 >= this.length) {
         throw new IllegalStateException("Malformed DN: " + this.SecureRandomHolder_2);
      } else {
         int j = this.ZenithInternal044[i];
         if (j >= 48 && j <= 57) {
            j -= 48;
         } else if (j >= 97 && j <= 102) {
            j -= 87;
         } else {
            if (j < 65 || j > 70) {
               throw new IllegalStateException("Malformed DN: " + this.SecureRandomHolder_2);
            }

            j -= 55;
         }

         int k = this.ZenithInternal044[i + 1];
         if (k >= 48 && k <= 57) {
            k -= 48;
         } else if (k >= 97 && k <= 102) {
            k -= 87;
         } else {
            if (k < 65 || k > 70) {
               throw new IllegalStateException("Malformed DN: " + this.SecureRandomHolder_2);
            }

            k -= 55;
         }

         return (j << 4) + k;
      }
   }

   public String EventBus(String s) {
      this.longHolder_7 = 0;
      this.HostnameVerifierImpl = 0;
      this.longHolder_4 = 0;
      this.ZenithInternal045 = 0;
      this.ZenithInternal044 = this.SecureRandomHolder_2.toCharArray();
      String s1 = this.CallableImpl();
      if (s1 == null) {
         return null;
      } else {
         do {
            String s2 = "";
            if (this.longHolder_7 == this.length) {
               return null;
            }

            switch (this.ZenithInternal044[this.longHolder_7]) {
               case '"':
                  s2 = this.hasTimeElapsed();
                  break;
               case '#':
                  s2 = this.ZenithInternal042();
               case '+':
               case ',':
               case ';':
                  break;
               default:
                  s2 = this.ZenithInternal101();
            }

            if (s.equalsIgnoreCase(s1)) {
               return s2;
            }

            if (this.longHolder_7 >= this.length) {
               return null;
            }

            if (this.ZenithInternal044[this.longHolder_7] != ','
               && this.ZenithInternal044[this.longHolder_7] != ';'
               && this.ZenithInternal044[this.longHolder_7] != '+') {
               throw new IllegalStateException("Malformed DN: " + this.SecureRandomHolder_2);
            }

            this.longHolder_7++;
            s1 = this.CallableImpl();
         } while (s1 != null);

         throw new IllegalStateException("Malformed DN: " + this.SecureRandomHolder_2);
      }
   }
}
