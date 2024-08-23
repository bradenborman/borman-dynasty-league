package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SalaryPlayer {

    @JacksonXmlProperty(isAttribute = true)
    private String salary;

    @JacksonXmlProperty(isAttribute = true)
    private String id;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}