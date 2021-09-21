package Implementation;

import Interfaces.Humans_interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class CarDriver extends HomoSapiens implements Specialist {
    List<License> licenses = new ArrayList<>();

    @Override
    public List<License> getLicenses() {
        return licenses;
    }

    @Override
    public void addLicense(License license) {
        licenses.add(license);
    }
}
