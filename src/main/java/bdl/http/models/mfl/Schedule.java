package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JacksonXmlRootElement(localName = "schedule")
public class Schedule {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "weeklySchedule")
    private List<WeeklySchedule> weeklySchedule;

    public List<WeeklySchedule> getWeeklySchedule() {
        return weeklySchedule;
    }

    public void setWeeklySchedule(List<WeeklySchedule> weeklySchedule) {
        this.weeklySchedule = weeklySchedule;
    }

}