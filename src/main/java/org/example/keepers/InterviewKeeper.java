package org.example.keepers;

import org.example.models.Interview;

import java.util.ArrayList;

public class InterviewKeeper {
    public ArrayList<Interview> interviews = new ArrayList<>();

    public InterviewKeeper() {
        interviews.add(new Interview(1200, "Мери Сью"));
    }
}
