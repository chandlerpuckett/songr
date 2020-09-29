package com.chandlerpuckett.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class EmotionController {

    @GetMapping("/emotions")
    public String showEmotions (Model m) {

        ArrayList<Emotion> emotions = new ArrayList<>();
        emotions.add(new Emotion(
                "chill",
                "Jack",
                "cause im learning",
                true,
                9
        ));
        emotions.add(new Emotion(
                "satisfied",
                "Paul",
                "no phone calls",
                false,
                7
        ));
        emotions.add(new Emotion(
                "Perturbed",
                "Chandler",
                "hungry",
                false,
                6
        ));

        m.addAttribute("feelings", emotions);
        return "feelings";
    }
}
