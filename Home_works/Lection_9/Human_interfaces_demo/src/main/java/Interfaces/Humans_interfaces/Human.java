package Interfaces.Humans_interfaces;

import java.time.LocalDate;

public interface Human {
    String getName();
    void setName(String name);
    LocalDate getBirthDate();
    void setBirthDate(LocalDate dateOfBirth);
    void addGoods(Goods goods);
}
