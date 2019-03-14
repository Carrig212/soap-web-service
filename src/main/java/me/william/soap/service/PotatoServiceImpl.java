package me.william.soap.service;

import me.william.soap.beans.Potato;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebService(endpointInterface = "me.william.soap.service.PotatoService")
public class PotatoServiceImpl implements PotatoService {

    private static final Map<Integer, Potato> potatoes = new HashMap<>();

    public boolean addPotato(Potato p) {
        if (potatoes.get(p.getId()) != null) {
            return false;
        }

        potatoes.put(p.getId(), p);

        System.out.printf("Added Potato '%d' to inventory%n", p.getId());

        return true;
    }

    public boolean deletePotato(int id) {
        if (potatoes.get(id) == null) {
            return false;
        }

        potatoes.remove(id);

        System.out.printf("Removed Potato '%d' from inventory%n", id);

        return true;
    }

    public Potato getPotato(int id) {
        System.out.printf("Returned Potato '%d' from inventory%n", id);

        return potatoes.get(id);
    }

    public Potato[] getAllPotatoes() {
        final Set<Integer> ids = potatoes.keySet();
        final Potato[] potatoArray = new Potato[ids.size()];

        int i = 0;

        for (int id : ids) {
            potatoArray[i] = potatoes.get(id);
            i++;
        }

        System.out.printf("Returned Potatoes '%s' from inventory%n", ids.toString());

        return potatoArray;
    }
}
