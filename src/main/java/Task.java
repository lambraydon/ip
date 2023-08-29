public class Task {
    private final String description;
    private Boolean isCompleted;

    public Task(String description, boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public void mark() {
        isCompleted = true;
    }

    public void unmark() {
        isCompleted = false;
    }

    @Override
    public String toString() {
        String marking;
        if (isCompleted) {
            marking = "[X]";
        } else {
            marking = "[ ]";
        }
        return marking + " " + description;
    }

    public String saveString() {
        return isCompleted.toString() + "|" + description;
    }
}
