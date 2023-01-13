package FuramaResort.Model;
import FuramaResort.util.ContanUtil.Gender;
public abstract class PersonModel {
    private String name;
    private String dayOfBirth;
    private Gender gender;
    private int idCard;
    private int numberPhone;
    private String email;

    public PersonModel() {
    }

    public PersonModel(String name, String dayOfBirth, Gender gender, int idCard, int numberPhone, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender=" + gender +
                ", idCard=" + idCard +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
