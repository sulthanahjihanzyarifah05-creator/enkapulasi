
public class Main {
    
    public static void main(String[] args) {
        
// --- Tes Student dan Team ---
        Student s1 = new Student("Sulthanah Jihan Zyarifah", 98);
        Student s2 = new Student("Ibnu Nashrulloh", 80);
        Student s3 = new Student("Nadiva Meilya", 95);

        Team team = new Team();
        team.addMember(s1);
        team.addMember(s2);
        team.addMember(s3);

        team.displayTeam();

        // --- Tes ImmutableStudent ---
        System.out.println("\n--- Tes ImmutableStudent ---");
        ImmutableStudent im1 = new ImmutableStudent("Asep cah bagus", 85);
        im1.displayInfo();

        System.out.println("Menambah nilai 10");
        ImmutableStudent im2 = im1.withAddedScore(10);
        im2.displayInfo();

        System.out.println("Objek lama tetap:");
        im1.displayInfo();
    }
}
