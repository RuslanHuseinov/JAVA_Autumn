package Controller;

import Interfaces.*;

public class CompanyUtilities {
    Company company;

    public CompanyUtilities(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
