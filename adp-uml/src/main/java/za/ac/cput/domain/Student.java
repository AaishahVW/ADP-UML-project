package za.ac.cput.domain;

public class Student extends Person{

<<<<<<< HEAD
    private Course regCourse = new Course();
    private Person stuDetails = new Person();
    private int studNo;
    private int studYear;

    public Student(Course regCourse, Person stuDetails, int studNo, int studYear) {
        this.regCourse = regCourse;
        this.stuDetails = stuDetails;
        this.studNo = studNo;
        this.studYear = studYear;
=======
    private Course regCourse;
    private long stuNumber;

    public Student(String name, String surname, String email, String password, Course regCourse, long stuNumber) {
        super(name, surname, email, password);
        this.regCourse = regCourse;
        this.stuNumber = stuNumber;
>>>>>>> upstream/main
    }

    public Student() {
    }

    public Course getRegCourse() {
        return regCourse;
    }

<<<<<<< HEAD
    public Person getStuDetails() {
        return stuDetails;
    }

    public int getStudNo() {
        return studNo;
    }

    public int getStudYear() {
        return studYear;
    }

=======
>>>>>>> upstream/main
    public void setRegCourse(Course regCourse) {
        this.regCourse = regCourse;
    }

<<<<<<< HEAD
    public void setStuDetails(Person stuDetails) {
        this.stuDetails = stuDetails;
    }

    public void setStudNo(int studNo) {
        this.studNo = studNo;
    }

    public void setStudYear(int studYear) {
        this.studYear = studYear;
=======
    public long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(long stuNumber) {
        this.stuNumber = stuNumber;
>>>>>>> upstream/main
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Student{" +
                "regCourse=" + regCourse +
                ", stuDetails=" + stuDetails +
                ", studNo=" + studNo +
                ", studYear=" + studYear +
                '}';
    }
=======
        return "Student{" + "\n" +
                "regCourse=" + regCourse + "\n" +
                ", stuNumber=" + stuNumber + "\n" +
                /*", allMarks=" + getMarks() + "\n" +*/
                '}';
    }

   /* private String getMarks(){
        if (this.regCourse == null){
            return null;
        }

        String returnString = "";
           for(Integer key1: regCourse.getSubjects().keySet()){
               String subName = regCourse.getSubjects().get(key1).getSubjectName();
               StringBuilder subMarks = new StringBuilder("[");

               if (regCourse.getSubjects().get(key1).getMarks() == null){
                   return null;
               }

               for (Integer key2: regCourse.getSubjects().get(key1).getMarks().keySet()){
                   subMarks.append(regCourse.getSubjects().get(key1).getMarks().get(key2).toString()).append(",");
               }
               subMarks.append(']');
               returnString = subName + subMarks;
           }

           return returnString;
    }*/
>>>>>>> upstream/main
}
