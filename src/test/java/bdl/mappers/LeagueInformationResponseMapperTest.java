package bdl.mappers;

import bdl.http.models.mfl.MflLeagueInformation;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class LeagueInformationResponseMapperTest {

    private LeagueInformationResponseMapper mapper;

    @BeforeEach
    void setUp() {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper = new LeagueInformationResponseMapper(xmlMapper);
    }

    @Test
    void testMapMflLeagueInformation() throws Exception {
        // Load the XML file from the resources folder
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("league-example-response.xml");
        assertNotNull(inputStream, "XML file not found in resources");
        String xml = new String(inputStream.readAllBytes());

        MflLeagueInformation leagueInformation = mapper.mapMflLeagueInformation(xml);
        assertNotNull(leagueInformation);
    }
}