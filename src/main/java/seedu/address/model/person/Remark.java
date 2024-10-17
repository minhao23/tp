package seedu.address.model.person;
import static java.util.Objects.requireNonNull;
/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is always valid
 */
public class Remark {
    public static final Remark EMPTY_REMARK = Remark.of("");
    public final String value;
    /**
     * Constructor of Remark using a string as remark value
     * */
    public Remark(String remark) {
        requireNonNull(remark);
        value = remark;
    }

    public static Remark of(String remark) {
        return new Remark(remark);
    }

    public String getValue() {
        return this.value;
    }
    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Remark // instanceof handles nulls
                && value.equals(((Remark) other).value)); // state check
    }
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}