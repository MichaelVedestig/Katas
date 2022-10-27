package se.salt.jfs.kata.csvplayer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerReaderTest {

    PlayerReader reader = new PlayerReader();

    @Test
    void shouldParsePlayersToDTOs(){
        String players = "Name|id|HP\\nOmid,007,97\\nAlex,404,98\\nMarcus,001,100\\nOscar,123,5\\nJohan,200,36";

        List<PlayerDTO> playerDTOS = reader.playersFromCsv(players);
        assertTrue(matchPlayer(playerDTOS, "Johan", 36));
        assertTrue(matchPlayer(playerDTOS, "Marcus", 100));
    }

    private boolean matchPlayer(List<PlayerDTO> playerDTOS, String name, int hp) {
        return playerDTOS.stream().anyMatch(player -> player.getName().equals(name) && player.getHp() == hp);
    }


    @Test
    void shouldCreateCsvStringFromObjects(){

        List<PlayerDTO> input = Arrays.asList(new PlayerDTO(007, "Omid",  97), new PlayerDTO( 200, "Johan",36));
        String expected = "name|id|HP\\nOmid,007,97\\nJohan,200,36";

        String actual = reader.playerListToCsv(input);
        assertEquals(expected, actual);

    }







}