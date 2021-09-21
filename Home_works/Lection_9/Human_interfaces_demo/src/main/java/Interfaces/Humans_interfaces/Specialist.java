package Interfaces.Humans_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Specialist {
    List <License> getLicenses();
    void addLicense(License license);
}
