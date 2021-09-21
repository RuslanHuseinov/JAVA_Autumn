package Implementation;

import Interfaces.Humans_interfaces.License;

public class LicenseA implements License {
    String type = "A";
    @Override
    public String getType() {
        return type;
    }

}
