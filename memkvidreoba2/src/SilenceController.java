public class SilenceController extends LibraryEmployee {
    private double strictness;

    public SilenceController(String firstName, String lastName, String employeeId, double strictness) {
        super(firstName, lastName, employeeId);
        this.strictness = strictness;
    }

    public double getStrictness() {
        return strictness;
    }

    @Override
    public String toString() {
        return super.toString() + " [Silence Controller] | Strictness level: " + strictness;
    }
}
