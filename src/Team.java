
import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Student> members;

    public Team() {
        members = new ArrayList<>();
    }

    public void addMember(Student s) {
        if (s == null) throw new IllegalArgumentException("Member tidak boleh null");
        members.add(s);
    }

    public List<Student> getMembers() {
        return new ArrayList<>(members);
    }

    public void displayTeam() {
        System.out.println("Daftar Anggota Tim:");
        for (Student s : members) {
            System.out.println("- " + s.getName() + " (Nilai: " + s.getScore() + ")");
        }
    }
}
