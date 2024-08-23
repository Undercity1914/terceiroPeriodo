package trabalho.schoolproject.Classes;

import java.util.Objects;

public class Person 
{
    protected String name;
    protected Integer age;
    protected Integer cpf;

    public Person(String name, Integer age, Integer cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }
    
    public Person()
    {
        this.name = "";
        this.age = 0;
        this.cpf = cpf;
    }
    
    public Person(Person other)
    {
        this.name = other.getName();
        this.age = other.getAge();
        this.cpf = other.getCpf();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.age);
        hash = 17 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", cpf=" + cpf + '}';
    }
}
