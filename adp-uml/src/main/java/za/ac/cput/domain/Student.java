package za.ac.cput.domain;

public class Student {

    private Course regCourse = new Course();
    private Person stuDetails = new Person();
    private int studNo;
    private int studYear;

    public Student(Course regCourse, Person stuDetails, int studNo, int studYear) {
        this.regCourse = regCourse;
        this.stuDetails = stuDetails;
        this.studNo = studNo;
        this.studYear = studYear;
    }

    public Student() {
    }

    public Course getRegCourse() {
        return regCourse;
    }

    public Person getStuDetails() {
        return stuDetails;
    }

    public int getStudNo() {
        return studNo;
    }

    public int getStudYear() {
        return studYear;
    }

    public void setRegCourse(Course regCourse) {
        this.regCourse = regCourse;
    }

    public void setStuDetails(Person stuDetails) {
        this.stuDetails = stuDetails;
    }

    public void setStudNo(int studNo) {
        this.studNo = studNo;
    }

    public void setStudYear(int studYear) {
        this.studYear = studYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regCourse=" + regCourse +
                ", stuDetails=" + stuDetails +
                ", studNo=" + studNo +
                ", studYear=" + studYear +
                '}';
    }
}
