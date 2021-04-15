package laddergame.controller;

import laddergame.domain.ladder.Ladder;
import laddergame.domain.ladder.Size;
import laddergame.domain.player.Name;
import laddergame.domain.player.Player;
import laddergame.domain.player.Players;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderControllerTest {
    private LadderController factory;

    @Test
    void 참여자여러명생성() {
        List<String> names = Arrays.asList("참여1", "참여2", "참여3", "참여4");
        List<Player> playerList = names.stream()
                .map(name -> new Player(new Name(name)))
                .collect(Collectors.toList());

        Players players = LadderController.enroll(names);

        assertThat(players).isEqualTo(new Players(playerList));
    }

    @Test
    void 사다리생성() {
        Size size = new Size(5, 6);
        Ladder ladder = LadderController.makeLadder(size);

    }


}
