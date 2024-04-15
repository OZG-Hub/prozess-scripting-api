// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.validator;

/**
 * Validierungsregel, die prüft, dass eine hochgeladene PDF-Datei PDF/A-konform ist.
 */
public class PdfAValidatorV1 extends ValidationRuleV1 {

	@SuppressWarnings("all")
	public static abstract class PdfAValidatorV1Builder<C extends PdfAValidatorV1, B extends PdfAValidatorV1.PdfAValidatorV1Builder<C, B>> extends ValidationRuleV1.ValidationRuleV1Builder<C, B> {
		@Override
		@SuppressWarnings("all")
		protected abstract B self();

		@Override
		@SuppressWarnings("all")
		public abstract C build();

		@Override
		@SuppressWarnings("all")
		public String toString() {
			return "PdfAValidatorV1.PdfAValidatorV1Builder(super=" + super.toString() + ")";
		}
	}


	@SuppressWarnings("all")
	private static final class PdfAValidatorV1BuilderImpl extends PdfAValidatorV1.PdfAValidatorV1Builder<PdfAValidatorV1, PdfAValidatorV1.PdfAValidatorV1BuilderImpl> {
		@SuppressWarnings("all")
		private PdfAValidatorV1BuilderImpl() {
		}

		@Override
		@SuppressWarnings("all")
		protected PdfAValidatorV1.PdfAValidatorV1BuilderImpl self() {
			return this;
		}

		@Override
		@SuppressWarnings("all")
		public PdfAValidatorV1 build() {
			return new PdfAValidatorV1(this);
		}
	}

	@SuppressWarnings("all")
	protected PdfAValidatorV1(final PdfAValidatorV1.PdfAValidatorV1Builder<?, ?> b) {
		super(b);
	}

	@SuppressWarnings("all")
	public static PdfAValidatorV1.PdfAValidatorV1Builder<?, ?> builder() {
		return new PdfAValidatorV1.PdfAValidatorV1BuilderImpl();
	}

	@Override
	@SuppressWarnings("all")
	public String toString() {
		return "PdfAValidatorV1()";
	}

	@Override
	@SuppressWarnings("all")
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof PdfAValidatorV1)) return false;
		final PdfAValidatorV1 other = (PdfAValidatorV1) o;
		if (!other.canEqual((Object) this)) return false;
		return true;
	}

	@SuppressWarnings("all")
	protected boolean canEqual(final Object other) {
		return other instanceof PdfAValidatorV1;
	}

	@Override
	@SuppressWarnings("all")
	public int hashCode() {
		final int result = 1;
		return result;
	}
}
