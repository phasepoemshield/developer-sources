package oxxxde

// $VF: Compiled from heavy
private data class رذ {
   public final val pasteButton: طً
   public final val picker: طً
   public final val hue: طً
   public final val alpha: طً
   public final val copyButton: طً

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is رذ
            && this.picker == (other as رذ).picker
            && this.hue == (other as رذ).hue
            && this.alpha == (other as رذ).alpha
            && this.copyButton == (other as رذ).copyButton
            && this.pasteButton == (other as رذ).pasteButton
         }
   }

   fun getAlpha(): طً {
      this.alpha
   }

   public override fun toString(): String {
      return "Layout(picker=${this.picker}, hue=${this.hue}, alpha=${this.alpha}, copyButton=${this.copyButton}, pasteButton=${this.pasteButton})"
   }

   public operator fun component4(): طً {
      return this.copyButton
   }

   public override fun hashCode(): Int {
      return (((this.picker.hashCode() * 31 + this.hue.hashCode()) * 31 + this.alpha.hashCode()) * 31 + this.copyButton.hashCode()) * 31
         + this.pasteButton.hashCode()
      }

   public operator fun component3(): طً {
      return this.alpha
   }

   fun رذ(hue: طً, copyButton: طً, alpha: طً, picker: طً, pasteButton: طً) {
      this.picker = picker
      this.hue = hue
      this.alpha = alpha
      this.copyButton = copyButton
      this.pasteButton = pasteButton
   }

   fun getPicker(): طً {
      this.picker
   }

   fun getPasteButton(): طً {
      this.pasteButton
   }

   public operator fun component5(): طً {
      return this.pasteButton
   }

   public fun copy(picker: طً = this.picker, hue: طً = this.hue, alpha: طً = this.alpha, copyButton: طً = this.copyButton, pasteButton: طً = this.pasteButton): رذ {
      return رذ(picker, hue, alpha, copyButton, pasteButton)
   }

   fun getCopyButton(): طً {
      this.copyButton
   }

   public operator fun component2(): طً {
      return this.hue
   }

   fun getHue(): طً {
      this.hue
   }

   public operator fun component1(): طً {
      return this.picker
   }
}
