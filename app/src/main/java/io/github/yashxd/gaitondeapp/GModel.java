package io.github.yashxd.gaitondeapp;

public class GModel {
    private String personName;
    private String deathType;
    private int deathTime;
    private String familyMembers;
    private String killed;
    private String photo;




    public GModel(String personName, String deathType, int deathTime, String familyMembers, String killed, String photo) {//constructor puts default values
        this.personName = personName;
        this.deathType = deathType;
        this.deathTime = deathTime;
        this.familyMembers = familyMembers;
        this.killed = killed;
        this.photo = photo;



    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getDeathType() {
        return deathType;
    }

    public void setDeathType(String deathType) {
        this.deathType = deathType;
    }

    public int getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(int deathTime) { this.deathTime = deathTime; }

    public String getFamilyMembers() { return familyMembers; }

    public void setFamilyMembers(String familyMembers) { this.familyMembers = familyMembers; }

    public String getKill() {
        return killed;
    }

    public void setKill(String killed) {
        this.killed = killed;
    }

    public String getPhoto() { return photo; }

    public void setPhoto(String photo) { this.photo = photo; }
}
