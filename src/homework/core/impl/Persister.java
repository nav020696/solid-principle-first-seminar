package homework.core.impl;

import homework.core.Saver;
import homework.core.User;

public class Persister implements Saver {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
