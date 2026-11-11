
public class Quest {

    private String name;
    private int requiredProgress;
    private int currentProgress;

    public Quest(String name, int requiredProgress) {
        if (requiredProgress <= 0) {
            throw new IllegalArgumentException(
                    "Required progress must be greater than 0"
            );
        }

        this.name = name;
        this.requiredProgress = requiredProgress;
        this.currentProgress = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void addProgress(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Progress cannot be negative"
            );
        }

        currentProgress += amount;
    }

    public boolean isCompleted() {
        return currentProgress >= requiredProgress;
    }

    public int getCompletionPercentage() {
        int percentage = (currentProgress * 100) / requiredProgress;

        return Math.min(100, percentage);
    }
}

