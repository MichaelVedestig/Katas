package se.salt.jfs.kata.csvplayer;

public class PlayerDTO {
    private long id;
    private String name;
    private int hp;

    public PlayerDTO(long id, String name, int hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
