package uz.pdp;

import java.util.List;

public class Club {
    List<String> members = List.of("John","Jackie");

    public boolean isMember(String name) {
        return members.contains(name);
    }
}
