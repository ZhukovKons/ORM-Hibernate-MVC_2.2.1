package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String model;
    @Column
    private int series;

    @OneToOne(optional = false, mappedBy = "car")  //forMentor*  Обозначаю, что это поле приявязанно к полю car, в классе User
    private User user;



    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car: " +
                "model= " + model +
                ", series= " + series;
    }
}
