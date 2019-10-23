package Service;
import Client.Dao;
import Comon.Animals;
import Client.Model;

import java.util.List;

public class AnimalService {

    private Dao Dao = new Dao();

    public AnimalService() {
    }

    public Animals findUser(int id) {
        return Dao.findById(id);
    }

    public void saveUser(Animals user) {
        Dao.save(user);
    }

    public void deleteUser(Animals user) {
        Dao.delete(user);
    }

    public void updateUser(Animals user) {
        Dao.update(user);
    }

    public List<Animals> findAllUsers() {
        return Dao.findAll();
    }


  }