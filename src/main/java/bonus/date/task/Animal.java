package bonus.date.task;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.time.LocalDateTime;


public class Animal {
    private String name;
    private LocalDate birthday;
    public Animal(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }
}
