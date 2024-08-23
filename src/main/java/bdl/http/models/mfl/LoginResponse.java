package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName = "status")
public class LoginResponse {

    @JacksonXmlProperty(isAttribute = true, localName = "MFL_USER_ID")
    private String cookie;

    @JacksonXmlText
    private String status;

    // Getters and Setters
    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}