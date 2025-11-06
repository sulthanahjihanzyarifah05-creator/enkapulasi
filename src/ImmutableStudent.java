

public final class ImmutableStudent {
    
    private final String name;
    private final int score;

    public ImmutableStudent(String name, int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Nilai harus antara 0 dan 100");
        }
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    public ImmutableStudent withAddedScore(int delta) {
        int newScore = this.score + delta;
        if (newScore > 100) newScore = 100;
        if (newScore < 0) newScore = 0;
        return new ImmutableStudent(this.name, newScore);
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Nilai: " + score);
    }
}

