package bdl.mappers;

import bdl.http.models.mfl.MflLeagueInformation;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class LeagueInformationResponseMapper {

    private final XmlMapper xmlMapper;

    public LeagueInformationResponseMapper(XmlMapper xmlMapper) {
        this.xmlMapper = xmlMapper;
    }

    public MflLeagueInformation mapMflLeagueInformation(String xml) throws Exception {
        try {
            return xmlMapper.readValue(xml, MflLeagueInformation.class);
        } catch (Exception e) {
            throw new Exception("Failed to map XML to MflLeagueInformation", e);
        }
    }

}