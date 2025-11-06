
public class Student {
   
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Nilai harus antara 0 dan 100");
        }
        this.score = score;
    }

    public String getName() { return name; }
    
    public int getScore() { return score; }
    public void setName(String name) { this.name = name; }

    public void addScore(int delta) {
        if (score + delta > 100) throw new IllegalArgumentException("Nilai melebihi 100");
        score += delta;
    }

    public void reduceScore(int delta) {
        if (score - delta < 0) throw new IllegalArgumentException("Nilai di bawah 0");
        score -= delta;
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Nilai: " + score);
    }
}

