public class Person {
    private final String name;
    private final boolean sex;
    private final int age;
    Enum jobTitle;

    public Person(String name, boolean sex, int age, Enum e) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        jobTitle=e;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (sex != person.sex) return false;
        if (jobTitle != person.jobTitle) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex ? 1 : 0);
        result = 31 * result + age;
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        return result;
    }
}
