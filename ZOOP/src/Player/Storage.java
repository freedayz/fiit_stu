package Player;

import Resources.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Storage {

    private int storage;

    public ArrayList<Resource> content;

    public Storage(int storage) {
        setStorage(storage);
        setContent(new ArrayList<>());
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void generateResource() {
        ArrayList<Resource> possibleResources = new ArrayList<>();
        possibleResources.add(new Coal());
        possibleResources.add(new Iron());
        possibleResources.add(new Silver());
        possibleResources.add(new Gold());
        possibleResources.add(new Diamond());
        possibleResources.add(new Kryptonite());
        Random r = new Random();

        for (Resource res : possibleResources) {
            int randomNumber = r.nextInt(10000 - 1) + 1;

            if (randomNumber <= res.getDropChance()) {
                addContent(res);
                System.out.println(">Resource found: " + res.getName() + " [" + randomNumber + "/" + res.getDropChance() + "]");
            }
        }
    }

    public int getResourceCount(Resource r) {
        int count = 0;
        if (!content.isEmpty()) {
            for (Resource res : getContent()) {
                if (res.getResID() == r.getResID()) {
                    count++;
                }
            }
        }

        return count;
    }

    public ArrayList<Resource> getContent() {
        return content;
    }

    public void setContent(ArrayList<Resource> content) {
        this.content = content;
    }

    public void addContent(Resource e) {
        this.content.add(e);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storage=" + storage +
                ", content=" + content +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage1 = (Storage) o;
        return storage == storage1.storage && content.equals(storage1.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage, content);
    }
}
