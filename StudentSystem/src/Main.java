
public class Main {

	public static void main(String[] args) {
		Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Duygu Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Nilufer Hoca", "90550000001", "FZK");
        Teacher t3 = new Teacher("Basak Hoca", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Deniz", "1080", 4, mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Cagan", "2163", 4, mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Beyza", "2009", 4, mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }

	}


