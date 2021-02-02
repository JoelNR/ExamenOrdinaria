package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Cast {
    private final List<String> cast;

    public Cast(String[] names) {
        this.cast = new ArrayList<>();
        Collections.addAll(cast, names);
    }

    public List<String> getCast() {
        return cast;
    }

        
}
