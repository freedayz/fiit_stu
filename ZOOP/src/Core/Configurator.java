package Core;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Configurator {
    private final String fileName = "config.dat";
    private final ArrayList<Node> nodesToPush = new ArrayList<>();
    private ArrayList<Node> nodesToPull = new ArrayList<>();
    private Node n;
    private FileOutputStream fileOutput;

    private ObjectOutputStream objOutput;
    private FileInputStream fileInput;
    private ObjectInputStream objInput;


    public void CommitNode(String name, String value) {
        this.n = new Node(name, value);
        nodesToPush.add(n);
    }
    public void Push() {
        try {
            this.fileOutput = new FileOutputStream(fileName);
            this.objOutput = new ObjectOutputStream(fileOutput);
            objOutput.writeObject(nodesToPush);
            nodesToPull.clear();
        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
    }

    public void Pull() {
        if (Exists()) {
            try {
                this.fileInput = new FileInputStream(fileName);
                this.objInput = new ObjectInputStream(fileInput);
                this.nodesToPull = (ArrayList) objInput.readObject();

                fileInput.close();
                objInput.close();
            }
            catch (Exception e) {
                System.out.println("Error occured while pulling from config file.");
            }
        }
    }

    public String Get(String name) {
        if (!nodesToPull.isEmpty() && Exists()) {
            for (Node n : nodesToPull) {
                if (n.getName().equals(name)) {
                    return n.getValue();
                }
            }
        }
        return null;
    }

    public boolean FoundNodes(String[] values) {
        boolean empty = false;
        if (Exists()) {
            for (String value : values) {
                if (Get(value) == null) {
                    empty = true;
                    break;
                }
            }
        }

        return empty;
    }

    public boolean Exists() {
        File f = new File(fileName);
        return f.exists() && !f.isDirectory();
    }

    public boolean Destroy() {
        File fileToDestroy = new File(fileName);
        return fileToDestroy.delete();
    }

    @Override
    public String toString() {
        return "Configurator{" +
                "fileName='" + fileName + '\'' +
                ", nodesToPush=" + nodesToPush +
                ", nodesToPull=" + nodesToPull +
                ", n=" + n +
                ", fileOutput=" + fileOutput +
                ", objOutput=" + objOutput +
                ", fileInput=" + fileInput +
                ", objInput=" + objInput +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Configurator that = (Configurator) o;
        return nodesToPush.equals(that.nodesToPush) && nodesToPull.equals(that.nodesToPull) && n.equals(that.n) && fileOutput.equals(that.fileOutput) && objOutput.equals(that.objOutput) && fileInput.equals(that.fileInput) && objInput.equals(that.objInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, nodesToPush, nodesToPull, n, fileOutput, objOutput, fileInput, objInput);
    }
}
