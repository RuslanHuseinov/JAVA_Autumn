package Implementation;

import Interfaces.Humans_interfaces.Goods;
import Interfaces.Humans_interfaces.Human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HomoSapiens implements Human {
    List<Goods> goods = new ArrayList<>();

    public void addGoods(Goods goods){
        this.goods.add(goods);
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public LocalDate getBirthDate() {
        return null;
    }

    @Override
    public void setBirthDate(LocalDate dateOfBirth) {

    }
}
