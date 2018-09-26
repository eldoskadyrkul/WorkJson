public class Student {

    private String nameStudent;
    private String LastNameStudent;
    private int ageStudent;
    private String FacultyStudent;
    private boolean goodAtMath;

    public Student(String nameStudent, String lastNameStudent, int ageStudent, String facultyStudent, boolean goodAtMath) {
        this.nameStudent = nameStudent;
        LastNameStudent = lastNameStudent;
        this.ageStudent = ageStudent;
        FacultyStudent = facultyStudent;
        this.goodAtMath = goodAtMath;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastNameStudent() {
        return LastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        LastNameStudent = lastNameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public String getFacultyStudent() {
        return FacultyStudent;
    }

    public void setFacultyStudent(String facultyStudent) {
        FacultyStudent = facultyStudent;
    }

    public boolean isGoodAtMath() {
        return goodAtMath;
    }

    public void setGoodAtMath(boolean goodAtMath) {
        this.goodAtMath = goodAtMath;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", LastNameStudent='" + LastNameStudent + '\'' +
                ", ageStudent=" + ageStudent +
                ", FacultyStudent='" + FacultyStudent + '\'' +
                ", goodAtMath=" + goodAtMath +
                '}';
    }
}