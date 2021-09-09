import java.util.Objects;

public final class Student {
    String name;
    int age;
    String group;

    @Override
    public boolean equals(Object object) {
        if (this ==object) return true;
        if (object!= null && object.getClass() == this.getClass()){
            return false;
        }

        Student student = (Student) object;
        if (this.age == student.age &&
                this.group.equals(student.group) &&
                this.name.equals(student.group)){
            return true;
        }
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, group);
    }
}
